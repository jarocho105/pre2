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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.SubPreguntaEvaluacionConstantesFunciones;
import com.bydan.erp.cartera.util.SubPreguntaEvaluacionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.SubPreguntaEvaluacionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.SubPreguntaEvaluacionBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class SubPreguntaEvaluacionBeanSwingJInternalFrame extends SubPreguntaEvaluacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SubPreguntaEvaluacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SubPreguntaEvaluacion> subpreguntaevaluacionValidator = new ClassValidator<SubPreguntaEvaluacion>(SubPreguntaEvaluacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SubPreguntaEvaluacion subpreguntaevaluacion;	
	public SubPreguntaEvaluacion subpreguntaevaluacionAux;
	public SubPreguntaEvaluacion subpreguntaevaluacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SubPreguntaEvaluacion subpreguntaevaluacionTotales;
	public Long idSubPreguntaEvaluacionActual;
	public Long iIdNuevoSubPreguntaEvaluacion=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboPreguntaEvaluacion="";

	public List<PreguntaEvaluacion> preguntaevaluacionsForeignKey;

	public List<PreguntaEvaluacion> getpreguntaevaluacionsForeignKey() {
		return preguntaevaluacionsForeignKey;
	}

	public void setpreguntaevaluacionsForeignKey(List<PreguntaEvaluacion> preguntaevaluacionsForeignKey) {
		this.preguntaevaluacionsForeignKey = preguntaevaluacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public PreguntaEvaluacion preguntaevaluacionForeignKey;

	public PreguntaEvaluacion getpreguntaevaluacionForeignKey() {
		return preguntaevaluacionForeignKey;
	}

	public void setpreguntaevaluacionForeignKey(PreguntaEvaluacion preguntaevaluacionForeignKey) {
		this.preguntaevaluacionForeignKey = preguntaevaluacionForeignKey;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleEvaluacionProveedor=false;

	public Boolean getIsTienePermisosDetalleEvaluacionProveedor() {
		return isTienePermisosDetalleEvaluacionProveedor;
	}

	public void setIsTienePermisosDetalleEvaluacionProveedor(Boolean isTienePermisosDetalleEvaluacionProveedor) {
		this.isTienePermisosDetalleEvaluacionProveedor= isTienePermisosDetalleEvaluacionProveedor;
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
	
	public Boolean isPermisoTodoSubPreguntaEvaluacion;
	public Boolean isPermisoNuevoSubPreguntaEvaluacion;
	public Boolean isPermisoActualizarSubPreguntaEvaluacion;
	public Boolean isPermisoActualizarOriginalSubPreguntaEvaluacion;
	public Boolean isPermisoEliminarSubPreguntaEvaluacion;
	public Boolean isPermisoGuardarCambiosSubPreguntaEvaluacion;
	public Boolean isPermisoConsultaSubPreguntaEvaluacion;
	public Boolean isPermisoBusquedaSubPreguntaEvaluacion;
	public Boolean isPermisoReporteSubPreguntaEvaluacion;
	public Boolean isPermisoPaginacionMedioSubPreguntaEvaluacion;
	public Boolean isPermisoPaginacionAltoSubPreguntaEvaluacion;
	public Boolean isPermisoPaginacionTodoSubPreguntaEvaluacion;
	public Boolean isPermisoCopiarSubPreguntaEvaluacion;
	public Boolean isPermisoVerFormSubPreguntaEvaluacion;
	public Boolean isPermisoDuplicarSubPreguntaEvaluacion;
	public Boolean isPermisoOrdenSubPreguntaEvaluacion;
	
	
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
	
	public SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionReturnGeneral;
	public SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionParameterGeneral;
	
	

	public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic=null;

	public DetalleEvaluacionProveedorLogic getDetalleEvaluacionProveedorLogic() {
		return detalleevaluacionproveedorLogic;
	}

	public void setDetalleEvaluacionProveedorLogic(DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic) {
		this.detalleevaluacionproveedorLogic = detalleevaluacionproveedorLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSubPreguntaEvaluacion=false;
	public Boolean esParaAccionDesdeFormularioSubPreguntaEvaluacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SubPreguntaEvaluacionSessionBeanAdditional subpreguntaevaluacionSessionBeanAdditional=null;
	
	public SubPreguntaEvaluacionSessionBeanAdditional getSubPreguntaEvaluacionSessionBeanAdditional() {
		return this.subpreguntaevaluacionSessionBeanAdditional;
	}
	
	public void setSubPreguntaEvaluacionSessionBeanAdditional(SubPreguntaEvaluacionSessionBeanAdditional subpreguntaevaluacionSessionBeanAdditional) {
		try {
			this.subpreguntaevaluacionSessionBeanAdditional=subpreguntaevaluacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional subpreguntaevaluacionBeanSwingJInternalFrameAdditional=null;
	//public class SubPreguntaEvaluacionBeanSwingJInternalFrame
	
	public SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional getSubPreguntaEvaluacionBeanSwingJInternalFrameAdditional() {
		return this.subpreguntaevaluacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setSubPreguntaEvaluacionBeanSwingJInternalFrameAdditional(SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional subpreguntaevaluacionBeanSwingJInternalFrameAdditional) {
		try {
			this.subpreguntaevaluacionBeanSwingJInternalFrameAdditional=subpreguntaevaluacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SubPreguntaEvaluacion subpreguntaevaluacionBean;
	public SubPreguntaEvaluacionConstantesFunciones subpreguntaevaluacionConstantesFunciones;
	//public SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public PreguntaEvaluacionLogic preguntaevaluacionLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<SubPreguntaEvaluacion> subpreguntaevaluacions;	
	//public List<SubPreguntaEvaluacion> subpreguntaevaluacionsEliminados;
	//public List<SubPreguntaEvaluacion> subpreguntaevaluacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaDuplicarSubPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaCopiarSubPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaVerFormSubPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaOrdenSubPreguntaEvaluacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaCancelarSubPreguntaEvaluacion=false;
	public Boolean isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdPreguntaEvaluacion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSubPreguntaEvaluacion() {
		return this.iIdNuevoSubPreguntaEvaluacion;
	}

	public void setiIdNuevoSubPreguntaEvaluacion(Long iIdNuevoSubPreguntaEvaluacion) {
		this.iIdNuevoSubPreguntaEvaluacion = iIdNuevoSubPreguntaEvaluacion;
	}
	
	public Long getidSubPreguntaEvaluacionActual() {
		return this.idSubPreguntaEvaluacionActual;
	}

	public void setidSubPreguntaEvaluacionActual(Long idSubPreguntaEvaluacionActual) {
		this.idSubPreguntaEvaluacionActual = idSubPreguntaEvaluacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SubPreguntaEvaluacion getsubpreguntaevaluacion() {
		return this.subpreguntaevaluacion;
	}

	public void setsubpreguntaevaluacion(SubPreguntaEvaluacion subpreguntaevaluacion) {
		this.subpreguntaevaluacion = subpreguntaevaluacion;
	}
	
	public SubPreguntaEvaluacion getsubpreguntaevaluacionAux() {
		return this.subpreguntaevaluacionAux;
	}

	public void setsubpreguntaevaluacionAux(SubPreguntaEvaluacion subpreguntaevaluacionAux) {
		this.subpreguntaevaluacionAux = subpreguntaevaluacionAux;
	}				
	
	public SubPreguntaEvaluacion getsubpreguntaevaluacionAnterior() {
		return this.subpreguntaevaluacionAnterior;
	}

	public void setsubpreguntaevaluacionAnterior(SubPreguntaEvaluacion subpreguntaevaluacionAnterior) {
		this.subpreguntaevaluacionAnterior = subpreguntaevaluacionAnterior;
	}	
	
	public SubPreguntaEvaluacion getsubpreguntaevaluacionTotales() {
		return this.subpreguntaevaluacionTotales;
	}

	public void setsubpreguntaevaluacionTotales(SubPreguntaEvaluacion subpreguntaevaluacionTotales) {
		this.subpreguntaevaluacionTotales = subpreguntaevaluacionTotales;
	}	
	
	public SubPreguntaEvaluacion getsubpreguntaevaluacionBean() {
		return this.subpreguntaevaluacionBean;
	}

	public void setsubpreguntaevaluacionBean(SubPreguntaEvaluacion subpreguntaevaluacionBean) {
		this.subpreguntaevaluacionBean = subpreguntaevaluacionBean;
	}	
	
	public SubPreguntaEvaluacionParameterReturnGeneral getsubpreguntaevaluacionReturnGeneral() {
		return this.subpreguntaevaluacionReturnGeneral;
	}

	public void setsubpreguntaevaluacionReturnGeneral(SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionReturnGeneral) {
		this.subpreguntaevaluacionReturnGeneral = subpreguntaevaluacionReturnGeneral;
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

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_pregunta_evaluacionFK_IdPreguntaEvaluacion=-1L;

	public Long getid_pregunta_evaluacionFK_IdPreguntaEvaluacion() {
		return this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion;
	}

	public void setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(Long id_pregunta_evaluacionFK_IdPreguntaEvaluacion) {
		this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion = id_pregunta_evaluacionFK_IdPreguntaEvaluacion;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SubPreguntaEvaluacionLogic getSubPreguntaEvaluacionLogic()	{		
		return subpreguntaevaluacionLogic;
	}

	public void setSubPreguntaEvaluacionLogic(SubPreguntaEvaluacionLogic subpreguntaevaluacionLogic) {
		this.subpreguntaevaluacionLogic = subpreguntaevaluacionLogic;
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
	
	public Boolean getIsEsNuevoSubPreguntaEvaluacion() {
		return isEsNuevoSubPreguntaEvaluacion;
	}

	public void setIsEsNuevoSubPreguntaEvaluacion(Boolean isEsNuevoSubPreguntaEvaluacion) {
		this.isEsNuevoSubPreguntaEvaluacion = isEsNuevoSubPreguntaEvaluacion;
	}

	public Boolean getEsParaAccionDesdeFormularioSubPreguntaEvaluacion() {
		return esParaAccionDesdeFormularioSubPreguntaEvaluacion;
	}
	
	public void setEsParaAccionDesdeFormularioSubPreguntaEvaluacion(Boolean esParaAccionDesdeFormularioSubPreguntaEvaluacion) {
		this.esParaAccionDesdeFormularioSubPreguntaEvaluacion = esParaAccionDesdeFormularioSubPreguntaEvaluacion;
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

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(subpreguntaevaluacionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(subpreguntaevaluacionSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosPreguntaEvaluacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PreguntaEvaluacionLogic preguntaevaluacionLogic=new PreguntaEvaluacionLogic();

			//preguntaevaluacionLogic.getPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//preguntaevaluacionLogic.getPreguntaEvaluacionDataAccess().setIsForForeingKeyData(true);

					preguntaevaluacionLogic.getTodosPreguntaEvaluacionsWithConnection(sFinalQuery,new Pagination());

					this.preguntaevaluacionsForeignKey=preguntaevaluacionLogic.getPreguntaEvaluacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPreguntaEvaluacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					preguntaevaluacionLogic.getEntityWithConnection(subpreguntaevaluacionSessionBean.getlidPreguntaEvaluacionActual());
					this.preguntaevaluacionsForeignKey.add(preguntaevaluacionLogic.getPreguntaEvaluacion());
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

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(subpreguntaevaluacionSessionBean.getlidEjercicioActual());
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

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(subpreguntaevaluacionSessionBean.getlidPeriodoActual());
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

					if(this.subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSubPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_empresaSubPreguntaEvaluacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSubPreguntaEvaluacionGenerico!=null && jComboBoxid_empresaSubPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaSubPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalSubPreguntaEvaluacionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSubPreguntaEvaluacionGenerico!=null && jComboBoxid_sucursalSubPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSubPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPreguntaEvaluacionForeignKey(Long idPreguntaEvaluacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(preguntaevaluacionTemp!=null) {

					if(this.subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion.setPreguntaEvaluacion(preguntaevaluacionTemp);
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacionTemp);
					}
				} else {
					//jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacionTemp);
					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(preguntaevaluacionTemp!=null && jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion!=null) {
						jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacionTemp);
					} else {
						if(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion!=null) {
							//jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacionTemp);
							if(jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.getItemCount()>0) {
								jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setSelectedIndex(0);
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

	public String getActualPreguntaEvaluacionForeignKeyDescripcion(Long idPreguntaEvaluacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}


			sDescripcion=PreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPreguntaEvaluacionForeignKeyGenerico(Long idPreguntaEvaluacionSeleccionado,JComboBox jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionTemp=null;

			for(PreguntaEvaluacion preguntaevaluacionAux:preguntaevaluacionsForeignKey) {
				if(preguntaevaluacionAux.getId()!=null && preguntaevaluacionAux.getId().equals(idPreguntaEvaluacionSeleccionado)) {
					preguntaevaluacionTemp=preguntaevaluacionAux;
					break;
				}
			}

			if(preguntaevaluacionTemp!=null) {
				jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico.setSelectedItem(preguntaevaluacionTemp);
			} else {
				if(jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico!=null && jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico.setSelectedIndex(0);
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

					if(this.subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico!=null && jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico.setSelectedIndex(0);
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

					if(this.subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoSubPreguntaEvaluacionGenerico)throws Exception
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
				jComboBoxid_periodoSubPreguntaEvaluacionGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoSubPreguntaEvaluacionGenerico!=null && jComboBoxid_periodoSubPreguntaEvaluacionGenerico.getItemCount()>0) {
					jComboBoxid_periodoSubPreguntaEvaluacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,JComboBox jComboBoxid_empresaSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSubPreguntaEvaluacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSubPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				subpreguntaevaluacion.setid_empresa(empresaAux.getId());
				subpreguntaevaluacion.setempresa_descripcion(SubPreguntaEvaluacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				subpreguntaevaluacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,JComboBox jComboBoxid_sucursalSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSubPreguntaEvaluacionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSubPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				subpreguntaevaluacion.setid_sucursal(sucursalAux.getId());
				subpreguntaevaluacion.setsucursal_descripcion(SubPreguntaEvaluacionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				subpreguntaevaluacion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPreguntaEvaluacionForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,JComboBox jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			PreguntaEvaluacion  preguntaevaluacionAux=new PreguntaEvaluacion();

			if(jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico==null) {
				preguntaevaluacionAux=(PreguntaEvaluacion)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getSelectedItem();
			} else {
				preguntaevaluacionAux=(PreguntaEvaluacion)jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(preguntaevaluacionAux!=null && preguntaevaluacionAux.getId()!=null) {
				subpreguntaevaluacion.setid_pregunta_evaluacion(preguntaevaluacionAux.getId());
				subpreguntaevaluacion.setpreguntaevaluacion_descripcion(SubPreguntaEvaluacionConstantesFunciones.getPreguntaEvaluacionDescripcion(preguntaevaluacionAux));
				subpreguntaevaluacion.setPreguntaEvaluacion(preguntaevaluacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,JComboBox jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioSubPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				subpreguntaevaluacion.setid_ejercicio(ejercicioAux.getId());
				subpreguntaevaluacion.setejercicio_descripcion(SubPreguntaEvaluacionConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				subpreguntaevaluacion.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(SubPreguntaEvaluacion subpreguntaevaluacion,JComboBox jComboBoxid_periodoSubPreguntaEvaluacionGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoSubPreguntaEvaluacionGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoSubPreguntaEvaluacionGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				subpreguntaevaluacion.setid_periodo(periodoAux.getId());
				subpreguntaevaluacion.setperiodo_descripcion(SubPreguntaEvaluacionConstantesFunciones.getPeriodoDescripcion(periodoAux));
				subpreguntaevaluacion.setPeriodo(periodoAux);			}
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

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
					}

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
					}

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePreguntaEvaluacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPreguntaEvaluacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.removeAllItems();

							for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacionsForeignKey) {
								this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.addItem(preguntaevaluacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
					}

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPreguntaEvaluacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.removeAllItems();

							for(PreguntaEvaluacion preguntaevaluacion:this.preguntaevaluacionsForeignKey) {
								this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.addItem(preguntaevaluacion);
							}
						}

						if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
					}

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { 
					}

					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePreguntaEvaluacionForeignKey(PreguntaEvaluacion preguntaevaluacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setSelectedItem(preguntaevaluacion);
						} else {
							this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSubPreguntaEvaluacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SubPreguntaEvaluacionConstantesFunciones.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SubPreguntaEvaluacionConstantesFunciones.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion(this.subpreguntaevaluacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(PreguntaEvaluacion.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(this.subpreguntaevaluacions);
			subpreguntaevaluacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SubPreguntaEvaluacionParameterReturnGeneral getSubPreguntaEvaluacionParameterGeneral() {
		return this.subpreguntaevaluacionParameterGeneral;
	}
	
	public void setSubPreguntaEvaluacionParameterGeneral(SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionParameterGeneral) {
		this.subpreguntaevaluacionParameterGeneral = subpreguntaevaluacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSubPreguntaEvaluacion() {
		return isPermisoTodoSubPreguntaEvaluacion;
	}

	public void setIsPermisoTodoSubPreguntaEvaluacion(Boolean isPermisoTodoSubPreguntaEvaluacion) {
		this.isPermisoTodoSubPreguntaEvaluacion = isPermisoTodoSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoNuevoSubPreguntaEvaluacion() {
		return isPermisoNuevoSubPreguntaEvaluacion;
	}

	public void setIsPermisoNuevoSubPreguntaEvaluacion(Boolean isPermisoNuevoSubPreguntaEvaluacion) {
		this.isPermisoNuevoSubPreguntaEvaluacion = isPermisoNuevoSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoActualizarSubPreguntaEvaluacion() {
		return isPermisoActualizarSubPreguntaEvaluacion;
	}

	public void setIsPermisoActualizarSubPreguntaEvaluacion(Boolean isPermisoActualizarSubPreguntaEvaluacion) {
		this.isPermisoActualizarSubPreguntaEvaluacion = isPermisoActualizarSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoEliminarSubPreguntaEvaluacion() {
		return isPermisoEliminarSubPreguntaEvaluacion;
	}

	public void setIsPermisoEliminarSubPreguntaEvaluacion(Boolean isPermisoEliminarSubPreguntaEvaluacion) {
		this.isPermisoEliminarSubPreguntaEvaluacion = isPermisoEliminarSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoGuardarCambiosSubPreguntaEvaluacion() {
		return isPermisoGuardarCambiosSubPreguntaEvaluacion;
	}

	public void setIsPermisoGuardarCambiosSubPreguntaEvaluacion(Boolean isPermisoGuardarCambiosSubPreguntaEvaluacion) {
		this.isPermisoGuardarCambiosSubPreguntaEvaluacion = isPermisoGuardarCambiosSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoConsultaSubPreguntaEvaluacion() {
		return isPermisoConsultaSubPreguntaEvaluacion;
	}

	public void setIsPermisoConsultaSubPreguntaEvaluacion(Boolean isPermisoConsultaSubPreguntaEvaluacion) {
		this.isPermisoConsultaSubPreguntaEvaluacion = isPermisoConsultaSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoBusquedaSubPreguntaEvaluacion() {
		return isPermisoBusquedaSubPreguntaEvaluacion;
	}

	public void setIsPermisoBusquedaSubPreguntaEvaluacion(Boolean isPermisoBusquedaSubPreguntaEvaluacion) {
		this.isPermisoBusquedaSubPreguntaEvaluacion = isPermisoBusquedaSubPreguntaEvaluacion;
	}

	public Boolean getIsPermisoReporteSubPreguntaEvaluacion() {
		return isPermisoReporteSubPreguntaEvaluacion;
	}

	public void setIsPermisoReporteSubPreguntaEvaluacion(Boolean isPermisoReporteSubPreguntaEvaluacion) {
		this.isPermisoReporteSubPreguntaEvaluacion = isPermisoReporteSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioSubPreguntaEvaluacion() {
		return isPermisoPaginacionMedioSubPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionMedioSubPreguntaEvaluacion(Boolean isPermisoPaginacionMedioSubPreguntaEvaluacion) {
		this.isPermisoPaginacionMedioSubPreguntaEvaluacion = isPermisoPaginacionMedioSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoSubPreguntaEvaluacion() {
		return isPermisoPaginacionTodoSubPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionTodoSubPreguntaEvaluacion(Boolean isPermisoPaginacionTodoSubPreguntaEvaluacion) {
		this.isPermisoPaginacionTodoSubPreguntaEvaluacion = isPermisoPaginacionTodoSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoSubPreguntaEvaluacion() {
		return isPermisoPaginacionAltoSubPreguntaEvaluacion;
	}

	public void setIsPermisoPaginacionAltoSubPreguntaEvaluacion(Boolean isPermisoPaginacionAltoSubPreguntaEvaluacion) {
		this.isPermisoPaginacionAltoSubPreguntaEvaluacion = isPermisoPaginacionAltoSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoCopiarSubPreguntaEvaluacion() {
		return isPermisoCopiarSubPreguntaEvaluacion;
	}

	public void setIsPermisoCopiarSubPreguntaEvaluacion(Boolean isPermisoCopiarSubPreguntaEvaluacion) {
		this.isPermisoCopiarSubPreguntaEvaluacion = isPermisoCopiarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoVerFormSubPreguntaEvaluacion() {
		return isPermisoVerFormSubPreguntaEvaluacion;
	}

	public void setIsPermisoVerFormSubPreguntaEvaluacion(Boolean isPermisoVerFormSubPreguntaEvaluacion) {
		this.isPermisoVerFormSubPreguntaEvaluacion = isPermisoVerFormSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoDuplicarSubPreguntaEvaluacion() {
		return isPermisoDuplicarSubPreguntaEvaluacion;
	}

	public void setIsPermisoDuplicarSubPreguntaEvaluacion(Boolean isPermisoDuplicarSubPreguntaEvaluacion) {
		this.isPermisoDuplicarSubPreguntaEvaluacion = isPermisoDuplicarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsPermisoOrdenSubPreguntaEvaluacion() {
		return isPermisoOrdenSubPreguntaEvaluacion;
	}

	public void setIsPermisoOrdenSubPreguntaEvaluacion(Boolean isPermisoOrdenSubPreguntaEvaluacion) {
		this.isPermisoOrdenSubPreguntaEvaluacion = isPermisoOrdenSubPreguntaEvaluacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSubPreguntaEvaluacion() {
		return isVisibilidadCeldaNuevoSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaNuevoSubPreguntaEvaluacion(Boolean isVisibilidadCeldaNuevoSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion = isVisibilidadCeldaNuevoSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaDuplicarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaDuplicarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaDuplicarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion = isVisibilidadCeldaDuplicarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaCopiarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaCopiarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaCopiarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion = isVisibilidadCeldaCopiarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSubPreguntaEvaluacion() {
		return isVisibilidadCeldaVerFormSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaVerFormSubPreguntaEvaluacion(Boolean isVisibilidadCeldaVerFormSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion = isVisibilidadCeldaVerFormSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSubPreguntaEvaluacion() {
		return isVisibilidadCeldaOrdenSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaOrdenSubPreguntaEvaluacion(Boolean isVisibilidadCeldaOrdenSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion = isVisibilidadCeldaOrdenSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion() {
		return isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion(Boolean isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion = isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaModificarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaModificarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaModificarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaModificarSubPreguntaEvaluacion = isVisibilidadCeldaModificarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaActualizarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaActualizarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaActualizarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion = isVisibilidadCeldaActualizarSubPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaEliminarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaEliminarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaEliminarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion = isVisibilidadCeldaEliminarSubPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaCancelarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaCancelarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaCancelarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion = isVisibilidadCeldaCancelarSubPreguntaEvaluacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarSubPreguntaEvaluacion() {
		return isVisibilidadCeldaGuardarSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaGuardarSubPreguntaEvaluacion(Boolean isVisibilidadCeldaGuardarSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion = isVisibilidadCeldaGuardarSubPreguntaEvaluacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion() {
		return isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion(Boolean isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion) {
		this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion = isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion;
	}
		
	public SubPreguntaEvaluacionSessionBean getsubpreguntaevaluacionSessionBean() {
		return this.subpreguntaevaluacionSessionBean;
	}
	
	public void setsubpreguntaevaluacionSessionBean(SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean) {
		this.subpreguntaevaluacionSessionBean=subpreguntaevaluacionSessionBean;
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

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdPreguntaEvaluacion() {
		return this.isVisibilidadFK_IdPreguntaEvaluacion;
	}

	public void setisVisibilidadFK_IdPreguntaEvaluacion(Boolean isVisibilidadFK_IdPreguntaEvaluacion) {
		this.isVisibilidadFK_IdPreguntaEvaluacion=isVisibilidadFK_IdPreguntaEvaluacion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(subpreguntaevaluacion,null);
				this.setActualParaGuardarSucursalForeignKey(subpreguntaevaluacion,null);
				this.setActualParaGuardarPreguntaEvaluacionForeignKey(subpreguntaevaluacion,null);
				this.setActualParaGuardarEjercicioForeignKey(subpreguntaevaluacion,null);
				this.setActualParaGuardarPeriodoForeignKey(subpreguntaevaluacion,null);
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
	
	public void bugActualizarReferenciaActual(SubPreguntaEvaluacion subpreguntaevaluacion,SubPreguntaEvaluacion subpreguntaevaluacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSubPreguntaEvaluacion(subpreguntaevaluacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		subpreguntaevaluacionAux.setId(subpreguntaevaluacion.getId());
		subpreguntaevaluacionAux.setVersionRow(subpreguntaevaluacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSubPreguntaEvaluacion();
		
			int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = subpreguntaevaluacionValidator.getInvalidValues(this.subpreguntaevaluacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			subpreguntaevaluacionLogic.setDatosCliente(datosCliente);
			subpreguntaevaluacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				subpreguntaevaluacionAux=new  SubPreguntaEvaluacion();
				
				subpreguntaevaluacionAux.setIsNew(true);
				subpreguntaevaluacionAux.setIsChanged(true);
				
				subpreguntaevaluacionAux.setSubPreguntaEvaluacionOriginal(this.subpreguntaevaluacion);
				
				subpreguntaevaluacionAux.setId(this.subpreguntaevaluacion.getId());	
				subpreguntaevaluacionAux.setVersionRow(this.subpreguntaevaluacion.getVersionRow());	
				subpreguntaevaluacionAux.setid_empresa(this.subpreguntaevaluacion.getid_empresa());	
				subpreguntaevaluacionAux.setid_sucursal(this.subpreguntaevaluacion.getid_sucursal());	
				subpreguntaevaluacionAux.setid_pregunta_evaluacion(this.subpreguntaevaluacion.getid_pregunta_evaluacion());	
				subpreguntaevaluacionAux.setid_ejercicio(this.subpreguntaevaluacion.getid_ejercicio());	
				subpreguntaevaluacionAux.setid_periodo(this.subpreguntaevaluacion.getid_periodo());	
				subpreguntaevaluacionAux.setorden(this.subpreguntaevaluacion.getorden());	
				subpreguntaevaluacionAux.setpregunta(this.subpreguntaevaluacion.getpregunta());	
				subpreguntaevaluacionAux.setporcentaje_si(this.subpreguntaevaluacion.getporcentaje_si());	
				subpreguntaevaluacionAux.setcon_factura(this.subpreguntaevaluacion.getcon_factura());	
				subpreguntaevaluacionAux.setcon_orden_compra(this.subpreguntaevaluacion.getcon_orden_compra());	
				subpreguntaevaluacionAux.setcon_completo(this.subpreguntaevaluacion.getcon_completo());	
				subpreguntaevaluacionAux.setcon_a_tiempo(this.subpreguntaevaluacion.getcon_a_tiempo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.saveSubPreguntaEvaluacions();//WithConnection
						//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);
					
					this.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subpreguntaevaluacionLogic.saveSubPreguntaEvaluacionRelaciones(subpreguntaevaluacionAux,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							subpreguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				subpreguntaevaluacionAux=new  SubPreguntaEvaluacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() 
					|| (this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() && this.subpreguntaevaluacion.getId()>=0)) {
						
					subpreguntaevaluacionAux.setIsNew(false);
				}
				
				subpreguntaevaluacionAux.setIsDeleted(false);
			
				subpreguntaevaluacionAux.setId(this.subpreguntaevaluacion.getId());	
				subpreguntaevaluacionAux.setVersionRow(this.subpreguntaevaluacion.getVersionRow());	
				subpreguntaevaluacionAux.setid_empresa(this.subpreguntaevaluacion.getid_empresa());	
				subpreguntaevaluacionAux.setid_sucursal(this.subpreguntaevaluacion.getid_sucursal());	
				subpreguntaevaluacionAux.setid_pregunta_evaluacion(this.subpreguntaevaluacion.getid_pregunta_evaluacion());	
				subpreguntaevaluacionAux.setid_ejercicio(this.subpreguntaevaluacion.getid_ejercicio());	
				subpreguntaevaluacionAux.setid_periodo(this.subpreguntaevaluacion.getid_periodo());	
				subpreguntaevaluacionAux.setorden(this.subpreguntaevaluacion.getorden());	
				subpreguntaevaluacionAux.setpregunta(this.subpreguntaevaluacion.getpregunta());	
				subpreguntaevaluacionAux.setporcentaje_si(this.subpreguntaevaluacion.getporcentaje_si());	
				subpreguntaevaluacionAux.setcon_factura(this.subpreguntaevaluacion.getcon_factura());	
				subpreguntaevaluacionAux.setcon_orden_compra(this.subpreguntaevaluacion.getcon_orden_compra());	
				subpreguntaevaluacionAux.setcon_completo(this.subpreguntaevaluacion.getcon_completo());	
				subpreguntaevaluacionAux.setcon_a_tiempo(this.subpreguntaevaluacion.getcon_a_tiempo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.saveSubPreguntaEvaluacions();//WithConnection
						//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);
					
					this.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subpreguntaevaluacionLogic.saveSubPreguntaEvaluacionRelaciones(subpreguntaevaluacionAux,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							subpreguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subpreguntaevaluacion,subpreguntaevaluacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				subpreguntaevaluacionAux=new  SubPreguntaEvaluacion();
				
				subpreguntaevaluacionAux.setIsNew(false);
				subpreguntaevaluacionAux.setIsChanged(false);
				
				subpreguntaevaluacionAux.setIsDeleted(true);
				
				subpreguntaevaluacionAux.setId(this.subpreguntaevaluacion.getId());	
				subpreguntaevaluacionAux.setVersionRow(this.subpreguntaevaluacion.getVersionRow());	
				subpreguntaevaluacionAux.setid_empresa(this.subpreguntaevaluacion.getid_empresa());	
				subpreguntaevaluacionAux.setid_sucursal(this.subpreguntaevaluacion.getid_sucursal());	
				subpreguntaevaluacionAux.setid_pregunta_evaluacion(this.subpreguntaevaluacion.getid_pregunta_evaluacion());	
				subpreguntaevaluacionAux.setid_ejercicio(this.subpreguntaevaluacion.getid_ejercicio());	
				subpreguntaevaluacionAux.setid_periodo(this.subpreguntaevaluacion.getid_periodo());	
				subpreguntaevaluacionAux.setorden(this.subpreguntaevaluacion.getorden());	
				subpreguntaevaluacionAux.setpregunta(this.subpreguntaevaluacion.getpregunta());	
				subpreguntaevaluacionAux.setporcentaje_si(this.subpreguntaevaluacion.getporcentaje_si());	
				subpreguntaevaluacionAux.setcon_factura(this.subpreguntaevaluacion.getcon_factura());	
				subpreguntaevaluacionAux.setcon_orden_compra(this.subpreguntaevaluacion.getcon_orden_compra());	
				subpreguntaevaluacionAux.setcon_completo(this.subpreguntaevaluacion.getcon_completo());	
				subpreguntaevaluacionAux.setcon_a_tiempo(this.subpreguntaevaluacion.getcon_a_tiempo());	
				
				if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.subpreguntaevaluacionAux.getId()>=0) {	
						this.subpreguntaevaluacionsEliminados.add(subpreguntaevaluacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.saveSubPreguntaEvaluacions();//WithConnection
						//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subpreguntaevaluacionLogic.saveSubPreguntaEvaluacionRelaciones(subpreguntaevaluacionAux,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							subpreguntaevaluacionAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(subpreguntaevaluacionAux,subpreguntaevaluacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(this.subpreguntaevaluacionsEliminados);
					
					subpreguntaevaluacionLogic.saveSubPreguntaEvaluacions();//WithConnection
					//subpreguntaevaluacionLogic.getSetVersionRowSubPreguntaEvaluacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion();
				
				this.subpreguntaevaluacionsEliminados= new ArrayList<SubPreguntaEvaluacion>();		
			}
			
			if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sub Pregunta Evaluacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.subpreguntaevaluacion=subpreguntaevaluacionAux;
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
      		//this.finishProcessSubPreguntaEvaluacion();
      	}
		
	}	
	
	public void actualizarRelaciones(SubPreguntaEvaluacion subpreguntaevaluacionLocal) throws Exception {
		
		if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				subpreguntaevaluacionLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
			
			} else {
			
				subpreguntaevaluacionLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SubPreguntaEvaluacion subpreguntaevaluacionLocal) throws Exception {	
		if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				subpreguntaevaluacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				subpreguntaevaluacionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PreguntaEvaluacionDetalleFormJInternalFrame.class)) {
				PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrameLocal=(PreguntaEvaluacionBeanSwingJInternalFrame) ((PreguntaEvaluacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				preguntaevaluacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPreguntaEvaluacion(preguntaevaluacionBeanSwingJInternalFrameLocal.getpreguntaevaluacion(),true);
				preguntaevaluacionBeanSwingJInternalFrameLocal.actualizarLista(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion,this.preguntaevaluacionsForeignKey);

				preguntaevaluacionBeanSwingJInternalFrameLocal.actualizarRelaciones(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion);

				subpreguntaevaluacionLocal.setPreguntaEvaluacion(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion);

				this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
				this.cargarCombosFramePreguntaEvaluacionsForeignKey("Formulario");
				this.setActualPreguntaEvaluacionForeignKey(preguntaevaluacionBeanSwingJInternalFrameLocal.preguntaevaluacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				subpreguntaevaluacionLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				subpreguntaevaluacionLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSubPreguntaEvaluacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = subpreguntaevaluacionValidator.getInvalidValues(this.subpreguntaevaluacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SubPreguntaEvaluacion subpreguntaevaluacion,List<SubPreguntaEvaluacion> subpreguntaevaluacions) throws Exception {
		try	{		
			SubPreguntaEvaluacionConstantesFunciones.actualizarLista(subpreguntaevaluacion,subpreguntaevaluacions,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SubPreguntaEvaluacion subpreguntaevaluacion,List<SubPreguntaEvaluacion> subpreguntaevaluacions) throws Exception {
		try	{			
			SubPreguntaEvaluacionConstantesFunciones.actualizarSelectedLista(subpreguntaevaluacion,subpreguntaevaluacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SubPreguntaEvaluacion> subpreguntaevaluacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				subpreguntaevaluacionsLocal=this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				subpreguntaevaluacionsLocal=this.subpreguntaevaluacions;
			}
			//ARCHITECTURE
		
			for(SubPreguntaEvaluacion subpreguntaevaluacionLocal:subpreguntaevaluacionsLocal) {
				if(this.permiteMantenimiento(subpreguntaevaluacionLocal) && subpreguntaevaluacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.getSubPreguntaEvaluacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_empresaSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_sucursalSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.IDPREGUNTAEVALUACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_ejercicioSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_periodoSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelordenSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.PREGUNTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelpreguntaSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.PORCENTAJESI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelporcentaje_siSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.CONFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_facturaSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.CONORDENCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_orden_compraSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.CONCOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_completoSubPreguntaEvaluacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubPreguntaEvaluacionConstantesFunciones.CONATIEMPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_a_tiempoSubPreguntaEvaluacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_empresaSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_sucursalSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_pregunta_evaluacionSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_ejercicioSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelid_periodoSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelordenSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelpreguntaSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelporcentaje_siSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_facturaSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_orden_compraSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_completoSubPreguntaEvaluacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_a_tiempoSubPreguntaEvaluacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleEvaluacionProveedor")) {
			if(this.subpreguntaevaluacion==null) {
				this.subpreguntaevaluacion= new SubPreguntaEvaluacion();
			}

			if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSubPreguntaEvaluacion
				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getdetalleevaluacionproveedor().setSubPreguntaEvaluacion(this.subpreguntaevaluacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSubPreguntaEvaluacion--;	
		
		
		this.subpreguntaevaluacionAux=new SubPreguntaEvaluacion();
		
		this.subpreguntaevaluacionAux.setId(this.iIdNuevoSubPreguntaEvaluacion);
		this.subpreguntaevaluacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().add(this.subpreguntaevaluacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.subpreguntaevaluacions.add(this.subpreguntaevaluacionAux);
		}
		//ARCHITECTURE
		
		this.subpreguntaevaluacion=this.subpreguntaevaluacionAux;
		
		if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacion);
			this.setVariablesObjetoActualToFormularioForeignKeySubPreguntaEvaluacion(this.subpreguntaevaluacion);
		}
				
		//this.setDefaultControlesSubPreguntaEvaluacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySubPreguntaEvaluacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySubPreguntaEvaluacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySubPreguntaEvaluacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacionBean,this.subpreguntaevaluacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			classes=SubPreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfSubPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.procesarEventosSubPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this.subpreguntaevaluacion,this.subpreguntaevaluacionParameterGeneral,this.isEsNuevoSubPreguntaEvaluacion,classes);//this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral,this.subpreguntaevaluacionBean,false);
		
		if(this.subpreguntaevaluacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion());
		}
		
		if(this.subpreguntaevaluacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion(),classes);//this.subpreguntaevaluacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySubPreguntaEvaluacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySubPreguntaEvaluacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.RecargarFormSubPreguntaEvaluacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
						
			if(subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();
			}
			
			this.actualizarVisualTableDatosSubPreguntaEvaluacion();
			
			this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoSubPreguntaEvaluacion(), this.getIndiceNuevoSubPreguntaEvaluacion());
			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
						
			this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSubPreguntaEvaluacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarordenSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarpreguntaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarporcentaje_siSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarcon_facturaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarcon_orden_compraSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarcon_completoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarcon_a_tiempoSubPreguntaEvaluacion);	
		//
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarid_empresaSubPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarid_sucursalSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarid_pregunta_evaluacionSubPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarid_ejercicioSubPreguntaEvaluacion);//
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setEnabled(isHabilitar && this.subpreguntaevaluacionConstantesFunciones.activarid_periodoSubPreguntaEvaluacion);
	};
	
	public void setDefaultControlesSubPreguntaEvaluacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSubPreguntaEvaluacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(true);			
			this.subpreguntaevaluacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(false);			
			this.subpreguntaevaluacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSubPreguntaEvaluacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				if(subpreguntaevaluacionAux.getId().equals(this.iIdNuevoSubPreguntaEvaluacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacions) {
				if(subpreguntaevaluacionAux.getId().equals(this.iIdNuevoSubPreguntaEvaluacion)) {
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
	
	public int getIndiceActualSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				if(subpreguntaevaluacionAux.getId().equals(subpreguntaevaluacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacions) {
				if(subpreguntaevaluacionAux.getId().equals(subpreguntaevaluacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				if(subpreguntaevaluacionAux.getSubPreguntaEvaluacionOriginal().getId().equals(subpreguntaevaluacionOriginal.getId())) {
					existe=true;
					subpreguntaevaluacionOriginal.setId(subpreguntaevaluacionAux.getId());
					subpreguntaevaluacionOriginal.setVersionRow(subpreguntaevaluacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacions) {
				if(subpreguntaevaluacionAux.getSubPreguntaEvaluacionOriginal().getId().equals(subpreguntaevaluacionOriginal.getId())) {
					existe=true;
					subpreguntaevaluacionOriginal.setId(subpreguntaevaluacionAux.getId());
					subpreguntaevaluacionOriginal.setVersionRow(subpreguntaevaluacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSubPreguntaEvaluacion(Boolean esParaCancelar) throws Exception {
		subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
		subpreguntaevaluacionAux=new SubPreguntaEvaluacion();
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
					if(subpreguntaevaluacionAux.getId()<0) {
						subpreguntaevaluacionsAux.add(subpreguntaevaluacionAux);
					}		
				}
				this.iIdNuevoSubPreguntaEvaluacion=0L;
				this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().removeAll(subpreguntaevaluacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacions) {
					if(subpreguntaevaluacionAux.getId()<0) {
						subpreguntaevaluacionsAux.add(subpreguntaevaluacionAux);
					}		
				}
				this.iIdNuevoSubPreguntaEvaluacion=0L;
				this.subpreguntaevaluacions.removeAll(subpreguntaevaluacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSubPreguntaEvaluacion 
					&& this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()>0
					) {
					subpreguntaevaluacionAux=this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().get(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size() - 1);
				
					if(subpreguntaevaluacionAux.getId()<0) {
						this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().remove(subpreguntaevaluacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSubPreguntaEvaluacion && this.subpreguntaevaluacions.size()>0) {
					subpreguntaevaluacionAux=this.subpreguntaevaluacions.get(this.subpreguntaevaluacions.size() - 1);
				
					if(subpreguntaevaluacionAux.getId()<0) {
						this.subpreguntaevaluacions.remove(subpreguntaevaluacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSubPreguntaEvaluacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(subpreguntaevaluacion.getId()<0) {
				this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().remove(this.subpreguntaevaluacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(subpreguntaevaluacion.getId()<0) {
				this.subpreguntaevaluacions.remove(this.subpreguntaevaluacion);
			}
		}			
	}
	
	public void setEstadosInicialesSubPreguntaEvaluacion(List<SubPreguntaEvaluacion> subpreguntaevaluacionsAux) throws Exception {
		SubPreguntaEvaluacionConstantesFunciones.setEstadosInicialesSubPreguntaEvaluacion(subpreguntaevaluacionsAux);
	}
	
	public void setEstadosInicialesSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacionAux) throws Exception {
		SubPreguntaEvaluacionConstantesFunciones.setEstadosInicialesSubPreguntaEvaluacion(subpreguntaevaluacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSubPreguntaEvaluacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSubPreguntaEvaluacionActual()) {
				if(!this.isEsNuevoSubPreguntaEvaluacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSubPreguntaEvaluacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSubPreguntaEvaluacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sub Pregunta Evaluacion ?", "MANTENIMIENTO DE Sub Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SubPreguntaEvaluacion subpreguntaevaluacion) throws Exception {
		SubPreguntaEvaluacionConstantesFunciones.seleccionarAsignar(this.subpreguntaevaluacion,subpreguntaevaluacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSubPreguntaEvaluacion=this.isPermisoActualizarOriginalSubPreguntaEvaluacion;
			
			
			this.seleccionarAsignar(subpreguntaevaluacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubPreguntaEvaluacionConstantesFunciones.quitarEspaciosSubPreguntaEvaluacion(this.subpreguntaevaluacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.subpreguntaevaluacionSessionBean.setsFuncionBusquedaRapida(this.subpreguntaevaluacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSubPreguntaEvaluacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSubPreguntaEvaluacion(esParaCancelar);				
				this.cancelarNuevoSubPreguntaEvaluacion(esParaCancelar);								
			}
			
			this.subpreguntaevaluacion=new SubPreguntaEvaluacion();
			
			this.inicializarSubPreguntaEvaluacion();
			
			this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSubPreguntaEvaluacion() throws Exception {
		try {
			SubPreguntaEvaluacionConstantesFunciones.inicializarSubPreguntaEvaluacion(this.subpreguntaevaluacion);
			
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
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSubPreguntaEvaluacions(String sAccionBusqueda,List<SubPreguntaEvaluacion> subpreguntaevaluacionsParaReportes) throws Exception {
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
					sPathReporteFinal="SubPreguntaEvaluacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SubPreguntaEvaluacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SubPreguntaEvaluacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SubPreguntaEvaluacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sub Pregunta Evaluaciones");		
		parameters.put("busquedapor", SubPreguntaEvaluacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleEvaluacionProveedor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SubPreguntaEvaluacionLogic subpreguntaevaluacionLogicAuxiliar=new SubPreguntaEvaluacionLogic();
					subpreguntaevaluacionLogicAuxiliar.setDatosCliente(subpreguntaevaluacionLogic.getDatosCliente());				
					subpreguntaevaluacionLogicAuxiliar.setSubPreguntaEvaluacions(subpreguntaevaluacionsParaReportes);
					
					subpreguntaevaluacionLogicAuxiliar.cargarRelacionesLoteForeignKeySubPreguntaEvaluacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					subpreguntaevaluacionsParaReportes=subpreguntaevaluacionLogicAuxiliar.getSubPreguntaEvaluacions();
					
					//subpreguntaevaluacionLogic.getNewConnexionToDeep();
					
					//for (SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsParaReportes) {
					//	subpreguntaevaluacionLogic.deepLoad(subpreguntaevaluacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//subpreguntaevaluacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleEvaluacionProveedor = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionProveedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionproveedor", reportFileDetalleEvaluacionProveedor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSubPreguntaEvaluacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SubPreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SubPreguntaEvaluacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSubPreguntaEvaluacion=new JRBeanArrayDataSource(SubPreguntaEvaluacionJInternalFrame.TraerSubPreguntaEvaluacionBeans(subpreguntaevaluacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSubPreguntaEvaluacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SubPreguntaEvaluacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SubPreguntaEvaluacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SubPreguntaEvaluacionBean.TraerSubPreguntaEvaluacionBeans(subpreguntaevaluacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacionActionPerformed(null);
					//this.generarExcelReporteSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSubPreguntaEvaluacions(sAccionBusqueda,sTipoArchivoReporte,subpreguntaevaluacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSubPreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SubPreguntaEvaluacion> subpreguntaevaluacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubPreguntaEvaluacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubPreguntaEvaluacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SubPreguntaEvaluacion subpreguntaevaluacion : subpreguntaevaluacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SubPreguntaEvaluacionConstantesFunciones.generarExcelReporteDataSubPreguntaEvaluacion("NORMAL",row,workbook,subpreguntaevaluacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSubPreguntaEvaluacion(String sTipo,Row row,Workbook workbook) {
		
		SubPreguntaEvaluacionConstantesFunciones.generarExcelReporteHeaderSubPreguntaEvaluacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSubPreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SubPreguntaEvaluacion> subpreguntaevaluacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubPreguntaEvaluacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SubPreguntaEvaluacion subpreguntaevaluacion : subpreguntaevaluacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.getSubPreguntaEvaluacionDescripcion(subpreguntaevaluacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getpreguntaevaluacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getpregunta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subpreguntaevaluacion.getporcentaje_si());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(subpreguntaevaluacion.getcon_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(subpreguntaevaluacion.getcon_orden_compra()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(subpreguntaevaluacion.getcon_completo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(subpreguntaevaluacion.getcon_a_tiempo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSubPreguntaEvaluacions(String sAccionBusqueda,String sTipoArchivoReporte,List<SubPreguntaEvaluacion> subpreguntaevaluacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SubPreguntaEvaluacion> subpreguntaevaluacionsRespaldo=null;
		
		classes=SubPreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfSubPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.subpreguntaevaluacionLogic.setDatosCliente(this.datosCliente);
		this.subpreguntaevaluacionLogic.setDatosDeep(this.datosDeep);
		this.subpreguntaevaluacionLogic.setIsConDeep(true);
		
		subpreguntaevaluacionsRespaldo=this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions();
		
		this.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(subpreguntaevaluacionsParaReportes);	
		this.subpreguntaevaluacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		subpreguntaevaluacionsParaReportes=this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions();
		this.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(subpreguntaevaluacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubPreguntaEvaluacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubPreguntaEvaluacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SubPreguntaEvaluacion subpreguntaevaluacion : subpreguntaevaluacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSubPreguntaEvaluacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SubPreguntaEvaluacionConstantesFunciones.generarExcelReporteDataSubPreguntaEvaluacion("NORMAL",row,workbook,subpreguntaevaluacion,cellStyleDataAux);
		
			
			


				//DetalleEvaluacionProveedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(subpreguntaevaluacion.getDetalleEvaluacionProveedors()!=null && subpreguntaevaluacion.getDetalleEvaluacionProveedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionProveedor("RELACIONADO",row,workbook);
				}

				if(subpreguntaevaluacion.getDetalleEvaluacionProveedors()!=null) {
					i2=0;
					for(DetalleEvaluacionProveedor detalleevaluacionproveedor : subpreguntaevaluacion.getDetalleEvaluacionProveedors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteDataDetalleEvaluacionProveedor("RELACIONADO",row,workbook,detalleevaluacionproveedor,cellStyleDataAuxHijo);
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
		cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.getSubPreguntaEvaluacionDescripcion(subpreguntaevaluacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSubPreguntaEvaluacion() throws Exception {		
		this.startProcessSubPreguntaEvaluacion(true);
	}
	
	public void startProcessSubPreguntaEvaluacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSubPreguntaEvaluacion ,this.jPanelParametrosReportesSubPreguntaEvaluacion, this.jScrollPanelDatosSubPreguntaEvaluacion,this.jPanelPaginacionSubPreguntaEvaluacion, this.jScrollPanelDatosEdicionSubPreguntaEvaluacion, this.jPanelAccionesSubPreguntaEvaluacion,this.jPanelAccionesFormularioSubPreguntaEvaluacion,this.jmenuBarSubPreguntaEvaluacion,this.jmenuBarDetalleSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion);		
		
		final JTabbedPane jTabbedPaneBusquedasSubPreguntaEvaluacion=this.jTabbedPaneBusquedasSubPreguntaEvaluacion; 
		
		final JPanel jPanelParametrosReportesSubPreguntaEvaluacion=this.jPanelParametrosReportesSubPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosSubPreguntaEvaluacion=this.jScrollPanelDatosSubPreguntaEvaluacion;
		final JTable jTableDatosSubPreguntaEvaluacion=this.jTableDatosSubPreguntaEvaluacion;		
		final JPanel jPanelPaginacionSubPreguntaEvaluacion=this.jPanelPaginacionSubPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosEdicionSubPreguntaEvaluacion=this.jScrollPanelDatosEdicionSubPreguntaEvaluacion;
		final JPanel jPanelAccionesSubPreguntaEvaluacion=this.jPanelAccionesSubPreguntaEvaluacion;
		
		JPanel jPanelCamposAuxiliarSubPreguntaEvaluacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			jPanelCamposAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelCamposSubPreguntaEvaluacion;
			jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelAccionesFormularioSubPreguntaEvaluacion;
		}
		
		final JPanel jPanelCamposSubPreguntaEvaluacion=jPanelCamposAuxiliarSubPreguntaEvaluacion;
		final JPanel jPanelAccionesFormularioSubPreguntaEvaluacion=jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion;
		
		
		final JMenuBar jmenuBarSubPreguntaEvaluacion=this.jmenuBarSubPreguntaEvaluacion;
		final JToolBar jTtoolBarSubPreguntaEvaluacion=this.jTtoolBarSubPreguntaEvaluacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSubPreguntaEvaluacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			jmenuBarDetalleAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jmenuBarDetalleSubPreguntaEvaluacion;
			jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTtoolBarDetalleSubPreguntaEvaluacion;
		}
		
		final JMenuBar jmenuBarDetalleSubPreguntaEvaluacion=jmenuBarDetalleAuxiliarSubPreguntaEvaluacion;
		final JToolBar jTtoolBarDetalleSubPreguntaEvaluacion=jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubPreguntaEvaluacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubPreguntaEvaluacion;
			processRunnable.jTableDatos=jTableDatosSubPreguntaEvaluacion;
			processRunnable.jPanelCampos=jPanelCamposSubPreguntaEvaluacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubPreguntaEvaluacion;
			processRunnable.jPanelAcciones=jPanelAccionesSubPreguntaEvaluacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubPreguntaEvaluacion;
			
			
			processRunnable.jmenuBar=jmenuBarSubPreguntaEvaluacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubPreguntaEvaluacion;
			processRunnable.jTtoolBar=jTtoolBarSubPreguntaEvaluacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubPreguntaEvaluacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubPreguntaEvaluacion ,jPanelParametrosReportesSubPreguntaEvaluacion,jTableDatosSubPreguntaEvaluacion, /*jScrollPanelDatosSubPreguntaEvaluacion,*/jPanelCamposSubPreguntaEvaluacion,jPanelPaginacionSubPreguntaEvaluacion, /*jScrollPanelDatosEdicionSubPreguntaEvaluacion,*/ jPanelAccionesSubPreguntaEvaluacion,jPanelAccionesFormularioSubPreguntaEvaluacion,jmenuBarSubPreguntaEvaluacion,jmenuBarDetalleSubPreguntaEvaluacion,jTtoolBarSubPreguntaEvaluacion,jTtoolBarDetalleSubPreguntaEvaluacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubPreguntaEvaluacion ,jPanelParametrosReportesSubPreguntaEvaluacion, jScrollPanelDatosSubPreguntaEvaluacion,jPanelPaginacionSubPreguntaEvaluacion, jScrollPanelDatosEdicionSubPreguntaEvaluacion, jPanelAccionesSubPreguntaEvaluacion,jPanelAccionesFormularioSubPreguntaEvaluacion,jmenuBarSubPreguntaEvaluacion,jmenuBarDetalleSubPreguntaEvaluacion,jTtoolBarSubPreguntaEvaluacion,jTtoolBarDetalleSubPreguntaEvaluacion);
						
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
	
	public void finishProcessSubPreguntaEvaluacion() {// throws Exception 
		this.finishProcessSubPreguntaEvaluacion(true);
	}
	
	public void finishProcessSubPreguntaEvaluacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSubPreguntaEvaluacion ,this.jPanelParametrosReportesSubPreguntaEvaluacion, this.jScrollPanelDatosSubPreguntaEvaluacion,this.jPanelPaginacionSubPreguntaEvaluacion, this.jScrollPanelDatosEdicionSubPreguntaEvaluacion, this.jPanelAccionesSubPreguntaEvaluacion,this.jPanelAccionesFormularioSubPreguntaEvaluacion,this.jmenuBarSubPreguntaEvaluacion,this.jmenuBarDetalleSubPreguntaEvaluacion,this.jTtoolBarSubPreguntaEvaluacion,this.jTtoolBarDetalleSubPreguntaEvaluacion);		
		
		final JTabbedPane jTabbedPaneBusquedasSubPreguntaEvaluacion=this.jTabbedPaneBusquedasSubPreguntaEvaluacion; 
		
		final JPanel jPanelParametrosReportesSubPreguntaEvaluacion=this.jPanelParametrosReportesSubPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosSubPreguntaEvaluacion=this.jScrollPanelDatosSubPreguntaEvaluacion;
		final JTable jTableDatosSubPreguntaEvaluacion=this.jTableDatosSubPreguntaEvaluacion;		
		final JPanel jPanelPaginacionSubPreguntaEvaluacion=this.jPanelPaginacionSubPreguntaEvaluacion;
		//final JScrollPane jScrollPanelDatosEdicionSubPreguntaEvaluacion=this.jScrollPanelDatosEdicionSubPreguntaEvaluacion;
		final JPanel jPanelAccionesSubPreguntaEvaluacion=this.jPanelAccionesSubPreguntaEvaluacion;
		
		JPanel jPanelCamposAuxiliarSubPreguntaEvaluacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			jPanelCamposAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelCamposSubPreguntaEvaluacion;
			jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelAccionesFormularioSubPreguntaEvaluacion;
		}
		
		final JPanel jPanelCamposSubPreguntaEvaluacion=jPanelCamposAuxiliarSubPreguntaEvaluacion;
		final JPanel jPanelAccionesFormularioSubPreguntaEvaluacion=jPanelAccionesFormularioAuxiliarSubPreguntaEvaluacion;
		
		
		final JMenuBar jmenuBarSubPreguntaEvaluacion=this.jmenuBarSubPreguntaEvaluacion;		
		final JToolBar jTtoolBarSubPreguntaEvaluacion=this.jTtoolBarSubPreguntaEvaluacion;
				
		JMenuBar jmenuBarDetalleAuxiliarSubPreguntaEvaluacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			jmenuBarDetalleAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jmenuBarDetalleSubPreguntaEvaluacion;
			jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTtoolBarDetalleSubPreguntaEvaluacion;		
		}
		
		final JMenuBar jmenuBarDetalleSubPreguntaEvaluacion=jmenuBarDetalleAuxiliarSubPreguntaEvaluacion;
		final JToolBar jTtoolBarDetalleSubPreguntaEvaluacion=jTtoolBarDetalleAuxiliarSubPreguntaEvaluacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubPreguntaEvaluacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubPreguntaEvaluacion;
			processRunnable.jTableDatos=jTableDatosSubPreguntaEvaluacion;
			processRunnable.jPanelCampos=jPanelCamposSubPreguntaEvaluacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubPreguntaEvaluacion;
			processRunnable.jPanelAcciones=jPanelAccionesSubPreguntaEvaluacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubPreguntaEvaluacion;
			
			
			processRunnable.jmenuBar=jmenuBarSubPreguntaEvaluacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubPreguntaEvaluacion;
			processRunnable.jTtoolBar=jTtoolBarSubPreguntaEvaluacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubPreguntaEvaluacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSubPreguntaEvaluacion ,jPanelParametrosReportesSubPreguntaEvaluacion, jTableDatosSubPreguntaEvaluacion,/*jScrollPanelDatosSubPreguntaEvaluacion,*/jPanelCamposSubPreguntaEvaluacion,jPanelPaginacionSubPreguntaEvaluacion, /*jScrollPanelDatosEdicionSubPreguntaEvaluacion,*/ jPanelAccionesSubPreguntaEvaluacion,jPanelAccionesFormularioSubPreguntaEvaluacion,jmenuBarSubPreguntaEvaluacion,jmenuBarDetalleSubPreguntaEvaluacion,jTtoolBarSubPreguntaEvaluacion,jTtoolBarDetalleSubPreguntaEvaluacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSubPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSubPreguntaEvaluacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSubPreguntaEvaluacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSubPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSubPreguntaEvaluacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSubPreguntaEvaluacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSubPreguntaEvaluacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSubPreguntaEvaluacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSubPreguntaEvaluacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.subpreguntaevaluacionConstantesFunciones.getsFinalQuerySubPreguntaEvaluacion();
		String  finalQueryPaginacionTodos=this.subpreguntaevaluacionConstantesFunciones.getsFinalQuerySubPreguntaEvaluacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SubPreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesNoSubPreguntaEvaluacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SubPreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesSubPreguntaEvaluacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SubPreguntaEvaluacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.subpreguntaevaluacionsEliminados= new ArrayList<SubPreguntaEvaluacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSubPreguntaEvaluacion();
		
				///*SubPreguntaEvaluacionSessionBean*/this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			
			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
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
					this.iNumeroPaginacion=SubPreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SubPreguntaEvaluacionConstantesFunciones.getClassesForeignKeysOfSubPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/subpreguntaevaluacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			subpreguntaevaluacionsAux= new ArrayList<SubPreguntaEvaluacion>();
			
				
			subpreguntaevaluacionLogic.setDatosCliente(this.datosCliente);
			subpreguntaevaluacionLogic.setDatosDeep(this.datosDeep);
			subpreguntaevaluacionLogic.setIsConDeep(true);
			
			
			subpreguntaevaluacionLogic.getSubPreguntaEvaluacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					subpreguntaevaluacionLogic.getTodosSubPreguntaEvaluacions(finalQueryGlobal,pagination);
					
					//subpreguntaevaluacionLogic.getTodosSubPreguntaEvaluacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null|| subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subpreguntaevaluacionsAux= new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux= new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subpreguntaevaluacionLogic.getTodosSubPreguntaEvaluacions(finalQueryGlobal+"",this.pagination);												
							
							//subpreguntaevaluacionLogic.getTodosSubPreguntaEvaluacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());					
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSubPreguntaEvaluacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSubPreguntaEvaluacion=this.idActual;
				
				} else if(this.idSubPreguntaEvaluacionActual!=null && this.idSubPreguntaEvaluacionActual!=0L) {
					idSubPreguntaEvaluacion=idSubPreguntaEvaluacionActual;
				}
				
					
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndicePorId(idSubPreguntaEvaluacion);
				
				this.subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					subpreguntaevaluacionLogic.getEntity(idSubPreguntaEvaluacion);
					
					//subpreguntaevaluacionLogic.getEntityWithConnection(idSubPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().add(subpreguntaevaluacionLogic.getSubPreguntaEvaluacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
					this.subpreguntaevaluacions.add(subpreguntaevaluacion);
				}
				
				if(subpreguntaevaluacionLogic.getSubPreguntaEvaluacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null||subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subpreguntaevaluacions==null|| subpreguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
						subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubPreguntaEvaluacions("FK_IdEjercicio",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubPreguntaEvaluacions("FK_IdEjercicio",subpreguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
						subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null||subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subpreguntaevaluacions==null|| subpreguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
						subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubPreguntaEvaluacions("FK_IdEmpresa",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubPreguntaEvaluacions("FK_IdEmpresa",subpreguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
						subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null||subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subpreguntaevaluacions==null|| subpreguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
						subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubPreguntaEvaluacions("FK_IdPeriodo",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubPreguntaEvaluacions("FK_IdPeriodo",subpreguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
						subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPreguntaEvaluacion")) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion(finalQueryGlobal,pagination,id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null||subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subpreguntaevaluacions==null|| subpreguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
						subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion(finalQueryGlobal,pagination,id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdPreguntaEvaluacion(id_pregunta_evaluacionFK_IdPreguntaEvaluacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubPreguntaEvaluacions("FK_IdPreguntaEvaluacion",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubPreguntaEvaluacions("FK_IdPreguntaEvaluacion",subpreguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
						subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()==null||subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subpreguntaevaluacions==null|| subpreguntaevaluacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
						subpreguntaevaluacionsAux.addAll(subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionsAux=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacionsAux.addAll(subpreguntaevaluacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubPreguntaEvaluacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubPreguntaEvaluacions("FK_IdSucursal",subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubPreguntaEvaluacions("FK_IdSucursal",subpreguntaevaluacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(new ArrayList<SubPreguntaEvaluacion>());
						subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().addAll(subpreguntaevaluacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
							subpreguntaevaluacions.addAll(subpreguntaevaluacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSubPreguntaEvaluacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSubPreguntaEvaluacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subpreguntaevaluacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subpreguntaevaluacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SubPreguntaEvaluacion subpreguntaevaluacion) {
		Boolean permite=true;
		
		if(this.subpreguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SubPreguntaEvaluacionConstantesFunciones.getOrderByListaSubPreguntaEvaluacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SubPreguntaEvaluacionConstantesFunciones.getOrderByListaSubPreguntaEvaluacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				if(subpreguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					subpreguntaevaluacionTotales=subpreguntaevaluacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubPreguntaEvaluacion subpreguntaevaluacion:this.subpreguntaevaluacions) {
				if(subpreguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					subpreguntaevaluacionTotales=subpreguntaevaluacion;
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
			this.subpreguntaevaluacionAux=new SubPreguntaEvaluacion();
			this.subpreguntaevaluacionAux.setsType(Constantes2.S_TOTALES);
			this.subpreguntaevaluacionAux.setIsNew(false);
			this.subpreguntaevaluacionAux.setIsChanged(false);
			this.subpreguntaevaluacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SubPreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaSubPreguntaEvaluacion(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this.subpreguntaevaluacionAux);
				
				this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().add(this.subpreguntaevaluacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SubPreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaSubPreguntaEvaluacion(this.subpreguntaevaluacions,this.subpreguntaevaluacionAux);
				
				this.subpreguntaevaluacions.add(this.subpreguntaevaluacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		subpreguntaevaluacionTotales=new SubPreguntaEvaluacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().remove(subpreguntaevaluacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subpreguntaevaluacions.remove(subpreguntaevaluacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		subpreguntaevaluacionTotales=new SubPreguntaEvaluacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				if(subpreguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					subpreguntaevaluacionTotales=subpreguntaevaluacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubPreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaSubPreguntaEvaluacion(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),subpreguntaevaluacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubPreguntaEvaluacion subpreguntaevaluacion:this.subpreguntaevaluacions) {
				if(subpreguntaevaluacion.getsType().equals(Constantes2.S_TOTALES)) {
					subpreguntaevaluacionTotales=subpreguntaevaluacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubPreguntaEvaluacionConstantesFunciones.TotalizarValoresFilaSubPreguntaEvaluacion(this.subpreguntaevaluacions,subpreguntaevaluacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSubPreguntaEvaluacionsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdPreguntaEvaluacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSubPreguntaEvaluacionsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion(String sFinalQuery,Long id_pregunta_evaluacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion(sFinalQuery,this.pagination,id_pregunta_evaluacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubPreguntaEvaluacionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLogic.getSubPreguntaEvaluacionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSubPreguntaEvaluacion() {
		this.isPermisoTodoSubPreguntaEvaluacion=false;
		this.isPermisoNuevoSubPreguntaEvaluacion=false;
		this.isPermisoActualizarSubPreguntaEvaluacion=false;
		this.isPermisoActualizarOriginalSubPreguntaEvaluacion=false;
		this.isPermisoEliminarSubPreguntaEvaluacion=false;
		this.isPermisoGuardarCambiosSubPreguntaEvaluacion=false;
		this.isPermisoConsultaSubPreguntaEvaluacion=false;
		this.isPermisoBusquedaSubPreguntaEvaluacion=false;
		this.isPermisoReporteSubPreguntaEvaluacion=false;		
		this.isPermisoOrdenSubPreguntaEvaluacion=false;		
		this.isPermisoPaginacionMedioSubPreguntaEvaluacion=false;		
		this.isPermisoPaginacionAltoSubPreguntaEvaluacion=false;
		this.isPermisoPaginacionTodoSubPreguntaEvaluacion=false;
		this.isPermisoCopiarSubPreguntaEvaluacion=false;		
		this.isPermisoVerFormSubPreguntaEvaluacion=false;		
		this.isPermisoDuplicarSubPreguntaEvaluacion=false;		
		this.isPermisoOrdenSubPreguntaEvaluacion=false;		
	}
	
	public void setPermisosUsuarioSubPreguntaEvaluacion(Boolean isPermiso) {
		this.isPermisoTodoSubPreguntaEvaluacion=isPermiso;
		this.isPermisoNuevoSubPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarSubPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarOriginalSubPreguntaEvaluacion=isPermiso;
		this.isPermisoEliminarSubPreguntaEvaluacion=isPermiso;
		this.isPermisoGuardarCambiosSubPreguntaEvaluacion=isPermiso;
		this.isPermisoConsultaSubPreguntaEvaluacion=isPermiso;
		this.isPermisoBusquedaSubPreguntaEvaluacion=isPermiso;
		this.isPermisoReporteSubPreguntaEvaluacion=isPermiso;
		this.isPermisoOrdenSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionMedioSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionAltoSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoPaginacionTodoSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoCopiarSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoVerFormSubPreguntaEvaluacion=isPermiso;		
		this.isPermisoDuplicarSubPreguntaEvaluacion=isPermiso;
		this.isPermisoOrdenSubPreguntaEvaluacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSubPreguntaEvaluacion(Boolean isPermiso) {
		//this.isPermisoTodoSubPreguntaEvaluacion=isPermiso;
		this.isPermisoNuevoSubPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarSubPreguntaEvaluacion=isPermiso;
		this.isPermisoActualizarOriginalSubPreguntaEvaluacion=isPermiso;
		this.isPermisoEliminarSubPreguntaEvaluacion=isPermiso;
		this.isPermisoGuardarCambiosSubPreguntaEvaluacion=isPermiso;
		//this.isPermisoConsultaSubPreguntaEvaluacion=isPermiso;
		//this.isPermisoBusquedaSubPreguntaEvaluacion=isPermiso;
		//this.isPermisoReporteSubPreguntaEvaluacion=isPermiso;
		//this.isPermisoOrdenSubPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionMedioSubPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionAltoSubPreguntaEvaluacion=isPermiso;		
		//this.isPermisoPaginacionTodoSubPreguntaEvaluacion=isPermiso;		
		//this.isPermisoCopiarSubPreguntaEvaluacion=isPermiso;		
		//this.isPermisoDuplicarSubPreguntaEvaluacion=isPermiso;
		//this.isPermisoOrdenSubPreguntaEvaluacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSubPreguntaEvaluacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
		if(SubPreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleEvaluacionProveedor=false;
		this.isTienePermisosDetalleEvaluacionProveedor=this.verificarGetPermisosUsuarioOpcionSubPreguntaEvaluacionClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSubPreguntaEvaluacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleEvaluacionProveedor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSubPreguntaEvaluacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSubPreguntaEvaluacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSubPreguntaEvaluacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleEvaluacionProveedor && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.remove(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSubPreguntaEvaluacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SubPreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSubPreguntaEvaluacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSubPreguntaEvaluacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSubPreguntaEvaluacion=this.isPermisoActualizarSubPreguntaEvaluacion;
			this.isPermisoEliminarSubPreguntaEvaluacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSubPreguntaEvaluacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSubPreguntaEvaluacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSubPreguntaEvaluacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSubPreguntaEvaluacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSubPreguntaEvaluacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubPreguntaEvaluacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSubPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSubPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSubPreguntaEvaluacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSubPreguntaEvaluacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSubPreguntaEvaluacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSubPreguntaEvaluacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubPreguntaEvaluacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSubPreguntaEvaluacion.setToolTipText(this.jTableDatosSubPreguntaEvaluacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSubPreguntaEvaluacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSubPreguntaEvaluacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSubPreguntaEvaluacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleEvaluacionProveedor && this.subpreguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorSubPreguntaEvaluacion && !SubPreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Proveedor");
			reporte.setsDescripcion("Detalle Evaluacion Proveedor");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeySubPreguntaEvaluacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.preguntaevaluacionsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySubPreguntaEvaluacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SubPreguntaEvaluacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySubPreguntaEvaluacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPreguntaEvaluacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.preguntaevaluacionsForeignKey==null||this.preguntaevaluacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaEvaluacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PreguntaEvaluacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeySubPreguntaEvaluacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionReturnGeneral=new SubPreguntaEvaluacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.subpreguntaevaluacionConstantesFunciones.cargarid_empresaSubPreguntaEvaluacion)
					 || (this.esRecargarFks && this.subpreguntaevaluacionConstantesFunciones.cargarid_empresaSubPreguntaEvaluacion)) {

					if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+subpreguntaevaluacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.subpreguntaevaluacionConstantesFunciones.cargarid_sucursalSubPreguntaEvaluacion)
					 || (this.esRecargarFks && this.subpreguntaevaluacionConstantesFunciones.cargarid_sucursalSubPreguntaEvaluacion)) {

					if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+subpreguntaevaluacionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalPreguntaEvaluacion="";

				if(((this.preguntaevaluacionsForeignKey==null||this.preguntaevaluacionsForeignKey.size()<=0) && this.subpreguntaevaluacionConstantesFunciones.cargarid_pregunta_evaluacionSubPreguntaEvaluacion)
					 || (this.esRecargarFks && this.subpreguntaevaluacionConstantesFunciones.cargarid_pregunta_evaluacionSubPreguntaEvaluacion)) {

					if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PreguntaEvaluacionConstantesFunciones.getArrayColumnasGlobalesPreguntaEvaluacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPreguntaEvaluacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PreguntaEvaluacionConstantesFunciones.TABLENAME);

						finalQueryGlobalPreguntaEvaluacion=Funciones.GetFinalQueryAppend(finalQueryGlobalPreguntaEvaluacion, "");
						finalQueryGlobalPreguntaEvaluacion+=PreguntaEvaluacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPreguntaEvaluacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPreguntaEvaluacion=" WHERE " + ConstantesSql.ID + "="+subpreguntaevaluacionSessionBean.getlidPreguntaEvaluacionActual();
					}
				} else {
					finalQueryGlobalPreguntaEvaluacion="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.subpreguntaevaluacionConstantesFunciones.cargarid_ejercicioSubPreguntaEvaluacion)
					 || (this.esRecargarFks && this.subpreguntaevaluacionConstantesFunciones.cargarid_ejercicioSubPreguntaEvaluacion)) {

					if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+subpreguntaevaluacionSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.subpreguntaevaluacionConstantesFunciones.cargarid_periodoSubPreguntaEvaluacion)
					 || (this.esRecargarFks && this.subpreguntaevaluacionConstantesFunciones.cargarid_periodoSubPreguntaEvaluacion)) {

					if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+subpreguntaevaluacionSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.cargarCombosLoteForeignKeySubPreguntaEvaluacion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalPreguntaEvaluacion,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=subpreguntaevaluacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=subpreguntaevaluacionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalPreguntaEvaluacion.equals("NONE")) {
				this.preguntaevaluacionsForeignKey=subpreguntaevaluacionReturnGeneral.getpreguntaevaluacionsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=subpreguntaevaluacionReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=subpreguntaevaluacionReturnGeneral.getperiodosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySubPreguntaEvaluacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPreguntaEvaluacion()throws Exception {
		try {

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPreguntaEvaluacion()) {
				PreguntaEvaluacion preguntaevaluacion=new PreguntaEvaluacion();
				PreguntaEvaluacionConstantesFunciones.setPreguntaEvaluacionDescripcion(preguntaevaluacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				preguntaevaluacion.setId(null);

				if(!PreguntaEvaluacionConstantesFunciones.ExisteEnLista(this.preguntaevaluacionsForeignKey,preguntaevaluacion,true)) {

					this.preguntaevaluacionsForeignKey.add(0,preguntaevaluacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.subpreguntaevaluacionSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeySubPreguntaEvaluacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySubPreguntaEvaluacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySubPreguntaEvaluacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySubPreguntaEvaluacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion)throws Exception {	
		try {
			
			this.setActualPreguntaEvaluacionForeignKey(subpreguntaevaluacion.getid_pregunta_evaluacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySubPreguntaEvaluacion()throws Exception {	
		try {
			
			this.setActualPreguntaEvaluacionForeignKey(this.subpreguntaevaluacionConstantesFunciones.getid_pregunta_evaluacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySubPreguntaEvaluacion()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySubPreguntaEvaluacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySubPreguntaEvaluacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSubPreguntaEvaluacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySubPreguntaEvaluacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFramePreguntaEvaluacionsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySubPreguntaEvaluacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySubPreguntaEvaluacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public SubPreguntaEvaluacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SubPreguntaEvaluacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SubPreguntaEvaluacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean(); 
		this.subpreguntaevaluacionConstantesFunciones=new SubPreguntaEvaluacionConstantesFunciones(); 
		this.subpreguntaevaluacionBean=new SubPreguntaEvaluacion();//(this.subpreguntaevaluacionConstantesFunciones); 		
		this.subpreguntaevaluacionReturnGeneral=new SubPreguntaEvaluacionParameterReturnGeneral(); 
		
		this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SubPreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SubPreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SubPreguntaEvaluacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSubPreguntaEvaluacion(true);
			
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
			
			this.subpreguntaevaluacionConstantesFunciones=new SubPreguntaEvaluacionConstantesFunciones(); 
			this.subpreguntaevaluacionBean=new SubPreguntaEvaluacion();//this.subpreguntaevaluacionConstantesFunciones); 			
			this.subpreguntaevaluacionReturnGeneral=new SubPreguntaEvaluacionParameterReturnGeneral(); 
		
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Pregunta Evaluacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.subpreguntaevaluacion=new SubPreguntaEvaluacion();
			this.subpreguntaevaluacions = new ArrayList<SubPreguntaEvaluacion>();
			this.subpreguntaevaluacionsAux = new ArrayList<SubPreguntaEvaluacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic=new SubPreguntaEvaluacionLogic();
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			//this.subpreguntaevaluacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.subpreguntaevaluacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSubPreguntaEvaluacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion);	
					}
					
					if(this.jInternalFrameImportacionSubPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubPreguntaEvaluacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySubPreguntaEvaluacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySubPreguntaEvaluacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSubPreguntaEvaluacion);
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion);
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSubPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSubPreguntaEvaluacion);
					this.jInternalFrameImportacionSubPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameImportacionSubPreguntaEvaluacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySubPreguntaEvaluacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySubPreguntaEvaluacion);
					this.jInternalFrameOrderBySubPreguntaEvaluacion.setVisible(false);
					this.jInternalFrameOrderBySubPreguntaEvaluacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSubPreguntaEvaluacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SubPreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.subpreguntaevaluacionReturnGeneral=new SubPreguntaEvaluacionParameterReturnGeneral();
			
			this.subpreguntaevaluacionParameterGeneral=new SubPreguntaEvaluacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.subpreguntaevaluacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdPreguntaEvaluacion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSubPreguntaEvaluacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSubPreguntaEvaluacion(false);
			
			this.setPermisosUsuarioSubPreguntaEvaluacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() 
				|| (this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado() && this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSubPreguntaEvaluacionClasesRelacionadas();
			}
			
			if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSubPreguntaEvaluacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSubPreguntaEvaluacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSubPreguntaEvaluacion();
			}
			
			if(!this.isPermisoBusquedaSubPreguntaEvaluacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSubPreguntaEvaluacion,this.isPermisoPaginacionMedioSubPreguntaEvaluacion,this.isPermisoPaginacionTodoSubPreguntaEvaluacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SubPreguntaEvaluacionConstantesFunciones.getTiposSeleccionarSubPreguntaEvaluacion());
				
				this.tiposColumnasSelect=SubPreguntaEvaluacionConstantesFunciones.getTiposSeleccionarSubPreguntaEvaluacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSubPreguntaEvaluacion();				
				//this.tiposRelacionesSelect=SubPreguntaEvaluacionConstantesFunciones.getTiposRelacionesSubPreguntaEvaluacion(true);
				
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
			//if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSubPreguntaEvaluacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSubPreguntaEvaluacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSubPreguntaEvaluacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSubPreguntaEvaluacion() ;
			
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
			
			
			this.detalleevaluacionproveedorLogic=new DetalleEvaluacionProveedorLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.preguntaevaluacionLogic=new PreguntaEvaluacionLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				subpreguntaevaluacionImplementable= (SubPreguntaEvaluacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubPreguntaEvaluacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				subpreguntaevaluacionImplementableHome= (SubPreguntaEvaluacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubPreguntaEvaluacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.subpreguntaevaluacions= new ArrayList<SubPreguntaEvaluacion>();
			this.subpreguntaevaluacionsEliminados= new ArrayList<SubPreguntaEvaluacion>();
						
			this.isEsNuevoSubPreguntaEvaluacion=false;
			this.esParaAccionDesdeFormularioSubPreguntaEvaluacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySubPreguntaEvaluacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSubPreguntaEvaluacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SubPreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSubPreguntaEvaluacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSubPreguntaEvaluacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSubPreguntaEvaluacion();
			}
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSubPreguntaEvaluacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SubPreguntaEvaluacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSubPreguntaEvaluacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSubPreguntaEvaluacion")) {
				iIndex=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Proveedores")) {
					if(!DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSubPreguntaEvaluacion();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSubPreguntaEvaluacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(false,true,iIndex);
		this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();

		//this.jTabbedPaneRelacionesSubPreguntaEvaluacion.updateUI();
		//this.jTabbedPaneRelacionesSubPreguntaEvaluacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSubPreguntaEvaluacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleEvaluacionProveedor")) {
				int row=this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
				jButtonDetalleEvaluacionProveedorActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Evaluacion Proveedor")) {

					if(this.isTienePermisosDetalleEvaluacionProveedor && this.subpreguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorSubPreguntaEvaluacion && !SubPreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Proveedores"+"("+DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Proveedores");

						if(subpreguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorSubPreguntaEvaluacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(subpreguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorSubPreguntaEvaluacion);
						}

						jmenuItem.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorSubPreguntaEvaluacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionProveedor"));

						

						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jmenuDetalleSubPreguntaEvaluacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySubPreguntaEvaluacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySubPreguntaEvaluacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySubPreguntaEvaluacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySubPreguntaEvaluacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySubPreguntaEvaluacion();
		
		this.cargarCombosFrameForeignKeySubPreguntaEvaluacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySubPreguntaEvaluacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySubPreguntaEvaluacion();
		}
	}
	
	

	public void cargarCombosForeignKeyPreguntaEvaluacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPreguntaEvaluacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
				this.cargarCombosFramePreguntaEvaluacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPreguntaEvaluacion(this.preguntaevaluacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSubPreguntaEvaluacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			
			if(jTableDatosSubPreguntaEvaluacion.getRowCount()>=1) {
				jTableDatosSubPreguntaEvaluacion.removeRowSelectionInterval(0, jTableDatosSubPreguntaEvaluacion.getRowCount()-1);						
			}
			
			this.isEsNuevoSubPreguntaEvaluacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSubPreguntaEvaluacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(true);			
			//this.subpreguntaevaluacion=new SubPreguntaEvaluacion();
			//this.subpreguntaevaluacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion() ;
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubPreguntaEvaluacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.subpreguntaevaluacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);				
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SubPreguntaEvaluacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSubPreguntaEvaluacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSubPreguntaEvaluacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSubPreguntaEvaluacion.getSelectedRows().length;			
			}
			
			subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSubPreguntaEvaluacion--;			
				//SubPreguntaEvaluacion subpreguntaevaluacionAux= new SubPreguntaEvaluacion();			
				//subpreguntaevaluacionAux.setId(this.iIdNuevoSubPreguntaEvaluacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SubPreguntaEvaluacion subpreguntaevaluacionOrigen=new SubPreguntaEvaluacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SubPreguntaEvaluacion subpreguntaevaluacionOrigen : subpreguntaevaluacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							subpreguntaevaluacionOrigen =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subpreguntaevaluacionOrigen =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSubPreguntaEvaluacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.subpreguntaevaluacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSubPreguntaEvaluacion(subpreguntaevaluacionOrigen,this.subpreguntaevaluacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().add(this.subpreguntaevaluacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacions.add(this.subpreguntaevaluacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
				
				this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoSubPreguntaEvaluacion(), this.getIndiceNuevoSubPreguntaEvaluacion());
				
				int iLastRow =  this.jTableDatosSubPreguntaEvaluacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubPreguntaEvaluacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();									
		
			SubPreguntaEvaluacion subpreguntaevaluacionOrigen=new SubPreguntaEvaluacion();
			SubPreguntaEvaluacion subpreguntaevaluacionDestino=new SubPreguntaEvaluacion();
				
			subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSubPreguntaEvaluacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || subpreguntaevaluacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSubPreguntaEvaluacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionOrigen =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subpreguntaevaluacionOrigen =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subpreguntaevaluacionDestino =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subpreguntaevaluacionDestino =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				subpreguntaevaluacionOrigen =subpreguntaevaluacionsSeleccionados.get(0);
				subpreguntaevaluacionDestino =subpreguntaevaluacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSubPreguntaEvaluacion(subpreguntaevaluacionOrigen,subpreguntaevaluacionDestino,true,false);
				
				subpreguntaevaluacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subpreguntaevaluacionDestino,subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subpreguntaevaluacionDestino,subpreguntaevaluacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
				
				//this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoSubPreguntaEvaluacion(), this.getIndiceNuevoSubPreguntaEvaluacion());
				
				int iLastRow =  this.jTableDatosSubPreguntaEvaluacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubPreguntaEvaluacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSubPreguntaEvaluacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(!isVisible);
			this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(!isVisible);
			this.jPanelAccionesSubPreguntaEvaluacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSubPreguntaEvaluacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSubPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSubPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySubPreguntaEvaluacion();
			
			this.abrirFrameOrderBySubPreguntaEvaluacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySubPreguntaEvaluacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSubPreguntaEvaluacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubPreguntaEvaluacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.isMaximum()) {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSize(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.iWidthFormulario,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSubPreguntaEvaluacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSubPreguntaEvaluacion.isMaximum()) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jContentPaneDetalleSubPreguntaEvaluacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jContentPaneDetalleSubPreguntaEvaluacion.getWidth(),SubPreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jContentPaneDetalleSubPreguntaEvaluacion.getWidth(),SubPreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jContentPaneDetalleSubPreguntaEvaluacion.getWidth(),SubPreguntaEvaluacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySubPreguntaEvaluacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySubPreguntaEvaluacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySubPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubPreguntaEvaluacion,false,this);
				} else {
					this.jInternalFrameOrderBySubPreguntaEvaluacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubPreguntaEvaluacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySubPreguntaEvaluacion);
				this.jInternalFrameOrderBySubPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameOrderBySubPreguntaEvaluacion.setSelected(false);
				
				this.jInternalFrameOrderBySubPreguntaEvaluacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubPreguntaEvaluacion"));
				
				this.inicializarActualizarBindingTablaOrderBySubPreguntaEvaluacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSubPreguntaEvaluacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSubPreguntaEvaluacion==null) {
				
				this.jInternalFrameImportacionSubPreguntaEvaluacion=new ImportacionJInternalFrame(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubPreguntaEvaluacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSubPreguntaEvaluacion);
				this.jInternalFrameImportacionSubPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameImportacionSubPreguntaEvaluacion.setSelected(false);


				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubPreguntaEvaluacion"));
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubPreguntaEvaluacion"));
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubPreguntaEvaluacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSubPreguntaEvaluacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion==null) {
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion=new ReporteDinamicoJInternalFrame(SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion);
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setVisible(false);
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubPreguntaEvaluacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubPreguntaEvaluacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jContentPaneDetalleSubPreguntaEvaluacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSubPreguntaEvaluacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubPreguntaEvaluacion);
			
	       	this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.dispose();
			//this.jInternalFrameDetalleFormSubPreguntaEvaluacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSubPreguntaEvaluacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSubPreguntaEvaluacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSubPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameImportacionSubPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySubPreguntaEvaluacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setVisible(true);
	        this.jInternalFrameOrderBySubPreguntaEvaluacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySubPreguntaEvaluacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySubPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameOrderBySubPreguntaEvaluacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSubPreguntaEvaluacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSubPreguntaEvaluacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSubPreguntaEvaluacion.setVisible(false);
	        this.jInternalFrameImportacionSubPreguntaEvaluacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSubPreguntaEvaluacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSubPreguntaEvaluacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(true);
			//this.isEsNuevoSubPreguntaEvaluacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false) ;
			
			if(subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubPreguntaEvaluacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSubPreguntaEvaluacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSubPreguntaEvaluacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(true);
			//this.isEsNuevoSubPreguntaEvaluacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.subpreguntaevaluacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false) ;
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubPreguntaEvaluacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPreguntaEvaluacion(List<PreguntaEvaluacion> preguntaevaluacionsForeignKey)throws Exception{
		TableColumn tableColumnPreguntaEvaluacion=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION));
		TableCellEditor tableCellEditorPreguntaEvaluacion =tableColumnPreguntaEvaluacion.getCellEditor();

		PreguntaEvaluacionTableCell preguntaevaluacionTableCellFk=(PreguntaEvaluacionTableCell)tableCellEditorPreguntaEvaluacion;

		if(preguntaevaluacionTableCellFk!=null) {
			preguntaevaluacionTableCellFk.setpreguntaevaluacionsForeignKey(preguntaevaluacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//preguntaevaluacionTableCellFk.setRowActual(intSelectedRow);
			//preguntaevaluacionTableCellFk.setpreguntaevaluacionsForeignKeyActual(preguntaevaluacionsForeignKey);
		//}


		if(preguntaevaluacionTableCellFk!=null) {
			preguntaevaluacionTableCellFk.RecargarPreguntaEvaluacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSubPreguntaEvaluacion(false);
			
			//if(!this.isEsNuevoSubPreguntaEvaluacion) {								
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				
			}
			
			if(this.permiteMantenimiento(this.subpreguntaevaluacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSubPreguntaEvaluacion=true;
					this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
					this.isEsNuevoSubPreguntaEvaluacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSubPreguntaEvaluacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSubPreguntaEvaluacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(false);
				
				this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(false);
			
												
				
				if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSubPreguntaEvaluacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,subpreguntaevaluacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.subpreguntaevaluacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				this.subpreguntaevaluacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				this.subpreguntaevaluacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.subpreguntaevaluacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SubPreguntaEvaluacionModel) this.jTableDatosSubPreguntaEvaluacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSubPreguntaEvaluacion=true;
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
				this.isEsNuevoSubPreguntaEvaluacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(false);
				
				this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(false);
				
				
				
				if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSubPreguntaEvaluacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSubPreguntaEvaluacion.getRowCount()>=1) {
				jTableDatosSubPreguntaEvaluacion.removeRowSelectionInterval(0, jTableDatosSubPreguntaEvaluacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSubPreguntaEvaluacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(false) ;
			
			this.isEsNuevoSubPreguntaEvaluacion=false;
			
			if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSubPreguntaEvaluacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				
				//SI ES MANUAL
				if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSubPreguntaEvaluacion--;			
			//SubPreguntaEvaluacion subpreguntaevaluacionAux= new SubPreguntaEvaluacion();			
			//subpreguntaevaluacionAux.setId(this.iIdNuevoSubPreguntaEvaluacion);
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSubPreguntaEvaluacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
			
			this.subpreguntaevaluacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().add(this.subpreguntaevaluacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.subpreguntaevaluacions.add(this.subpreguntaevaluacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			
			this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(this.getIndiceNuevoSubPreguntaEvaluacion(), this.getIndiceNuevoSubPreguntaEvaluacion());
			
			int iLastRow =  this.jTableDatosSubPreguntaEvaluacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSubPreguntaEvaluacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSubPreguntaEvaluacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();
			}
			
			//this.abrirFrameTreeSubPreguntaEvaluacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Sub Pregunta EvaluacionES ?", "MANTENIMIENTO DE Sub Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSubPreguntaEvaluacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSubPreguntaEvaluacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.procesarImportacionSubPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.subpreguntaevaluacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSubPreguntaEvaluacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSubPreguntaEvaluacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSubPreguntaEvaluacion.setFileImportacion(this.jInternalFrameImportacionSubPreguntaEvaluacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSubPreguntaEvaluacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSubPreguntaEvaluacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		

		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SubPreguntaEvaluacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SubPreguntaEvaluacionBaseDesign.jrxml";
			
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
			
			this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PreguntaEvaluacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PreguntaEvaluacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PreguntaEvaluacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PreguntaEvaluacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_egunta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_egunta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_egunta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_egunta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeSi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeSi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeSi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeSi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nOrdenCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nOrdenCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nOrdenCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nOrdenCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nATiempo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nATiempo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nATiempo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nATiempo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					sNombreCampoCategoria="id_pregunta_evaluacion";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoria="pregunta";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI:
					sNombreCampoCategoria="porcentaje_si";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA:
					sNombreCampoCategoria="con_factura";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA:
					sNombreCampoCategoria="con_orden_compra";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO:
					sNombreCampoCategoria="con_completo";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO:
					sNombreCampoCategoria="con_a_tiempo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					sNombreCampoCategoriaValor="id_pregunta_evaluacion";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					sNombreCampoCategoriaValor="pregunta";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI:
					sNombreCampoCategoriaValor="porcentaje_si";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA:
					sNombreCampoCategoriaValor="con_factura";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA:
					sNombreCampoCategoriaValor="con_orden_compra";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO:
					sNombreCampoCategoriaValor="con_completo";
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO:
					sNombreCampoCategoriaValor="con_a_tiempo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta Evaluacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pregunta_evaluacion");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pregunta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"pregunta");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Si",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_si");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_factura");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Orden Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_orden_compra");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_completo");
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con A Tiempo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_a_tiempo");
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
	
	public void jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SubPreguntaEvaluacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getpreguntaevaluacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getpregunta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getporcentaje_si());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getcon_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getcon_orden_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getcon_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO);
					iRow++;

					for(SubPreguntaEvaluacion subpreguntaevaluacion:subpreguntaevaluacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subpreguntaevaluacion.getcon_a_tiempo());
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
			//	this.getFilaCabeceraExportarExcelSubPreguntaEvaluacion(row);				
			//	iRow++;
			//}				
			
			//for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSubPreguntaEvaluacion(subpreguntaevaluacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
			
			//SI ES MANUAL
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubPreguntaEvaluacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSubPreguntaEvaluacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSubPreguntaEvaluacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSubPreguntaEvaluacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSubPreguntaEvaluacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSubPreguntaEvaluacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSubPreguntaEvaluacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosSubPreguntaEvaluacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosSubPreguntaEvaluacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSubPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSubPreguntaEvaluacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSubPreguntaEvaluacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSubPreguntaEvaluacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubPreguntaEvaluacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSubPreguntaEvaluacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSubPreguntaEvaluacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSubPreguntaEvaluacion();
		
		this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSubPreguntaEvaluacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubPreguntaEvaluacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSubPreguntaEvaluacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSubPreguntaEvaluacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSubPreguntaEvaluacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionNuevoSubPreguntaEvaluacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionSinCerrarSubPreguntaEvaluacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxPostAccionSinMensajeSubPreguntaEvaluacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSubPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		try	{	
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSubPreguntaEvaluacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSubPreguntaEvaluacion() throws Exception {
		try	{
			if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSubPreguntaEvaluacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubPreguntaEvaluacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSubPreguntaEvaluacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSubPreguntaEvaluacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSubPreguntaEvaluacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSubPreguntaEvaluacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.addItem(reporte);
			}
			
			
			if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSubPreguntaEvaluacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSubPreguntaEvaluacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubPreguntaEvaluacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubPreguntaEvaluacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SubPreguntaEvaluacionConstantesFunciones.getTiposSeleccionarSubPreguntaEvaluacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SubPreguntaEvaluacionConstantesFunciones.getTiposSeleccionarSubPreguntaEvaluacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SubPreguntaEvaluacionConstantesFunciones.getTiposSeleccionarSubPreguntaEvaluacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSubPreguntaEvaluacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.getSelectedItem()!=null){this.id_pregunta_evaluacionFK_IdPreguntaEvaluacion=((PreguntaEvaluacion)this.jComboBoxid_pregunta_evaluacionFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSubPreguntaEvaluacion(Boolean esInicializar) throws Exception {				
		if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSubPreguntaEvaluacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSubPreguntaEvaluacion() throws Exception {
		this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySubPreguntaEvaluacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSubPreguntaEvaluacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSubPreguntaEvaluacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=subpreguntaevaluacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSubPreguntaEvaluacion.setModel(new SubPreguntaEvaluacionModel(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSubPreguntaEvaluacion.setModel(new SubPreguntaEvaluacionModel(this.subpreguntaevaluacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySubPreguntaEvaluacion!=null && this.jInternalFrameOrderBySubPreguntaEvaluacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySubPreguntaEvaluacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,subpreguntaevaluacionConstantesFunciones.resaltarSeleccionarSubPreguntaEvaluacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SubPreguntaEvaluacionConstantesFunciones.SCLASSWEBTITULO,subpreguntaevaluacionConstantesFunciones.resaltarSeleccionarSubPreguntaEvaluacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_ID));

		if(this.subpreguntaevaluacionConstantesFunciones.mostraridSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltaridSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activaridSubPreguntaEvaluacion,iSizeTabla,this,true,"idSubPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltaridSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activaridSubPreguntaEvaluacion,this,true,"idSubPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarid_empresaSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_empresaSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_empresaSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_empresaSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_empresaSubPreguntaEvaluacion,false,"id_empresaSubPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarid_sucursalSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_sucursalSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_sucursalSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_sucursalSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_sucursalSubPreguntaEvaluacion,false,"id_sucursalSubPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarid_pregunta_evaluacionSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PreguntaEvaluacionTableCell(this.preguntaevaluacionsForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_pregunta_evaluacionSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_pregunta_evaluacionSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new PreguntaEvaluacionTableCell(this.preguntaevaluacionsForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_pregunta_evaluacionSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_pregunta_evaluacionSubPreguntaEvaluacion,true,"id_pregunta_evaluacionSubPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarid_ejercicioSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_ejercicioSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_ejercicioSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_ejercicioSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_ejercicioSubPreguntaEvaluacion,false,"id_ejercicioSubPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarid_periodoSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_periodoSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_periodoSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.subpreguntaevaluacionConstantesFunciones.resaltarid_periodoSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarid_periodoSubPreguntaEvaluacion,false,"id_periodoSubPreguntaEvaluacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarordenSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarordenSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarordenSubPreguntaEvaluacion,iSizeTabla,this,true,"ordenSubPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarordenSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarordenSubPreguntaEvaluacion,this,true,"ordenSubPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarpreguntaSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarpreguntaSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarpreguntaSubPreguntaEvaluacion,iSizeTabla,this,true,"preguntaSubPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarpreguntaSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarpreguntaSubPreguntaEvaluacion,this,true,"preguntaSubPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarporcentaje_siSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarporcentaje_siSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarporcentaje_siSubPreguntaEvaluacion,iSizeTabla,this,true,"porcentaje_siSubPreguntaEvaluacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarporcentaje_siSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarporcentaje_siSubPreguntaEvaluacion,this,true,"porcentaje_siSubPreguntaEvaluacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_facturaSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_facturaSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_facturaSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_facturaSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_facturaSubPreguntaEvaluacion,this,true,"con_facturaSubPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_orden_compraSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_orden_compraSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_orden_compraSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_orden_compraSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_orden_compraSubPreguntaEvaluacion,this,true,"con_orden_compraSubPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_completoSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_completoSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_completoSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_completoSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_completoSubPreguntaEvaluacion,this,true,"con_completoSubPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO));

		if(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_a_tiempoSubPreguntaEvaluacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_a_tiempoSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_a_tiempoSubPreguntaEvaluacion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_a_tiempoSubPreguntaEvaluacion,this.subpreguntaevaluacionConstantesFunciones.activarcon_a_tiempoSubPreguntaEvaluacion,this,true,"con_a_tiempoSubPreguntaEvaluacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubPreguntaEvaluacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleEvaluacionProveedor && this.subpreguntaevaluacionConstantesFunciones.mostrarDetalleEvaluacionProveedorSubPreguntaEvaluacion && !SubPreguntaEvaluacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Proveedores");
				tableColumn.setHeaderValue("Detalle Evaluacion Proveedores");
				tableColumn.setCellRenderer(new DetalleEvaluacionProveedorTableCell(subpreguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorSubPreguntaEvaluacion));
				tableColumn.setCellEditor(new DetalleEvaluacionProveedorTableCell(subpreguntaevaluacionConstantesFunciones.resaltarDetalleEvaluacionProveedorSubPreguntaEvaluacion,this,this.subpreguntaevaluacionConstantesFunciones.activarDetalleEvaluacionProveedorSubPreguntaEvaluacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);
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
			
			this.jTableDatosSubPreguntaEvaluacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSubPreguntaEvaluacion.moveColumn(this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSubPreguntaEvaluacion.moveColumn(this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSubPreguntaEvaluacion.moveColumn(this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSubPreguntaEvaluacion.moveColumn(this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSubPreguntaEvaluacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSubPreguntaEvaluacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSubPreguntaEvaluacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSubPreguntaEvaluacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSubPreguntaEvaluacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSubPreguntaEvaluacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=subpreguntaevaluacions.size()-1;
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
		//this.jTableDatosSubPreguntaEvaluacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSubPreguntaEvaluacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSubPreguntaEvaluacion();
			
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
				
				//this.isEsNuevoSubPreguntaEvaluacion=false;
					
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
				if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubPreguntaEvaluacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.subpreguntaevaluacion.getsType().equals("DUPLICADO")
				   || this.subpreguntaevaluacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSubPreguntaEvaluacion=true;
				
				} else {
					this.isEsNuevoSubPreguntaEvaluacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					if(this.subpreguntaevaluacion.getId()>=0 && !this.subpreguntaevaluacion.getIsNew()) {						
						this.isEsNuevoSubPreguntaEvaluacion=false;
						
					} else {
						this.isEsNuevoSubPreguntaEvaluacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSubPreguntaEvaluacion(esRelaciones);						
				
				this.seleccionarSubPreguntaEvaluacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.subpreguntaevaluacion.getId()<0) {
					this.isEsNuevoSubPreguntaEvaluacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSubPreguntaEvaluacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSubPreguntaEvaluacion(evt,rowIndex);
				}	
				
				if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SubPreguntaEvaluacion: " + this.dDif); 
					}
				}								
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSubPreguntaEvaluacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.subpreguntaevaluacion)) {
					if(this.subpreguntaevaluacion.getId()>0) {
						this.subpreguntaevaluacion.setIsDeleted(true);
						
						this.subpreguntaevaluacionsEliminados.add(this.subpreguntaevaluacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().remove(this.subpreguntaevaluacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacions.remove(this.subpreguntaevaluacion);				
					}
					
					
					((SubPreguntaEvaluacionModel) this.jTableDatosSubPreguntaEvaluacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSubPreguntaEvaluacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSubPreguntaEvaluacion) {
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubPreguntaEvaluacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.subpreguntaevaluacionConstantesFunciones.cargarid_empresaSubPreguntaEvaluacion || this.subpreguntaevaluacionConstantesFunciones.event_dependid_empresaSubPreguntaEvaluacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.subpreguntaevaluacion.getid_empresa());
									//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(subpreguntaevaluacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(subpreguntaevaluacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.subpreguntaevaluacion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.subpreguntaevaluacionConstantesFunciones.cargarid_sucursalSubPreguntaEvaluacion || this.subpreguntaevaluacionConstantesFunciones.event_dependid_sucursalSubPreguntaEvaluacion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.subpreguntaevaluacion.getid_sucursal());
									//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(subpreguntaevaluacion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(subpreguntaevaluacion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.subpreguntaevaluacion.getid_sucursal(),false,"Formulario");

					//PreguntaEvaluacion
					if(!this.subpreguntaevaluacionConstantesFunciones.cargarid_pregunta_evaluacionSubPreguntaEvaluacion || this.subpreguntaevaluacionConstantesFunciones.event_dependid_pregunta_evaluacionSubPreguntaEvaluacion) {
						//this.cargarCombosPreguntaEvaluacionsForeignKeyLista(" where id="+this.subpreguntaevaluacion.getid_pregunta_evaluacion());
									//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
						this.preguntaevaluacionsForeignKey=new ArrayList<PreguntaEvaluacion>();

						if(subpreguntaevaluacion.getPreguntaEvaluacion()!=null) {
							this.preguntaevaluacionsForeignKey.add(subpreguntaevaluacion.getPreguntaEvaluacion());
						}

						this.addItemDefectoCombosForeignKeyPreguntaEvaluacion();
						this.cargarCombosFramePreguntaEvaluacionsForeignKey("Todos");
					}
					this.setActualPreguntaEvaluacionForeignKey(this.subpreguntaevaluacion.getid_pregunta_evaluacion(),false,"Formulario");

					//Ejercicio
					if(!this.subpreguntaevaluacionConstantesFunciones.cargarid_ejercicioSubPreguntaEvaluacion || this.subpreguntaevaluacionConstantesFunciones.event_dependid_ejercicioSubPreguntaEvaluacion) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.subpreguntaevaluacion.getid_ejercicio());
									//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(subpreguntaevaluacion.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(subpreguntaevaluacion.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.subpreguntaevaluacion.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.subpreguntaevaluacionConstantesFunciones.cargarid_periodoSubPreguntaEvaluacion || this.subpreguntaevaluacionConstantesFunciones.event_dependid_periodoSubPreguntaEvaluacion) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.subpreguntaevaluacion.getid_periodo());
									//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(subpreguntaevaluacion.getPeriodo()!=null) {
							this.periodosForeignKey.add(subpreguntaevaluacion.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.subpreguntaevaluacion.getid_periodo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSubPreguntaEvaluacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSubPreguntaEvaluacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSubPreguntaEvaluacion(subpreguntaevaluacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(subpreguntaevaluacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySubPreguntaEvaluacion(subpreguntaevaluacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySubPreguntaEvaluacion(subpreguntaevaluacion);
	}
	
	public void setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getId().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getorden().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getpregunta());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getporcentaje_si().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_factura());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_orden_compra());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_completo());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_a_tiempo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SubPreguntaEvaluacion subpreguntaevaluacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,subpreguntaevaluacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SubPreguntaEvaluacion subpreguntaevaluacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				subpreguntaevaluacionLocal=this.subpreguntaevaluacion;
			} else {
				subpreguntaevaluacionLocal=this.subpreguntaevaluacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(subpreguntaevaluacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSubPreguntaEvaluacion(subpreguntaevaluacionLocal,true);
					
					if(subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(subpreguntaevaluacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(subpreguntaevaluacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(subpreguntaevaluacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(subpreguntaevaluacion);
	}
	
	public void setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(subpreguntaevaluacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.getText()==null || this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.getText()=="" || this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.getText()=="Id") {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setText("0");
			}

			if(conColumnasBase) {subpreguntaevaluacion.setId(Long.parseLong(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelIdSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setorden(Integer.parseInt(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelordenSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setpregunta(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelpreguntaSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setporcentaje_si(Double.parseDouble(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelporcentaje_siSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setcon_factura(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_facturaSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setcon_orden_compra(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_orden_compraSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setcon_completo(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_completoSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subpreguntaevaluacion.setcon_a_tiempo(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelcon_a_tiempoSubPreguntaEvaluacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacionBean,SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && subpreguntaevaluacionBean.getid_pregunta_evaluacion()!=null && !subpreguntaevaluacionBean.getid_pregunta_evaluacion().equals(-1L))) {subpreguntaevaluacion.setid_pregunta_evaluacion(subpreguntaevaluacionBean.getid_pregunta_evaluacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacionOrigen,SubPreguntaEvaluacion subpreguntaevaluacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getId()!=null && !subpreguntaevaluacionOrigen.getId().equals(0L))) {subpreguntaevaluacion.setId(subpreguntaevaluacionOrigen.getId());}}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getid_pregunta_evaluacion()!=null && !subpreguntaevaluacionOrigen.getid_pregunta_evaluacion().equals(-1L))) {subpreguntaevaluacion.setid_pregunta_evaluacion(subpreguntaevaluacionOrigen.getid_pregunta_evaluacion());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getorden()!=null && !subpreguntaevaluacionOrigen.getorden().equals(0))) {subpreguntaevaluacion.setorden(subpreguntaevaluacionOrigen.getorden());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getpregunta()!=null && !subpreguntaevaluacionOrigen.getpregunta().equals(""))) {subpreguntaevaluacion.setpregunta(subpreguntaevaluacionOrigen.getpregunta());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getporcentaje_si()!=null && !subpreguntaevaluacionOrigen.getporcentaje_si().equals(0.0))) {subpreguntaevaluacion.setporcentaje_si(subpreguntaevaluacionOrigen.getporcentaje_si());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getcon_factura()!=null && !subpreguntaevaluacionOrigen.getcon_factura().equals(false))) {subpreguntaevaluacion.setcon_factura(subpreguntaevaluacionOrigen.getcon_factura());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getcon_orden_compra()!=null && !subpreguntaevaluacionOrigen.getcon_orden_compra().equals(false))) {subpreguntaevaluacion.setcon_orden_compra(subpreguntaevaluacionOrigen.getcon_orden_compra());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getcon_completo()!=null && !subpreguntaevaluacionOrigen.getcon_completo().equals(false))) {subpreguntaevaluacion.setcon_completo(subpreguntaevaluacionOrigen.getcon_completo());}
			if(conDefault || (!conDefault && subpreguntaevaluacionOrigen.getcon_a_tiempo()!=null && !subpreguntaevaluacionOrigen.getcon_a_tiempo().equals(false))) {subpreguntaevaluacion.setcon_a_tiempo(subpreguntaevaluacionOrigen.getcon_a_tiempo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getId().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getorden().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getpregunta());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setText(subpreguntaevaluacion.getporcentaje_si().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_factura());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_orden_compra());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_completo());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacion.getcon_a_tiempo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubPreguntaEvaluacion(SubPreguntaEvaluacionBean subpreguntaevaluacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setText(subpreguntaevaluacionBean.getId().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setText(subpreguntaevaluacionBean.getorden().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setText(subpreguntaevaluacionBean.getpregunta());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setText(subpreguntaevaluacionBean.getporcentaje_si().toString());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setSelected(subpreguntaevaluacionBean.getcon_factura());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setSelected(subpreguntaevaluacionBean.getcon_orden_compra());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacionBean.getcon_completo());
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setSelected(subpreguntaevaluacionBean.getcon_a_tiempo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSubPreguntaEvaluacion(SubPreguntaEvaluacionParameterReturnGeneral subpreguntaevaluacionReturnGeneral,SubPreguntaEvaluacionBean subpreguntaevaluacionBean,Boolean conDefault) throws Exception { 
		try {
			SubPreguntaEvaluacion subpreguntaevaluacionLocal=new SubPreguntaEvaluacion();
			
			subpreguntaevaluacionLocal=subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getId()!=null && !subpreguntaevaluacionLocal.getId().equals(0L))) {subpreguntaevaluacionBean.setId(subpreguntaevaluacionLocal.getId());}}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getid_pregunta_evaluacion()!=null && !subpreguntaevaluacionLocal.getid_pregunta_evaluacion().equals(-1L))) {subpreguntaevaluacionBean.setid_pregunta_evaluacion(subpreguntaevaluacionLocal.getid_pregunta_evaluacion());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getorden()!=null && !subpreguntaevaluacionLocal.getorden().equals(0))) {subpreguntaevaluacionBean.setorden(subpreguntaevaluacionLocal.getorden());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getpregunta()!=null && !subpreguntaevaluacionLocal.getpregunta().equals(""))) {subpreguntaevaluacionBean.setpregunta(subpreguntaevaluacionLocal.getpregunta());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getporcentaje_si()!=null && !subpreguntaevaluacionLocal.getporcentaje_si().equals(0.0))) {subpreguntaevaluacionBean.setporcentaje_si(subpreguntaevaluacionLocal.getporcentaje_si());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getcon_factura()!=null && !subpreguntaevaluacionLocal.getcon_factura().equals(false))) {subpreguntaevaluacionBean.setcon_factura(subpreguntaevaluacionLocal.getcon_factura());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getcon_orden_compra()!=null && !subpreguntaevaluacionLocal.getcon_orden_compra().equals(false))) {subpreguntaevaluacionBean.setcon_orden_compra(subpreguntaevaluacionLocal.getcon_orden_compra());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getcon_completo()!=null && !subpreguntaevaluacionLocal.getcon_completo().equals(false))) {subpreguntaevaluacionBean.setcon_completo(subpreguntaevaluacionLocal.getcon_completo());}
			if(conDefault || (!conDefault && subpreguntaevaluacionLocal.getcon_a_tiempo()!=null && !subpreguntaevaluacionLocal.getcon_a_tiempo().equals(false))) {subpreguntaevaluacionBean.setcon_a_tiempo(subpreguntaevaluacionLocal.getcon_a_tiempo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSubPreguntaEvaluacionGenerico(Long idSubPreguntaEvaluacionSeleccionado,JComboBox jComboBoxSubPreguntaEvaluacion,List<SubPreguntaEvaluacion> subpreguntaevaluacionsLocal)throws Exception {
		try {
			SubPreguntaEvaluacion  subpreguntaevaluacionTemp=null;

			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsLocal) {
				if(subpreguntaevaluacionAux.getId()!=null && subpreguntaevaluacionAux.getId().equals(idSubPreguntaEvaluacionSeleccionado)) {
					subpreguntaevaluacionTemp=subpreguntaevaluacionAux;
					break;
				}
			}

			jComboBoxSubPreguntaEvaluacion.setSelectedItem(subpreguntaevaluacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSubPreguntaEvaluacionGenerico(JComboBox jComboBoxSubPreguntaEvaluacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubPreguntaEvaluacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSubPreguntaEvaluacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubPreguntaEvaluacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSubPreguntaEvaluacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSubPreguntaEvaluacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSubPreguntaEvaluacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleEvaluacionProveedor")) {
			jButtonDetalleEvaluacionProveedorActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subpreguntaevaluacion=(SubPreguntaEvaluacion) subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subpreguntaevaluacion =(SubPreguntaEvaluacion) subpreguntaevaluacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!subpreguntaevaluacion.getIsNew() && !subpreguntaevaluacion.getIsChanged() && !subpreguntaevaluacion.getIsDeleted()) {
				sDescripcion=subpreguntaevaluacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=subpreguntaevaluacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!subpreguntaevaluacion.getIsNew() && !subpreguntaevaluacion.getIsChanged() && !subpreguntaevaluacion.getIsDeleted()) {
				sDescripcion=subpreguntaevaluacion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=subpreguntaevaluacion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("PreguntaEvaluacion")) {
			//sDescripcion=this.getActualPreguntaEvaluacionForeignKeyDescripcion((Long)value);
			if(!subpreguntaevaluacion.getIsNew() && !subpreguntaevaluacion.getIsChanged() && !subpreguntaevaluacion.getIsDeleted()) {
				sDescripcion=subpreguntaevaluacion.getpreguntaevaluacion_descripcion();
			} else {
				//sDescripcion=this.getActualPreguntaEvaluacionForeignKeyDescripcion((Long)value);
				sDescripcion=subpreguntaevaluacion.getpreguntaevaluacion_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!subpreguntaevaluacion.getIsNew() && !subpreguntaevaluacion.getIsChanged() && !subpreguntaevaluacion.getIsDeleted()) {
				sDescripcion=subpreguntaevaluacion.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=subpreguntaevaluacion.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!subpreguntaevaluacion.getIsNew() && !subpreguntaevaluacion.getIsChanged() && !subpreguntaevaluacion.getIsDeleted()) {
				sDescripcion=subpreguntaevaluacion.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=subpreguntaevaluacion.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SubPreguntaEvaluacion subpreguntaevaluacionRow=new SubPreguntaEvaluacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subpreguntaevaluacionRow=(SubPreguntaEvaluacion) subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subpreguntaevaluacionRow=(SubPreguntaEvaluacion) subpreguntaevaluacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleEvaluacionProveedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SubPreguntaEvaluacion subpreguntaevaluacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion = (SubPreguntaEvaluacion)this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.subpreguntaevaluacion = (SubPreguntaEvaluacion)this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(subpreguntaevaluacion!=null) {
						this.subpreguntaevaluacion = subpreguntaevaluacion;
					} else {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionProveedor && this.permiteMantenimiento(this.subpreguntaevaluacion)) {
					DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame;
					}

					List<SubPreguntaEvaluacion> subpreguntaevaluacions=new ArrayList<SubPreguntaEvaluacion>();
					subpreguntaevaluacions.add(this.subpreguntaevaluacion);
					if(!esRelacionado) {
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(subpreguntaevaluacions,this.subpreguntaevaluacion,detalleevaluacionproveedorBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("no_relacionado");

						detalleevaluacionproveedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionproveedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
						TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();

						titledBorderDetalleEvaluacionProveedor.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Detalle Evaluacion Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionproveedorBeanSwingJInternalFrame);
						}

						detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionproveedorBeanSwingJInternalFrame);

						detalleevaluacionproveedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));			
			this.jButtonDuplicarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion && this.isPermisoDuplicarSubPreguntaEvaluacion));			
			this.jButtonCopiarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion && this.isPermisoCopiarSubPreguntaEvaluacion));
			this.jButtonVerFormSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion && this.isPermisoVerFormSubPreguntaEvaluacion));
			
			this.jButtonAbrirOrderBySubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));			
			
			this.jButtonNuevoRelacionesSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));			
			this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarSubPreguntaEvaluacion && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion && this.isPermisoEliminarSubPreguntaEvaluacion));
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion);							
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));						
			this.jButtonDuplicarToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion && this.isPermisoDuplicarSubPreguntaEvaluacion));						
			this.jButtonCopiarToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion && this.isPermisoCopiarSubPreguntaEvaluacion));			
			this.jButtonVerFormToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion && this.isPermisoVerFormSubPreguntaEvaluacion));			
			this.jButtonAbrirOrderByToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));
			this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));			
			this.jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));			
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarSubPreguntaEvaluacion && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion  && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion && this.isPermisoEliminarSubPreguntaEvaluacion));
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarToolBarSubPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion);				
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));			
			this.jMenuItemDuplicarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion && this.isPermisoDuplicarSubPreguntaEvaluacion));			
			this.jMenuItemCopiarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion && this.isPermisoCopiarSubPreguntaEvaluacion));			
			this.jMenuItemVerFormSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion && this.isPermisoVerFormSubPreguntaEvaluacion));			
			this.jMenuItemAbrirOrderBySubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));			
			//this.jMenuItemMostrarOcultarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));
			this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));			
			//this.jMenuItemDetalleMostrarOcultarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion && this.isPermisoOrdenSubPreguntaEvaluacion));			
			this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion));			
			this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion && this.isPermisoNuevoSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));									
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemModificarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaModificarSubPreguntaEvaluacion && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemActualizarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion && this.isPermisoActualizarSubPreguntaEvaluacion));	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemEliminarSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion && this.isPermisoEliminarSubPreguntaEvaluacion));
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemCancelarSubPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion);				
			}
			
			this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));						
			this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=this.jButtonNuevoSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion=this.jButtonDuplicarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion=this.jButtonCopiarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion=this.jButtonVerFormSubPreguntaEvaluacion.isVisible();
			
			this.isVisibilidadCeldaOrdenSubPreguntaEvaluacion=this.jButtonAbrirOrderBySubPreguntaEvaluacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=this.jButtonNuevoRelacionesSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=this.jButtonModificarSubPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=this.jButtonNuevoToolBarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarToolBarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarToolBarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarToolBarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarToolBarSubPreguntaEvaluacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=this.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=this.jMenuItemNuevoSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion.isVisible();
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemModificarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemActualizarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemEliminarSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemCancelarSubPreguntaEvaluacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSubPreguntaEvaluacion(Boolean esInicializar) {
		if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
				//if(this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSubPreguntaEvaluacion();
			}
			
			this.inicializarActualizarBindingBotonesManualSubPreguntaEvaluacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSubPreguntaEvaluacion() {
		this.jButtonNuevoSubPreguntaEvaluacion.setVisible(this.isPermisoNuevoSubPreguntaEvaluacion);			
		this.jButtonDuplicarSubPreguntaEvaluacion.setVisible(this.isPermisoDuplicarSubPreguntaEvaluacion);			
		this.jButtonCopiarSubPreguntaEvaluacion.setVisible(this.isPermisoCopiarSubPreguntaEvaluacion);			
		this.jButtonVerFormSubPreguntaEvaluacion.setVisible(this.isPermisoVerFormSubPreguntaEvaluacion);			
		
		this.jButtonAbrirOrderBySubPreguntaEvaluacion.setVisible(this.isPermisoOrdenSubPreguntaEvaluacion);					
		
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.setVisible(this.isPermisoNuevoSubPreguntaEvaluacion);			
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarSubPreguntaEvaluacion.setVisible(this.isPermisoActualizarSubPreguntaEvaluacion);	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.setVisible(this.isPermisoActualizarSubPreguntaEvaluacion);	
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.setVisible(this.isPermisoEliminarSubPreguntaEvaluacion);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion);						
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.setVisible(this.isPermisoGuardarCambiosSubPreguntaEvaluacion);							
		}
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.setVisible(this.isPermisoActualizarSubPreguntaEvaluacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSubPreguntaEvaluacion() {
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarSubPreguntaEvaluacion.setVisible(this.isPermisoActualizarSubPreguntaEvaluacion);	
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.setVisible(this.isPermisoActualizarSubPreguntaEvaluacion);	
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.setVisible(this.isPermisoEliminarSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.setVisible(this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion);							
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.setVisible((this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion && this.isPermisoGuardarCambiosSubPreguntaEvaluacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSubPreguntaEvaluacion() {
		if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSubPreguntaEvaluacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSubPreguntaEvaluacion() {
	}
	
	public void jTableDatosSubPreguntaEvaluacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSubPreguntaEvaluacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.subpreguntaevaluacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSubPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

				if(this.subpreguntaevaluacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.subpreguntaevaluacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.subpreguntaevaluacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSubPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

				if(this.subpreguntaevaluacion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.subpreguntaevaluacion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.subpreguntaevaluacion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopreguntaevaluacion=true;

			idTienePermisopreguntaevaluacion=this.tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(PreguntaEvaluacionConstantesFunciones.CLASSNAME);

			if(idTienePermisopreguntaevaluacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.preguntaevaluacionBeanSwingJInternalFrame=new PreguntaEvaluacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.preguntaevaluacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.preguntaevaluacionBeanSwingJInternalFrame.getPreguntaEvaluacionLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

				if(this.subpreguntaevaluacion.getid_pregunta_evaluacion()!=null) {
					this.preguntaevaluacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.preguntaevaluacionBeanSwingJInternalFrame.setIdActual(this.subpreguntaevaluacion.getid_pregunta_evaluacion());
					this.preguntaevaluacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.preguntaevaluacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.preguntaevaluacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaEvaluacion();
				}

				JInternalFrameBase jinternalFrame =this.preguntaevaluacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderpreguntaevaluacion=(TitledBorder)this.preguntaevaluacionBeanSwingJInternalFrame.jScrollPanelDatosPreguntaEvaluacion.getBorder();

				titledBorderpreguntaevaluacion.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Pregunta Evaluacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getid_pregunta_evaluacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pregunta_evaluacion = "+this.subpreguntaevaluacion.getid_pregunta_evaluacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioSubPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

				if(this.subpreguntaevaluacion.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.subpreguntaevaluacion.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.subpreguntaevaluacion.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoSubPreguntaEvaluacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebSubPreguntaEvaluacion(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubPreguntaEvaluacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubPreguntaEvaluacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.subpreguntaevaluacionLogic.getConnexion());

				if(this.subpreguntaevaluacion.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.subpreguntaevaluacion.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubPreguntaEvaluacion=(TitledBorder)this.jScrollPanelDatosSubPreguntaEvaluacion.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderSubPreguntaEvaluacion.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.subpreguntaevaluacion.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.subpreguntaevaluacion.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpreguntaSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getpregunta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where pregunta like '%"+this.subpreguntaevaluacion.getpregunta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_siSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getporcentaje_si()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_si = "+this.subpreguntaevaluacion.getporcentaje_si().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_facturaSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getcon_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_factura = "+this.subpreguntaevaluacion.getcon_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_orden_compraSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getcon_orden_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_orden_compra = "+this.subpreguntaevaluacion.getcon_orden_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_completoSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getcon_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_completo = "+this.subpreguntaevaluacion.getcon_completo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_a_tiempoSubPreguntaEvaluacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.getsubpreguntaevaluacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subpreguntaevaluacion==null) {
						this.subpreguntaevaluacion = new SubPreguntaEvaluacion();
					}

					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);
				}

				if(this.subpreguntaevaluacion.getcon_a_tiempo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_a_tiempo = "+this.subpreguntaevaluacion.getcon_a_tiempo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);

			this.getSubPreguntaEvaluacionsFK_IdEjercicio();

			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);

			//if(SubPreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);

			this.getSubPreguntaEvaluacionsFK_IdEmpresa();

			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);

			//if(SubPreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);

			this.getSubPreguntaEvaluacionsFK_IdPeriodo();

			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);

			//if(SubPreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);

			this.getSubPreguntaEvaluacionsFK_IdPreguntaEvaluacion();

			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);

			//if(SubPreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSubPreguntaEvaluacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);

			this.getSubPreguntaEvaluacionsFK_IdSucursal();

			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);

			//if(SubPreguntaEvaluacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subpreguntaevaluacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSubPreguntaEvaluacion() {
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
		

		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.dispose();
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
			this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.dispose();
			this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion=null;
		}
		
		if(this.jInternalFrameImportacionSubPreguntaEvaluacion!=null) {
			this.jInternalFrameImportacionSubPreguntaEvaluacion.setVisible(false);	    			
			this.jInternalFrameImportacionSubPreguntaEvaluacion.dispose();
			this.jInternalFrameImportacionSubPreguntaEvaluacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSubPreguntaEvaluacion();
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSubPreguntaEvaluacion")) {
				jButtonDuplicarSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSubPreguntaEvaluacion")) {
				jButtonCopiarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormSubPreguntaEvaluacion")) {
				jButtonVerFormSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSubPreguntaEvaluacion")) {
				jButtonDuplicarSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSubPreguntaEvaluacion")) {
				jButtonDuplicarSubPreguntaEvaluacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSubPreguntaEvaluacion")) {
				jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSubPreguntaEvaluacion")) {
				jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSubPreguntaEvaluacion")) {
				jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSubPreguntaEvaluacion")) {
				jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSubPreguntaEvaluacion")) {
				jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSubPreguntaEvaluacion")) {
				jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarSubPreguntaEvaluacion")) {
				jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSubPreguntaEvaluacion")) {
				jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSubPreguntaEvaluacion")) {
				jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarSubPreguntaEvaluacion")) {
				jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSubPreguntaEvaluacion")) {
				jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSubPreguntaEvaluacion")) {
				jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarSubPreguntaEvaluacion")) {
				jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSubPreguntaEvaluacion")) {
				jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSubPreguntaEvaluacion")) {
				jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSubPreguntaEvaluacion")) {
				jButtonMostrarOcultarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSubPreguntaEvaluacion")) {
				jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSubPreguntaEvaluacion")) {
				jButtonCopiarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSubPreguntaEvaluacion")) {
				jButtonVerFormSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSubPreguntaEvaluacion")) {
				jButtonCopiarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSubPreguntaEvaluacion")) {
				jButtonVerFormSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSubPreguntaEvaluacion")) {
				jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSubPreguntaEvaluacion")) {
				jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSubPreguntaEvaluacion")) {
				jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSubPreguntaEvaluacion")) {
				jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSubPreguntaEvaluacion")) {
				jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSubPreguntaEvaluacion")) {
				jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSubPreguntaEvaluacion")) {
				jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSubPreguntaEvaluacion")) {
				jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSubPreguntaEvaluacion")) {
				jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySubPreguntaEvaluacion") || sTipo.equals("MenuItemDetalleAbrirOrderBySubPreguntaEvaluacion")) {
				jButtonAbrirOrderBySubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSubPreguntaEvaluacion") || sTipo.equals("MenuItemDetalleMostrarOcultarSubPreguntaEvaluacion")) {
				jButtonMostrarOcultarSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSubPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSubPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSubPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSubPreguntaEvaluacion")) {
				jButtonCerrarReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSubPreguntaEvaluacion")) {
				jButtonGenerarReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSubPreguntaEvaluacion")) {
				
				jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSubPreguntaEvaluacion")) {
				jButtonCerrarImportacionSubPreguntaEvaluacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSubPreguntaEvaluacion")) {
				
				jButtonGenerarImportacionSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSubPreguntaEvaluacion")) {
				
				jButtonAbrirImportacionSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSubPreguntaEvaluacion")) {
				jComboBoxTiposAccionesSubPreguntaEvaluacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSubPreguntaEvaluacion")) {
				jComboBoxTiposRelacionesSubPreguntaEvaluacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSubPreguntaEvaluacion")) {
				jComboBoxTiposAccionesSubPreguntaEvaluacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSubPreguntaEvaluacion")) {
				
				jComboBoxTiposSeleccionarSubPreguntaEvaluacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSubPreguntaEvaluacion")) {
				jTextFieldValorCampoGeneralSubPreguntaEvaluacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySubPreguntaEvaluacion")) {
				jButtonAbrirOrderBySubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSubPreguntaEvaluacion")) {
				jButtonAbrirOrderBySubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySubPreguntaEvaluacion")) {
				jButtonCerrarOrderBySubPreguntaEvaluacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubPreguntaEvaluacionBusqueda")) {
				this.jButtonidSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_empresaSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_empresaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_sucursalSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_sucursalSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_ejercicioSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_ejercicioSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_periodoSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_periodoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenSubPreguntaEvaluacionBusqueda")) {
				this.jButtonordenSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaSubPreguntaEvaluacionBusqueda")) {
				this.jButtonpreguntaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_siSubPreguntaEvaluacionBusqueda")) {
				this.jButtonporcentaje_siSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_facturaSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_facturaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_orden_compraSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_orden_compraSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_completoSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_completoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_a_tiempoSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPreguntaEvaluacionSubPreguntaEvaluacion")) {
				this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacionActionPerformed(evt);
			}
			
			;
			
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSubPreguntaEvaluacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SubPreguntaEvaluacion subpreguntaevaluacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				subpreguntaevaluacionLocal=this.subpreguntaevaluacion;
			} else {
				subpreguntaevaluacionLocal=this.subpreguntaevaluacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
							
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
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
			
			


			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
								
						
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
								
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
							
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
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
			
			


			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
								
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSubPreguntaEvaluacion")) {
					jCheckBoxSeleccionarTodosSubPreguntaEvaluacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSubPreguntaEvaluacion")) {
					jCheckBoxSeleccionadosSubPreguntaEvaluacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSubPreguntaEvaluacion")) {
					
				}
				
				


				
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
												
				
				


				
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
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
			
			


			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subpreguntaevaluacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subpreguntaevaluacion);
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
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
				
				


				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubPreguntaEvaluacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubPreguntaEvaluacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubPreguntaEvaluacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subpreguntaevaluacionAnterior =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSubPreguntaEvaluacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSubPreguntaEvaluacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSubPreguntaEvaluacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.subpreguntaevaluacion =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.subpreguntaevaluacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSubPreguntaEvaluacion")) {
				
				}
				
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSubPreguntaEvaluacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSubPreguntaEvaluacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSubPreguntaEvaluacion")) {
			
			}
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSubPreguntaEvaluacion();
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("NuevoSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSubPreguntaEvaluacion")) {
				jButtonDuplicarSubPreguntaEvaluacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSubPreguntaEvaluacion")) {
				jButtonCopiarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSubPreguntaEvaluacion")) {
				jButtonVerFormSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSubPreguntaEvaluacion")) {
				jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSubPreguntaEvaluacion")) {
				jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSubPreguntaEvaluacion")) {
				jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSubPreguntaEvaluacion")) {
				jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSubPreguntaEvaluacion")) {
				jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSubPreguntaEvaluacion")) {
				jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSubPreguntaEvaluacion")) {
				jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSubPreguntaEvaluacion")) {
				jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySubPreguntaEvaluacion")) {
				jButtonAbrirOrderBySubPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSubPreguntaEvaluacion")) {
				jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSubPreguntaEvaluacion")) {
				jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSubPreguntaEvaluacion")) {
				jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubPreguntaEvaluacionBusqueda")) {
				this.jButtonidSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_empresaSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_empresaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_sucursalSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_sucursalSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_ejercicioSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_ejercicioSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSubPreguntaEvaluacionUpdate")) {
				this.jButtonid_periodoSubPreguntaEvaluacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSubPreguntaEvaluacionBusqueda")) {
				this.jButtonid_periodoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenSubPreguntaEvaluacionBusqueda")) {
				this.jButtonordenSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("preguntaSubPreguntaEvaluacionBusqueda")) {
				this.jButtonpreguntaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_siSubPreguntaEvaluacionBusqueda")) {
				this.jButtonporcentaje_siSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_facturaSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_facturaSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_orden_compraSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_orden_compraSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_completoSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_completoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_a_tiempoSubPreguntaEvaluacionBusqueda")) {
				this.jButtoncon_a_tiempoSubPreguntaEvaluacionBusquedaActionPerformed(evt);
			}
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSubPreguntaEvaluacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSubPreguntaEvaluacion")) {
				closingInternalFrameSubPreguntaEvaluacion();
				
			} else if(sTipo.equals("jButtonCancelarSubPreguntaEvaluacion")) {
				JInternalFrameBase jInternalFrameDetalleFormSubPreguntaEvaluacion = (JInternalFrameBase)evt.getSource();
	            	
	            SubPreguntaEvaluacionBeanSwingJInternalFrame jInternalFrameParent=(SubPreguntaEvaluacionBeanSwingJInternalFrame)jInternalFrameDetalleFormSubPreguntaEvaluacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSubPreguntaEvaluacionActionPerformed(null);
			}
			
			SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subpreguntaevaluacion,new Object(),this.subpreguntaevaluacionParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSubPreguntaEvaluacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSubPreguntaEvaluacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSubPreguntaEvaluacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.subpreguntaevaluacion)) {
			if(!esControlTabla) {
				if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);			
				}
				
				if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.procesarEventosSubPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this.subpreguntaevaluacion,this.subpreguntaevaluacionParameterGeneral,this.isEsNuevoSubPreguntaEvaluacion,classes);//this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral,this.subpreguntaevaluacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSubPreguntaEvaluacion(classes,this.subpreguntaevaluacionReturnGeneral,this.subpreguntaevaluacionBean,false);
					}
						
					if(this.subpreguntaevaluacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion());	
					}
						
					if(this.subpreguntaevaluacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion(),classes);//this.subpreguntaevaluacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSubPreguntaEvaluacion(this.subpreguntaevaluacion,classes);//this.subpreguntaevaluacionBean);									
				}
			
				if(SubPreguntaEvaluacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSubPreguntaEvaluacion(this.subpreguntaevaluacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubPreguntaEvaluacion(this.subpreguntaevaluacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.subpreguntaevaluacionAnterior!=null) {
						this.subpreguntaevaluacion=this.subpreguntaevaluacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.procesarEventosSubPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this.subpreguntaevaluacion,this.subpreguntaevaluacionParameterGeneral,this.isEsNuevoSubPreguntaEvaluacion,classes);//this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subpreguntaevaluacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion(),subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion(),this.subpreguntaevaluacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSubPreguntaEvaluacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosSubPreguntaEvaluacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSubPreguntaEvaluacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosSubPreguntaEvaluacion() throws Exception {
		
		SubPreguntaEvaluacionModel subpreguntaevaluacionModel=(SubPreguntaEvaluacionModel)this.jTableDatosSubPreguntaEvaluacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subpreguntaevaluacionModel.subpreguntaevaluacions=this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			subpreguntaevaluacionModel.subpreguntaevaluacions=this.subpreguntaevaluacions;
		}
		
		
		((SubPreguntaEvaluacionModel) this.jTableDatosSubPreguntaEvaluacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSubPreguntaEvaluacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsubpreguntaevaluacionAnterior(),this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsubpreguntaevaluacionAnterior(),this.subpreguntaevaluacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSubPreguntaEvaluacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(subpreguntaevaluacion.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
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
										
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subpreguntaevaluacion,new Object(),generalEntityParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SubPreguntaEvaluacionConstantesFunciones.getClassesRelationshipsOfSubPreguntaEvaluacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SubPreguntaEvaluacionConstantesFunciones.getClassesRelationshipsFromStringsOfSubPreguntaEvaluacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSubPreguntaEvaluacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subpreguntaevaluacion,new Object(),generalEntityParameterGeneral,this.subpreguntaevaluacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSubPreguntaEvaluacion(SubPreguntaEvaluacionBean subpreguntaevaluacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(subpreguntaevaluacion.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSubPreguntaEvaluacion(ArrayList<Classe> classes,SubPreguntaEvaluacionReturnGeneral subpreguntaevaluacionReturnGeneral,SubPreguntaEvaluacionBean subpreguntaevaluacionBean,Boolean conDefault) throws Exception {
		
			this.subpreguntaevaluacionBean.setDetalleEvaluacionProveedors(subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion().getDetalleEvaluacionProveedors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					subpreguntaevaluacion.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
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
		if(!paraTabla && !this.permiteMantenimiento(this.subpreguntaevaluacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion = new SubPreguntaEvaluacionDetalleFormJInternalFrame(jDesktopPane,this.subpreguntaevaluacionSessionBean.getConGuardarRelaciones(),this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setVisible(false);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.subpreguntaevaluacionLogic=this.subpreguntaevaluacionLogic;
		
		this.cargarCombosFrameForeignKeySubPreguntaEvaluacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSubPreguntaEvaluacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubPreguntaEvaluacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySubPreguntaEvaluacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySubPreguntaEvaluacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubPreguntaEvaluacion"));
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarSubPreguntaEvaluacion"));

		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubPreguntaEvaluacion"));
					
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemModificarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ActualizarSubPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubPreguntaEvaluacion"));
						
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemActualizarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarSubPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubPreguntaEvaluacion"));
								
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemEliminarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarSubPreguntaEvaluacion"));
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubPreguntaEvaluacion"));
					
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemCancelarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubPreguntaEvaluacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemDetalleCerrarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubPreguntaEvaluacion"));		
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubPreguntaEvaluacion"));
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubPreguntaEvaluacion"));
		
		
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubPreguntaEvaluacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonidSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonordenSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonpreguntaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_siSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_orden_compraSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_completoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_completoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_a_tiempoSubPreguntaEvaluacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubPreguntaEvaluacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSubPreguntaEvaluacion"));
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubPreguntaEvaluacion"));
		}
		
		this.jTableDatosSubPreguntaEvaluacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSubPreguntaEvaluacion"));
		
		this.jTableDatosSubPreguntaEvaluacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSubPreguntaEvaluacion"));
		
		this.jButtonNuevoSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoSubPreguntaEvaluacion"));
		
		this.jButtonDuplicarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"DuplicarSubPreguntaEvaluacion"));
		
		this.jButtonCopiarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"CopiarSubPreguntaEvaluacion"));
		
		this.jButtonVerFormSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"VerFormSubPreguntaEvaluacion"));
		
		
		this.jButtonNuevoToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarSubPreguntaEvaluacion"));
			
		this.jButtonDuplicarToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemNuevoSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSubPreguntaEvaluacion"));
			
		this.jMenuItemDuplicarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSubPreguntaEvaluacion"));		
		
		
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSubPreguntaEvaluacion"));
		
		
		this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSubPreguntaEvaluacion"));		
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarSubPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonModificarToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubPreguntaEvaluacion"));
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemModificarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ActualizarSubPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonActualizarToolBarSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubPreguntaEvaluacion"));
				
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemActualizarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarSubPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonEliminarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubPreguntaEvaluacion"));
						
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemEliminarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarSubPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonCancelarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubPreguntaEvaluacion"));
			
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemCancelarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubPreguntaEvaluacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSubPreguntaEvaluacion"));		
		
		
		this.jButtonCerrarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarSubPreguntaEvaluacion"));
		
		
		this.jButtonCerrarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemCerrarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSubPreguntaEvaluacion"));
			
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jMenuItemDetalleCerrarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubPreguntaEvaluacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosSubPreguntaEvaluacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubPreguntaEvaluacion"));
		}
		
		this.jButtonCopiarToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarSubPreguntaEvaluacion"));
			
		this.jButtonVerFormToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarSubPreguntaEvaluacion"));
		
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSubPreguntaEvaluacion"));
			
		this.jMenuItemCopiarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSubPreguntaEvaluacion"));		
		
		this.jMenuItemVerFormSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSubPreguntaEvaluacion"));		
		
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubPreguntaEvaluacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubPreguntaEvaluacion"));		
		
		
		
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionSubPreguntaEvaluacion"));
					
		this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSubPreguntaEvaluacion"));
		
		this.jMenuItemRecargarInformacionSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSubPreguntaEvaluacion"));		
		
		
		
		this.jButtonAnterioresSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AnterioresSubPreguntaEvaluacion"));
		
		
		this.jButtonAnterioresToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSubPreguntaEvaluacion"));
		
		this.jMenuItemAnterioresSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSubPreguntaEvaluacion"));		
		
		
		this.jButtonSiguientesSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"SiguientesSubPreguntaEvaluacion"));
		
		
		this.jButtonSiguientesToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemSiguientesSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSubPreguntaEvaluacion"));
			
		this.jMenuItemAbrirOrderBySubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySubPreguntaEvaluacion"));
			
		this.jMenuItemMostrarOcultarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSubPreguntaEvaluacion"));
			
		this.jMenuItemDetalleAbrirOrderBySubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySubPreguntaEvaluacion"));
			
		this.jMenuItemDetalleMostarOcultarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSubPreguntaEvaluacion"));		
		
		
		this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSubPreguntaEvaluacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSubPreguntaEvaluacion"));
			
		this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSubPreguntaEvaluacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSubPreguntaEvaluacion"));

		this.jCheckBoxSeleccionadosSubPreguntaEvaluacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSubPreguntaEvaluacion"));
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubPreguntaEvaluacion"));
		}
		
		
		this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesSubPreguntaEvaluacion"));
			
		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposAccionesSubPreguntaEvaluacion"));
					
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSubPreguntaEvaluacion"));
			
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSubPreguntaEvaluacion"));		
		
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonidSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonordenSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonpreguntaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_siSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_orden_compraSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_completoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_completoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_a_tiempoSubPreguntaEvaluacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaEvaluacionSubPreguntaEvaluacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion!=null) {
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubPreguntaEvaluacion"));
				this.jInternalFrameReporteDinamicoSubPreguntaEvaluacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubPreguntaEvaluacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubPreguntaEvaluacion"));				
			//this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubPreguntaEvaluacion"));
			//this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubPreguntaEvaluacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSubPreguntaEvaluacion!=null) {
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubPreguntaEvaluacion"));
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubPreguntaEvaluacion"));
				this.jInternalFrameImportacionSubPreguntaEvaluacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubPreguntaEvaluacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AbrirOrderBySubPreguntaEvaluacion"));
			
			this.jButtonAbrirOrderByToolBarSubPreguntaEvaluacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSubPreguntaEvaluacion"));			
			
			if(this.jInternalFrameOrderBySubPreguntaEvaluacion!=null) {
				this.jInternalFrameOrderBySubPreguntaEvaluacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubPreguntaEvaluacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTabbedPaneRelacionesSubPreguntaEvaluacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubPreguntaEvaluacion"));
		
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
            		closingInternalFrameSubPreguntaEvaluacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSubPreguntaEvaluacion = (JInternalFrameBase)event.getSource();
	            	
	            SubPreguntaEvaluacionBeanSwingJInternalFrame jInternalFrameParent=(SubPreguntaEvaluacionBeanSwingJInternalFrame)jInternalFrameDetalleFormSubPreguntaEvaluacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSubPreguntaEvaluacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSubPreguntaEvaluacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSubPreguntaEvaluacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSubPreguntaEvaluacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSubPreguntaEvaluacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSubPreguntaEvaluacion";
		inputMap = this.jButtonNuevoRelacionesSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubPreguntaEvaluacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSubPreguntaEvaluacion";
		inputMap = this.jButtonModificarSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSubPreguntaEvaluacion";
		inputMap = this.jButtonActualizarSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSubPreguntaEvaluacion";
		inputMap = this.jButtonEliminarSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSubPreguntaEvaluacion";
		inputMap = this.jButtonCancelarSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSubPreguntaEvaluacion";
		inputMap = this.jButtonCerrarSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSubPreguntaEvaluacion";
		inputMap = this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonGuardarCambiosSubPreguntaEvaluacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSubPreguntaEvaluacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSubPreguntaEvaluacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSubPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSubPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSubPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSubPreguntaEvaluacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonidSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"idSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_empresaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_sucursalSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_pregunta_evaluacionSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_pregunta_evaluacionSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_ejercicioSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSubPreguntaEvaluacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonid_periodoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonordenSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"ordenSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonpreguntaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"preguntaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtonporcentaje_siSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_siSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_facturaSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_facturaSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_orden_compraSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_orden_compraSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_completoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_completoSubPreguntaEvaluacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jButtoncon_a_tiempoSubPreguntaEvaluacionBusqueda.addActionListener(new ButtonActionListener(this,"con_a_tiempoSubPreguntaEvaluacionBusqueda"));
		
		
		this.jButtonFK_IdPreguntaEvaluacionSubPreguntaEvaluacion.addActionListener(new ButtonActionListener(this,"FK_IdPreguntaEvaluacionSubPreguntaEvaluacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSubPreguntaEvaluacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSubPreguntaEvaluacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSubPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSubPreguntaEvaluacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSubPreguntaEvaluacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
					subpreguntaevaluacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacions) {
					subpreguntaevaluacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSubPreguntaEvaluacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
						subpreguntaevaluacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacions) {
						subpreguntaevaluacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
					
						if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_orden_compra(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_completo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_a_tiempo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacions) {
						
						if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_orden_compra(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_completo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO)) {
							existe=true;
							subpreguntaevaluacionAux.setcon_a_tiempo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubPreguntaEvaluacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubPreguntaEvaluacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSubPreguntaEvaluacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSubPreguntaEvaluacion.getSelectedRows();
			
			SubPreguntaEvaluacion subpreguntaevaluacionLocal=new SubPreguntaEvaluacion();
			
			//this.seleccionarTodosSubPreguntaEvaluacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subpreguntaevaluacionLocal =(SubPreguntaEvaluacion) this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions().toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					subpreguntaevaluacionLocal =(SubPreguntaEvaluacion) this.subpreguntaevaluacions.toArray()[this.jTableDatosSubPreguntaEvaluacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				subpreguntaevaluacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
						subpreguntaevaluacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacions) {
						subpreguntaevaluacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubPreguntaEvaluacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubPreguntaEvaluacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubPreguntaEvaluacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSubPreguntaEvaluacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSubPreguntaEvaluacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSubPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSubPreguntaEvaluacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
				
						if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							subpreguntaevaluacionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							subpreguntaevaluacionAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI)) {
							existe=true;
							subpreguntaevaluacionAux.setporcentaje_si(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacions) {
					
						if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							subpreguntaevaluacionAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
							existe=true;
							subpreguntaevaluacionAux.setpregunta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI)) {
							existe=true;
							subpreguntaevaluacionAux.setporcentaje_si(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSubPreguntaEvaluacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSubPreguntaEvaluacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSubPreguntaEvaluacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSubPreguntaEvaluacion) {				
					conSplash=true;//false;										
					
					//this.startProcessSubPreguntaEvaluacion(conSplash);
				
					this.generarReporteSubPreguntaEvaluacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSubPreguntaEvaluacionsSeleccionados();
				//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubPreguntaEvaluacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubPreguntaEvaluacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubPreguntaEvaluacion();
				
				this.exportarSubPreguntaEvaluacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSubPreguntaEvaluacions();
				//this.importarSubPreguntaEvaluacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubPreguntaEvaluacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSubPreguntaEvaluacionsSeleccionados();
				//this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sub Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSubPreguntaEvaluacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSubPreguntaEvaluacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySubPreguntaEvaluacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
				}	
			} 			
			else if(SubPreguntaEvaluacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSubPreguntaEvaluacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSubPreguntaEvaluacion(conSplash);
					
						//this.actualizarParametrosGeneralSubPreguntaEvaluacion();
						
						this.generarReporteProcesoAccionSubPreguntaEvaluacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sub Pregunta EvaluacionES SELECCIONADOS?", "MANTENIMIENTO DE Sub Pregunta Evaluacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSubPreguntaEvaluacion();
				
						this.actualizarParametrosGeneralSubPreguntaEvaluacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.subpreguntaevaluacionReturnGeneral=subpreguntaevaluacionLogic.procesarAccionSubPreguntaEvaluacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions(),this.subpreguntaevaluacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSubPreguntaEvaluacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSubPreguntaEvaluacion();
					
					SubPreguntaEvaluacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSubPreguntaEvaluacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubPreguntaEvaluacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxTiposAccionesFormularioSubPreguntaEvaluacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSubPreguntaEvaluacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSubPreguntaEvaluacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSubPreguntaEvaluacion();
			
			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
			SubPreguntaEvaluacion subpreguntaevaluacion=new SubPreguntaEvaluacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSubPreguntaEvaluacion.getSelectedItem();
			
			
			
			
			subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(subpreguntaevaluacionsSeleccionados.size()==1) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
					subpreguntaevaluacion=subpreguntaevaluacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Proveedor")) {
					jButtonDetalleEvaluacionProveedorActionPerformed(null,rowIndex,true,false,subpreguntaevaluacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSubPreguntaEvaluacion();
			
      		//this.finishProcessSubPreguntaEvaluacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSubPreguntaEvaluacionReturnGeneral() throws Exception {
		if(this.subpreguntaevaluacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.subpreguntaevaluacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.subpreguntaevaluacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.subpreguntaevaluacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.subpreguntaevaluacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.subpreguntaevaluacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
		}
		
		if(this.subpreguntaevaluacionReturnGeneral.getConRetornoLista() || this.subpreguntaevaluacionReturnGeneral.getConRetornoObjeto()) {
			if(this.subpreguntaevaluacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subpreguntaevaluacionLogic.setSubPreguntaEvaluacions(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.subpreguntaevaluacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subpreguntaevaluacionLogic.setSubPreguntaEvaluacion(this.subpreguntaevaluacionReturnGeneral.getSubPreguntaEvaluacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSubPreguntaEvaluacion(false);
		}
	}
	
	public void actualizarParametrosGeneralSubPreguntaEvaluacion() throws Exception {
		
		
	}
	
	public ArrayList<SubPreguntaEvaluacion> getSubPreguntaEvaluacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSubPreguntaEvaluacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionLogic.getSubPreguntaEvaluacions()) {
					if(subpreguntaevaluacionAux.getIsSelected()) {
						subpreguntaevaluacionsSeleccionados.add(subpreguntaevaluacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubPreguntaEvaluacion subpreguntaevaluacionAux:this.subpreguntaevaluacions) {
					if(subpreguntaevaluacionAux.getIsSelected()) {
						subpreguntaevaluacionsSeleccionados.add(subpreguntaevaluacionAux);				
					}
				}
			}
			
			if(subpreguntaevaluacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						subpreguntaevaluacionsSeleccionados.addAll(this.subpreguntaevaluacionLogic.getSubPreguntaEvaluacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						subpreguntaevaluacionsSeleccionados.addAll(this.subpreguntaevaluacions);				
					}
				}
			}
		} else {
			subpreguntaevaluacionsSeleccionados.add(this.subpreguntaevaluacion);
		}
		
		return subpreguntaevaluacionsSeleccionados;
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
	
	public void generarReporteSubPreguntaEvaluacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSubPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSubPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubPreguntaEvaluacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubPreguntaEvaluacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSubPreguntaEvaluacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sub Pregunta Evaluacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSubPreguntaEvaluacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSubPreguntaEvaluacion();
		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSubPreguntaEvaluacion();
		
		
		//this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados ,subpreguntaevaluacionImplementable,subpreguntaevaluacionImplementableHome);
	}
	
	public void mostrarImportacionSubPreguntaEvaluacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSubPreguntaEvaluacion();
		
		this.abrirFrameImportacionSubPreguntaEvaluacion();		
		
			
		//this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados ,subpreguntaevaluacionImplementable,subpreguntaevaluacionImplementableHome);
	}
	
	public void importarSubPreguntaEvaluacions() throws Exception {		
	
	}
	
	public void exportarSubPreguntaEvaluacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSubPreguntaEvaluacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSubPreguntaEvaluacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSubPreguntaEvaluacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sub Pregunta Evaluacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSubPreguntaEvaluacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSubPreguntaEvaluacion(subpreguntaevaluacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//subpreguntaevaluacionAux.setsDetalleGeneralEntityReporte(subpreguntaevaluacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSubPreguntaEvaluacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=subpreguntaevaluacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getpreguntaevaluacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getpregunta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getporcentaje_si().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getcon_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getcon_orden_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getcon_completo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subpreguntaevaluacion.getcon_a_tiempo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SubPreguntaEvaluacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSubPreguntaEvaluacion(row);				
				iRow++;
			}				
			
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSubPreguntaEvaluacion(subpreguntaevaluacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSubPreguntaEvaluacionsSeleccionados() throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();		
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subpreguntaevaluacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("subpreguntaevaluacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("subpreguntaevaluacion");
			//elementRoot.appendChild(element);
		
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
				element = document.createElement("subpreguntaevaluacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSubPreguntaEvaluacion(subpreguntaevaluacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Pregunta Evaluacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSubPreguntaEvaluacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_PORCENTAJESI);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getpreguntaevaluacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getpregunta());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getporcentaje_si());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getcon_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getcon_orden_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getcon_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(subpreguntaevaluacion.getcon_a_tiempo());				
	}
	
	public void setFilaDatosExportarXmlSubPreguntaEvaluacion(SubPreguntaEvaluacion subpreguntaevaluacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SubPreguntaEvaluacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(subpreguntaevaluacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SubPreguntaEvaluacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(subpreguntaevaluacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SubPreguntaEvaluacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(subpreguntaevaluacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SubPreguntaEvaluacionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(subpreguntaevaluacion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementpreguntaevaluacion_descripcion = document.createElement(SubPreguntaEvaluacionConstantesFunciones.IDPREGUNTAEVALUACION);
		elementpreguntaevaluacion_descripcion.appendChild(document.createTextNode(subpreguntaevaluacion.getpreguntaevaluacion_descripcion()));
		element.appendChild(elementpreguntaevaluacion_descripcion);

		Element elementejercicio_descripcion = document.createElement(SubPreguntaEvaluacionConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(subpreguntaevaluacion.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(SubPreguntaEvaluacionConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(subpreguntaevaluacion.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementorden = document.createElement(SubPreguntaEvaluacionConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(subpreguntaevaluacion.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementpregunta = document.createElement(SubPreguntaEvaluacionConstantesFunciones.PREGUNTA);
		elementpregunta.appendChild(document.createTextNode(subpreguntaevaluacion.getpregunta().trim()));
		element.appendChild(elementpregunta);

		Element elementporcentaje_si = document.createElement(SubPreguntaEvaluacionConstantesFunciones.PORCENTAJESI);
		elementporcentaje_si.appendChild(document.createTextNode(subpreguntaevaluacion.getporcentaje_si().toString().trim()));
		element.appendChild(elementporcentaje_si);

		Element elementcon_factura = document.createElement(SubPreguntaEvaluacionConstantesFunciones.CONFACTURA);
		elementcon_factura.appendChild(document.createTextNode(subpreguntaevaluacion.getcon_factura().toString().trim()));
		element.appendChild(elementcon_factura);

		Element elementcon_orden_compra = document.createElement(SubPreguntaEvaluacionConstantesFunciones.CONORDENCOMPRA);
		elementcon_orden_compra.appendChild(document.createTextNode(subpreguntaevaluacion.getcon_orden_compra().toString().trim()));
		element.appendChild(elementcon_orden_compra);

		Element elementcon_completo = document.createElement(SubPreguntaEvaluacionConstantesFunciones.CONCOMPLETO);
		elementcon_completo.appendChild(document.createTextNode(subpreguntaevaluacion.getcon_completo().toString().trim()));
		element.appendChild(elementcon_completo);

		Element elementcon_a_tiempo = document.createElement(SubPreguntaEvaluacionConstantesFunciones.CONATIEMPO);
		elementcon_a_tiempo.appendChild(document.createTextNode(subpreguntaevaluacion.getcon_a_tiempo().toString().trim()));
		element.appendChild(elementcon_a_tiempo);
	}
	
	public void generarReporteGroupGenericoSubPreguntaEvaluacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados=new ArrayList<SubPreguntaEvaluacion>();
		
		subpreguntaevaluacionsSeleccionados=this.getSubPreguntaEvaluacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSubPreguntaEvaluacion(subpreguntaevaluacionsSeleccionados);
		
		this.generarReporteSubPreguntaEvaluacions("Todos",subpreguntaevaluacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSubPreguntaEvaluacion(ArrayList<SubPreguntaEvaluacion> subpreguntaevaluacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SubPreguntaEvaluacion subpreguntaevaluacionAux:subpreguntaevaluacionsSeleccionados) {
				subpreguntaevaluacionAux.setsDetalleGeneralEntityReporte(subpreguntaevaluacionAux.toString());
			
				if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPREGUNTAEVALUACION)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getpreguntaevaluacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_PREGUNTA)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(subpreguntaevaluacionAux.getpregunta());
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONFACTURA)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(subpreguntaevaluacionAux.getcon_factura()));
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONORDENCOMPRA)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(subpreguntaevaluacionAux.getcon_orden_compra()));
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONCOMPLETO)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(subpreguntaevaluacionAux.getcon_completo()));
				}
				 else if(sTipoSeleccionar.equals(SubPreguntaEvaluacionConstantesFunciones.LABEL_CONATIEMPO)) {
					existe=true;
					subpreguntaevaluacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(subpreguntaevaluacionAux.getcon_a_tiempo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubPreguntaEvaluacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSubPreguntaEvaluacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=true;
				this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=true;
				this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=true;
			}
			
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=true;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaModificarSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaCancelarSubPreguntaEvaluacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				} else {
					this.isVisibilidadCeldaGuardarSubPreguntaEvaluacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SubPreguntaEvaluacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=true;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=true;
		} else {
			this.actualizarEstadoPanelsSubPreguntaEvaluacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSubPreguntaEvaluacion=false;
			//this.isVisibilidadCeldaVerFormSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaDuplicarSubPreguntaEvaluacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
		} else {
			this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(!subpreguntaevaluacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;												
			}
			
			this.jButtonCerrarSubPreguntaEvaluacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSubPreguntaEvaluacion=false;
		}
		
		if(!this.permiteMantenimiento(this.subpreguntaevaluacion)) {
			this.isVisibilidadCeldaActualizarSubPreguntaEvaluacion=false;
			this.isVisibilidadCeldaEliminarSubPreguntaEvaluacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSubPreguntaEvaluacion() {
		this.isVisibilidadCeldaNuevoSubPreguntaEvaluacion=false;
		this.isVisibilidadCeldaGuardarCambiosSubPreguntaEvaluacion=false;
	}
	
	public void actualizarEstadoPanelsSubPreguntaEvaluacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosEdicionSubPreguntaEvaluacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubPreguntaEvaluacion!=null) {
				this.jScrollPanelDatosSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubPreguntaEvaluacion!=null) {
				this.jPanelPaginacionSubPreguntaEvaluacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
					this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.subpreguntaevaluacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion!=null) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSubPreguntaEvaluacion!=null) {
				this.jPanelParametrosReportesSubPreguntaEvaluacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPreguntaEvaluacion(Boolean isParaPreguntaEvaluacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPreguntaEvaluacionNegation=!isParaPreguntaEvaluacion;

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaPreguntaEvaluacion;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdPreguntaEvaluacion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPreguntaEvaluacion) {this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);}
		}
		
	}
	
	

	public String registrarSesionSubPreguntaEvaluacionParaDetalleEvaluacionProveedores() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionProveedor=false;

		try {

			if(this.subpreguntaevaluacionSessionBean==null) {
				this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean==null) {
				this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setsPathNavegacionActual(subpreguntaevaluacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(true);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(SubPreguntaEvaluacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionSubPreguntaEvaluacion(true);
			this.jInternalFrameDetalleFormSubPreguntaEvaluacion.detalleevaluacionproveedorSessionBean.setlidSubPreguntaEvaluacionActual(this.idSubPreguntaEvaluacionActual);

			subpreguntaevaluacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySubPreguntaEvaluacion(true);
			subpreguntaevaluacionSessionBean.setlIdSubPreguntaEvaluacionActualForeignKey(this.idSubPreguntaEvaluacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		
		if(this.subpreguntaevaluacionSessionBean==null) {
			this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		}
		
		this.subpreguntaevaluacionSessionBean.setsUltimaBusquedaSubPreguntaEvaluacion(this.getsAccionBusqueda());
		this.subpreguntaevaluacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.subpreguntaevaluacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			subpreguntaevaluacionSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			subpreguntaevaluacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			subpreguntaevaluacionSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPreguntaEvaluacion")) {
			subpreguntaevaluacionSessionBean.setid_pregunta_evaluacion(this.getid_pregunta_evaluacionFK_IdPreguntaEvaluacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			subpreguntaevaluacionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		
		if(this.subpreguntaevaluacionSessionBean==null) {
			this.subpreguntaevaluacionSessionBean=new SubPreguntaEvaluacionSessionBean();
		}
		
		if(this.subpreguntaevaluacionSessionBean.getsUltimaBusquedaSubPreguntaEvaluacion()!=null&&!this.subpreguntaevaluacionSessionBean.getsUltimaBusquedaSubPreguntaEvaluacion().equals("")) {
			this.setsAccionBusqueda(subpreguntaevaluacionSessionBean.getsUltimaBusquedaSubPreguntaEvaluacion());
			this.setiNumeroPaginacion(subpreguntaevaluacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(subpreguntaevaluacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(subpreguntaevaluacionSessionBean.getid_ejercicio());
				subpreguntaevaluacionSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(subpreguntaevaluacionSessionBean.getid_empresa());
				subpreguntaevaluacionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(subpreguntaevaluacionSessionBean.getid_periodo());
				subpreguntaevaluacionSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPreguntaEvaluacion")) {
				this.setid_pregunta_evaluacionFK_IdPreguntaEvaluacion(subpreguntaevaluacionSessionBean.getid_pregunta_evaluacion());
				subpreguntaevaluacionSessionBean.setid_pregunta_evaluacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(subpreguntaevaluacionSessionBean.getid_sucursal());
				subpreguntaevaluacionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.subpreguntaevaluacionSessionBean.setsUltimaBusquedaSubPreguntaEvaluacion("");
		this.subpreguntaevaluacionSessionBean.setiNumeroPaginacion(SubPreguntaEvaluacionConstantesFunciones.INUMEROPAGINACION);
		this.subpreguntaevaluacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSubPreguntaEvaluacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSubPreguntaEvaluacion() {
		this.updateBorderResaltarBusquedasFormularioSubPreguntaEvaluacion();
		this.updateVisibilidadBusquedasFormularioSubPreguntaEvaluacion();
		this.updateHabilitarBusquedasFormularioSubPreguntaEvaluacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioSubPreguntaEvaluacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponents().length>0) {
	

		if(this.subpreguntaevaluacionConstantesFunciones.resaltarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion!=null) {
			index= this.jTabbedPaneBusquedasSubPreguntaEvaluacion.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponent(index);
				jPanel.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSubPreguntaEvaluacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubPreguntaEvaluacion.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			if(!this.subpreguntaevaluacionConstantesFunciones.mostrarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion && index>-1) {
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSubPreguntaEvaluacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubPreguntaEvaluacion.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
				this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setEnabledAt(index,this.subpreguntaevaluacionConstantesFunciones.activarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSubPreguntaEvaluacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPreguntaEvaluacion")) {
			index= this.jTabbedPaneBusquedasSubPreguntaEvaluacion.indexOfComponent(this.jPanelFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);

			this.jTabbedPaneBusquedasSubPreguntaEvaluacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubPreguntaEvaluacion.getComponent(index);

			this.subpreguntaevaluacionConstantesFunciones.setResaltarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion(resaltar);

			jPanel.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarFK_IdPreguntaEvaluacionSubPreguntaEvaluacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSubPreguntaEvaluacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSubPreguntaEvaluacion() throws Exception {

		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSubPreguntaEvaluacion();
		this.updateVisibilidadResaltarControlesFormularioSubPreguntaEvaluacion();
		this.updateHabilitarResaltarControlesFormularioSubPreguntaEvaluacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioSubPreguntaEvaluacion() throws Exception {
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.subpreguntaevaluacionConstantesFunciones.resaltaridSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltaridSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarid_empresaSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarid_empresaSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarid_sucursalSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarid_sucursalSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarid_pregunta_evaluacionSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarid_pregunta_evaluacionSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarid_ejercicioSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarid_ejercicioSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarid_periodoSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarid_periodoSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarordenSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarordenSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarpreguntaSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarpreguntaSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarporcentaje_siSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarporcentaje_siSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_facturaSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setBorderPainted(true);this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_facturaSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_orden_compraSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setBorderPainted(true);this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_orden_compraSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_completoSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setBorderPainted(true);this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_completoSubPreguntaEvaluacion);}
		if(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_a_tiempoSubPreguntaEvaluacion!=null && this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setBorderPainted(true);this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setBorder(this.subpreguntaevaluacionConstantesFunciones.resaltarcon_a_tiempoSubPreguntaEvaluacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSubPreguntaEvaluacion() throws Exception {		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
	
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostraridSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelidSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostraridSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_empresaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelid_empresaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_empresaSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_sucursalSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelid_sucursalSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_sucursalSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_pregunta_evaluacionSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelid_pregunta_evaluacionSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_pregunta_evaluacionSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_ejercicioSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelid_ejercicioSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_ejercicioSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_periodoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelid_periodoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarid_periodoSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarordenSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelordenSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarordenSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarpreguntaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelpreguntaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarpreguntaSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarporcentaje_siSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelporcentaje_siSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarporcentaje_siSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_facturaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelcon_facturaSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_facturaSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_orden_compraSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelcon_orden_compraSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_orden_compraSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_completoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelcon_completoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_completoSubPreguntaEvaluacion);
		//this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_a_tiempoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jPanelcon_a_tiempoSubPreguntaEvaluacion.setVisible(this.subpreguntaevaluacionConstantesFunciones.mostrarcon_a_tiempoSubPreguntaEvaluacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSubPreguntaEvaluacion() throws Exception {
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubPreguntaEvaluacion!=null) {
	
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jLabelidSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activaridSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_empresaSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarid_empresaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_sucursalSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarid_sucursalSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_pregunta_evaluacionSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarid_pregunta_evaluacionSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_ejercicioSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarid_ejercicioSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jComboBoxid_periodoSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarid_periodoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldordenSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarordenSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextAreapreguntaSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarpreguntaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jTextFieldporcentaje_siSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarporcentaje_siSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_facturaSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarcon_facturaSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_orden_compraSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarcon_orden_compraSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_completoSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarcon_completoSubPreguntaEvaluacion);
		this.jInternalFrameDetalleFormSubPreguntaEvaluacion.jCheckBoxcon_a_tiempoSubPreguntaEvaluacion.setEnabled(this.subpreguntaevaluacionConstantesFunciones.activarcon_a_tiempoSubPreguntaEvaluacion);
		}
	}
	
		
}