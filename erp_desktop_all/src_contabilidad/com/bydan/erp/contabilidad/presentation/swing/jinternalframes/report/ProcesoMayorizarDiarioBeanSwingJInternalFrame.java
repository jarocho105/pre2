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

//import com.bydan.erp.contabilidad.util.ProcesoMayorizarDiarioConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoMayorizarDiarioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoMayorizarDiarioParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoMayorizarDiarioBean;
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

import com.bydan.erp.seguridad.business.logic.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoMayorizarDiarioBeanSwingJInternalFrame extends ProcesoMayorizarDiarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoMayorizarDiarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoMayorizarDiario> procesomayorizardiarioValidator = new ClassValidator<ProcesoMayorizarDiario>(ProcesoMayorizarDiario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoMayorizarDiario procesomayorizardiario;	
	public ProcesoMayorizarDiario procesomayorizardiarioAux;
	public ProcesoMayorizarDiario procesomayorizardiarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoMayorizarDiario procesomayorizardiarioTotales;
	public Long idProcesoMayorizarDiarioActual;
	public Long iIdNuevoProcesoMayorizarDiario=0L;
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

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoMayorizarDiario;
	public Boolean isPermisoNuevoProcesoMayorizarDiario;
	public Boolean isPermisoActualizarProcesoMayorizarDiario;
	public Boolean isPermisoActualizarOriginalProcesoMayorizarDiario;
	public Boolean isPermisoEliminarProcesoMayorizarDiario;
	public Boolean isPermisoGuardarCambiosProcesoMayorizarDiario;
	public Boolean isPermisoConsultaProcesoMayorizarDiario;
	public Boolean isPermisoBusquedaProcesoMayorizarDiario;
	public Boolean isPermisoReporteProcesoMayorizarDiario;
	public Boolean isPermisoPaginacionMedioProcesoMayorizarDiario;
	public Boolean isPermisoPaginacionAltoProcesoMayorizarDiario;
	public Boolean isPermisoPaginacionTodoProcesoMayorizarDiario;
	public Boolean isPermisoCopiarProcesoMayorizarDiario;
	public Boolean isPermisoVerFormProcesoMayorizarDiario;
	public Boolean isPermisoDuplicarProcesoMayorizarDiario;
	public Boolean isPermisoOrdenProcesoMayorizarDiario;
	
	
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
	
	public ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioReturnGeneral;
	public ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoMayorizarDiario=false;
	public Boolean esParaAccionDesdeFormularioProcesoMayorizarDiario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoMayorizarDiarioSessionBeanAdditional procesomayorizardiarioSessionBeanAdditional=null;
	
	public ProcesoMayorizarDiarioSessionBeanAdditional getProcesoMayorizarDiarioSessionBeanAdditional() {
		return this.procesomayorizardiarioSessionBeanAdditional;
	}
	
	public void setProcesoMayorizarDiarioSessionBeanAdditional(ProcesoMayorizarDiarioSessionBeanAdditional procesomayorizardiarioSessionBeanAdditional) {
		try {
			this.procesomayorizardiarioSessionBeanAdditional=procesomayorizardiarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional procesomayorizardiarioBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoMayorizarDiarioBeanSwingJInternalFrame
	
	public ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional getProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional() {
		return this.procesomayorizardiarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional(ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional procesomayorizardiarioBeanSwingJInternalFrameAdditional) {
		try {
			this.procesomayorizardiarioBeanSwingJInternalFrameAdditional=procesomayorizardiarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoMayorizarDiarioLogic procesomayorizardiarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoMayorizarDiario procesomayorizardiarioBean;
	public ProcesoMayorizarDiarioConstantesFunciones procesomayorizardiarioConstantesFunciones;
	//public ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoMayorizarDiario> procesomayorizardiarios;	
	//public List<ProcesoMayorizarDiario> procesomayorizardiariosEliminados;
	//public List<ProcesoMayorizarDiario> procesomayorizardiariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoMayorizarDiario=true;
	public Boolean isVisibilidadCeldaCopiarProcesoMayorizarDiario=true;
	public Boolean isVisibilidadCeldaVerFormProcesoMayorizarDiario=true;
	public Boolean isVisibilidadCeldaOrdenProcesoMayorizarDiario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaCancelarProcesoMayorizarDiario=false;
	public Boolean isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoMayorizarDiario=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoProcesoMayorizarDiario() {
		return this.iIdNuevoProcesoMayorizarDiario;
	}

	public void setiIdNuevoProcesoMayorizarDiario(Long iIdNuevoProcesoMayorizarDiario) {
		this.iIdNuevoProcesoMayorizarDiario = iIdNuevoProcesoMayorizarDiario;
	}
	
	public Long getidProcesoMayorizarDiarioActual() {
		return this.idProcesoMayorizarDiarioActual;
	}

	public void setidProcesoMayorizarDiarioActual(Long idProcesoMayorizarDiarioActual) {
		this.idProcesoMayorizarDiarioActual = idProcesoMayorizarDiarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoMayorizarDiario getprocesomayorizardiario() {
		return this.procesomayorizardiario;
	}

	public void setprocesomayorizardiario(ProcesoMayorizarDiario procesomayorizardiario) {
		this.procesomayorizardiario = procesomayorizardiario;
	}
	
	public ProcesoMayorizarDiario getprocesomayorizardiarioAux() {
		return this.procesomayorizardiarioAux;
	}

	public void setprocesomayorizardiarioAux(ProcesoMayorizarDiario procesomayorizardiarioAux) {
		this.procesomayorizardiarioAux = procesomayorizardiarioAux;
	}				
	
	public ProcesoMayorizarDiario getprocesomayorizardiarioAnterior() {
		return this.procesomayorizardiarioAnterior;
	}

	public void setprocesomayorizardiarioAnterior(ProcesoMayorizarDiario procesomayorizardiarioAnterior) {
		this.procesomayorizardiarioAnterior = procesomayorizardiarioAnterior;
	}	
	
	public ProcesoMayorizarDiario getprocesomayorizardiarioTotales() {
		return this.procesomayorizardiarioTotales;
	}

	public void setprocesomayorizardiarioTotales(ProcesoMayorizarDiario procesomayorizardiarioTotales) {
		this.procesomayorizardiarioTotales = procesomayorizardiarioTotales;
	}	
	
	public ProcesoMayorizarDiario getprocesomayorizardiarioBean() {
		return this.procesomayorizardiarioBean;
	}

	public void setprocesomayorizardiarioBean(ProcesoMayorizarDiario procesomayorizardiarioBean) {
		this.procesomayorizardiarioBean = procesomayorizardiarioBean;
	}	
	
	public ProcesoMayorizarDiarioParameterReturnGeneral getprocesomayorizardiarioReturnGeneral() {
		return this.procesomayorizardiarioReturnGeneral;
	}

	public void setprocesomayorizardiarioReturnGeneral(ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioReturnGeneral) {
		this.procesomayorizardiarioReturnGeneral = procesomayorizardiarioReturnGeneral;
	}	
	
	
	public String codigoBusquedaProcesoMayorizarDiario="";

	public String getcodigoBusquedaProcesoMayorizarDiario() {
		return this.codigoBusquedaProcesoMayorizarDiario;
	}

	public void setcodigoBusquedaProcesoMayorizarDiario(String codigoBusquedaProcesoMayorizarDiario) {
		this.codigoBusquedaProcesoMayorizarDiario = codigoBusquedaProcesoMayorizarDiario;
	}

;
	public Long id_tipo_movimientoBusquedaProcesoMayorizarDiario=-1L;

	public Long getid_tipo_movimientoBusquedaProcesoMayorizarDiario() {
		return this.id_tipo_movimientoBusquedaProcesoMayorizarDiario;
	}

	public void setid_tipo_movimientoBusquedaProcesoMayorizarDiario(Long id_tipo_movimientoBusquedaProcesoMayorizarDiario) {
		this.id_tipo_movimientoBusquedaProcesoMayorizarDiario = id_tipo_movimientoBusquedaProcesoMayorizarDiario;
	}

;
	public Date fecha_inicioBusquedaProcesoMayorizarDiario=new Date();

	public Date getfecha_inicioBusquedaProcesoMayorizarDiario() {
		return this.fecha_inicioBusquedaProcesoMayorizarDiario;
	}

	public void setfecha_inicioBusquedaProcesoMayorizarDiario(Date fecha_inicioBusquedaProcesoMayorizarDiario) {
		this.fecha_inicioBusquedaProcesoMayorizarDiario = fecha_inicioBusquedaProcesoMayorizarDiario;
	}

;
	public Date fecha_finBusquedaProcesoMayorizarDiario=new Date();

	public Date getfecha_finBusquedaProcesoMayorizarDiario() {
		return this.fecha_finBusquedaProcesoMayorizarDiario;
	}

	public void setfecha_finBusquedaProcesoMayorizarDiario(Date fecha_finBusquedaProcesoMayorizarDiario) {
		this.fecha_finBusquedaProcesoMayorizarDiario = fecha_finBusquedaProcesoMayorizarDiario;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoMayorizarDiarioLogic getProcesoMayorizarDiarioLogic()	{		
		return procesomayorizardiarioLogic;
	}

	public void setProcesoMayorizarDiarioLogic(ProcesoMayorizarDiarioLogic procesomayorizardiarioLogic) {
		this.procesomayorizardiarioLogic = procesomayorizardiarioLogic;
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
	
	public Boolean getIsEsNuevoProcesoMayorizarDiario() {
		return isEsNuevoProcesoMayorizarDiario;
	}

	public void setIsEsNuevoProcesoMayorizarDiario(Boolean isEsNuevoProcesoMayorizarDiario) {
		this.isEsNuevoProcesoMayorizarDiario = isEsNuevoProcesoMayorizarDiario;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoMayorizarDiario() {
		return esParaAccionDesdeFormularioProcesoMayorizarDiario;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoMayorizarDiario(Boolean esParaAccionDesdeFormularioProcesoMayorizarDiario) {
		this.esParaAccionDesdeFormularioProcesoMayorizarDiario = esParaAccionDesdeFormularioProcesoMayorizarDiario;
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

			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			}

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesomayorizardiarioSessionBean.getlidEmpresaActual());
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

			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			}

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesomayorizardiarioSessionBean.getlidSucursalActual());
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

			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			}

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(procesomayorizardiarioSessionBean.getlidEjercicioActual());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			}

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(procesomayorizardiarioSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

					if(this.procesomayorizardiario!=null) {
						this.procesomayorizardiario.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoMayorizarDiario.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoMayorizarDiarioGenerico)throws Exception
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
				jComboBoxid_empresaProcesoMayorizarDiarioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoMayorizarDiarioGenerico!=null && jComboBoxid_empresaProcesoMayorizarDiarioGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoMayorizarDiarioGenerico.setSelectedIndex(0);
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

					if(this.procesomayorizardiario!=null) {
						this.procesomayorizardiario.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoMayorizarDiarioGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoMayorizarDiarioGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoMayorizarDiarioGenerico!=null && jComboBoxid_sucursalProcesoMayorizarDiarioGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoMayorizarDiarioGenerico.setSelectedIndex(0);
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

					if(this.procesomayorizardiario!=null) {
						this.procesomayorizardiario.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico)throws Exception
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
				jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico!=null && jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.procesomayorizardiario!=null) {
						this.procesomayorizardiario.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoMayorizarDiario") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario!=null) {
						jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario!=null) {
							//jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico!=null && jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoMayorizarDiario procesomayorizardiario,JComboBox jComboBoxid_empresaProcesoMayorizarDiarioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoMayorizarDiarioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoMayorizarDiarioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesomayorizardiario.setid_empresa(empresaAux.getId());
				procesomayorizardiario.setempresa_descripcion(ProcesoMayorizarDiarioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesomayorizardiario.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoMayorizarDiario procesomayorizardiario,JComboBox jComboBoxid_sucursalProcesoMayorizarDiarioGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoMayorizarDiarioGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoMayorizarDiarioGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesomayorizardiario.setid_sucursal(sucursalAux.getId());
				procesomayorizardiario.setsucursal_descripcion(ProcesoMayorizarDiarioConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesomayorizardiario.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoMayorizarDiario procesomayorizardiario,JComboBox jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoMayorizarDiarioGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesomayorizardiario.setid_ejercicio(ejercicioAux.getId());
				procesomayorizardiario.setejercicio_descripcion(ProcesoMayorizarDiarioConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesomayorizardiario.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(ProcesoMayorizarDiario procesomayorizardiario,JComboBox jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoProcesoMayorizarDiarioGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				procesomayorizardiario.setid_tipo_movimiento(tipomovimientoAux.getId());
				procesomayorizardiario.settipomovimiento_descripcion(ProcesoMayorizarDiarioConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				procesomayorizardiario.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
					}

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
					}

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
					}

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { 
					}

					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoMayorizarDiario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.addItem(tipomovimiento);
							}
						}

						if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoMayorizarDiario() throws Exception {
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
		
	public ProcesoMayorizarDiarioParameterReturnGeneral getProcesoMayorizarDiarioParameterGeneral() {
		return this.procesomayorizardiarioParameterGeneral;
	}
	
	public void setProcesoMayorizarDiarioParameterGeneral(ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioParameterGeneral) {
		this.procesomayorizardiarioParameterGeneral = procesomayorizardiarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoMayorizarDiario() {
		return isPermisoTodoProcesoMayorizarDiario;
	}

	public void setIsPermisoTodoProcesoMayorizarDiario(Boolean isPermisoTodoProcesoMayorizarDiario) {
		this.isPermisoTodoProcesoMayorizarDiario = isPermisoTodoProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoNuevoProcesoMayorizarDiario() {
		return isPermisoNuevoProcesoMayorizarDiario;
	}

	public void setIsPermisoNuevoProcesoMayorizarDiario(Boolean isPermisoNuevoProcesoMayorizarDiario) {
		this.isPermisoNuevoProcesoMayorizarDiario = isPermisoNuevoProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoActualizarProcesoMayorizarDiario() {
		return isPermisoActualizarProcesoMayorizarDiario;
	}

	public void setIsPermisoActualizarProcesoMayorizarDiario(Boolean isPermisoActualizarProcesoMayorizarDiario) {
		this.isPermisoActualizarProcesoMayorizarDiario = isPermisoActualizarProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoEliminarProcesoMayorizarDiario() {
		return isPermisoEliminarProcesoMayorizarDiario;
	}

	public void setIsPermisoEliminarProcesoMayorizarDiario(Boolean isPermisoEliminarProcesoMayorizarDiario) {
		this.isPermisoEliminarProcesoMayorizarDiario = isPermisoEliminarProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoMayorizarDiario() {
		return isPermisoGuardarCambiosProcesoMayorizarDiario;
	}

	public void setIsPermisoGuardarCambiosProcesoMayorizarDiario(Boolean isPermisoGuardarCambiosProcesoMayorizarDiario) {
		this.isPermisoGuardarCambiosProcesoMayorizarDiario = isPermisoGuardarCambiosProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoConsultaProcesoMayorizarDiario() {
		return isPermisoConsultaProcesoMayorizarDiario;
	}

	public void setIsPermisoConsultaProcesoMayorizarDiario(Boolean isPermisoConsultaProcesoMayorizarDiario) {
		this.isPermisoConsultaProcesoMayorizarDiario = isPermisoConsultaProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoBusquedaProcesoMayorizarDiario() {
		return isPermisoBusquedaProcesoMayorizarDiario;
	}

	public void setIsPermisoBusquedaProcesoMayorizarDiario(Boolean isPermisoBusquedaProcesoMayorizarDiario) {
		this.isPermisoBusquedaProcesoMayorizarDiario = isPermisoBusquedaProcesoMayorizarDiario;
	}

	public Boolean getIsPermisoReporteProcesoMayorizarDiario() {
		return isPermisoReporteProcesoMayorizarDiario;
	}

	public void setIsPermisoReporteProcesoMayorizarDiario(Boolean isPermisoReporteProcesoMayorizarDiario) {
		this.isPermisoReporteProcesoMayorizarDiario = isPermisoReporteProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoMayorizarDiario() {
		return isPermisoPaginacionMedioProcesoMayorizarDiario;
	}

	public void setIsPermisoPaginacionMedioProcesoMayorizarDiario(Boolean isPermisoPaginacionMedioProcesoMayorizarDiario) {
		this.isPermisoPaginacionMedioProcesoMayorizarDiario = isPermisoPaginacionMedioProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoMayorizarDiario() {
		return isPermisoPaginacionTodoProcesoMayorizarDiario;
	}

	public void setIsPermisoPaginacionTodoProcesoMayorizarDiario(Boolean isPermisoPaginacionTodoProcesoMayorizarDiario) {
		this.isPermisoPaginacionTodoProcesoMayorizarDiario = isPermisoPaginacionTodoProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoMayorizarDiario() {
		return isPermisoPaginacionAltoProcesoMayorizarDiario;
	}

	public void setIsPermisoPaginacionAltoProcesoMayorizarDiario(Boolean isPermisoPaginacionAltoProcesoMayorizarDiario) {
		this.isPermisoPaginacionAltoProcesoMayorizarDiario = isPermisoPaginacionAltoProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoCopiarProcesoMayorizarDiario() {
		return isPermisoCopiarProcesoMayorizarDiario;
	}

	public void setIsPermisoCopiarProcesoMayorizarDiario(Boolean isPermisoCopiarProcesoMayorizarDiario) {
		this.isPermisoCopiarProcesoMayorizarDiario = isPermisoCopiarProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoVerFormProcesoMayorizarDiario() {
		return isPermisoVerFormProcesoMayorizarDiario;
	}

	public void setIsPermisoVerFormProcesoMayorizarDiario(Boolean isPermisoVerFormProcesoMayorizarDiario) {
		this.isPermisoVerFormProcesoMayorizarDiario = isPermisoVerFormProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoDuplicarProcesoMayorizarDiario() {
		return isPermisoDuplicarProcesoMayorizarDiario;
	}

	public void setIsPermisoDuplicarProcesoMayorizarDiario(Boolean isPermisoDuplicarProcesoMayorizarDiario) {
		this.isPermisoDuplicarProcesoMayorizarDiario = isPermisoDuplicarProcesoMayorizarDiario;
	}
	
	public Boolean getIsPermisoOrdenProcesoMayorizarDiario() {
		return isPermisoOrdenProcesoMayorizarDiario;
	}

	public void setIsPermisoOrdenProcesoMayorizarDiario(Boolean isPermisoOrdenProcesoMayorizarDiario) {
		this.isPermisoOrdenProcesoMayorizarDiario = isPermisoOrdenProcesoMayorizarDiario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoMayorizarDiario() {
		return isVisibilidadCeldaNuevoProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaNuevoProcesoMayorizarDiario(Boolean isVisibilidadCeldaNuevoProcesoMayorizarDiario) {
		this.isVisibilidadCeldaNuevoProcesoMayorizarDiario = isVisibilidadCeldaNuevoProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoMayorizarDiario() {
		return isVisibilidadCeldaDuplicarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoMayorizarDiario(Boolean isVisibilidadCeldaDuplicarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario = isVisibilidadCeldaDuplicarProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoMayorizarDiario() {
		return isVisibilidadCeldaCopiarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaCopiarProcesoMayorizarDiario(Boolean isVisibilidadCeldaCopiarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaCopiarProcesoMayorizarDiario = isVisibilidadCeldaCopiarProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoMayorizarDiario() {
		return isVisibilidadCeldaVerFormProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaVerFormProcesoMayorizarDiario(Boolean isVisibilidadCeldaVerFormProcesoMayorizarDiario) {
		this.isVisibilidadCeldaVerFormProcesoMayorizarDiario = isVisibilidadCeldaVerFormProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoMayorizarDiario() {
		return isVisibilidadCeldaOrdenProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaOrdenProcesoMayorizarDiario(Boolean isVisibilidadCeldaOrdenProcesoMayorizarDiario) {
		this.isVisibilidadCeldaOrdenProcesoMayorizarDiario = isVisibilidadCeldaOrdenProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario() {
		return isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario(Boolean isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario = isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoMayorizarDiario() {
		return isVisibilidadCeldaModificarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaModificarProcesoMayorizarDiario(Boolean isVisibilidadCeldaModificarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaModificarProcesoMayorizarDiario = isVisibilidadCeldaModificarProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoMayorizarDiario() {
		return isVisibilidadCeldaActualizarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaActualizarProcesoMayorizarDiario(Boolean isVisibilidadCeldaActualizarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaActualizarProcesoMayorizarDiario = isVisibilidadCeldaActualizarProcesoMayorizarDiario;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoMayorizarDiario() {
		return isVisibilidadCeldaEliminarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaEliminarProcesoMayorizarDiario(Boolean isVisibilidadCeldaEliminarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaEliminarProcesoMayorizarDiario = isVisibilidadCeldaEliminarProcesoMayorizarDiario;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoMayorizarDiario() {
		return isVisibilidadCeldaCancelarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaCancelarProcesoMayorizarDiario(Boolean isVisibilidadCeldaCancelarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaCancelarProcesoMayorizarDiario = isVisibilidadCeldaCancelarProcesoMayorizarDiario;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoMayorizarDiario() {
		return isVisibilidadCeldaGuardarProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaGuardarProcesoMayorizarDiario(Boolean isVisibilidadCeldaGuardarProcesoMayorizarDiario) {
		this.isVisibilidadCeldaGuardarProcesoMayorizarDiario = isVisibilidadCeldaGuardarProcesoMayorizarDiario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario() {
		return isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario(Boolean isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario) {
		this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario = isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario;
	}
		
	public ProcesoMayorizarDiarioSessionBean getprocesomayorizardiarioSessionBean() {
		return this.procesomayorizardiarioSessionBean;
	}
	
	public void setprocesomayorizardiarioSessionBean(ProcesoMayorizarDiarioSessionBean procesomayorizardiarioSessionBean) {
		this.procesomayorizardiarioSessionBean=procesomayorizardiarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoMayorizarDiario() {
		return this.isVisibilidadBusquedaProcesoMayorizarDiario;
	}

	public void setisVisibilidadBusquedaProcesoMayorizarDiario(Boolean isVisibilidadBusquedaProcesoMayorizarDiario) {
		this.isVisibilidadBusquedaProcesoMayorizarDiario=isVisibilidadBusquedaProcesoMayorizarDiario;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesomayorizardiario,null);
				this.setActualParaGuardarSucursalForeignKey(procesomayorizardiario,null);
				this.setActualParaGuardarEjercicioForeignKey(procesomayorizardiario,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(procesomayorizardiario,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoMayorizarDiario procesomayorizardiario,ProcesoMayorizarDiario procesomayorizardiarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoMayorizarDiario(procesomayorizardiario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesomayorizardiarioAux.setId(procesomayorizardiario.getId());
		procesomayorizardiarioAux.setVersionRow(procesomayorizardiario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoMayorizarDiario procesomayorizardiarioLocal) throws Exception {
		
		if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoMayorizarDiario procesomayorizardiarioLocal) throws Exception {	
		if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesomayorizardiarioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesomayorizardiarioLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesomayorizardiarioLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				procesomayorizardiarioLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoMayorizarDiarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesomayorizardiarioValidator.getInvalidValues(this.procesomayorizardiario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoMayorizarDiario procesomayorizardiario,List<ProcesoMayorizarDiario> procesomayorizardiarios) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoMayorizarDiario procesomayorizardiario,List<ProcesoMayorizarDiario> procesomayorizardiarios) throws Exception {
		try	{			
			ProcesoMayorizarDiarioConstantesFunciones.actualizarSelectedLista(procesomayorizardiario,procesomayorizardiarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoMayorizarDiario> procesomayorizardiariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesomayorizardiariosLocal=this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesomayorizardiariosLocal=this.procesomayorizardiarios;
			}
			//ARCHITECTURE
		
			for(ProcesoMayorizarDiario procesomayorizardiarioLocal:procesomayorizardiariosLocal) {
				if(this.permiteMantenimiento(procesomayorizardiarioLocal) && procesomayorizardiarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.getProcesoMayorizarDiarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoMayorizarDiarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelcodigoProcesoMayorizarDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoMayorizarDiarioConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelfechaProcesoMayorizarDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoMayorizarDiarioConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelbeneficiarioProcesoMayorizarDiario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoMayorizarDiarioConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelvalorProcesoMayorizarDiario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelcodigoProcesoMayorizarDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelfechaProcesoMayorizarDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelbeneficiarioProcesoMayorizarDiario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelvalorProcesoMayorizarDiario,"");
		
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
		this.iIdNuevoProcesoMayorizarDiario--;	
		
		
		this.procesomayorizardiarioAux=new ProcesoMayorizarDiario();
		
		this.procesomayorizardiarioAux.setId(this.iIdNuevoProcesoMayorizarDiario);
		this.procesomayorizardiarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().add(this.procesomayorizardiarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesomayorizardiarios.add(this.procesomayorizardiarioAux);
		}
		//ARCHITECTURE
		
		this.procesomayorizardiario=this.procesomayorizardiarioAux;
		
		if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiario);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoMayorizarDiario(this.procesomayorizardiario);
		}
				
		//this.setDefaultControlesProcesoMayorizarDiario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoMayorizarDiario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoMayorizarDiario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoMayorizarDiario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiarioBean,this.procesomayorizardiario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral,this.procesomayorizardiarioBean,false);
		
		if(this.procesomayorizardiarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario());
		}
		
		if(this.procesomayorizardiarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario(),classes);//this.procesomayorizardiarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoMayorizarDiario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoMayorizarDiario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.RecargarFormProcesoMayorizarDiario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
						
			if(procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoMayorizarDiario();
			}
			
			this.actualizarVisualTableDatosProcesoMayorizarDiario();
			
			this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(this.getIndiceNuevoProcesoMayorizarDiario(), this.getIndiceNuevoProcesoMayorizarDiario());
			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
						
			this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoMayorizarDiario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_inicioProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarfecha_inicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_finProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarfecha_finProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarcodigoProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarfechaProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarbeneficiarioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarvalorProcesoMayorizarDiario);	
		//
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarid_empresaProcesoMayorizarDiario);//
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarid_sucursalProcesoMayorizarDiario);//
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarid_ejercicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setEnabled(isHabilitar && this.procesomayorizardiarioConstantesFunciones.activarid_tipo_movimientoProcesoMayorizarDiario);
	};
	
	public void setDefaultControlesProcesoMayorizarDiario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoMayorizarDiario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(true);			
			this.procesomayorizardiarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.setVisible(true);
			
					
		} else {
			//this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(false);			
			this.procesomayorizardiarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoMayorizarDiario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				if(procesomayorizardiarioAux.getId().equals(this.iIdNuevoProcesoMayorizarDiario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarios) {
				if(procesomayorizardiarioAux.getId().equals(this.iIdNuevoProcesoMayorizarDiario)) {
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
	
	public int getIndiceActualProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				if(procesomayorizardiarioAux.getId().equals(procesomayorizardiario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarios) {
				if(procesomayorizardiarioAux.getId().equals(procesomayorizardiario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				if(procesomayorizardiarioAux.getProcesoMayorizarDiarioOriginal().getId().equals(procesomayorizardiarioOriginal.getId())) {
					existe=true;
					procesomayorizardiarioOriginal.setId(procesomayorizardiarioAux.getId());
					procesomayorizardiarioOriginal.setVersionRow(procesomayorizardiarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarios) {
				if(procesomayorizardiarioAux.getProcesoMayorizarDiarioOriginal().getId().equals(procesomayorizardiarioOriginal.getId())) {
					existe=true;
					procesomayorizardiarioOriginal.setId(procesomayorizardiarioAux.getId());
					procesomayorizardiarioOriginal.setVersionRow(procesomayorizardiarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoMayorizarDiario(Boolean esParaCancelar) throws Exception {
		procesomayorizardiariosAux=new ArrayList<ProcesoMayorizarDiario>();
		procesomayorizardiarioAux=new ProcesoMayorizarDiario();
		
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
					if(procesomayorizardiarioAux.getId()<0) {
						procesomayorizardiariosAux.add(procesomayorizardiarioAux);
					}		
				}
				this.iIdNuevoProcesoMayorizarDiario=0L;
				this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().removeAll(procesomayorizardiariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarios) {
					if(procesomayorizardiarioAux.getId()<0) {
						procesomayorizardiariosAux.add(procesomayorizardiarioAux);
					}		
				}
				this.iIdNuevoProcesoMayorizarDiario=0L;
				this.procesomayorizardiarios.removeAll(procesomayorizardiariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoMayorizarDiario 
					&& this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size()>0
					) {
					procesomayorizardiarioAux=this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().get(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size() - 1);
				
					if(procesomayorizardiarioAux.getId()<0) {
						this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().remove(procesomayorizardiarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoMayorizarDiario && this.procesomayorizardiarios.size()>0) {
					procesomayorizardiarioAux=this.procesomayorizardiarios.get(this.procesomayorizardiarios.size() - 1);
				
					if(procesomayorizardiarioAux.getId()<0) {
						this.procesomayorizardiarios.remove(procesomayorizardiarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoMayorizarDiario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesomayorizardiario.getId()<0) {
				this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().remove(this.procesomayorizardiario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesomayorizardiario.getId()<0) {
				this.procesomayorizardiarios.remove(this.procesomayorizardiario);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoMayorizarDiario(List<ProcesoMayorizarDiario> procesomayorizardiariosAux) throws Exception {
		ProcesoMayorizarDiarioConstantesFunciones.setEstadosInicialesProcesoMayorizarDiario(procesomayorizardiariosAux);
	}
	
	public void setEstadosInicialesProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiarioAux) throws Exception {
		ProcesoMayorizarDiarioConstantesFunciones.setEstadosInicialesProcesoMayorizarDiario(procesomayorizardiarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoMayorizarDiarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoMayorizarDiarioActual()) {
				if(!this.isEsNuevoProcesoMayorizarDiario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoMayorizarDiario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoMayorizarDiarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Mayorizar Diario ?", "MANTENIMIENTO DE Proceso Mayorizar Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoMayorizarDiario procesomayorizardiario) throws Exception {
		ProcesoMayorizarDiarioConstantesFunciones.seleccionarAsignar(this.procesomayorizardiario,procesomayorizardiario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoMayorizarDiario=this.isPermisoActualizarOriginalProcesoMayorizarDiario;
			
			
			this.seleccionarAsignar(procesomayorizardiario);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesomayorizardiarioSessionBean.setsFuncionBusquedaRapida(this.procesomayorizardiarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoMayorizarDiario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoMayorizarDiario(esParaCancelar);				
				this.cancelarNuevoProcesoMayorizarDiario(esParaCancelar);								
			}
			
			this.procesomayorizardiario=new ProcesoMayorizarDiario();
			
			this.inicializarProcesoMayorizarDiario();
			
			this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoMayorizarDiario() throws Exception {
		try {
			ProcesoMayorizarDiarioConstantesFunciones.inicializarProcesoMayorizarDiario(this.procesomayorizardiario);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoMayorizarDiarios(String sAccionBusqueda,List<ProcesoMayorizarDiario> procesomayorizardiariosParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoMayorizarDiario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoMayorizarDiarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoMayorizarDiarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoMayorizarDiario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Mayorizar Diarioes");		
		parameters.put("busquedapor", ProcesoMayorizarDiarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoMayorizarDiario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoMayorizarDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoMayorizarDiarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoMayorizarDiario=new JRBeanArrayDataSource(ProcesoMayorizarDiarioJInternalFrame.TraerProcesoMayorizarDiarioBeans(procesomayorizardiariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoMayorizarDiario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoMayorizarDiarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoMayorizarDiarioBean.TraerProcesoMayorizarDiarioBeans(procesomayorizardiariosParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiarioActionPerformed(null);
					//this.generarExcelReporteProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoMayorizarDiarios(sAccionBusqueda,sTipoArchivoReporte,procesomayorizardiariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoMayorizarDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoMayorizarDiario> procesomayorizardiariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoMayorizarDiarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoMayorizarDiario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoMayorizarDiario procesomayorizardiario : procesomayorizardiariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoMayorizarDiarioConstantesFunciones.generarExcelReporteDataProcesoMayorizarDiario("NORMAL",row,workbook,procesomayorizardiario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoMayorizarDiario(String sTipo,Row row,Workbook workbook) {
		
		ProcesoMayorizarDiarioConstantesFunciones.generarExcelReporteHeaderProcesoMayorizarDiario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoMayorizarDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoMayorizarDiario> procesomayorizardiariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoMayorizarDiarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoMayorizarDiario procesomayorizardiario : procesomayorizardiariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.getProcesoMayorizarDiarioDescripcion(procesomayorizardiario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesomayorizardiario.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoMayorizarDiarios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoMayorizarDiario> procesomayorizardiariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoMayorizarDiario> procesomayorizardiariosRespaldo=null;
		
		classes=ProcesoMayorizarDiarioConstantesFunciones.getClassesRelationshipsOfProcesoMayorizarDiario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesomayorizardiarioLogic.setDatosCliente(this.datosCliente);
		this.procesomayorizardiarioLogic.setDatosDeep(this.datosDeep);
		this.procesomayorizardiarioLogic.setIsConDeep(true);
		
		procesomayorizardiariosRespaldo=this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios();
		
		this.procesomayorizardiarioLogic.setProcesoMayorizarDiarios(procesomayorizardiariosParaReportes);	
		this.procesomayorizardiarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesomayorizardiariosParaReportes=this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios();
		this.procesomayorizardiarioLogic.setProcesoMayorizarDiarios(procesomayorizardiariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoMayorizarDiarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoMayorizarDiario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoMayorizarDiario procesomayorizardiario : procesomayorizardiariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoMayorizarDiario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoMayorizarDiarioConstantesFunciones.generarExcelReporteDataProcesoMayorizarDiario("NORMAL",row,workbook,procesomayorizardiario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.getProcesoMayorizarDiarioDescripcion(procesomayorizardiario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoMayorizarDiario() throws Exception {		
		this.startProcessProcesoMayorizarDiario(true);
	}
	
	public void startProcessProcesoMayorizarDiario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoMayorizarDiario ,this.jPanelParametrosReportesProcesoMayorizarDiario, this.jScrollPanelDatosProcesoMayorizarDiario,this.jPanelPaginacionProcesoMayorizarDiario, this.jScrollPanelDatosEdicionProcesoMayorizarDiario, this.jPanelAccionesProcesoMayorizarDiario,this.jPanelAccionesFormularioProcesoMayorizarDiario,this.jmenuBarProcesoMayorizarDiario,this.jmenuBarDetalleProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoMayorizarDiario=this.jTabbedPaneBusquedasProcesoMayorizarDiario; 
		
		final JPanel jPanelParametrosReportesProcesoMayorizarDiario=this.jPanelParametrosReportesProcesoMayorizarDiario;
		//final JScrollPane jScrollPanelDatosProcesoMayorizarDiario=this.jScrollPanelDatosProcesoMayorizarDiario;
		final JTable jTableDatosProcesoMayorizarDiario=this.jTableDatosProcesoMayorizarDiario;		
		final JPanel jPanelPaginacionProcesoMayorizarDiario=this.jPanelPaginacionProcesoMayorizarDiario;
		//final JScrollPane jScrollPanelDatosEdicionProcesoMayorizarDiario=this.jScrollPanelDatosEdicionProcesoMayorizarDiario;
		final JPanel jPanelAccionesProcesoMayorizarDiario=this.jPanelAccionesProcesoMayorizarDiario;
		
		JPanel jPanelCamposAuxiliarProcesoMayorizarDiario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			jPanelCamposAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelCamposProcesoMayorizarDiario;
			jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelAccionesFormularioProcesoMayorizarDiario;
		}
		
		final JPanel jPanelCamposProcesoMayorizarDiario=jPanelCamposAuxiliarProcesoMayorizarDiario;
		final JPanel jPanelAccionesFormularioProcesoMayorizarDiario=jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario;
		
		
		final JMenuBar jmenuBarProcesoMayorizarDiario=this.jmenuBarProcesoMayorizarDiario;
		final JToolBar jTtoolBarProcesoMayorizarDiario=this.jTtoolBarProcesoMayorizarDiario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoMayorizarDiario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoMayorizarDiario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			jmenuBarDetalleAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jmenuBarDetalleProcesoMayorizarDiario;
			jTtoolBarDetalleAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTtoolBarDetalleProcesoMayorizarDiario;
		}
		
		final JMenuBar jmenuBarDetalleProcesoMayorizarDiario=jmenuBarDetalleAuxiliarProcesoMayorizarDiario;
		final JToolBar jTtoolBarDetalleProcesoMayorizarDiario=jTtoolBarDetalleAuxiliarProcesoMayorizarDiario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoMayorizarDiario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoMayorizarDiario;
			processRunnable.jTableDatos=jTableDatosProcesoMayorizarDiario;
			processRunnable.jPanelCampos=jPanelCamposProcesoMayorizarDiario;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoMayorizarDiario;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoMayorizarDiario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoMayorizarDiario;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoMayorizarDiario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoMayorizarDiario;
			processRunnable.jTtoolBar=jTtoolBarProcesoMayorizarDiario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoMayorizarDiario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoMayorizarDiario ,jPanelParametrosReportesProcesoMayorizarDiario,jTableDatosProcesoMayorizarDiario, /*jScrollPanelDatosProcesoMayorizarDiario,*/jPanelCamposProcesoMayorizarDiario,jPanelPaginacionProcesoMayorizarDiario, /*jScrollPanelDatosEdicionProcesoMayorizarDiario,*/ jPanelAccionesProcesoMayorizarDiario,jPanelAccionesFormularioProcesoMayorizarDiario,jmenuBarProcesoMayorizarDiario,jmenuBarDetalleProcesoMayorizarDiario,jTtoolBarProcesoMayorizarDiario,jTtoolBarDetalleProcesoMayorizarDiario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoMayorizarDiario ,jPanelParametrosReportesProcesoMayorizarDiario, jScrollPanelDatosProcesoMayorizarDiario,jPanelPaginacionProcesoMayorizarDiario, jScrollPanelDatosEdicionProcesoMayorizarDiario, jPanelAccionesProcesoMayorizarDiario,jPanelAccionesFormularioProcesoMayorizarDiario,jmenuBarProcesoMayorizarDiario,jmenuBarDetalleProcesoMayorizarDiario,jTtoolBarProcesoMayorizarDiario,jTtoolBarDetalleProcesoMayorizarDiario);
						
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
	
	public void finishProcessProcesoMayorizarDiario() {// throws Exception 
		this.finishProcessProcesoMayorizarDiario(true);
	}
	
	public void finishProcessProcesoMayorizarDiario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoMayorizarDiario ,this.jPanelParametrosReportesProcesoMayorizarDiario, this.jScrollPanelDatosProcesoMayorizarDiario,this.jPanelPaginacionProcesoMayorizarDiario, this.jScrollPanelDatosEdicionProcesoMayorizarDiario, this.jPanelAccionesProcesoMayorizarDiario,this.jPanelAccionesFormularioProcesoMayorizarDiario,this.jmenuBarProcesoMayorizarDiario,this.jmenuBarDetalleProcesoMayorizarDiario,this.jTtoolBarProcesoMayorizarDiario,this.jTtoolBarDetalleProcesoMayorizarDiario);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoMayorizarDiario=this.jTabbedPaneBusquedasProcesoMayorizarDiario; 
		
		final JPanel jPanelParametrosReportesProcesoMayorizarDiario=this.jPanelParametrosReportesProcesoMayorizarDiario;
		//final JScrollPane jScrollPanelDatosProcesoMayorizarDiario=this.jScrollPanelDatosProcesoMayorizarDiario;
		final JTable jTableDatosProcesoMayorizarDiario=this.jTableDatosProcesoMayorizarDiario;		
		final JPanel jPanelPaginacionProcesoMayorizarDiario=this.jPanelPaginacionProcesoMayorizarDiario;
		//final JScrollPane jScrollPanelDatosEdicionProcesoMayorizarDiario=this.jScrollPanelDatosEdicionProcesoMayorizarDiario;
		final JPanel jPanelAccionesProcesoMayorizarDiario=this.jPanelAccionesProcesoMayorizarDiario;
		
		JPanel jPanelCamposAuxiliarProcesoMayorizarDiario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			jPanelCamposAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelCamposProcesoMayorizarDiario;
			jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelAccionesFormularioProcesoMayorizarDiario;
		}
		
		final JPanel jPanelCamposProcesoMayorizarDiario=jPanelCamposAuxiliarProcesoMayorizarDiario;
		final JPanel jPanelAccionesFormularioProcesoMayorizarDiario=jPanelAccionesFormularioAuxiliarProcesoMayorizarDiario;
		
		
		final JMenuBar jmenuBarProcesoMayorizarDiario=this.jmenuBarProcesoMayorizarDiario;		
		final JToolBar jTtoolBarProcesoMayorizarDiario=this.jTtoolBarProcesoMayorizarDiario;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoMayorizarDiario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoMayorizarDiario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			jmenuBarDetalleAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jmenuBarDetalleProcesoMayorizarDiario;
			jTtoolBarDetalleAuxiliarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTtoolBarDetalleProcesoMayorizarDiario;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoMayorizarDiario=jmenuBarDetalleAuxiliarProcesoMayorizarDiario;
		final JToolBar jTtoolBarDetalleProcesoMayorizarDiario=jTtoolBarDetalleAuxiliarProcesoMayorizarDiario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoMayorizarDiario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoMayorizarDiario;
			processRunnable.jTableDatos=jTableDatosProcesoMayorizarDiario;
			processRunnable.jPanelCampos=jPanelCamposProcesoMayorizarDiario;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoMayorizarDiario;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoMayorizarDiario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoMayorizarDiario;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoMayorizarDiario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoMayorizarDiario;
			processRunnable.jTtoolBar=jTtoolBarProcesoMayorizarDiario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoMayorizarDiario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoMayorizarDiario ,jPanelParametrosReportesProcesoMayorizarDiario, jTableDatosProcesoMayorizarDiario,/*jScrollPanelDatosProcesoMayorizarDiario,*/jPanelCamposProcesoMayorizarDiario,jPanelPaginacionProcesoMayorizarDiario, /*jScrollPanelDatosEdicionProcesoMayorizarDiario,*/ jPanelAccionesProcesoMayorizarDiario,jPanelAccionesFormularioProcesoMayorizarDiario,jmenuBarProcesoMayorizarDiario,jmenuBarDetalleProcesoMayorizarDiario,jTtoolBarProcesoMayorizarDiario,jTtoolBarDetalleProcesoMayorizarDiario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoMayorizarDiario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoMayorizarDiario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoMayorizarDiario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoMayorizarDiario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoMayorizarDiario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoMayorizarDiario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoMayorizarDiario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoMayorizarDiario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoMayorizarDiario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesomayorizardiarioConstantesFunciones.getsFinalQueryProcesoMayorizarDiario();
		String  finalQueryPaginacionTodos=this.procesomayorizardiarioConstantesFunciones.getsFinalQueryProcesoMayorizarDiario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoMayorizarDiarioConstantesFunciones.getArrayColumnasGlobalesNoProcesoMayorizarDiario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoMayorizarDiarioConstantesFunciones.getArrayColumnasGlobalesProcesoMayorizarDiario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoMayorizarDiarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesomayorizardiariosEliminados= new ArrayList<ProcesoMayorizarDiario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoMayorizarDiario();
		
				///*ProcesoMayorizarDiarioSessionBean*/this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			
			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
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
					this.iNumeroPaginacion=ProcesoMayorizarDiarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoMayorizarDiarioConstantesFunciones.getClassesForeignKeysOfProcesoMayorizarDiario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesomayorizardiario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesomayorizardiariosAux= new ArrayList<ProcesoMayorizarDiario>();
			
				
			procesomayorizardiarioLogic.setDatosCliente(this.datosCliente);
			procesomayorizardiarioLogic.setDatosDeep(this.datosDeep);
			procesomayorizardiarioLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoMayorizarDiario")) {
				this.sDetalleReporte=ProcesoMayorizarDiarioConstantesFunciones.getDetalleIndiceBusquedaProcesoMayorizarDiario(codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesomayorizardiarioLogic.getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoMayorizarDiarioConstantesFunciones.getDetalleIndiceBusquedaProcesoMayorizarDiario(codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoMayorizarDiarioConstantesFunciones.getDetalleIndiceBusquedaProcesoMayorizarDiario(codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesomayorizardiarioLogic.getProcesoMayorizarDiarios()==null||procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesomayorizardiarios==null|| procesomayorizardiarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesomayorizardiariosAux=new ArrayList<ProcesoMayorizarDiario>();
						procesomayorizardiariosAux.addAll(procesomayorizardiarioLogic.getProcesoMayorizarDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesomayorizardiariosAux=new ArrayList<ProcesoMayorizarDiario>();
							procesomayorizardiariosAux.addAll(procesomayorizardiarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesomayorizardiarioLogic.getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoMayorizarDiarioConstantesFunciones.getDetalleIndiceBusquedaProcesoMayorizarDiario(codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoMayorizarDiarioConstantesFunciones.getDetalleIndiceBusquedaProcesoMayorizarDiario(codigoBusquedaProcesoMayorizarDiario,id_tipo_movimientoBusquedaProcesoMayorizarDiario,fecha_inicioBusquedaProcesoMayorizarDiario,fecha_finBusquedaProcesoMayorizarDiario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoMayorizarDiarios("BusquedaProcesoMayorizarDiario",procesomayorizardiarioLogic.getProcesoMayorizarDiarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoMayorizarDiarios("BusquedaProcesoMayorizarDiario",procesomayorizardiarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesomayorizardiarioLogic.setProcesoMayorizarDiarios(new ArrayList<ProcesoMayorizarDiario>());
						procesomayorizardiarioLogic.getProcesoMayorizarDiarios().addAll(procesomayorizardiariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesomayorizardiarios=new ArrayList<ProcesoMayorizarDiario>();
							procesomayorizardiarios.addAll(procesomayorizardiariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoMayorizarDiario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoMayorizarDiario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesomayorizardiarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesomayorizardiarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoMayorizarDiario procesomayorizardiario) {
		Boolean permite=true;
		
		if(this.procesomayorizardiario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoMayorizarDiarioConstantesFunciones.getOrderByListaProcesoMayorizarDiario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoMayorizarDiarioConstantesFunciones.getOrderByListaProcesoMayorizarDiario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				if(procesomayorizardiario.getsType().equals(Constantes2.S_TOTALES)) {
					procesomayorizardiarioTotales=procesomayorizardiario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoMayorizarDiario procesomayorizardiario:this.procesomayorizardiarios) {
				if(procesomayorizardiario.getsType().equals(Constantes2.S_TOTALES)) {
					procesomayorizardiarioTotales=procesomayorizardiario;
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
			this.procesomayorizardiarioAux=new ProcesoMayorizarDiario();
			this.procesomayorizardiarioAux.setsType(Constantes2.S_TOTALES);
			this.procesomayorizardiarioAux.setIsNew(false);
			this.procesomayorizardiarioAux.setIsChanged(false);
			this.procesomayorizardiarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoMayorizarDiarioConstantesFunciones.TotalizarValoresFilaProcesoMayorizarDiario(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios(),this.procesomayorizardiarioAux);
				
				//this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().add(this.procesomayorizardiarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoMayorizarDiarioConstantesFunciones.TotalizarValoresFilaProcesoMayorizarDiario(this.procesomayorizardiarios,this.procesomayorizardiarioAux);
				
				this.procesomayorizardiarios.add(this.procesomayorizardiarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesomayorizardiarioTotales=new ProcesoMayorizarDiario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().remove(procesomayorizardiarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesomayorizardiarios.remove(procesomayorizardiarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesomayorizardiarioTotales=new ProcesoMayorizarDiario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				if(procesomayorizardiario.getsType().equals(Constantes2.S_TOTALES)) {
					procesomayorizardiarioTotales=procesomayorizardiario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoMayorizarDiarioConstantesFunciones.TotalizarValoresFilaProcesoMayorizarDiario(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios(),procesomayorizardiarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoMayorizarDiario procesomayorizardiario:this.procesomayorizardiarios) {
				if(procesomayorizardiario.getsType().equals(Constantes2.S_TOTALES)) {
					procesomayorizardiarioTotales=procesomayorizardiario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoMayorizarDiarioConstantesFunciones.TotalizarValoresFilaProcesoMayorizarDiario(this.procesomayorizardiarios,procesomayorizardiarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoMayorizarDiario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoMayorizarDiariosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoMayorizarDiariosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoMayorizarDiariosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoMayorizarDiariosFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario(String sFinalQuery,String codigo,Long id_tipo_movimiento,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesomayorizardiarioLogic.getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario(sFinalQuery,this.pagination,codigo,id_tipo_movimiento,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoMayorizarDiariosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesomayorizardiarioLogic.getProcesoMayorizarDiariosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoMayorizarDiariosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesomayorizardiarioLogic.getProcesoMayorizarDiariosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoMayorizarDiariosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesomayorizardiarioLogic.getProcesoMayorizarDiariosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoMayorizarDiariosFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesomayorizardiarioLogic.getProcesoMayorizarDiariosFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosProcesoMayorizarDiario() {
		this.isPermisoTodoProcesoMayorizarDiario=false;
		this.isPermisoNuevoProcesoMayorizarDiario=false;
		this.isPermisoActualizarProcesoMayorizarDiario=false;
		this.isPermisoActualizarOriginalProcesoMayorizarDiario=false;
		this.isPermisoEliminarProcesoMayorizarDiario=false;
		this.isPermisoGuardarCambiosProcesoMayorizarDiario=false;
		this.isPermisoConsultaProcesoMayorizarDiario=true;
		this.isPermisoBusquedaProcesoMayorizarDiario=true;
		this.isPermisoReporteProcesoMayorizarDiario=true;
		this.isPermisoOrdenProcesoMayorizarDiario=false;		
		this.isPermisoPaginacionMedioProcesoMayorizarDiario=false;		
		this.isPermisoPaginacionAltoProcesoMayorizarDiario=false;		
		this.isPermisoPaginacionTodoProcesoMayorizarDiario=false;		
		this.isPermisoCopiarProcesoMayorizarDiario=false;		
		this.isPermisoVerFormProcesoMayorizarDiario=false;		
		this.isPermisoDuplicarProcesoMayorizarDiario=false;
		this.isPermisoOrdenProcesoMayorizarDiario=false;
	}
	
	public void setPermisosUsuarioProcesoMayorizarDiario(Boolean isPermiso) {
		this.isPermisoTodoProcesoMayorizarDiario=isPermiso;
		this.isPermisoNuevoProcesoMayorizarDiario=isPermiso;
		this.isPermisoActualizarProcesoMayorizarDiario=isPermiso;
		this.isPermisoActualizarOriginalProcesoMayorizarDiario=isPermiso;
		this.isPermisoEliminarProcesoMayorizarDiario=isPermiso;
		this.isPermisoGuardarCambiosProcesoMayorizarDiario=isPermiso;
		this.isPermisoConsultaProcesoMayorizarDiario=isPermiso;
		this.isPermisoBusquedaProcesoMayorizarDiario=isPermiso;
		this.isPermisoReporteProcesoMayorizarDiario=isPermiso;
		this.isPermisoOrdenProcesoMayorizarDiario=isPermiso;		
		this.isPermisoPaginacionMedioProcesoMayorizarDiario=isPermiso;		
		this.isPermisoPaginacionAltoProcesoMayorizarDiario=isPermiso;		
		this.isPermisoPaginacionTodoProcesoMayorizarDiario=isPermiso;		
		this.isPermisoCopiarProcesoMayorizarDiario=isPermiso;		
		this.isPermisoVerFormProcesoMayorizarDiario=isPermiso;		
		this.isPermisoDuplicarProcesoMayorizarDiario=isPermiso;
		this.isPermisoOrdenProcesoMayorizarDiario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoMayorizarDiario(Boolean isPermiso) {
		//this.isPermisoTodoProcesoMayorizarDiario=isPermiso;
		this.isPermisoNuevoProcesoMayorizarDiario=isPermiso;
		this.isPermisoActualizarProcesoMayorizarDiario=isPermiso;
		this.isPermisoActualizarOriginalProcesoMayorizarDiario=isPermiso;
		this.isPermisoEliminarProcesoMayorizarDiario=isPermiso;
		this.isPermisoGuardarCambiosProcesoMayorizarDiario=isPermiso;
		//this.isPermisoConsultaProcesoMayorizarDiario=isPermiso;
		//this.isPermisoBusquedaProcesoMayorizarDiario=isPermiso;
		//this.isPermisoReporteProcesoMayorizarDiario=isPermiso;
		//this.isPermisoOrdenProcesoMayorizarDiario=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoMayorizarDiario=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoMayorizarDiario=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoMayorizarDiario=isPermiso;		
		//this.isPermisoCopiarProcesoMayorizarDiario=isPermiso;		
		//this.isPermisoDuplicarProcesoMayorizarDiario=isPermiso;
		//this.isPermisoOrdenProcesoMayorizarDiario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoMayorizarDiarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoMayorizarDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoMayorizarDiario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoMayorizarDiarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoMayorizarDiarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoMayorizarDiarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoMayorizarDiarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoMayorizarDiario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoMayorizarDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoMayorizarDiarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoMayorizarDiario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoMayorizarDiario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoMayorizarDiario=this.isPermisoActualizarProcesoMayorizarDiario;
			this.isPermisoEliminarProcesoMayorizarDiario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoMayorizarDiario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoMayorizarDiario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoMayorizarDiario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoMayorizarDiario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoMayorizarDiario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoMayorizarDiario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoMayorizarDiario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoMayorizarDiario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoMayorizarDiario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoMayorizarDiario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoMayorizarDiario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoMayorizarDiario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoMayorizarDiario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoMayorizarDiario.setToolTipText(this.jTableDatosProcesoMayorizarDiario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoMayorizarDiario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoMayorizarDiario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoMayorizarDiario() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoMayorizarDiarioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoMayorizarDiarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoMayorizarDiarioJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoMayorizarDiario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.procesomayorizardiarioSessionBean==null) {
				this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean();
			}

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.procesomayorizardiarioSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoMayorizarDiario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoMayorizarDiario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoMayorizarDiario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoMayorizarDiario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoMayorizarDiario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoMayorizarDiario()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoMayorizarDiario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoMayorizarDiario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoMayorizarDiario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoMayorizarDiario()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoMayorizarDiario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoMayorizarDiario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoMayorizarDiarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoMayorizarDiarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoMayorizarDiarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesomayorizardiarioSessionBean=new ProcesoMayorizarDiarioSessionBean(); 
		this.procesomayorizardiarioConstantesFunciones=new ProcesoMayorizarDiarioConstantesFunciones(); 
		this.procesomayorizardiarioBean=new ProcesoMayorizarDiario();//(this.procesomayorizardiarioConstantesFunciones); 		
		this.procesomayorizardiarioReturnGeneral=new ProcesoMayorizarDiarioParameterReturnGeneral(); 
		
		this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesomayorizardiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoMayorizarDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoMayorizarDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoMayorizarDiarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoMayorizarDiario(true);
			
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
			
			this.procesomayorizardiarioConstantesFunciones=new ProcesoMayorizarDiarioConstantesFunciones(); 
			this.procesomayorizardiarioBean=new ProcesoMayorizarDiario();//this.procesomayorizardiarioConstantesFunciones); 			
			this.procesomayorizardiarioReturnGeneral=new ProcesoMayorizarDiarioParameterReturnGeneral(); 
		
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Mayorizar Diario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesomayorizardiario=new ProcesoMayorizarDiario();
			this.procesomayorizardiarios = new ArrayList<ProcesoMayorizarDiario>();
			this.procesomayorizardiariosAux = new ArrayList<ProcesoMayorizarDiario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic=new ProcesoMayorizarDiarioLogic();
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			//this.procesomayorizardiarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesomayorizardiarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoMayorizarDiario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoMayorizarDiario);	
					}
					
					if(this.jInternalFrameImportacionProcesoMayorizarDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoMayorizarDiario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoMayorizarDiario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoMayorizarDiario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoMayorizarDiario);
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.setVisible(false);
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario);
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoMayorizarDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoMayorizarDiario);
					this.jInternalFrameImportacionProcesoMayorizarDiario.setVisible(false);
					this.jInternalFrameImportacionProcesoMayorizarDiario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoMayorizarDiario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoMayorizarDiario);
					this.jInternalFrameOrderByProcesoMayorizarDiario.setVisible(false);
					this.jInternalFrameOrderByProcesoMayorizarDiario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoMayorizarDiarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoMayorizarDiarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesomayorizardiarioReturnGeneral=new ProcesoMayorizarDiarioParameterReturnGeneral();
			
			this.procesomayorizardiarioParameterGeneral=new ProcesoMayorizarDiarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesomayorizardiarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoMayorizarDiarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),this.procesomayorizardiarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoMayorizarDiarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),this.procesomayorizardiarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaCopiarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaVerFormProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaOrdenProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			
			
			this.isVisibilidadBusquedaProcesoMayorizarDiario=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoMayorizarDiario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoMayorizarDiario(false);
			
			this.setPermisosUsuarioProcesoMayorizarDiario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() 
				|| (this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado() && this.procesomayorizardiarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoMayorizarDiarioClasesRelacionadas();
			}
			
			if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoMayorizarDiarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoMayorizarDiario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoMayorizarDiario();
			}
			
			if(!this.isPermisoBusquedaProcesoMayorizarDiario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoMayorizarDiarioConstantesFunciones.getTiposSeleccionarProcesoMayorizarDiario());
				
				this.tiposColumnasSelect=ProcesoMayorizarDiarioConstantesFunciones.getTiposSeleccionarProcesoMayorizarDiario(true);
				
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
			//if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoMayorizarDiario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoMayorizarDiario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoMayorizarDiario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoMayorizarDiario() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesomayorizardiarioImplementable= (ProcesoMayorizarDiarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoMayorizarDiarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesomayorizardiarioImplementableHome= (ProcesoMayorizarDiarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoMayorizarDiarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesomayorizardiarios= new ArrayList<ProcesoMayorizarDiario>();
			this.procesomayorizardiariosEliminados= new ArrayList<ProcesoMayorizarDiario>();
						
			this.isEsNuevoProcesoMayorizarDiario=false;
			this.esParaAccionDesdeFormularioProcesoMayorizarDiario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoMayorizarDiario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoMayorizarDiario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoMayorizarDiarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoMayorizarDiario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoMayorizarDiario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoMayorizarDiario();
			}
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoMayorizarDiario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoMayorizarDiario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoMayorizarDiario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoMayorizarDiario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoMayorizarDiario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoMayorizarDiario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoMayorizarDiario")) {
				iIndex=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoMayorizarDiario();	
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
	
	public void cargarCombosForeignKeyProcesoMayorizarDiario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoMayorizarDiario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoMayorizarDiario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoMayorizarDiarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoMayorizarDiario();
		
		this.cargarCombosFrameForeignKeyProcesoMayorizarDiario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoMayorizarDiario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoMayorizarDiario();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoMayorizarDiarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			
			if(jTableDatosProcesoMayorizarDiario.getRowCount()>=1) {
				jTableDatosProcesoMayorizarDiario.removeRowSelectionInterval(0, jTableDatosProcesoMayorizarDiario.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoMayorizarDiario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoMayorizarDiario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoMayorizarDiario(true);			
			//this.procesomayorizardiario=new ProcesoMayorizarDiario();
			//this.procesomayorizardiario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario() ;
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoMayorizarDiario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesomayorizardiario);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);				
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoMayorizarDiario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoMayorizarDiarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoMayorizarDiario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoMayorizarDiario.getSelectedRows().length;			
			}
			
			procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoMayorizarDiario--;			
				//ProcesoMayorizarDiario procesomayorizardiarioAux= new ProcesoMayorizarDiario();			
				//procesomayorizardiarioAux.setId(this.iIdNuevoProcesoMayorizarDiario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoMayorizarDiario procesomayorizardiarioOrigen=new ProcesoMayorizarDiario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoMayorizarDiario procesomayorizardiarioOrigen : procesomayorizardiariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesomayorizardiarioOrigen =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesomayorizardiarioOrigen =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoMayorizarDiario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesomayorizardiario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoMayorizarDiario(procesomayorizardiarioOrigen,this.procesomayorizardiario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().add(this.procesomayorizardiarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiarios.add(this.procesomayorizardiarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
				
				this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(this.getIndiceNuevoProcesoMayorizarDiario(), this.getIndiceNuevoProcesoMayorizarDiario());
				
				int iLastRow =  this.jTableDatosProcesoMayorizarDiario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoMayorizarDiario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoMayorizarDiario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();									
		
			ProcesoMayorizarDiario procesomayorizardiarioOrigen=new ProcesoMayorizarDiario();
			ProcesoMayorizarDiario procesomayorizardiarioDestino=new ProcesoMayorizarDiario();
				
			procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoMayorizarDiario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesomayorizardiariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoMayorizarDiario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesomayorizardiarioOrigen =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesomayorizardiarioOrigen =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesomayorizardiarioDestino =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesomayorizardiarioDestino =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesomayorizardiarioOrigen =procesomayorizardiariosSeleccionados.get(0);
				procesomayorizardiarioDestino =procesomayorizardiariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoMayorizarDiario(procesomayorizardiarioOrigen,procesomayorizardiarioDestino,true,false);
				
				procesomayorizardiarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesomayorizardiarioDestino,procesomayorizardiarioLogic.getProcesoMayorizarDiarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesomayorizardiarioDestino,procesomayorizardiarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
				
				//this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(this.getIndiceNuevoProcesoMayorizarDiario(), this.getIndiceNuevoProcesoMayorizarDiario());
				
				int iLastRow =  this.jTableDatosProcesoMayorizarDiario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoMayorizarDiario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoMayorizarDiario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoMayorizarDiario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(!isVisible);
			this.jPanelPaginacionProcesoMayorizarDiario.setVisible(!isVisible);
			this.jPanelAccionesProcesoMayorizarDiario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoMayorizarDiario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoMayorizarDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoMayorizarDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoMayorizarDiario();
			
			this.abrirFrameOrderByProcesoMayorizarDiario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoMayorizarDiario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoMayorizarDiario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoMayorizarDiario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSize(this.jInternalFrameDetalleFormProcesoMayorizarDiario.iWidthFormulario,this.jInternalFrameDetalleFormProcesoMayorizarDiario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoMayorizarDiario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoMayorizarDiario.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jContentPaneDetalleProcesoMayorizarDiario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jContentPaneDetalleProcesoMayorizarDiario.getWidth(),ProcesoMayorizarDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jContentPaneDetalleProcesoMayorizarDiario.getWidth(),ProcesoMayorizarDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jContentPaneDetalleProcesoMayorizarDiario.getWidth(),ProcesoMayorizarDiarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoMayorizarDiario.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoMayorizarDiario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoMayorizarDiario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoMayorizarDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoMayorizarDiario,false,this);
				} else {
					this.jInternalFrameOrderByProcesoMayorizarDiario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoMayorizarDiario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoMayorizarDiario);
				this.jInternalFrameOrderByProcesoMayorizarDiario.setVisible(false);
				this.jInternalFrameOrderByProcesoMayorizarDiario.setSelected(false);
				
				this.jInternalFrameOrderByProcesoMayorizarDiario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoMayorizarDiario"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoMayorizarDiario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoMayorizarDiario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoMayorizarDiario==null) {
				
				this.jInternalFrameImportacionProcesoMayorizarDiario=new ImportacionJInternalFrame(ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoMayorizarDiario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoMayorizarDiario);
				this.jInternalFrameImportacionProcesoMayorizarDiario.setVisible(false);
				this.jInternalFrameImportacionProcesoMayorizarDiario.setSelected(false);


				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoMayorizarDiario"));
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoMayorizarDiario"));
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoMayorizarDiario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoMayorizarDiario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario==null) {
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario=new ReporteDinamicoJInternalFrame(ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoMayorizarDiario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario);
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoMayorizarDiario"));
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoMayorizarDiario"));
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoMayorizarDiario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoMayorizarDiario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoMayorizarDiario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoMayorizarDiario);
			
	       	this.jInternalFrameDetalleFormProcesoMayorizarDiario.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoMayorizarDiario.dispose();
			//this.jInternalFrameDetalleFormProcesoMayorizarDiario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoMayorizarDiario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoMayorizarDiario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoMayorizarDiario.setVisible(true);
	        this.jInternalFrameImportacionProcesoMayorizarDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoMayorizarDiario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoMayorizarDiario.setVisible(true);
	        this.jInternalFrameOrderByProcesoMayorizarDiario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoMayorizarDiario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoMayorizarDiario.setVisible(false);
	        this.jInternalFrameOrderByProcesoMayorizarDiario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoMayorizarDiario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoMayorizarDiario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoMayorizarDiario.setVisible(false);
	        this.jInternalFrameImportacionProcesoMayorizarDiario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoMayorizarDiario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoMayorizarDiario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoMayorizarDiario(true);
			//this.isEsNuevoProcesoMayorizarDiario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false) ;
			
			if(procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoMayorizarDiario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoMayorizarDiarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoMayorizarDiario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoMayorizarDiario(true);
			//this.isEsNuevoProcesoMayorizarDiario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesomayorizardiario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false) ;
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoMayorizarDiario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoMayorizarDiario(false);
			
			//if(!this.isEsNuevoProcesoMayorizarDiario) {								
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				
			}
			
			if(this.permiteMantenimiento(this.procesomayorizardiario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoMayorizarDiario=true;
					this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
					this.isEsNuevoProcesoMayorizarDiario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoMayorizarDiario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoMayorizarDiario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(false);
				
				this.habilitarDeshabilitarControlesProcesoMayorizarDiario(false);
			
												
				
				if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoMayorizarDiario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,procesomayorizardiarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoMayorizarDiario(this.procesomayorizardiario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesomayorizardiarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesomayorizardiario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				this.procesomayorizardiario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				this.procesomayorizardiario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesomayorizardiario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoMayorizarDiarioModel) this.jTableDatosProcesoMayorizarDiario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoMayorizarDiario=true;
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
				this.isEsNuevoProcesoMayorizarDiario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(false);
				
				this.habilitarDeshabilitarControlesProcesoMayorizarDiario(false);
				
				
				
				if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoMayorizarDiario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoMayorizarDiario.getRowCount()>=1) {
				jTableDatosProcesoMayorizarDiario.removeRowSelectionInterval(0, jTableDatosProcesoMayorizarDiario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoMayorizarDiario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(false) ;
			
			this.isEsNuevoProcesoMayorizarDiario=false;
			
			if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoMayorizarDiario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				
				//SI ES MANUAL
				if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoMayorizarDiario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoMayorizarDiario--;			
			//ProcesoMayorizarDiario procesomayorizardiarioAux= new ProcesoMayorizarDiario();			
			//procesomayorizardiarioAux.setId(this.iIdNuevoProcesoMayorizarDiario);
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoMayorizarDiario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
			
			this.procesomayorizardiario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().add(this.procesomayorizardiarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesomayorizardiarios.add(this.procesomayorizardiarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			
			this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(this.getIndiceNuevoProcesoMayorizarDiario(), this.getIndiceNuevoProcesoMayorizarDiario());
			
			int iLastRow =  this.jTableDatosProcesoMayorizarDiario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoMayorizarDiario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoMayorizarDiario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
			
			//SI ES MANUAL
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoMayorizarDiario();
			}
			
			//this.abrirFrameTreeProcesoMayorizarDiario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoMayorizarDiario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoMayorizarDiario.setFileImportacion(this.jInternalFrameImportacionProcesoMayorizarDiario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoMayorizarDiario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoMayorizarDiario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		

		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoMayorizarDiarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoMayorizarDiarioBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoMayorizarDiarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ProcesoMayorizarDiario procesomayorizardiario:procesomayorizardiariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesomayorizardiario.getvalor());
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
			//	this.getFilaCabeceraExportarExcelProcesoMayorizarDiario(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoMayorizarDiario(procesomayorizardiarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoMayorizarDiario(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
			
			//SI ES MANUAL
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoMayorizarDiario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
			
			//SI ES MANUAL
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoMayorizarDiario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
			
			//SI ES MANUAL
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoMayorizarDiario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoMayorizarDiario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoMayorizarDiario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoMayorizarDiario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoMayorizarDiario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoMayorizarDiario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoMayorizarDiario.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoMayorizarDiario.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoMayorizarDiario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoMayorizarDiario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoMayorizarDiario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoMayorizarDiario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoMayorizarDiario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoMayorizarDiario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoMayorizarDiario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoMayorizarDiario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoMayorizarDiario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoMayorizarDiario();
		
		this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoMayorizarDiario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoMayorizarDiario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoMayorizarDiario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoMayorizarDiario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoMayorizarDiario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionNuevoProcesoMayorizarDiario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoMayorizarDiario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoMayorizarDiario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionNuevoProcesoMayorizarDiario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionSinCerrarProcesoMayorizarDiario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jCheckBoxPostAccionSinMensajeProcesoMayorizarDiario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoMayorizarDiario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoMayorizarDiario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoMayorizarDiario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoMayorizarDiario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoMayorizarDiario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoMayorizarDiario(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoMayorizarDiario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoMayorizarDiario() throws Exception {
		try	{
			if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoMayorizarDiario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoMayorizarDiario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoMayorizarDiario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoMayorizarDiario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoMayorizarDiario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoMayorizarDiario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoMayorizarDiario.addItem(reporte);
			}
			
			
			if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoMayorizarDiario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoMayorizarDiario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoMayorizarDiario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoMayorizarDiario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoMayorizarDiario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoMayorizarDiarioConstantesFunciones.getTiposSeleccionarProcesoMayorizarDiario(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoMayorizarDiarioConstantesFunciones.getTiposSeleccionarProcesoMayorizarDiario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoMayorizarDiarioConstantesFunciones.getTiposSeleccionarProcesoMayorizarDiario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoMayorizarDiario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaProcesoMayorizarDiario=this.jTextFieldcodigoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getText();
		if(this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaProcesoMayorizarDiario=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaProcesoMayorizarDiario=new Date(this.jDateChooserfecha_inicioBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getDate().getTime());
		this.fecha_finBusquedaProcesoMayorizarDiario=new Date(this.jDateChooserfecha_finBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoMayorizarDiario(Boolean esInicializar) throws Exception {				
		if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoMayorizarDiario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoMayorizarDiario() throws Exception {
		this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoMayorizarDiario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoMayorizarDiarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoMayorizarDiario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesomayorizardiarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoMayorizarDiario.setModel(new ProcesoMayorizarDiarioModel(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoMayorizarDiario.setModel(new ProcesoMayorizarDiarioModel(this.procesomayorizardiarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoMayorizarDiario!=null && this.jInternalFrameOrderByProcesoMayorizarDiario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoMayorizarDiario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,procesomayorizardiarioConstantesFunciones.resaltarSeleccionarProcesoMayorizarDiario,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoMayorizarDiarioConstantesFunciones.SCLASSWEBTITULO,procesomayorizardiarioConstantesFunciones.resaltarSeleccionarProcesoMayorizarDiario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID));

		if(this.procesomayorizardiarioConstantesFunciones.mostraridProcesoMayorizarDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesomayorizardiarioConstantesFunciones.resaltaridProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activaridProcesoMayorizarDiario,iSizeTabla,this,true,"idProcesoMayorizarDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesomayorizardiarioConstantesFunciones.resaltaridProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activaridProcesoMayorizarDiario,this,true,"idProcesoMayorizarDiario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO));

		if(this.procesomayorizardiarioConstantesFunciones.mostrarcodigoProcesoMayorizarDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarcodigoProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarcodigoProcesoMayorizarDiario,iSizeTabla,this,true,"codigoProcesoMayorizarDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarcodigoProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarcodigoProcesoMayorizarDiario,this,true,"codigoProcesoMayorizarDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA));

		if(this.procesomayorizardiarioConstantesFunciones.mostrarfechaProcesoMayorizarDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarfechaProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarfechaProcesoMayorizarDiario,iSizeTabla,this,true,"fechaProcesoMayorizarDiario","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarfechaProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarfechaProcesoMayorizarDiario,this,true,"fechaProcesoMayorizarDiario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.procesomayorizardiarioConstantesFunciones.mostrarbeneficiarioProcesoMayorizarDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarbeneficiarioProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarbeneficiarioProcesoMayorizarDiario,iSizeTabla,this,true,"beneficiarioProcesoMayorizarDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarbeneficiarioProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarbeneficiarioProcesoMayorizarDiario,this,true,"beneficiarioProcesoMayorizarDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR));

		if(this.procesomayorizardiarioConstantesFunciones.mostrarvalorProcesoMayorizarDiario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarvalorProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarvalorProcesoMayorizarDiario,iSizeTabla,this,true,"valorProcesoMayorizarDiario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesomayorizardiarioConstantesFunciones.resaltarvalorProcesoMayorizarDiario,this.procesomayorizardiarioConstantesFunciones.activarvalorProcesoMayorizarDiario,this,true,"valorProcesoMayorizarDiario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoMayorizarDiarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoMayorizarDiario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoMayorizarDiario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoMayorizarDiario.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoMayorizarDiario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoMayorizarDiario.moveColumn(this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoMayorizarDiario.moveColumn(this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoMayorizarDiario.moveColumn(this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoMayorizarDiario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoMayorizarDiario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoMayorizarDiario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoMayorizarDiario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoMayorizarDiario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoMayorizarDiario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesomayorizardiarioLogic.getProcesoMayorizarDiarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesomayorizardiarios.size()-1;
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
		//this.jTableDatosProcesoMayorizarDiario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoMayorizarDiario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoMayorizarDiario();
			
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
				
				//this.isEsNuevoProcesoMayorizarDiario=false;
					
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
				if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoMayorizarDiario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoMayorizarDiario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesomayorizardiario.getsType().equals("DUPLICADO")
				   || this.procesomayorizardiario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoMayorizarDiario=true;
				
				} else {
					this.isEsNuevoProcesoMayorizarDiario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
					if(this.procesomayorizardiario.getId()>=0 && !this.procesomayorizardiario.getIsNew()) {						
						this.isEsNuevoProcesoMayorizarDiario=false;
						
					} else {
						this.isEsNuevoProcesoMayorizarDiario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoMayorizarDiario(esRelaciones);						
				
				this.seleccionarProcesoMayorizarDiario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesomayorizardiario.getId()<0) {
					this.isEsNuevoProcesoMayorizarDiario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoMayorizarDiario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoMayorizarDiario(evt,rowIndex);
				}	
				
				if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoMayorizarDiario: " + this.dDif); 
					}
				}								
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoMayorizarDiario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesomayorizardiario)) {
					if(this.procesomayorizardiario.getId()>0) {
						this.procesomayorizardiario.setIsDeleted(true);
						
						this.procesomayorizardiariosEliminados.add(this.procesomayorizardiario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().remove(this.procesomayorizardiario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiarios.remove(this.procesomayorizardiario);				
					}
					
					
					((ProcesoMayorizarDiarioModel) this.jTableDatosProcesoMayorizarDiario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoMayorizarDiario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoMayorizarDiario) {
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoMayorizarDiario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoMayorizarDiario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoMayorizarDiario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoMayorizarDiario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoMayorizarDiario(procesomayorizardiario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoMayorizarDiario(procesomayorizardiario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoMayorizarDiario(procesomayorizardiario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoMayorizarDiario(procesomayorizardiario);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setText(procesomayorizardiario.getId().toString());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setText(procesomayorizardiario.getcodigo());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setDate(procesomayorizardiario.getfecha());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setText(procesomayorizardiario.getbeneficiario());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setText(procesomayorizardiario.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoMayorizarDiario procesomayorizardiarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesomayorizardiarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoMayorizarDiario procesomayorizardiarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesomayorizardiarioLocal=this.procesomayorizardiario;
			} else {
				procesomayorizardiarioLocal=this.procesomayorizardiarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesomayorizardiarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoMayorizarDiario(procesomayorizardiarioLocal,true);
					
					if(procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesomayorizardiarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesomayorizardiarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(procesomayorizardiario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(procesomayorizardiario);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(procesomayorizardiario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.getText()==null || this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.getText()=="" || this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setText("0");
			}

			if(conColumnasBase) {procesomayorizardiario.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelIdProcesoMayorizarDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesomayorizardiario.setcodigo(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelcodigoProcesoMayorizarDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesomayorizardiario.setfecha(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelfechaProcesoMayorizarDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesomayorizardiario.setbeneficiario(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelbeneficiarioProcesoMayorizarDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesomayorizardiario.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelvalorProcesoMayorizarDiario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiarioBean,ProcesoMayorizarDiario procesomayorizardiario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiarioOrigen,ProcesoMayorizarDiario procesomayorizardiario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getId()!=null && !procesomayorizardiarioOrigen.getId().equals(0L))) {procesomayorizardiario.setId(procesomayorizardiarioOrigen.getId());}}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getfecha_inicio()!=null && !procesomayorizardiarioOrigen.getfecha_inicio().equals(new Date()))) {procesomayorizardiario.setfecha_inicio(procesomayorizardiarioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getfecha_fin()!=null && !procesomayorizardiarioOrigen.getfecha_fin().equals(new Date()))) {procesomayorizardiario.setfecha_fin(procesomayorizardiarioOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getcodigo()!=null && !procesomayorizardiarioOrigen.getcodigo().equals(""))) {procesomayorizardiario.setcodigo(procesomayorizardiarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getfecha()!=null && !procesomayorizardiarioOrigen.getfecha().equals(new Date()))) {procesomayorizardiario.setfecha(procesomayorizardiarioOrigen.getfecha());}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getbeneficiario()!=null && !procesomayorizardiarioOrigen.getbeneficiario().equals(""))) {procesomayorizardiario.setbeneficiario(procesomayorizardiarioOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && procesomayorizardiarioOrigen.getvalor()!=null && !procesomayorizardiarioOrigen.getvalor().equals(0.0))) {procesomayorizardiario.setvalor(procesomayorizardiarioOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setText(procesomayorizardiario.getId().toString());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setText(procesomayorizardiario.getcodigo());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setDate(procesomayorizardiario.getfecha());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setText(procesomayorizardiario.getbeneficiario());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setText(procesomayorizardiario.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoMayorizarDiario(ProcesoMayorizarDiarioBean procesomayorizardiarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setText(procesomayorizardiarioBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setText(procesomayorizardiarioBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setDate(procesomayorizardiarioBean.getfecha());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setText(procesomayorizardiarioBean.getbeneficiario());
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setText(procesomayorizardiarioBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoMayorizarDiario(ProcesoMayorizarDiarioParameterReturnGeneral procesomayorizardiarioReturnGeneral,ProcesoMayorizarDiarioBean procesomayorizardiarioBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoMayorizarDiario procesomayorizardiarioLocal=new ProcesoMayorizarDiario();
			
			procesomayorizardiarioLocal=procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesomayorizardiarioLocal.getId()!=null && !procesomayorizardiarioLocal.getId().equals(0L))) {procesomayorizardiarioBean.setId(procesomayorizardiarioLocal.getId());}}
			if(conDefault || (!conDefault && procesomayorizardiarioLocal.getcodigo()!=null && !procesomayorizardiarioLocal.getcodigo().equals(""))) {procesomayorizardiarioBean.setcodigo(procesomayorizardiarioLocal.getcodigo());}
			if(conDefault || (!conDefault && procesomayorizardiarioLocal.getfecha()!=null && !procesomayorizardiarioLocal.getfecha().equals(new Date()))) {procesomayorizardiarioBean.setfecha(procesomayorizardiarioLocal.getfecha());}
			if(conDefault || (!conDefault && procesomayorizardiarioLocal.getbeneficiario()!=null && !procesomayorizardiarioLocal.getbeneficiario().equals(""))) {procesomayorizardiarioBean.setbeneficiario(procesomayorizardiarioLocal.getbeneficiario());}
			if(conDefault || (!conDefault && procesomayorizardiarioLocal.getvalor()!=null && !procesomayorizardiarioLocal.getvalor().equals(0.0))) {procesomayorizardiarioBean.setvalor(procesomayorizardiarioLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoMayorizarDiarioGenerico(Long idProcesoMayorizarDiarioSeleccionado,JComboBox jComboBoxProcesoMayorizarDiario,List<ProcesoMayorizarDiario> procesomayorizardiariosLocal)throws Exception {
		try {
			ProcesoMayorizarDiario  procesomayorizardiarioTemp=null;

			for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosLocal) {
				if(procesomayorizardiarioAux.getId()!=null && procesomayorizardiarioAux.getId().equals(idProcesoMayorizarDiarioSeleccionado)) {
					procesomayorizardiarioTemp=procesomayorizardiarioAux;
					break;
				}
			}

			jComboBoxProcesoMayorizarDiario.setSelectedItem(procesomayorizardiarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoMayorizarDiarioGenerico(JComboBox jComboBoxProcesoMayorizarDiario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoMayorizarDiario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoMayorizarDiario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoMayorizarDiario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoMayorizarDiario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoMayorizarDiario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoMayorizarDiario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesomayorizardiario=(ProcesoMayorizarDiario) procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesomayorizardiario =(ProcesoMayorizarDiario) procesomayorizardiarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesomayorizardiario.getIsNew() && !procesomayorizardiario.getIsChanged() && !procesomayorizardiario.getIsDeleted()) {
				sDescripcion=procesomayorizardiario.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesomayorizardiario.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesomayorizardiario.getIsNew() && !procesomayorizardiario.getIsChanged() && !procesomayorizardiario.getIsDeleted()) {
				sDescripcion=procesomayorizardiario.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesomayorizardiario.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesomayorizardiario.getIsNew() && !procesomayorizardiario.getIsChanged() && !procesomayorizardiario.getIsDeleted()) {
				sDescripcion=procesomayorizardiario.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesomayorizardiario.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!procesomayorizardiario.getIsNew() && !procesomayorizardiario.getIsChanged() && !procesomayorizardiario.getIsDeleted()) {
				sDescripcion=procesomayorizardiario.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=procesomayorizardiario.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoMayorizarDiario procesomayorizardiarioRow=new ProcesoMayorizarDiario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesomayorizardiarioRow=(ProcesoMayorizarDiario) procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesomayorizardiarioRow=(ProcesoMayorizarDiario) procesomayorizardiarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));			
			this.jButtonDuplicarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario && this.isPermisoDuplicarProcesoMayorizarDiario));			
			this.jButtonCopiarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaCopiarProcesoMayorizarDiario && this.isPermisoCopiarProcesoMayorizarDiario));
			this.jButtonVerFormProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaVerFormProcesoMayorizarDiario && this.isPermisoVerFormProcesoMayorizarDiario));
			
			this.jButtonAbrirOrderByProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));			
			
			this.jButtonNuevoRelacionesProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));			
			this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaModificarProcesoMayorizarDiario && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaActualizarProcesoMayorizarDiario && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaEliminarProcesoMayorizarDiario && this.isPermisoEliminarProcesoMayorizarDiario));
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.setVisible(this.isVisibilidadCeldaCancelarProcesoMayorizarDiario);							
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));						
			this.jButtonDuplicarToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario && this.isPermisoDuplicarProcesoMayorizarDiario));						
			this.jButtonCopiarToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaCopiarProcesoMayorizarDiario && this.isPermisoCopiarProcesoMayorizarDiario));			
			this.jButtonVerFormToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaVerFormProcesoMayorizarDiario && this.isPermisoVerFormProcesoMayorizarDiario));			
			this.jButtonAbrirOrderByToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));
			this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));			
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaModificarProcesoMayorizarDiario && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaActualizarProcesoMayorizarDiario  && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaEliminarProcesoMayorizarDiario && this.isPermisoEliminarProcesoMayorizarDiario));
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarToolBarProcesoMayorizarDiario.setVisible(this.isVisibilidadCeldaCancelarProcesoMayorizarDiario);				
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));			
			this.jMenuItemDuplicarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario && this.isPermisoDuplicarProcesoMayorizarDiario));			
			this.jMenuItemCopiarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaCopiarProcesoMayorizarDiario && this.isPermisoCopiarProcesoMayorizarDiario));			
			this.jMenuItemVerFormProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaVerFormProcesoMayorizarDiario && this.isPermisoVerFormProcesoMayorizarDiario));			
			this.jMenuItemAbrirOrderByProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));			
			//this.jMenuItemMostrarOcultarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));
			this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));			
			//this.jMenuItemDetalleMostrarOcultarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaOrdenProcesoMayorizarDiario && this.isPermisoOrdenProcesoMayorizarDiario));			
			this.jMenuItemNuevoRelacionesProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario));			
			this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaNuevoProcesoMayorizarDiario && this.isPermisoNuevoProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));									
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemModificarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaModificarProcesoMayorizarDiario && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemActualizarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaActualizarProcesoMayorizarDiario && this.isPermisoActualizarProcesoMayorizarDiario));	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemEliminarProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaEliminarProcesoMayorizarDiario && this.isPermisoEliminarProcesoMayorizarDiario));
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemCancelarProcesoMayorizarDiario.setVisible(this.isVisibilidadCeldaCancelarProcesoMayorizarDiario);				
			}
			
			this.jMenuItemGuardarCambiosProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));						
			this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=this.jButtonNuevoProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario=this.jButtonDuplicarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaCopiarProcesoMayorizarDiario=this.jButtonCopiarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaVerFormProcesoMayorizarDiario=this.jButtonVerFormProcesoMayorizarDiario.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoMayorizarDiario=this.jButtonAbrirOrderByProcesoMayorizarDiario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=this.jButtonNuevoRelacionesProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=this.jButtonModificarProcesoMayorizarDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=this.jButtonNuevoToolBarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarToolBarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarToolBarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarToolBarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarToolBarProcesoMayorizarDiario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=this.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=this.jMenuItemNuevoProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=this.jMenuItemNuevoRelacionesProcesoMayorizarDiario.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemModificarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemActualizarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemEliminarProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemCancelarProcesoMayorizarDiario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=this.jMenuItemGuardarCambiosProcesoMayorizarDiario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoMayorizarDiario(Boolean esInicializar) {
		if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
				//if(this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoMayorizarDiario();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoMayorizarDiario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoMayorizarDiario() {
		this.jButtonNuevoProcesoMayorizarDiario.setVisible(this.isPermisoNuevoProcesoMayorizarDiario);			
		this.jButtonDuplicarProcesoMayorizarDiario.setVisible(this.isPermisoDuplicarProcesoMayorizarDiario);			
		this.jButtonCopiarProcesoMayorizarDiario.setVisible(this.isPermisoCopiarProcesoMayorizarDiario);			
		this.jButtonVerFormProcesoMayorizarDiario.setVisible(this.isPermisoVerFormProcesoMayorizarDiario);			
		
		this.jButtonAbrirOrderByProcesoMayorizarDiario.setVisible(this.isPermisoOrdenProcesoMayorizarDiario);					
		
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.setVisible(this.isPermisoNuevoProcesoMayorizarDiario);			
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarProcesoMayorizarDiario.setVisible(this.isPermisoActualizarProcesoMayorizarDiario);	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.setVisible(this.isPermisoActualizarProcesoMayorizarDiario);	
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.setVisible(this.isPermisoEliminarProcesoMayorizarDiario);
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.setVisible(this.isVisibilidadCeldaCancelarProcesoMayorizarDiario);						
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.setVisible(this.isPermisoGuardarCambiosProcesoMayorizarDiario);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.setVisible(this.isPermisoActualizarProcesoMayorizarDiario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoMayorizarDiario() {
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarProcesoMayorizarDiario.setVisible(this.isPermisoActualizarProcesoMayorizarDiario);	
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.setVisible(this.isPermisoActualizarProcesoMayorizarDiario);	
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.setVisible(this.isPermisoEliminarProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.setVisible(this.isVisibilidadCeldaCancelarProcesoMayorizarDiario);							
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.setVisible((this.isVisibilidadCeldaGuardarProcesoMayorizarDiario && this.isPermisoGuardarCambiosProcesoMayorizarDiario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoMayorizarDiario() {
		if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoMayorizarDiario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoMayorizarDiario() {
	}
	
	public void jTableDatosProcesoMayorizarDiarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoMayorizarDiario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesomayorizardiario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoMayorizarDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoMayorizarDiario(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoMayorizarDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesomayorizardiarioLogic.getConnexion());

				if(this.procesomayorizardiario.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesomayorizardiario.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoMayorizarDiario=(TitledBorder)this.jScrollPanelDatosProcesoMayorizarDiario.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoMayorizarDiario.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesomayorizardiario.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoMayorizarDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoMayorizarDiario(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoMayorizarDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesomayorizardiarioLogic.getConnexion());

				if(this.procesomayorizardiario.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesomayorizardiario.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoMayorizarDiario=(TitledBorder)this.jScrollPanelDatosProcesoMayorizarDiario.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoMayorizarDiario.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesomayorizardiario.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoMayorizarDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoMayorizarDiario(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoMayorizarDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesomayorizardiarioLogic.getConnexion());

				if(this.procesomayorizardiario.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesomayorizardiario.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoMayorizarDiario=(TitledBorder)this.jScrollPanelDatosProcesoMayorizarDiario.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoMayorizarDiario.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesomayorizardiario.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebProcesoMayorizarDiario(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoMayorizarDiario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoMayorizarDiario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.procesomayorizardiarioLogic.getConnexion());

				if(this.procesomayorizardiario.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.procesomayorizardiario.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoMayorizarDiario=(TitledBorder)this.jScrollPanelDatosProcesoMayorizarDiario.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderProcesoMayorizarDiario.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.procesomayorizardiario.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.procesomayorizardiario.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.procesomayorizardiario.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesomayorizardiario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesomayorizardiario.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.procesomayorizardiario.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorProcesoMayorizarDiarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.getprocesomayorizardiario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesomayorizardiario==null) {
						this.procesomayorizardiario = new ProcesoMayorizarDiario();
					}

					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);
				}

				if(this.procesomayorizardiario.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.procesomayorizardiario.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoMayorizarDiario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);

			this.getProcesoMayorizarDiariosBusquedaProcesoMayorizarDiario();

			this.inicializarActualizarBindingProcesoMayorizarDiario(false);

			//if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);

			this.getProcesoMayorizarDiariosFK_IdEjercicio();

			this.inicializarActualizarBindingProcesoMayorizarDiario(false);

			//if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);

			this.getProcesoMayorizarDiariosFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoMayorizarDiario(false);

			//if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);

			this.getProcesoMayorizarDiariosFK_IdSucursal();

			this.inicializarActualizarBindingProcesoMayorizarDiario(false);

			//if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoProcesoMayorizarDiarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);

			this.getProcesoMayorizarDiariosFK_IdTipoMovimiento();

			this.inicializarActualizarBindingProcesoMayorizarDiario(false);

			//if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesomayorizardiarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoMayorizarDiario() {
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.dispose();
			this.jInternalFrameDetalleFormProcesoMayorizarDiario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
			this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.dispose();
			this.jInternalFrameReporteDinamicoProcesoMayorizarDiario=null;
		}
		
		if(this.jInternalFrameImportacionProcesoMayorizarDiario!=null) {
			this.jInternalFrameImportacionProcesoMayorizarDiario.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoMayorizarDiario.dispose();
			this.jInternalFrameImportacionProcesoMayorizarDiario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoMayorizarDiario();
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoMayorizarDiario")) {
				jButtonDuplicarProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoMayorizarDiario")) {
				jButtonCopiarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoMayorizarDiario")) {
				jButtonVerFormProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoMayorizarDiario")) {
				jButtonDuplicarProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoMayorizarDiario")) {
				jButtonDuplicarProcesoMayorizarDiarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoMayorizarDiario")) {
				jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoMayorizarDiario")) {
				jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoMayorizarDiario")) {
				jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoMayorizarDiario")) {
				jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoMayorizarDiario")) {
				jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoMayorizarDiario")) {
				jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoMayorizarDiario")) {
				jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoMayorizarDiario")) {
				jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoMayorizarDiario")) {
				jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoMayorizarDiario")) {
				jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoMayorizarDiario")) {
				jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoMayorizarDiario")) {
				jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoMayorizarDiario")) {
				jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoMayorizarDiario")) {
				jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoMayorizarDiario")) {
				jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoMayorizarDiario")) {
				jButtonMostrarOcultarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoMayorizarDiario")) {
				jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoMayorizarDiario")) {
				jButtonCopiarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoMayorizarDiario")) {
				jButtonVerFormProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoMayorizarDiario")) {
				jButtonCopiarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoMayorizarDiario")) {
				jButtonVerFormProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoMayorizarDiario")) {
				jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoMayorizarDiario")) {
				jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoMayorizarDiario")) {
				jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoMayorizarDiario")) {
				jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoMayorizarDiario")) {
				jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoMayorizarDiario")) {
				jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoMayorizarDiario")) {
				jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoMayorizarDiario")) {
				jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoMayorizarDiario")) {
				jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoMayorizarDiario") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoMayorizarDiario")) {
				jButtonAbrirOrderByProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoMayorizarDiario") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoMayorizarDiario")) {
				jButtonMostrarOcultarProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoMayorizarDiario")) {
				jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoMayorizarDiario")) {
				jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoMayorizarDiario")) {
				jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoMayorizarDiario")) {
				jButtonProcesarInformacionProcesoMayorizarDiarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoMayorizarDiario")) {
				jButtonCerrarReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoMayorizarDiario")) {
				jButtonGenerarReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoMayorizarDiario")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoMayorizarDiario")) {
				jButtonCerrarImportacionProcesoMayorizarDiarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoMayorizarDiario")) {
				
				jButtonGenerarImportacionProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoMayorizarDiario")) {
				
				jButtonAbrirImportacionProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoMayorizarDiario")) {
				jComboBoxTiposAccionesProcesoMayorizarDiarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoMayorizarDiario")) {
				jComboBoxTiposRelacionesProcesoMayorizarDiarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoMayorizarDiario")) {
				jComboBoxTiposAccionesProcesoMayorizarDiarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoMayorizarDiario")) {
				
				jComboBoxTiposSeleccionarProcesoMayorizarDiarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoMayorizarDiario")) {
				jTextFieldValorCampoGeneralProcesoMayorizarDiarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoMayorizarDiario")) {
				jButtonAbrirOrderByProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoMayorizarDiario")) {
				jButtonAbrirOrderByProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoMayorizarDiario")) {
				jButtonCerrarOrderByProcesoMayorizarDiarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoMayorizarDiarioBusqueda")) {
				this.jButtonidProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_empresaProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_empresaProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_sucursalProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_sucursalProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_ejercicioProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_ejercicioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfecha_inicioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfecha_finProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoMayorizarDiarioBusqueda")) {
				this.jButtoncodigoProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfechaProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonbeneficiarioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProcesoMayorizarDiarioBusqueda")) {
				this.jButtonvalorProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoMayorizarDiarioProcesoMayorizarDiario")) {
				this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiarioActionPerformed(evt);
			}
			
			;
			
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoMayorizarDiario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoMayorizarDiario procesomayorizardiarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesomayorizardiarioLocal=this.procesomayorizardiario;
			} else {
				procesomayorizardiarioLocal=this.procesomayorizardiarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
							
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
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
			
			


			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
								
						
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
								
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
							
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
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
			
			


			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
								
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoMayorizarDiario")) {
					jCheckBoxSeleccionarTodosProcesoMayorizarDiarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoMayorizarDiario")) {
					jCheckBoxSeleccionadosProcesoMayorizarDiarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoMayorizarDiario")) {
					
				}
				
				


				
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
												
				
				


				
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
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
			
			


			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesomayorizardiario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesomayorizardiario);
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
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
				
				


				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoMayorizarDiario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoMayorizarDiario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoMayorizarDiarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesomayorizardiarioAnterior =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoMayorizarDiario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoMayorizarDiarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoMayorizarDiario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesomayorizardiario =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesomayorizardiario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoMayorizarDiario")) {
				
				}
				
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoMayorizarDiario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoMayorizarDiario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoMayorizarDiario")) {
			
			}
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoMayorizarDiario();
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoMayorizarDiario")) {
				jButtonDuplicarProcesoMayorizarDiarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoMayorizarDiario")) {
				jButtonCopiarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoMayorizarDiario")) {
				jButtonVerFormProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoMayorizarDiario")) {
				jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoMayorizarDiario")) {
				jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoMayorizarDiario")) {
				jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoMayorizarDiario")) {
				jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoMayorizarDiario")) {
				jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoMayorizarDiario")) {
				jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoMayorizarDiario")) {
				jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoMayorizarDiario")) {
				jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoMayorizarDiario")) {
				jButtonAbrirOrderByProcesoMayorizarDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoMayorizarDiario")) {
				jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoMayorizarDiario")) {
				jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoMayorizarDiario")) {
				jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoMayorizarDiarioBusqueda")) {
				this.jButtonidProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_empresaProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_empresaProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_sucursalProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_sucursalProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_ejercicioProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_ejercicioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoProcesoMayorizarDiarioUpdate")) {
				this.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoProcesoMayorizarDiarioBusqueda")) {
				this.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfecha_inicioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfecha_finProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoMayorizarDiarioBusqueda")) {
				this.jButtoncodigoProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoMayorizarDiarioBusqueda")) {
				this.jButtonfechaProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioProcesoMayorizarDiarioBusqueda")) {
				this.jButtonbeneficiarioProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProcesoMayorizarDiarioBusqueda")) {
				this.jButtonvalorProcesoMayorizarDiarioBusquedaActionPerformed(evt);
			}
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoMayorizarDiario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoMayorizarDiario")) {
				closingInternalFrameProcesoMayorizarDiario();
				
			} else if(sTipo.equals("jButtonCancelarProcesoMayorizarDiario")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoMayorizarDiario = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoMayorizarDiarioBeanSwingJInternalFrame jInternalFrameParent=(ProcesoMayorizarDiarioBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoMayorizarDiario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoMayorizarDiarioActionPerformed(null);
			}
			
			ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesomayorizardiario,new Object(),this.procesomayorizardiarioParameterGeneral,this.procesomayorizardiarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoMayorizarDiario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoMayorizarDiario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoMayorizarDiario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesomayorizardiario)) {
			if(!esControlTabla) {
				if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);			
				}
				
				if(this.procesomayorizardiarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral,this.procesomayorizardiarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesomayorizardiarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoMayorizarDiario(classes,this.procesomayorizardiarioReturnGeneral,this.procesomayorizardiarioBean,false);
					}
						
					if(this.procesomayorizardiarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario());	
					}
						
					if(this.procesomayorizardiarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario(),classes);//this.procesomayorizardiarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoMayorizarDiario(this.procesomayorizardiario,classes);//this.procesomayorizardiarioBean);									
				}
			
				if(ProcesoMayorizarDiarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoMayorizarDiario(this.procesomayorizardiario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoMayorizarDiario(this.procesomayorizardiario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesomayorizardiarioAnterior!=null) {
						this.procesomayorizardiario=this.procesomayorizardiarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesomayorizardiarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario(),procesomayorizardiarioLogic.getProcesoMayorizarDiarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiario(),this.procesomayorizardiarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoMayorizarDiario.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoMayorizarDiario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoMayorizarDiario();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoMayorizarDiario() throws Exception {
		
		ProcesoMayorizarDiarioModel procesomayorizardiarioModel=(ProcesoMayorizarDiarioModel)this.jTableDatosProcesoMayorizarDiario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesomayorizardiarioModel.procesomayorizardiarios=this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesomayorizardiarioModel.procesomayorizardiarios=this.procesomayorizardiarios;
		}
		
		
		((ProcesoMayorizarDiarioModel) this.jTableDatosProcesoMayorizarDiario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoMayorizarDiario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesomayorizardiarioAnterior(),this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesomayorizardiarioAnterior(),this.procesomayorizardiarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoMayorizarDiario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
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
										
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesomayorizardiario,new Object(),generalEntityParameterGeneral,this.procesomayorizardiarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoMayorizarDiarioConstantesFunciones.getClassesRelationshipsOfProcesoMayorizarDiario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoMayorizarDiarioConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoMayorizarDiario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoMayorizarDiario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesomayorizardiario,new Object(),generalEntityParameterGeneral,this.procesomayorizardiarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoMayorizarDiario(ProcesoMayorizarDiarioBean procesomayorizardiarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoMayorizarDiario(ArrayList<Classe> classes,ProcesoMayorizarDiarioReturnGeneral procesomayorizardiarioReturnGeneral,ProcesoMayorizarDiarioBean procesomayorizardiarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesomayorizardiario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario = new ProcesoMayorizarDiarioDetalleFormJInternalFrame(jDesktopPane,this.procesomayorizardiarioSessionBean.getConGuardarRelaciones(),this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.setVisible(false);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.procesomayorizardiarioLogic=this.procesomayorizardiarioLogic;
		
		this.cargarCombosFrameForeignKeyProcesoMayorizarDiario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoMayorizarDiario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoMayorizarDiario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoMayorizarDiario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoMayorizarDiario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoMayorizarDiario"));
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ModificarProcesoMayorizarDiario"));

		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoMayorizarDiario"));
					
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemModificarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoMayorizarDiario"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"ActualizarProcesoMayorizarDiario"));
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoMayorizarDiario"));
						
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemActualizarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoMayorizarDiario"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"EliminarProcesoMayorizarDiario"));
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoMayorizarDiario"));
								
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemEliminarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoMayorizarDiario"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CancelarProcesoMayorizarDiario"));
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoMayorizarDiario"));
					
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemCancelarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoMayorizarDiario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemDetalleCerrarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoMayorizarDiario"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoMayorizarDiario"));
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoMayorizarDiario"));
		
		
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoMayorizarDiario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonidProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_finProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtoncodigoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfechaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonvalorProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoMayorizarDiarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoMayorizarDiario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoMayorizarDiario"));
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoMayorizarDiario"));
		}
		
		this.jTableDatosProcesoMayorizarDiario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoMayorizarDiario"));
		
		this.jTableDatosProcesoMayorizarDiario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoMayorizarDiario"));
		
		this.jButtonNuevoProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"NuevoProcesoMayorizarDiario"));
		
		this.jButtonDuplicarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"DuplicarProcesoMayorizarDiario"));
		
		this.jButtonCopiarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"CopiarProcesoMayorizarDiario"));
		
		this.jButtonVerFormProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"VerFormProcesoMayorizarDiario"));
		
		
		this.jButtonNuevoToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoMayorizarDiario"));
			
		this.jButtonDuplicarToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemNuevoProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoMayorizarDiario"));
			
		this.jMenuItemDuplicarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoMayorizarDiario"));		
		
		
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoMayorizarDiario"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemNuevoRelacionesProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoMayorizarDiario"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ModificarProcesoMayorizarDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonModificarToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoMayorizarDiario"));
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemModificarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoMayorizarDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"ActualizarProcesoMayorizarDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonActualizarToolBarProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoMayorizarDiario"));
				
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemActualizarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoMayorizarDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"EliminarProcesoMayorizarDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonEliminarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoMayorizarDiario"));
						
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemEliminarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoMayorizarDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CancelarProcesoMayorizarDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonCancelarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoMayorizarDiario"));
			
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemCancelarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoMayorizarDiario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoMayorizarDiario"));		
		
		
		this.jButtonCerrarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CerrarProcesoMayorizarDiario"));
		
		
		this.jButtonCerrarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemCerrarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoMayorizarDiario"));
			
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jMenuItemDetalleCerrarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoMayorizarDiario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoMayorizarDiario"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoMayorizarDiario"));
		}
		
		this.jButtonCopiarToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoMayorizarDiario"));
			
		this.jButtonVerFormToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoMayorizarDiario"));
		
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoMayorizarDiario"));
			
		this.jMenuItemCopiarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoMayorizarDiario"));		
		
		this.jMenuItemVerFormProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoMayorizarDiario"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoMayorizarDiario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoMayorizarDiario"));		
		
		
		
		this.jButtonRecargarInformacionProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoMayorizarDiario"));
					
		this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoMayorizarDiario"));
		
		this.jMenuItemRecargarInformacionProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoMayorizarDiario"));		
		
		
		
		this.jButtonAnterioresProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"AnterioresProcesoMayorizarDiario"));
		
		
		this.jButtonAnterioresToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoMayorizarDiario"));
		
		this.jMenuItemAnterioresProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoMayorizarDiario"));		
		
		
		this.jButtonSiguientesProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"SiguientesProcesoMayorizarDiario"));
		
		
		this.jButtonSiguientesToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemSiguientesProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoMayorizarDiario"));
			
		this.jMenuItemAbrirOrderByProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoMayorizarDiario"));
			
		this.jMenuItemMostrarOcultarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoMayorizarDiario"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoMayorizarDiario"));
			
		this.jMenuItemDetalleMostarOcultarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoMayorizarDiario"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoMayorizarDiario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoMayorizarDiario"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoMayorizarDiario"));		
		
		
		this.jButtonProcesarInformacionProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoMayorizarDiario"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoMayorizarDiario"));

		this.jCheckBoxSeleccionadosProcesoMayorizarDiario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoMayorizarDiario"));
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoMayorizarDiario"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoMayorizarDiario"));
			
		this.jComboBoxTiposAccionesProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoMayorizarDiario"));
					
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoMayorizarDiario"));
			
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoMayorizarDiario"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonidProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_finProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtoncodigoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfechaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonvalorProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoMayorizarDiarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"BusquedaProcesoMayorizarDiarioProcesoMayorizarDiario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoMayorizarDiario!=null) {
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoMayorizarDiario"));
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoMayorizarDiario"));
				this.jInternalFrameReporteDinamicoProcesoMayorizarDiario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoMayorizarDiario"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoMayorizarDiario"));				
			//this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoMayorizarDiario"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoMayorizarDiario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoMayorizarDiario!=null) {
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoMayorizarDiario"));
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoMayorizarDiario"));
				this.jInternalFrameImportacionProcesoMayorizarDiario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoMayorizarDiario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoMayorizarDiario"));
			
			this.jButtonAbrirOrderByToolBarProcesoMayorizarDiario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoMayorizarDiario"));			
			
			if(this.jInternalFrameOrderByProcesoMayorizarDiario!=null) {
				this.jInternalFrameOrderByProcesoMayorizarDiario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoMayorizarDiario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTabbedPaneRelacionesProcesoMayorizarDiario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoMayorizarDiario"));
		
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
            		closingInternalFrameProcesoMayorizarDiario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoMayorizarDiario = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoMayorizarDiarioBeanSwingJInternalFrame jInternalFrameParent=(ProcesoMayorizarDiarioBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoMayorizarDiario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoMayorizarDiarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoMayorizarDiario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoMayorizarDiarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoMayorizarDiario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoMayorizarDiario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoMayorizarDiario";
		inputMap = this.jButtonNuevoRelacionesProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoMayorizarDiarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoMayorizarDiario";
		inputMap = this.jButtonModificarProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoMayorizarDiario";
		inputMap = this.jButtonActualizarProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoMayorizarDiario";
		inputMap = this.jButtonEliminarProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoMayorizarDiario";
		inputMap = this.jButtonCancelarProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoMayorizarDiario";
		inputMap = this.jButtonCerrarProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoMayorizarDiario";
		inputMap = this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonGuardarCambiosProcesoMayorizarDiario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoMayorizarDiario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoMayorizarDiarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoMayorizarDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoMayorizarDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoMayorizarDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoMayorizarDiarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonidProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_empresaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_sucursalProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_ejercicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoMayorizarDiarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonid_tipo_movimientoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_inicioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfecha_finProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtoncodigoProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonfechaProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonbeneficiarioProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioProcesoMayorizarDiarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jButtonvalorProcesoMayorizarDiarioBusqueda.addActionListener(new ButtonActionListener(this,"valorProcesoMayorizarDiarioBusqueda"));
		
		
		this.jButtonBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario.addActionListener(new ButtonActionListener(this,"BusquedaProcesoMayorizarDiarioProcesoMayorizarDiario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoMayorizarDiario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoMayorizarDiarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoMayorizarDiarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoMayorizarDiario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoMayorizarDiario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
					procesomayorizardiarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarios) {
					procesomayorizardiarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoMayorizarDiarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
						procesomayorizardiarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarios) {
						procesomayorizardiarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoMayorizarDiario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoMayorizarDiario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoMayorizarDiarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoMayorizarDiario.getSelectedRows();
			
			ProcesoMayorizarDiario procesomayorizardiarioLocal=new ProcesoMayorizarDiario();
			
			//this.seleccionarTodosProcesoMayorizarDiario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesomayorizardiarioLocal =(ProcesoMayorizarDiario) this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios().toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesomayorizardiarioLocal =(ProcesoMayorizarDiario) this.procesomayorizardiarios.toArray()[this.jTableDatosProcesoMayorizarDiario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesomayorizardiarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
						procesomayorizardiarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarios) {
						procesomayorizardiarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoMayorizarDiario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoMayorizarDiario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoMayorizarDiario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoMayorizarDiarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoMayorizarDiarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoMayorizarDiarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoMayorizarDiario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
				
						if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							procesomayorizardiarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							procesomayorizardiarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesomayorizardiarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesomayorizardiarioAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							procesomayorizardiarioAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							procesomayorizardiarioAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarios) {
					
						if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							procesomayorizardiarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							procesomayorizardiarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesomayorizardiarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesomayorizardiarioAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							procesomayorizardiarioAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							procesomayorizardiarioAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoMayorizarDiarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoMayorizarDiario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoMayorizarDiario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoMayorizarDiario) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoMayorizarDiario(conSplash);
				
					this.generarReporteProcesoMayorizarDiariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoMayorizarDiariosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoMayorizarDiariosSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoMayorizarDiariosSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoMayorizarDiario();
				
				this.exportarProcesoMayorizarDiariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoMayorizarDiarios();
				//this.importarProcesoMayorizarDiarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoMayorizarDiario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoMayorizarDiariosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Mayorizar Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoMayorizarDiario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoMayorizarDiario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoMayorizarDiario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoMayorizarDiarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoMayorizarDiario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoMayorizarDiario(conSplash);
					
						//this.actualizarParametrosGeneralProcesoMayorizarDiario();
						
						this.generarReporteProcesoAccionProcesoMayorizarDiariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Mayorizar DiarioES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Mayorizar Diario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoMayorizarDiario();
				
						this.actualizarParametrosGeneralProcesoMayorizarDiario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesomayorizardiarioReturnGeneral=procesomayorizardiarioLogic.procesarAccionProcesoMayorizarDiariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios(),this.procesomayorizardiarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoMayorizarDiarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoMayorizarDiario();
					
					ProcesoMayorizarDiarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoMayorizarDiarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoMayorizarDiario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxTiposAccionesFormularioProcesoMayorizarDiario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoMayorizarDiario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoMayorizarDiarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoMayorizarDiario();
			
			if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
			ProcesoMayorizarDiario procesomayorizardiario=new ProcesoMayorizarDiario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoMayorizarDiario.getSelectedItem();
			
			
			
			
			procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesomayorizardiariosSeleccionados.size()==1) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
					procesomayorizardiario=procesomayorizardiarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoMayorizarDiario();
			
      		//this.finishProcessProcesoMayorizarDiario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoMayorizarDiarioReturnGeneral() throws Exception {
		if(this.procesomayorizardiarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesomayorizardiarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesomayorizardiarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesomayorizardiarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesomayorizardiarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesomayorizardiarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
		}
		
		if(this.procesomayorizardiarioReturnGeneral.getConRetornoLista() || this.procesomayorizardiarioReturnGeneral.getConRetornoObjeto()) {
			if(this.procesomayorizardiarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesomayorizardiarioLogic.setProcesoMayorizarDiarios(this.procesomayorizardiarioReturnGeneral.getProcesoMayorizarDiarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoMayorizarDiario(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoMayorizarDiario() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoMayorizarDiario> getProcesoMayorizarDiariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoMayorizarDiario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiarioLogic.getProcesoMayorizarDiarios()) {
					if(procesomayorizardiarioAux.getIsSelected()) {
						procesomayorizardiariosSeleccionados.add(procesomayorizardiarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoMayorizarDiario procesomayorizardiarioAux:this.procesomayorizardiarios) {
					if(procesomayorizardiarioAux.getIsSelected()) {
						procesomayorizardiariosSeleccionados.add(procesomayorizardiarioAux);				
					}
				}
			}
			
			if(procesomayorizardiariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesomayorizardiariosSeleccionados.addAll(this.procesomayorizardiarioLogic.getProcesoMayorizarDiarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesomayorizardiariosSeleccionados.addAll(this.procesomayorizardiarios);				
					}
				}
			}
		} else {
			procesomayorizardiariosSeleccionados.add(this.procesomayorizardiario);
		}
		
		return procesomayorizardiariosSeleccionados;
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
	
	public void generarReporteProcesoMayorizarDiariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoMayorizarDiariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoMayorizarDiariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoMayorizarDiariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoMayorizarDiariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Mayorizar Diario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoMayorizarDiariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoMayorizarDiario();
		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoMayorizarDiario();
		
		
		//this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados ,procesomayorizardiarioImplementable,procesomayorizardiarioImplementableHome);
	}
	
	public void mostrarImportacionProcesoMayorizarDiarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoMayorizarDiario();
		
		this.abrirFrameImportacionProcesoMayorizarDiario();		
		
			
		//this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados ,procesomayorizardiarioImplementable,procesomayorizardiarioImplementableHome);
	}
	
	public void importarProcesoMayorizarDiarios() throws Exception {		
	
	}
	
	public void exportarProcesoMayorizarDiariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoMayorizarDiariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoMayorizarDiariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoMayorizarDiariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Mayorizar Diario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoMayorizarDiario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoMayorizarDiario(procesomayorizardiarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesomayorizardiarioAux.setsDetalleGeneralEntityReporte(procesomayorizardiarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoMayorizarDiario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesomayorizardiario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesomayorizardiario.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoMayorizarDiarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoMayorizarDiario(row);				
				iRow++;
			}				
			
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoMayorizarDiario(procesomayorizardiarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoMayorizarDiariosSeleccionados() throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();		
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesomayorizardiario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesomayorizardiarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesomayorizardiario");
			//elementRoot.appendChild(element);
		
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
				element = document.createElement("procesomayorizardiario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoMayorizarDiario(procesomayorizardiarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Mayorizar Diario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoMayorizarDiario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoMayorizarDiarioConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(procesomayorizardiario.getvalor());				
	}
	
	public void setFilaDatosExportarXmlProcesoMayorizarDiario(ProcesoMayorizarDiario procesomayorizardiario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesomayorizardiario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesomayorizardiario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesomayorizardiario.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesomayorizardiario.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesomayorizardiario.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(procesomayorizardiario.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementfecha_inicio = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(procesomayorizardiario.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(procesomayorizardiario.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementcodigo = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesomayorizardiario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesomayorizardiario.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementbeneficiario = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(procesomayorizardiario.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementvalor = document.createElement(ProcesoMayorizarDiarioConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(procesomayorizardiario.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoProcesoMayorizarDiariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados=new ArrayList<ProcesoMayorizarDiario>();
		
		procesomayorizardiariosSeleccionados=this.getProcesoMayorizarDiariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoMayorizarDiario(procesomayorizardiariosSeleccionados);
		
		this.generarReporteProcesoMayorizarDiarios("Todos",procesomayorizardiariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoMayorizarDiario(ArrayList<ProcesoMayorizarDiario> procesomayorizardiariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoMayorizarDiario procesomayorizardiarioAux:procesomayorizardiariosSeleccionados) {
				procesomayorizardiarioAux.setsDetalleGeneralEntityReporte(procesomayorizardiarioAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesomayorizardiarioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesomayorizardiarioAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesomayorizardiarioAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoMayorizarDiarioConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					procesomayorizardiarioAux.setsDescripcionGeneralEntityReporte1(procesomayorizardiarioAux.getbeneficiario());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoMayorizarDiarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoMayorizarDiario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaModificarProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoMayorizarDiarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=true;
		} else {
			this.actualizarEstadoPanelsProcesoMayorizarDiario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoMayorizarDiario=false;
			//this.isVisibilidadCeldaVerFormProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaDuplicarProcesoMayorizarDiario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			if(!procesomayorizardiarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;												
			}
			
			this.jButtonCerrarProcesoMayorizarDiario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
		}
		
		if(!this.permiteMantenimiento(this.procesomayorizardiario)) {
			this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
			this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoMayorizarDiario=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoMayorizarDiario=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoMayorizarDiario=false;
		//this.isVisibilidadCeldaModificarProcesoMayorizarDiario=true;
		this.isVisibilidadCeldaActualizarProcesoMayorizarDiario=false;
		this.isVisibilidadCeldaEliminarProcesoMayorizarDiario=false;
		//this.isVisibilidadCeldaCancelarProcesoMayorizarDiario=true;			
		this.isVisibilidadCeldaGuardarProcesoMayorizarDiario=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoMayorizarDiario() {
	}
	
	public void actualizarEstadoPanelsProcesoMayorizarDiario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosEdicionProcesoMayorizarDiario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoMayorizarDiario!=null) {
				this.jScrollPanelDatosProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoMayorizarDiario!=null) {
				this.jPanelPaginacionProcesoMayorizarDiario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
					this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesomayorizardiarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoMayorizarDiario!=null) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoMayorizarDiario!=null) {
				this.jPanelParametrosReportesProcesoMayorizarDiario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoMayorizarDiario=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoMayorizarDiario) {this.jTabbedPaneBusquedasProcesoMayorizarDiario.remove(jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoMayorizarDiario=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoMayorizarDiario) {this.jTabbedPaneBusquedasProcesoMayorizarDiario.remove(jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaProcesoMayorizarDiario=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaProcesoMayorizarDiario) {this.jTabbedPaneBusquedasProcesoMayorizarDiario.remove(jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaProcesoMayorizarDiario=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaProcesoMayorizarDiario) {this.jTabbedPaneBusquedasProcesoMayorizarDiario.remove(jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);}
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
			
			this.inicializarActualizarBindingTablaProcesoMayorizarDiario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoMayorizarDiario() {
		this.updateBorderResaltarBusquedasFormularioProcesoMayorizarDiario();
		this.updateVisibilidadBusquedasFormularioProcesoMayorizarDiario();
		this.updateHabilitarBusquedasFormularioProcesoMayorizarDiario();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoMayorizarDiario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponents().length>0) {
	

		if(this.procesomayorizardiarioConstantesFunciones.resaltarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario!=null) {
			index= this.jTabbedPaneBusquedasProcesoMayorizarDiario.indexOfComponent(this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponent(index);
				jPanel.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoMayorizarDiario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoMayorizarDiario.indexOfComponent(this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			if(!this.procesomayorizardiarioConstantesFunciones.mostrarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario && index>-1) {
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoMayorizarDiario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoMayorizarDiario.indexOfComponent(this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
				this.jTabbedPaneBusquedasProcesoMayorizarDiario.setEnabledAt(index,this.procesomayorizardiarioConstantesFunciones.activarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoMayorizarDiario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoMayorizarDiario")) {
			index= this.jTabbedPaneBusquedasProcesoMayorizarDiario.indexOfComponent(this.jPanelBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);

			this.jTabbedPaneBusquedasProcesoMayorizarDiario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoMayorizarDiario.getComponent(index);

			this.procesomayorizardiarioConstantesFunciones.setResaltarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario(resaltar);

			jPanel.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarBusquedaProcesoMayorizarDiarioProcesoMayorizarDiario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoMayorizarDiario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoMayorizarDiario() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoMayorizarDiario();
		this.updateVisibilidadResaltarControlesFormularioProcesoMayorizarDiario();
		this.updateHabilitarResaltarControlesFormularioProcesoMayorizarDiario();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoMayorizarDiario() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesomayorizardiarioConstantesFunciones.resaltaridProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltaridProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarid_empresaProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarid_empresaProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarid_sucursalProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarid_sucursalProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarid_ejercicioProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarid_ejercicioProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarid_tipo_movimientoProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarid_tipo_movimientoProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarfecha_inicioProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_inicioProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarfecha_inicioProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarfecha_finProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_finProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarfecha_finProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarcodigoProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarcodigoProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarfechaProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarfechaProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarbeneficiarioProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarbeneficiarioProcesoMayorizarDiario);}
		if(this.procesomayorizardiarioConstantesFunciones.resaltarvalorProcesoMayorizarDiario!=null && this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setBorder(this.procesomayorizardiarioConstantesFunciones.resaltarvalorProcesoMayorizarDiario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoMayorizarDiario() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
	
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostraridProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelidProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostraridProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_empresaProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelid_empresaProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_empresaProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_sucursalProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelid_sucursalProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_sucursalProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_ejercicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelid_ejercicioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_ejercicioProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_tipo_movimientoProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelid_tipo_movimientoProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarid_tipo_movimientoProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_inicioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfecha_inicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelfecha_inicioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfecha_inicioProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_finProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfecha_finProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelfecha_finProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfecha_finProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarcodigoProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelcodigoProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarcodigoProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfechaProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelfechaProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarfechaProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarbeneficiarioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelbeneficiarioProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarbeneficiarioProcesoMayorizarDiario);
		//this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarvalorProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jPanelvalorProcesoMayorizarDiario.setVisible(this.procesomayorizardiarioConstantesFunciones.mostrarvalorProcesoMayorizarDiario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoMayorizarDiario() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoMayorizarDiario!=null) {
	
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jLabelidProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activaridProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_empresaProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarid_empresaProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_sucursalProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarid_sucursalProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_ejercicioProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarid_ejercicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jComboBoxid_tipo_movimientoProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarid_tipo_movimientoProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_inicioProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarfecha_inicioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfecha_finProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarfecha_finProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldcodigoProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarcodigoProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jDateChooserfechaProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarfechaProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextAreabeneficiarioProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarbeneficiarioProcesoMayorizarDiario);
		this.jInternalFrameDetalleFormProcesoMayorizarDiario.jTextFieldvalorProcesoMayorizarDiario.setEnabled(this.procesomayorizardiarioConstantesFunciones.activarvalorProcesoMayorizarDiario);
		}
	}
	
		
}