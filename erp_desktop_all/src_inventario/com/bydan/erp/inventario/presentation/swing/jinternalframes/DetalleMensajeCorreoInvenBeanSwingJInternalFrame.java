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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.DetalleMensajeCorreoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleMensajeCorreoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleMensajeCorreoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetalleMensajeCorreoInvenBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleMensajeCorreoInvenBeanSwingJInternalFrame extends DetalleMensajeCorreoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleMensajeCorreoInven> detallemensajecorreoinvenValidator = new ClassValidator<DetalleMensajeCorreoInven>(DetalleMensajeCorreoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleMensajeCorreoInven detallemensajecorreoinven;	
	public DetalleMensajeCorreoInven detallemensajecorreoinvenAux;
	public DetalleMensajeCorreoInven detallemensajecorreoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleMensajeCorreoInven detallemensajecorreoinvenTotales;
	public Long idDetalleMensajeCorreoInvenActual;
	public Long iIdNuevoDetalleMensajeCorreoInven=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboMensajeCorreoInven="";

	public List<MensajeCorreoInven> mensajecorreoinvensForeignKey;

	public List<MensajeCorreoInven> getmensajecorreoinvensForeignKey() {
		return mensajecorreoinvensForeignKey;
	}

	public void setmensajecorreoinvensForeignKey(List<MensajeCorreoInven> mensajecorreoinvensForeignKey) {
		this.mensajecorreoinvensForeignKey = mensajecorreoinvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public MensajeCorreoInven mensajecorreoinvenForeignKey;

	public MensajeCorreoInven getmensajecorreoinvenForeignKey() {
		return mensajecorreoinvenForeignKey;
	}

	public void setmensajecorreoinvenForeignKey(MensajeCorreoInven mensajecorreoinvenForeignKey) {
		this.mensajecorreoinvenForeignKey = mensajecorreoinvenForeignKey;
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

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
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
	
	public Boolean isPermisoTodoDetalleMensajeCorreoInven;
	public Boolean isPermisoNuevoDetalleMensajeCorreoInven;
	public Boolean isPermisoActualizarDetalleMensajeCorreoInven;
	public Boolean isPermisoActualizarOriginalDetalleMensajeCorreoInven;
	public Boolean isPermisoEliminarDetalleMensajeCorreoInven;
	public Boolean isPermisoGuardarCambiosDetalleMensajeCorreoInven;
	public Boolean isPermisoConsultaDetalleMensajeCorreoInven;
	public Boolean isPermisoBusquedaDetalleMensajeCorreoInven;
	public Boolean isPermisoReporteDetalleMensajeCorreoInven;
	public Boolean isPermisoPaginacionMedioDetalleMensajeCorreoInven;
	public Boolean isPermisoPaginacionAltoDetalleMensajeCorreoInven;
	public Boolean isPermisoPaginacionTodoDetalleMensajeCorreoInven;
	public Boolean isPermisoCopiarDetalleMensajeCorreoInven;
	public Boolean isPermisoVerFormDetalleMensajeCorreoInven;
	public Boolean isPermisoDuplicarDetalleMensajeCorreoInven;
	public Boolean isPermisoOrdenDetalleMensajeCorreoInven;
	
	
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
	
	public DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenReturnGeneral;
	public DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleMensajeCorreoInven=false;
	public Boolean esParaAccionDesdeFormularioDetalleMensajeCorreoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleMensajeCorreoInvenSessionBeanAdditional detallemensajecorreoinvenSessionBeanAdditional=null;
	
	public DetalleMensajeCorreoInvenSessionBeanAdditional getDetalleMensajeCorreoInvenSessionBeanAdditional() {
		return this.detallemensajecorreoinvenSessionBeanAdditional;
	}
	
	public void setDetalleMensajeCorreoInvenSessionBeanAdditional(DetalleMensajeCorreoInvenSessionBeanAdditional detallemensajecorreoinvenSessionBeanAdditional) {
		try {
			this.detallemensajecorreoinvenSessionBeanAdditional=detallemensajecorreoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional detallemensajecorreoinvenBeanSwingJInternalFrameAdditional=null;
	//public class DetalleMensajeCorreoInvenBeanSwingJInternalFrame
	
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional getDetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional() {
		return this.detallemensajecorreoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional(DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional detallemensajecorreoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.detallemensajecorreoinvenBeanSwingJInternalFrameAdditional=detallemensajecorreoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleMensajeCorreoInven detallemensajecorreoinvenBean;
	public DetalleMensajeCorreoInvenConstantesFunciones detallemensajecorreoinvenConstantesFunciones;
	//public DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenReturnGeneral;
	
	//FK
	
	public MensajeCorreoInvenLogic mensajecorreoinvenLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	public UsuarioLogic usuarioLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleMensajeCorreoInven> detallemensajecorreoinvens;	
	//public List<DetalleMensajeCorreoInven> detallemensajecorreoinvensEliminados;
	//public List<DetalleMensajeCorreoInven> detallemensajecorreoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaCopiarDetalleMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaVerFormDetalleMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaOrdenDetalleMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMensajeCorreoInven=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDetalleMensajeCorreoInven() {
		return this.iIdNuevoDetalleMensajeCorreoInven;
	}

	public void setiIdNuevoDetalleMensajeCorreoInven(Long iIdNuevoDetalleMensajeCorreoInven) {
		this.iIdNuevoDetalleMensajeCorreoInven = iIdNuevoDetalleMensajeCorreoInven;
	}
	
	public Long getidDetalleMensajeCorreoInvenActual() {
		return this.idDetalleMensajeCorreoInvenActual;
	}

	public void setidDetalleMensajeCorreoInvenActual(Long idDetalleMensajeCorreoInvenActual) {
		this.idDetalleMensajeCorreoInvenActual = idDetalleMensajeCorreoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleMensajeCorreoInven getdetallemensajecorreoinven() {
		return this.detallemensajecorreoinven;
	}

	public void setdetallemensajecorreoinven(DetalleMensajeCorreoInven detallemensajecorreoinven) {
		this.detallemensajecorreoinven = detallemensajecorreoinven;
	}
	
	public DetalleMensajeCorreoInven getdetallemensajecorreoinvenAux() {
		return this.detallemensajecorreoinvenAux;
	}

	public void setdetallemensajecorreoinvenAux(DetalleMensajeCorreoInven detallemensajecorreoinvenAux) {
		this.detallemensajecorreoinvenAux = detallemensajecorreoinvenAux;
	}				
	
	public DetalleMensajeCorreoInven getdetallemensajecorreoinvenAnterior() {
		return this.detallemensajecorreoinvenAnterior;
	}

	public void setdetallemensajecorreoinvenAnterior(DetalleMensajeCorreoInven detallemensajecorreoinvenAnterior) {
		this.detallemensajecorreoinvenAnterior = detallemensajecorreoinvenAnterior;
	}	
	
	public DetalleMensajeCorreoInven getdetallemensajecorreoinvenTotales() {
		return this.detallemensajecorreoinvenTotales;
	}

	public void setdetallemensajecorreoinvenTotales(DetalleMensajeCorreoInven detallemensajecorreoinvenTotales) {
		this.detallemensajecorreoinvenTotales = detallemensajecorreoinvenTotales;
	}	
	
	public DetalleMensajeCorreoInven getdetallemensajecorreoinvenBean() {
		return this.detallemensajecorreoinvenBean;
	}

	public void setdetallemensajecorreoinvenBean(DetalleMensajeCorreoInven detallemensajecorreoinvenBean) {
		this.detallemensajecorreoinvenBean = detallemensajecorreoinvenBean;
	}	
	
	public DetalleMensajeCorreoInvenParameterReturnGeneral getdetallemensajecorreoinvenReturnGeneral() {
		return this.detallemensajecorreoinvenReturnGeneral;
	}

	public void setdetallemensajecorreoinvenReturnGeneral(DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenReturnGeneral) {
		this.detallemensajecorreoinvenReturnGeneral = detallemensajecorreoinvenReturnGeneral;
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

	public Long id_mensaje_correo_invenFK_IdMensajeCorreoInven=-1L;

	public Long getid_mensaje_correo_invenFK_IdMensajeCorreoInven() {
		return this.id_mensaje_correo_invenFK_IdMensajeCorreoInven;
	}

	public void setid_mensaje_correo_invenFK_IdMensajeCorreoInven(Long id_mensaje_correo_invenFK_IdMensajeCorreoInven) {
		this.id_mensaje_correo_invenFK_IdMensajeCorreoInven = id_mensaje_correo_invenFK_IdMensajeCorreoInven;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleMensajeCorreoInvenLogic getDetalleMensajeCorreoInvenLogic()	{		
		return detallemensajecorreoinvenLogic;
	}

	public void setDetalleMensajeCorreoInvenLogic(DetalleMensajeCorreoInvenLogic detallemensajecorreoinvenLogic) {
		this.detallemensajecorreoinvenLogic = detallemensajecorreoinvenLogic;
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
	
	public Boolean getIsEsNuevoDetalleMensajeCorreoInven() {
		return isEsNuevoDetalleMensajeCorreoInven;
	}

	public void setIsEsNuevoDetalleMensajeCorreoInven(Boolean isEsNuevoDetalleMensajeCorreoInven) {
		this.isEsNuevoDetalleMensajeCorreoInven = isEsNuevoDetalleMensajeCorreoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleMensajeCorreoInven() {
		return esParaAccionDesdeFormularioDetalleMensajeCorreoInven;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleMensajeCorreoInven(Boolean esParaAccionDesdeFormularioDetalleMensajeCorreoInven) {
		this.esParaAccionDesdeFormularioDetalleMensajeCorreoInven = esParaAccionDesdeFormularioDetalleMensajeCorreoInven;
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
	
	
	public void cargarCombosMensajeCorreoInvensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mensajecorreoinvensForeignKey=new ArrayList<MensajeCorreoInven>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MensajeCorreoInvenLogic mensajecorreoinvenLogic=new MensajeCorreoInvenLogic();

			mensajecorreoinvenLogic.getMensajeCorreoInvenDataAccess().setIsForForeingKeyData(true);

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getMensajeCorreoInvenDataAccess().setIsForForeingKeyData(true);

					mensajecorreoinvenLogic.getTodosMensajeCorreoInvensWithConnection(sFinalQuery,new Pagination());

					this.mensajecorreoinvensForeignKey=mensajecorreoinvenLogic.getMensajeCorreoInvens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMensajeCorreoInven(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mensajecorreoinvenLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidMensajeCorreoInvenActual());
					this.mensajecorreoinvensForeignKey.add(mensajecorreoinvenLogic.getMensajeCorreoInven());
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

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidEmpresaActual());
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

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidSucursalActual());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(detallemensajecorreoinvenSessionBean.getlidEmpleadoActual());
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

	
	
	public void setActualMensajeCorreoInvenForeignKey(Long idMensajeCorreoInvenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			MensajeCorreoInven  mensajecorreoinvenTemp=null;

			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensForeignKey) {
				if(mensajecorreoinvenAux.getId()!=null && mensajecorreoinvenAux.getId().equals(idMensajeCorreoInvenSeleccionado)) {
					mensajecorreoinvenTemp=mensajecorreoinvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mensajecorreoinvenTemp!=null) {

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setMensajeCorreoInven(mensajecorreoinvenTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					}
				} else {
					//jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(mensajecorreoinvenTemp!=null && jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven!=null) {
						jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					} else {
						if(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven!=null) {
							//jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
							if(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.getItemCount()>0) {
								jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setSelectedIndex(0);
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

	public String getActualMensajeCorreoInvenForeignKeyDescripcion(Long idMensajeCorreoInvenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			MensajeCorreoInven  mensajecorreoinvenTemp=null;

			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensForeignKey) {
				if(mensajecorreoinvenAux.getId()!=null && mensajecorreoinvenAux.getId().equals(idMensajeCorreoInvenSeleccionado)) {
					mensajecorreoinvenTemp=mensajecorreoinvenAux;
					break;
				}
			}


			sDescripcion=MensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMensajeCorreoInvenForeignKeyGenerico(Long idMensajeCorreoInvenSeleccionado,JComboBox jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			MensajeCorreoInven  mensajecorreoinvenTemp=null;

			for(MensajeCorreoInven mensajecorreoinvenAux:mensajecorreoinvensForeignKey) {
				if(mensajecorreoinvenAux.getId()!=null && mensajecorreoinvenAux.getId().equals(idMensajeCorreoInvenSeleccionado)) {
					mensajecorreoinvenTemp=mensajecorreoinvenAux;
					break;
				}
			}

			if(mensajecorreoinvenTemp!=null) {
				jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico.setSelectedItem(mensajecorreoinvenTemp);
			} else {
				if(jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven!=null) {
						jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven!=null) {
							//jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.getItemCount()>0) {
								jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.detallemensajecorreoinven!=null) {
						this.detallemensajecorreoinven.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico!=null && jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMensajeCorreoInvenForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			MensajeCorreoInven  mensajecorreoinvenAux=new MensajeCorreoInven();

			if(jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico==null) {
				mensajecorreoinvenAux=(MensajeCorreoInven)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				mensajecorreoinvenAux=(MensajeCorreoInven)jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(mensajecorreoinvenAux!=null && mensajecorreoinvenAux.getId()!=null) {
				detallemensajecorreoinven.setid_mensaje_correo_inven(mensajecorreoinvenAux.getId());
				detallemensajecorreoinven.setmensajecorreoinven_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinvenAux));
				detallemensajecorreoinven.setMensajeCorreoInven(mensajecorreoinvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallemensajecorreoinven.setid_empresa(empresaAux.getId());
				detallemensajecorreoinven.setempresa_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallemensajecorreoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallemensajecorreoinven.setid_sucursal(sucursalAux.getId());
				detallemensajecorreoinven.setsucursal_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallemensajecorreoinven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				detallemensajecorreoinven.setid_modulo(moduloAux.getId());
				detallemensajecorreoinven.setmodulo_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getModuloDescripcion(moduloAux));
				detallemensajecorreoinven.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				detallemensajecorreoinven.setid_usuario(usuarioAux.getId());
				detallemensajecorreoinven.setusuario_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				detallemensajecorreoinven.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(DetalleMensajeCorreoInven detallemensajecorreoinven,JComboBox jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoDetalleMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				detallemensajecorreoinven.setid_empleado(empleadoAux.getId());
				detallemensajecorreoinven.setempleado_descripcion(DetalleMensajeCorreoInvenConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				detallemensajecorreoinven.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMensajeCorreoInvensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMensajeCorreoInven=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.removeAllItems();

							for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvensForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.addItem(mensajecorreoinven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.removeAllItems();

							for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvensForeignKey) {
								this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.addItem(mensajecorreoinven);
							}
						}

						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUsuario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.addItem(usuario);
							}
						}

						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { 
					}

					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.addItem(empleado);
							}
						}

						if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameMensajeCorreoInvenForeignKey(MensajeCorreoInven mensajecorreoinven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinven);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setSelectedItem(mensajecorreoinven);
						} else {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven(this.detallemensajecorreoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(MensajeCorreoInven.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(this.detallemensajecorreoinvens);
			detallemensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleMensajeCorreoInvenParameterReturnGeneral getDetalleMensajeCorreoInvenParameterGeneral() {
		return this.detallemensajecorreoinvenParameterGeneral;
	}
	
	public void setDetalleMensajeCorreoInvenParameterGeneral(DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenParameterGeneral) {
		this.detallemensajecorreoinvenParameterGeneral = detallemensajecorreoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleMensajeCorreoInven() {
		return isPermisoTodoDetalleMensajeCorreoInven;
	}

	public void setIsPermisoTodoDetalleMensajeCorreoInven(Boolean isPermisoTodoDetalleMensajeCorreoInven) {
		this.isPermisoTodoDetalleMensajeCorreoInven = isPermisoTodoDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoNuevoDetalleMensajeCorreoInven() {
		return isPermisoNuevoDetalleMensajeCorreoInven;
	}

	public void setIsPermisoNuevoDetalleMensajeCorreoInven(Boolean isPermisoNuevoDetalleMensajeCorreoInven) {
		this.isPermisoNuevoDetalleMensajeCorreoInven = isPermisoNuevoDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoActualizarDetalleMensajeCorreoInven() {
		return isPermisoActualizarDetalleMensajeCorreoInven;
	}

	public void setIsPermisoActualizarDetalleMensajeCorreoInven(Boolean isPermisoActualizarDetalleMensajeCorreoInven) {
		this.isPermisoActualizarDetalleMensajeCorreoInven = isPermisoActualizarDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoEliminarDetalleMensajeCorreoInven() {
		return isPermisoEliminarDetalleMensajeCorreoInven;
	}

	public void setIsPermisoEliminarDetalleMensajeCorreoInven(Boolean isPermisoEliminarDetalleMensajeCorreoInven) {
		this.isPermisoEliminarDetalleMensajeCorreoInven = isPermisoEliminarDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleMensajeCorreoInven() {
		return isPermisoGuardarCambiosDetalleMensajeCorreoInven;
	}

	public void setIsPermisoGuardarCambiosDetalleMensajeCorreoInven(Boolean isPermisoGuardarCambiosDetalleMensajeCorreoInven) {
		this.isPermisoGuardarCambiosDetalleMensajeCorreoInven = isPermisoGuardarCambiosDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoConsultaDetalleMensajeCorreoInven() {
		return isPermisoConsultaDetalleMensajeCorreoInven;
	}

	public void setIsPermisoConsultaDetalleMensajeCorreoInven(Boolean isPermisoConsultaDetalleMensajeCorreoInven) {
		this.isPermisoConsultaDetalleMensajeCorreoInven = isPermisoConsultaDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoBusquedaDetalleMensajeCorreoInven() {
		return isPermisoBusquedaDetalleMensajeCorreoInven;
	}

	public void setIsPermisoBusquedaDetalleMensajeCorreoInven(Boolean isPermisoBusquedaDetalleMensajeCorreoInven) {
		this.isPermisoBusquedaDetalleMensajeCorreoInven = isPermisoBusquedaDetalleMensajeCorreoInven;
	}

	public Boolean getIsPermisoReporteDetalleMensajeCorreoInven() {
		return isPermisoReporteDetalleMensajeCorreoInven;
	}

	public void setIsPermisoReporteDetalleMensajeCorreoInven(Boolean isPermisoReporteDetalleMensajeCorreoInven) {
		this.isPermisoReporteDetalleMensajeCorreoInven = isPermisoReporteDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleMensajeCorreoInven() {
		return isPermisoPaginacionMedioDetalleMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionMedioDetalleMensajeCorreoInven(Boolean isPermisoPaginacionMedioDetalleMensajeCorreoInven) {
		this.isPermisoPaginacionMedioDetalleMensajeCorreoInven = isPermisoPaginacionMedioDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleMensajeCorreoInven() {
		return isPermisoPaginacionTodoDetalleMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionTodoDetalleMensajeCorreoInven(Boolean isPermisoPaginacionTodoDetalleMensajeCorreoInven) {
		this.isPermisoPaginacionTodoDetalleMensajeCorreoInven = isPermisoPaginacionTodoDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleMensajeCorreoInven() {
		return isPermisoPaginacionAltoDetalleMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionAltoDetalleMensajeCorreoInven(Boolean isPermisoPaginacionAltoDetalleMensajeCorreoInven) {
		this.isPermisoPaginacionAltoDetalleMensajeCorreoInven = isPermisoPaginacionAltoDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoCopiarDetalleMensajeCorreoInven() {
		return isPermisoCopiarDetalleMensajeCorreoInven;
	}

	public void setIsPermisoCopiarDetalleMensajeCorreoInven(Boolean isPermisoCopiarDetalleMensajeCorreoInven) {
		this.isPermisoCopiarDetalleMensajeCorreoInven = isPermisoCopiarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoVerFormDetalleMensajeCorreoInven() {
		return isPermisoVerFormDetalleMensajeCorreoInven;
	}

	public void setIsPermisoVerFormDetalleMensajeCorreoInven(Boolean isPermisoVerFormDetalleMensajeCorreoInven) {
		this.isPermisoVerFormDetalleMensajeCorreoInven = isPermisoVerFormDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoDuplicarDetalleMensajeCorreoInven() {
		return isPermisoDuplicarDetalleMensajeCorreoInven;
	}

	public void setIsPermisoDuplicarDetalleMensajeCorreoInven(Boolean isPermisoDuplicarDetalleMensajeCorreoInven) {
		this.isPermisoDuplicarDetalleMensajeCorreoInven = isPermisoDuplicarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoOrdenDetalleMensajeCorreoInven() {
		return isPermisoOrdenDetalleMensajeCorreoInven;
	}

	public void setIsPermisoOrdenDetalleMensajeCorreoInven(Boolean isPermisoOrdenDetalleMensajeCorreoInven) {
		this.isPermisoOrdenDetalleMensajeCorreoInven = isPermisoOrdenDetalleMensajeCorreoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven = isVisibilidadCeldaNuevoDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven = isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaCopiarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCopiarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaCopiarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven = isVisibilidadCeldaCopiarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaVerFormDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaVerFormDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaVerFormDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven = isVisibilidadCeldaVerFormDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaOrdenDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaOrdenDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaOrdenDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven = isVisibilidadCeldaOrdenDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven = isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaModificarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaModificarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaModificarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven = isVisibilidadCeldaModificarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaActualizarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaActualizarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaActualizarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven = isVisibilidadCeldaActualizarDetalleMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaEliminarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaEliminarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaEliminarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven = isVisibilidadCeldaEliminarDetalleMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaCancelarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCancelarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaCancelarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven = isVisibilidadCeldaCancelarDetalleMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven = isVisibilidadCeldaGuardarDetalleMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven = isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven;
	}
		
	public DetalleMensajeCorreoInvenSessionBean getdetallemensajecorreoinvenSessionBean() {
		return this.detallemensajecorreoinvenSessionBean;
	}
	
	public void setdetallemensajecorreoinvenSessionBean(DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean) {
		this.detallemensajecorreoinvenSessionBean=detallemensajecorreoinvenSessionBean;
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

	public Boolean getisVisibilidadFK_IdMensajeCorreoInven() {
		return this.isVisibilidadFK_IdMensajeCorreoInven;
	}

	public void setisVisibilidadFK_IdMensajeCorreoInven(Boolean isVisibilidadFK_IdMensajeCorreoInven) {
		this.isVisibilidadFK_IdMensajeCorreoInven=isVisibilidadFK_IdMensajeCorreoInven;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven)throws Exception {
		try {
			
				this.setActualParaGuardarMensajeCorreoInvenForeignKey(detallemensajecorreoinven,null);
				this.setActualParaGuardarEmpresaForeignKey(detallemensajecorreoinven,null);
				this.setActualParaGuardarSucursalForeignKey(detallemensajecorreoinven,null);
				this.setActualParaGuardarModuloForeignKey(detallemensajecorreoinven,null);
				this.setActualParaGuardarUsuarioForeignKey(detallemensajecorreoinven,null);
				this.setActualParaGuardarEmpleadoForeignKey(detallemensajecorreoinven,null);
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
	
	public void bugActualizarReferenciaActual(DetalleMensajeCorreoInven detallemensajecorreoinven,DetalleMensajeCorreoInven detallemensajecorreoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleMensajeCorreoInven(detallemensajecorreoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallemensajecorreoinvenAux.setId(detallemensajecorreoinven.getId());
		detallemensajecorreoinvenAux.setVersionRow(detallemensajecorreoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleMensajeCorreoInven();
		
			int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallemensajecorreoinvenValidator.getInvalidValues(this.detallemensajecorreoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallemensajecorreoinvenLogic.setDatosCliente(datosCliente);
			detallemensajecorreoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallemensajecorreoinvenAux=new  DetalleMensajeCorreoInven();
				
				detallemensajecorreoinvenAux.setIsNew(true);
				detallemensajecorreoinvenAux.setIsChanged(true);
				
				detallemensajecorreoinvenAux.setDetalleMensajeCorreoInvenOriginal(this.detallemensajecorreoinven);
				
				detallemensajecorreoinvenAux.setId(this.detallemensajecorreoinven.getId());	
				detallemensajecorreoinvenAux.setVersionRow(this.detallemensajecorreoinven.getVersionRow());	
				detallemensajecorreoinvenAux.setid_mensaje_correo_inven(this.detallemensajecorreoinven.getid_mensaje_correo_inven());	
				detallemensajecorreoinvenAux.setid_empresa(this.detallemensajecorreoinven.getid_empresa());	
				detallemensajecorreoinvenAux.setid_sucursal(this.detallemensajecorreoinven.getid_sucursal());	
				detallemensajecorreoinvenAux.setid_modulo(this.detallemensajecorreoinven.getid_modulo());	
				detallemensajecorreoinvenAux.setid_usuario(this.detallemensajecorreoinven.getid_usuario());	
				detallemensajecorreoinvenAux.setid_empleado(this.detallemensajecorreoinven.getid_empleado());	
				detallemensajecorreoinvenAux.setesta_activo(this.detallemensajecorreoinven.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvens();//WithConnection
						//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvenRelaciones(detallemensajecorreoinvenAux);//WithConnection
								//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallemensajecorreoinvenAux=new  DetalleMensajeCorreoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.detallemensajecorreoinven.getId()>=0)) {
						
					detallemensajecorreoinvenAux.setIsNew(false);
				}
				
				detallemensajecorreoinvenAux.setIsDeleted(false);
			
				detallemensajecorreoinvenAux.setId(this.detallemensajecorreoinven.getId());	
				detallemensajecorreoinvenAux.setVersionRow(this.detallemensajecorreoinven.getVersionRow());	
				detallemensajecorreoinvenAux.setid_mensaje_correo_inven(this.detallemensajecorreoinven.getid_mensaje_correo_inven());	
				detallemensajecorreoinvenAux.setid_empresa(this.detallemensajecorreoinven.getid_empresa());	
				detallemensajecorreoinvenAux.setid_sucursal(this.detallemensajecorreoinven.getid_sucursal());	
				detallemensajecorreoinvenAux.setid_modulo(this.detallemensajecorreoinven.getid_modulo());	
				detallemensajecorreoinvenAux.setid_usuario(this.detallemensajecorreoinven.getid_usuario());	
				detallemensajecorreoinvenAux.setid_empleado(this.detallemensajecorreoinven.getid_empleado());	
				detallemensajecorreoinvenAux.setesta_activo(this.detallemensajecorreoinven.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvens();//WithConnection
						//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvenRelaciones(detallemensajecorreoinvenAux);//WithConnection
								//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallemensajecorreoinven,detallemensajecorreoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallemensajecorreoinvenAux=new  DetalleMensajeCorreoInven();
				
				detallemensajecorreoinvenAux.setIsNew(false);
				detallemensajecorreoinvenAux.setIsChanged(false);
				
				detallemensajecorreoinvenAux.setIsDeleted(true);
				
				detallemensajecorreoinvenAux.setId(this.detallemensajecorreoinven.getId());	
				detallemensajecorreoinvenAux.setVersionRow(this.detallemensajecorreoinven.getVersionRow());	
				detallemensajecorreoinvenAux.setid_mensaje_correo_inven(this.detallemensajecorreoinven.getid_mensaje_correo_inven());	
				detallemensajecorreoinvenAux.setid_empresa(this.detallemensajecorreoinven.getid_empresa());	
				detallemensajecorreoinvenAux.setid_sucursal(this.detallemensajecorreoinven.getid_sucursal());	
				detallemensajecorreoinvenAux.setid_modulo(this.detallemensajecorreoinven.getid_modulo());	
				detallemensajecorreoinvenAux.setid_usuario(this.detallemensajecorreoinven.getid_usuario());	
				detallemensajecorreoinvenAux.setid_empleado(this.detallemensajecorreoinven.getid_empleado());	
				detallemensajecorreoinvenAux.setesta_activo(this.detallemensajecorreoinven.getesta_activo());	
				
				if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallemensajecorreoinvenAux.getId()>=0) {	
						this.detallemensajecorreoinvensEliminados.add(detallemensajecorreoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvens();//WithConnection
						//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvenRelaciones(detallemensajecorreoinvenAux);//WithConnection
								//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
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
							if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallemensajecorreoinvenAux,detallemensajecorreoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(this.detallemensajecorreoinvensEliminados);
					
					detallemensajecorreoinvenLogic.saveDetalleMensajeCorreoInvens();//WithConnection
					//detallemensajecorreoinvenLogic.getSetVersionRowDetalleMensajeCorreoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven();
				
				this.detallemensajecorreoinvensEliminados= new ArrayList<DetalleMensajeCorreoInven>();		
			}
			
			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Mensaje Correo Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallemensajecorreoinven=detallemensajecorreoinvenAux;
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
      		//this.finishProcessDetalleMensajeCorreoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleMensajeCorreoInven detallemensajecorreoinvenLocal) throws Exception {
		
		if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleMensajeCorreoInven detallemensajecorreoinvenLocal) throws Exception {	
		if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(MensajeCorreoInvenDetalleFormJInternalFrame.class)) {
				MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrameLocal=(MensajeCorreoInvenBeanSwingJInternalFrame) ((MensajeCorreoInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mensajecorreoinvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMensajeCorreoInven(mensajecorreoinvenBeanSwingJInternalFrameLocal.getmensajecorreoinven(),true);
				mensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarLista(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven,this.mensajecorreoinvensForeignKey);

				mensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarRelaciones(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven);

				detallemensajecorreoinvenLocal.setMensajeCorreoInven(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven);

				this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
				this.cargarCombosFrameMensajeCorreoInvensForeignKey("Formulario");
				this.setActualMensajeCorreoInvenForeignKey(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallemensajecorreoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallemensajecorreoinvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				detallemensajecorreoinvenLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				detallemensajecorreoinvenLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				detallemensajecorreoinvenLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleMensajeCorreoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallemensajecorreoinvenValidator.getInvalidValues(this.detallemensajecorreoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleMensajeCorreoInven detallemensajecorreoinven,List<DetalleMensajeCorreoInven> detallemensajecorreoinvens) throws Exception {
		try	{		
			DetalleMensajeCorreoInvenConstantesFunciones.actualizarLista(detallemensajecorreoinven,detallemensajecorreoinvens,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleMensajeCorreoInven detallemensajecorreoinven,List<DetalleMensajeCorreoInven> detallemensajecorreoinvens) throws Exception {
		try	{			
			DetalleMensajeCorreoInvenConstantesFunciones.actualizarSelectedLista(detallemensajecorreoinven,detallemensajecorreoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleMensajeCorreoInven> detallemensajecorreoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallemensajecorreoinvensLocal=this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallemensajecorreoinvensLocal=this.detallemensajecorreoinvens;
			}
			//ARCHITECTURE
		
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenLocal:detallemensajecorreoinvensLocal) {
				if(this.permiteMantenimiento(detallemensajecorreoinvenLocal) && detallemensajecorreoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleMensajeCorreoInvenConstantesFunciones.getDetalleMensajeCorreoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDMENSAJECORREOINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_empresaDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_sucursalDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_moduloDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_usuarioDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_empleadoDetalleMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleMensajeCorreoInvenConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelesta_activoDetalleMensajeCorreoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_mensaje_correo_invenDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_empresaDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_sucursalDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_moduloDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_usuarioDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelid_empleadoDetalleMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelesta_activoDetalleMensajeCorreoInven,"");
		
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
		this.iIdNuevoDetalleMensajeCorreoInven--;	
		
		
		this.detallemensajecorreoinvenAux=new DetalleMensajeCorreoInven();
		
		this.detallemensajecorreoinvenAux.setId(this.iIdNuevoDetalleMensajeCorreoInven);
		this.detallemensajecorreoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().add(this.detallemensajecorreoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallemensajecorreoinvens.add(this.detallemensajecorreoinvenAux);
		}
		//ARCHITECTURE
		
		this.detallemensajecorreoinven=this.detallemensajecorreoinvenAux;
		
		if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
		}
				
		//this.setDefaultControlesDetalleMensajeCorreoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleMensajeCorreoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleMensajeCorreoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinvenBean,this.detallemensajecorreoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			classes=DetalleMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfDetalleMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.procesarEventosDetalleMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.detallemensajecorreoinven,this.detallemensajecorreoinvenParameterGeneral,this.isEsNuevoDetalleMensajeCorreoInven,classes);//this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral,this.detallemensajecorreoinvenBean,false);
		
		if(this.detallemensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven());
		}
		
		if(this.detallemensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven(),classes);//this.detallemensajecorreoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleMensajeCorreoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarFormDetalleMensajeCorreoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
						
			if(detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();
			}
			
			this.actualizarVisualTableDatosDetalleMensajeCorreoInven();
			
			this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleMensajeCorreoInven(), this.getIndiceNuevoDetalleMensajeCorreoInven());
			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
						
			this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleMensajeCorreoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activaresta_activoDetalleMensajeCorreoInven);	
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenDetalleMensajeCorreoInven);//
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_empresaDetalleMensajeCorreoInven);//
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_sucursalDetalleMensajeCorreoInven);//
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_moduloDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_usuarioDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setEnabled(isHabilitar && this.detallemensajecorreoinvenConstantesFunciones.activarid_empleadoDetalleMensajeCorreoInven);
	};
	
	public void setDefaultControlesDetalleMensajeCorreoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleMensajeCorreoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(true);			
			this.detallemensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setVisible(true);
			
					
		} else {
			//this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(false);			
			this.detallemensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleMensajeCorreoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				if(detallemensajecorreoinvenAux.getId().equals(this.iIdNuevoDetalleMensajeCorreoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvens) {
				if(detallemensajecorreoinvenAux.getId().equals(this.iIdNuevoDetalleMensajeCorreoInven)) {
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
	
	public int getIndiceActualDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				if(detallemensajecorreoinvenAux.getId().equals(detallemensajecorreoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvens) {
				if(detallemensajecorreoinvenAux.getId().equals(detallemensajecorreoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				if(detallemensajecorreoinvenAux.getDetalleMensajeCorreoInvenOriginal().getId().equals(detallemensajecorreoinvenOriginal.getId())) {
					existe=true;
					detallemensajecorreoinvenOriginal.setId(detallemensajecorreoinvenAux.getId());
					detallemensajecorreoinvenOriginal.setVersionRow(detallemensajecorreoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvens) {
				if(detallemensajecorreoinvenAux.getDetalleMensajeCorreoInvenOriginal().getId().equals(detallemensajecorreoinvenOriginal.getId())) {
					existe=true;
					detallemensajecorreoinvenOriginal.setId(detallemensajecorreoinvenAux.getId());
					detallemensajecorreoinvenOriginal.setVersionRow(detallemensajecorreoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
		detallemensajecorreoinvenAux=new DetalleMensajeCorreoInven();
		
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
					if(detallemensajecorreoinvenAux.getId()<0) {
						detallemensajecorreoinvensAux.add(detallemensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoDetalleMensajeCorreoInven=0L;
				this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().removeAll(detallemensajecorreoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvens) {
					if(detallemensajecorreoinvenAux.getId()<0) {
						detallemensajecorreoinvensAux.add(detallemensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoDetalleMensajeCorreoInven=0L;
				this.detallemensajecorreoinvens.removeAll(detallemensajecorreoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleMensajeCorreoInven 
					&& this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()>0
					) {
					detallemensajecorreoinvenAux=this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().get(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size() - 1);
				
					if(detallemensajecorreoinvenAux.getId()<0) {
						this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().remove(detallemensajecorreoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleMensajeCorreoInven && this.detallemensajecorreoinvens.size()>0) {
					detallemensajecorreoinvenAux=this.detallemensajecorreoinvens.get(this.detallemensajecorreoinvens.size() - 1);
				
					if(detallemensajecorreoinvenAux.getId()<0) {
						this.detallemensajecorreoinvens.remove(detallemensajecorreoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallemensajecorreoinven.getId()<0) {
				this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().remove(this.detallemensajecorreoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallemensajecorreoinven.getId()<0) {
				this.detallemensajecorreoinvens.remove(this.detallemensajecorreoinven);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleMensajeCorreoInven(List<DetalleMensajeCorreoInven> detallemensajecorreoinvensAux) throws Exception {
		DetalleMensajeCorreoInvenConstantesFunciones.setEstadosInicialesDetalleMensajeCorreoInven(detallemensajecorreoinvensAux);
	}
	
	public void setEstadosInicialesDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinvenAux) throws Exception {
		DetalleMensajeCorreoInvenConstantesFunciones.setEstadosInicialesDetalleMensajeCorreoInven(detallemensajecorreoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleMensajeCorreoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleMensajeCorreoInvenActual()) {
				if(!this.isEsNuevoDetalleMensajeCorreoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleMensajeCorreoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleMensajeCorreoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Mensaje Correo Inven ?", "MANTENIMIENTO DE Detalle Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleMensajeCorreoInven detallemensajecorreoinven) throws Exception {
		DetalleMensajeCorreoInvenConstantesFunciones.seleccionarAsignar(this.detallemensajecorreoinven,detallemensajecorreoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleMensajeCorreoInven=this.isPermisoActualizarOriginalDetalleMensajeCorreoInven;
			
			
			this.seleccionarAsignar(detallemensajecorreoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleMensajeCorreoInvenConstantesFunciones.quitarEspaciosDetalleMensajeCorreoInven(this.detallemensajecorreoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallemensajecorreoinvenSessionBean.setsFuncionBusquedaRapida(this.detallemensajecorreoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleMensajeCorreoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleMensajeCorreoInven(esParaCancelar);				
				this.cancelarNuevoDetalleMensajeCorreoInven(esParaCancelar);								
			}
			
			this.detallemensajecorreoinven=new DetalleMensajeCorreoInven();
			
			this.inicializarDetalleMensajeCorreoInven();
			
			this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleMensajeCorreoInven() throws Exception {
		try {
			DetalleMensajeCorreoInvenConstantesFunciones.inicializarDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleMensajeCorreoInvens(String sAccionBusqueda,List<DetalleMensajeCorreoInven> detallemensajecorreoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleMensajeCorreoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleMensajeCorreoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Mensaje Correo Invenes");		
		parameters.put("busquedapor", DetalleMensajeCorreoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleMensajeCorreoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleMensajeCorreoInven=new JRBeanArrayDataSource(DetalleMensajeCorreoInvenJInternalFrame.TraerDetalleMensajeCorreoInvenBeans(detallemensajecorreoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleMensajeCorreoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleMensajeCorreoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleMensajeCorreoInvenBean.TraerDetalleMensajeCorreoInvenBeans(detallemensajecorreoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(null);
					//this.generarExcelReporteDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,detallemensajecorreoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleMensajeCorreoInven> detallemensajecorreoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleMensajeCorreoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleMensajeCorreoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleMensajeCorreoInven detallemensajecorreoinven : detallemensajecorreoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataDetalleMensajeCorreoInven("NORMAL",row,workbook,detallemensajecorreoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleMensajeCorreoInven(String sTipo,Row row,Workbook workbook) {
		
		DetalleMensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderDetalleMensajeCorreoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleMensajeCorreoInven> detallemensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleMensajeCorreoInven detallemensajecorreoinven : detallemensajecorreoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.getDetalleMensajeCorreoInvenDescripcion(detallemensajecorreoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getmensajecorreoinven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallemensajecorreoinven.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detallemensajecorreoinven.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleMensajeCorreoInven> detallemensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleMensajeCorreoInven> detallemensajecorreoinvensRespaldo=null;
		
		classes=DetalleMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfDetalleMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallemensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
		this.detallemensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
		this.detallemensajecorreoinvenLogic.setIsConDeep(true);
		
		detallemensajecorreoinvensRespaldo=this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens();
		
		this.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(detallemensajecorreoinvensParaReportes);	
		this.detallemensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallemensajecorreoinvensParaReportes=this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens();
		this.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(detallemensajecorreoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleMensajeCorreoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleMensajeCorreoInven detallemensajecorreoinven : detallemensajecorreoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleMensajeCorreoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataDetalleMensajeCorreoInven("NORMAL",row,workbook,detallemensajecorreoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.getDetalleMensajeCorreoInvenDescripcion(detallemensajecorreoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleMensajeCorreoInven() throws Exception {		
		this.startProcessDetalleMensajeCorreoInven(true);
	}
	
	public void startProcessDetalleMensajeCorreoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleMensajeCorreoInven ,this.jPanelParametrosReportesDetalleMensajeCorreoInven, this.jScrollPanelDatosDetalleMensajeCorreoInven,this.jPanelPaginacionDetalleMensajeCorreoInven, this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven, this.jPanelAccionesDetalleMensajeCorreoInven,this.jPanelAccionesFormularioDetalleMensajeCorreoInven,this.jmenuBarDetalleMensajeCorreoInven,this.jmenuBarDetalleDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleMensajeCorreoInven=this.jTabbedPaneBusquedasDetalleMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesDetalleMensajeCorreoInven=this.jPanelParametrosReportesDetalleMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosDetalleMensajeCorreoInven=this.jScrollPanelDatosDetalleMensajeCorreoInven;
		final JTable jTableDatosDetalleMensajeCorreoInven=this.jTableDatosDetalleMensajeCorreoInven;		
		final JPanel jPanelPaginacionDetalleMensajeCorreoInven=this.jPanelPaginacionDetalleMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionDetalleMensajeCorreoInven=this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven;
		final JPanel jPanelAccionesDetalleMensajeCorreoInven=this.jPanelAccionesDetalleMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarDetalleMensajeCorreoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelCamposDetalleMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelAccionesFormularioDetalleMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposDetalleMensajeCorreoInven=jPanelCamposAuxiliarDetalleMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioDetalleMensajeCorreoInven=jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarDetalleMensajeCorreoInven=this.jmenuBarDetalleMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleMensajeCorreoInven=this.jTtoolBarDetalleMensajeCorreoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jmenuBarDetalleDetalleMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTtoolBarDetalleDetalleMensajeCorreoInven;
		}
		
		final JMenuBar jmenuBarDetalleDetalleMensajeCorreoInven=jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleDetalleMensajeCorreoInven=jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosDetalleMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposDetalleMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarDetalleMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleMensajeCorreoInven ,jPanelParametrosReportesDetalleMensajeCorreoInven,jTableDatosDetalleMensajeCorreoInven, /*jScrollPanelDatosDetalleMensajeCorreoInven,*/jPanelCamposDetalleMensajeCorreoInven,jPanelPaginacionDetalleMensajeCorreoInven, /*jScrollPanelDatosEdicionDetalleMensajeCorreoInven,*/ jPanelAccionesDetalleMensajeCorreoInven,jPanelAccionesFormularioDetalleMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jmenuBarDetalleDetalleMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven,jTtoolBarDetalleDetalleMensajeCorreoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleMensajeCorreoInven ,jPanelParametrosReportesDetalleMensajeCorreoInven, jScrollPanelDatosDetalleMensajeCorreoInven,jPanelPaginacionDetalleMensajeCorreoInven, jScrollPanelDatosEdicionDetalleMensajeCorreoInven, jPanelAccionesDetalleMensajeCorreoInven,jPanelAccionesFormularioDetalleMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jmenuBarDetalleDetalleMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven,jTtoolBarDetalleDetalleMensajeCorreoInven);
						
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
	
	public void finishProcessDetalleMensajeCorreoInven() {// throws Exception 
		this.finishProcessDetalleMensajeCorreoInven(true);
	}
	
	public void finishProcessDetalleMensajeCorreoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleMensajeCorreoInven ,this.jPanelParametrosReportesDetalleMensajeCorreoInven, this.jScrollPanelDatosDetalleMensajeCorreoInven,this.jPanelPaginacionDetalleMensajeCorreoInven, this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven, this.jPanelAccionesDetalleMensajeCorreoInven,this.jPanelAccionesFormularioDetalleMensajeCorreoInven,this.jmenuBarDetalleMensajeCorreoInven,this.jmenuBarDetalleDetalleMensajeCorreoInven,this.jTtoolBarDetalleMensajeCorreoInven,this.jTtoolBarDetalleDetalleMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleMensajeCorreoInven=this.jTabbedPaneBusquedasDetalleMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesDetalleMensajeCorreoInven=this.jPanelParametrosReportesDetalleMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosDetalleMensajeCorreoInven=this.jScrollPanelDatosDetalleMensajeCorreoInven;
		final JTable jTableDatosDetalleMensajeCorreoInven=this.jTableDatosDetalleMensajeCorreoInven;		
		final JPanel jPanelPaginacionDetalleMensajeCorreoInven=this.jPanelPaginacionDetalleMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionDetalleMensajeCorreoInven=this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven;
		final JPanel jPanelAccionesDetalleMensajeCorreoInven=this.jPanelAccionesDetalleMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarDetalleMensajeCorreoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelCamposDetalleMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelAccionesFormularioDetalleMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposDetalleMensajeCorreoInven=jPanelCamposAuxiliarDetalleMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioDetalleMensajeCorreoInven=jPanelAccionesFormularioAuxiliarDetalleMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarDetalleMensajeCorreoInven=this.jmenuBarDetalleMensajeCorreoInven;		
		final JToolBar jTtoolBarDetalleMensajeCorreoInven=this.jTtoolBarDetalleMensajeCorreoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jmenuBarDetalleDetalleMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTtoolBarDetalleDetalleMensajeCorreoInven;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleMensajeCorreoInven=jmenuBarDetalleAuxiliarDetalleMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleDetalleMensajeCorreoInven=jTtoolBarDetalleAuxiliarDetalleMensajeCorreoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosDetalleMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposDetalleMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarDetalleMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleMensajeCorreoInven ,jPanelParametrosReportesDetalleMensajeCorreoInven, jTableDatosDetalleMensajeCorreoInven,/*jScrollPanelDatosDetalleMensajeCorreoInven,*/jPanelCamposDetalleMensajeCorreoInven,jPanelPaginacionDetalleMensajeCorreoInven, /*jScrollPanelDatosEdicionDetalleMensajeCorreoInven,*/ jPanelAccionesDetalleMensajeCorreoInven,jPanelAccionesFormularioDetalleMensajeCorreoInven,jmenuBarDetalleMensajeCorreoInven,jmenuBarDetalleDetalleMensajeCorreoInven,jTtoolBarDetalleMensajeCorreoInven,jTtoolBarDetalleDetalleMensajeCorreoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleMensajeCorreoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleMensajeCorreoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallemensajecorreoinvenConstantesFunciones.getsFinalQueryDetalleMensajeCorreoInven();
		String  finalQueryPaginacionTodos=this.detallemensajecorreoinvenConstantesFunciones.getsFinalQueryDetalleMensajeCorreoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesNoDetalleMensajeCorreoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesDetalleMensajeCorreoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleMensajeCorreoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallemensajecorreoinvensEliminados= new ArrayList<DetalleMensajeCorreoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleMensajeCorreoInven();
		
				///*DetalleMensajeCorreoInvenSessionBean*/this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			
			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
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
					this.iNumeroPaginacion=DetalleMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleMensajeCorreoInvenConstantesFunciones.getClassesForeignKeysOfDetalleMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallemensajecorreoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallemensajecorreoinvensAux= new ArrayList<DetalleMensajeCorreoInven>();
			
				
			detallemensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
			detallemensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
			detallemensajecorreoinvenLogic.setIsConDeep(true);
			
			
			detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallemensajecorreoinvenLogic.getTodosDetalleMensajeCorreoInvens(finalQueryGlobal,pagination);
					
					//detallemensajecorreoinvenLogic.getTodosDetalleMensajeCorreoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null|| detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallemensajecorreoinvensAux= new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux= new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallemensajecorreoinvenLogic.getTodosDetalleMensajeCorreoInvens(finalQueryGlobal+"",this.pagination);												
							
							//detallemensajecorreoinvenLogic.getTodosDetalleMensajeCorreoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());					
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleMensajeCorreoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleMensajeCorreoInven=this.idActual;
				
				} else if(this.idDetalleMensajeCorreoInvenActual!=null && this.idDetalleMensajeCorreoInvenActual!=0L) {
					idDetalleMensajeCorreoInven=idDetalleMensajeCorreoInvenActual;
				}
				
					
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndicePorId(idDetalleMensajeCorreoInven);
				
				this.detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallemensajecorreoinvenLogic.getEntity(idDetalleMensajeCorreoInven);
					
					//detallemensajecorreoinvenLogic.getEntityWithConnection(idDetalleMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().add(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
					this.detallemensajecorreoinvens.add(detallemensajecorreoinven);
				}
				
				if(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdEmpleado",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdEmpleado",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdEmpresa",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdEmpresa",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMensajeCorreoInven")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven(finalQueryGlobal,pagination,id_mensaje_correo_invenFK_IdMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven(finalQueryGlobal,pagination,id_mensaje_correo_invenFK_IdMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdMensajeCorreoInven",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdMensajeCorreoInven",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdModulo",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdModulo",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdSucursal",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdSucursal",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()==null||detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallemensajecorreoinvens==null|| detallemensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
						detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvensAux=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvensAux.addAll(detallemensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdUsuario",detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleMensajeCorreoInvens("FK_IdUsuario",detallemensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(new ArrayList<DetalleMensajeCorreoInven>());
						detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().addAll(detallemensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvens=new ArrayList<DetalleMensajeCorreoInven>();
							detallemensajecorreoinvens.addAll(detallemensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleMensajeCorreoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleMensajeCorreoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallemensajecorreoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallemensajecorreoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleMensajeCorreoInven detallemensajecorreoinven) {
		Boolean permite=true;
		
		if(this.detallemensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleMensajeCorreoInvenConstantesFunciones.getOrderByListaDetalleMensajeCorreoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleMensajeCorreoInvenConstantesFunciones.getOrderByListaDetalleMensajeCorreoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				if(detallemensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detallemensajecorreoinvenTotales=detallemensajecorreoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinven:this.detallemensajecorreoinvens) {
				if(detallemensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detallemensajecorreoinvenTotales=detallemensajecorreoinven;
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
			this.detallemensajecorreoinvenAux=new DetalleMensajeCorreoInven();
			this.detallemensajecorreoinvenAux.setsType(Constantes2.S_TOTALES);
			this.detallemensajecorreoinvenAux.setIsNew(false);
			this.detallemensajecorreoinvenAux.setIsChanged(false);
			this.detallemensajecorreoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaDetalleMensajeCorreoInven(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.detallemensajecorreoinvenAux);
				
				this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().add(this.detallemensajecorreoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaDetalleMensajeCorreoInven(this.detallemensajecorreoinvens,this.detallemensajecorreoinvenAux);
				
				this.detallemensajecorreoinvens.add(this.detallemensajecorreoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallemensajecorreoinvenTotales=new DetalleMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().remove(detallemensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallemensajecorreoinvens.remove(detallemensajecorreoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallemensajecorreoinvenTotales=new DetalleMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				if(detallemensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detallemensajecorreoinvenTotales=detallemensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaDetalleMensajeCorreoInven(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),detallemensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleMensajeCorreoInven detallemensajecorreoinven:this.detallemensajecorreoinvens) {
				if(detallemensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detallemensajecorreoinvenTotales=detallemensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaDetalleMensajeCorreoInven(this.detallemensajecorreoinvens,detallemensajecorreoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleMensajeCorreoInvensFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdMensajeCorreoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleMensajeCorreoInvensFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven(String sFinalQuery,Long id_mensaje_correo_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven(sFinalQuery,this.pagination,id_mensaje_correo_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleMensajeCorreoInvensFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvensFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDetalleMensajeCorreoInven() {
		this.isPermisoTodoDetalleMensajeCorreoInven=false;
		this.isPermisoNuevoDetalleMensajeCorreoInven=false;
		this.isPermisoActualizarDetalleMensajeCorreoInven=false;
		this.isPermisoActualizarOriginalDetalleMensajeCorreoInven=false;
		this.isPermisoEliminarDetalleMensajeCorreoInven=false;
		this.isPermisoGuardarCambiosDetalleMensajeCorreoInven=false;
		this.isPermisoConsultaDetalleMensajeCorreoInven=false;
		this.isPermisoBusquedaDetalleMensajeCorreoInven=false;
		this.isPermisoReporteDetalleMensajeCorreoInven=false;		
		this.isPermisoOrdenDetalleMensajeCorreoInven=false;		
		this.isPermisoPaginacionMedioDetalleMensajeCorreoInven=false;		
		this.isPermisoPaginacionAltoDetalleMensajeCorreoInven=false;
		this.isPermisoPaginacionTodoDetalleMensajeCorreoInven=false;
		this.isPermisoCopiarDetalleMensajeCorreoInven=false;		
		this.isPermisoVerFormDetalleMensajeCorreoInven=false;		
		this.isPermisoDuplicarDetalleMensajeCorreoInven=false;		
		this.isPermisoOrdenDetalleMensajeCorreoInven=false;		
	}
	
	public void setPermisosUsuarioDetalleMensajeCorreoInven(Boolean isPermiso) {
		this.isPermisoTodoDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoConsultaDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoBusquedaDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoReporteDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionMedioDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionAltoDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionTodoDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoCopiarDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoVerFormDetalleMensajeCorreoInven=isPermiso;		
		this.isPermisoDuplicarDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenDetalleMensajeCorreoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleMensajeCorreoInven(Boolean isPermiso) {
		//this.isPermisoTodoDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarDetalleMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosDetalleMensajeCorreoInven=isPermiso;
		//this.isPermisoConsultaDetalleMensajeCorreoInven=isPermiso;
		//this.isPermisoBusquedaDetalleMensajeCorreoInven=isPermiso;
		//this.isPermisoReporteDetalleMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenDetalleMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleMensajeCorreoInven=isPermiso;		
		//this.isPermisoCopiarDetalleMensajeCorreoInven=isPermiso;		
		//this.isPermisoDuplicarDetalleMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenDetalleMensajeCorreoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleMensajeCorreoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleMensajeCorreoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleMensajeCorreoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleMensajeCorreoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleMensajeCorreoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleMensajeCorreoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleMensajeCorreoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleMensajeCorreoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleMensajeCorreoInven=this.isPermisoActualizarDetalleMensajeCorreoInven;
			this.isPermisoEliminarDetalleMensajeCorreoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleMensajeCorreoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleMensajeCorreoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleMensajeCorreoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleMensajeCorreoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleMensajeCorreoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleMensajeCorreoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleMensajeCorreoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleMensajeCorreoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleMensajeCorreoInven.setToolTipText(this.jTableDatosDetalleMensajeCorreoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleMensajeCorreoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleMensajeCorreoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleMensajeCorreoInven() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleMensajeCorreoInvenListas()throws Exception {
		try	{						
			
				this.mensajecorreoinvensForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleMensajeCorreoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleMensajeCorreoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyMensajeCorreoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyMensajeCorreoInvenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mensajecorreoinvensForeignKey==null||this.mensajecorreoinvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesMensajeCorreoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MensajeCorreoInvenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MensajeCorreoInvenConstantesFunciones.SFINALQUERY;

				this.cargarCombosMensajeCorreoInvensForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenReturnGeneral=new DetalleMensajeCorreoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalMensajeCorreoInven="";

				if(((this.mensajecorreoinvensForeignKey==null||this.mensajecorreoinvensForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesMensajeCorreoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMensajeCorreoInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MensajeCorreoInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalMensajeCorreoInven=Funciones.GetFinalQueryAppend(finalQueryGlobalMensajeCorreoInven, "");
						finalQueryGlobalMensajeCorreoInven+=MensajeCorreoInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMensajeCorreoInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMensajeCorreoInven=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidMensajeCorreoInvenActual();
					}
				} else {
					finalQueryGlobalMensajeCorreoInven="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_empresaDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_empresaDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_sucursalDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_sucursalDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_moduloDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_moduloDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_usuarioDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_usuarioDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.detallemensajecorreoinvenConstantesFunciones.cargarid_empleadoDetalleMensajeCorreoInven)
					 || (this.esRecargarFks && this.detallemensajecorreoinvenConstantesFunciones.cargarid_empleadoDetalleMensajeCorreoInven)) {

					if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+detallemensajecorreoinvenSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.cargarCombosLoteForeignKeyDetalleMensajeCorreoInven(finalQueryGlobalMensajeCorreoInven,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo,finalQueryGlobalUsuario,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalMensajeCorreoInven.equals("NONE")) {
				this.mensajecorreoinvensForeignKey=detallemensajecorreoinvenReturnGeneral.getmensajecorreoinvensForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallemensajecorreoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallemensajecorreoinvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=detallemensajecorreoinvenReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=detallemensajecorreoinvenReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=detallemensajecorreoinvenReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleMensajeCorreoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyMensajeCorreoInven()throws Exception {
		try {
			if(this.detallemensajecorreoinvenSessionBean==null) {
				this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
			}

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {
				MensajeCorreoInven mensajecorreoinven=new MensajeCorreoInven();
				MensajeCorreoInvenConstantesFunciones.setMensajeCorreoInvenDescripcion(mensajecorreoinven,Constantes.SMENSAJE_ESCOJA_OPCION);
				mensajecorreoinven.setId(null);

				if(!MensajeCorreoInvenConstantesFunciones.ExisteEnLista(this.mensajecorreoinvensForeignKey,mensajecorreoinven,true)) {

					this.mensajecorreoinvensForeignKey.add(0,mensajecorreoinven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.detallemensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleMensajeCorreoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleMensajeCorreoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleMensajeCorreoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven)throws Exception {	
		try {
			
			this.setActualMensajeCorreoInvenForeignKey(detallemensajecorreoinven.getid_mensaje_correo_inven(),false,"Formulario");
			this.setActualEmpleadoForeignKey(detallemensajecorreoinven.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleMensajeCorreoInven()throws Exception {	
		try {
			
			this.setActualMensajeCorreoInvenForeignKey(this.detallemensajecorreoinvenConstantesFunciones.getid_mensaje_correo_inven(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.detallemensajecorreoinvenConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleMensajeCorreoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleMensajeCorreoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleMensajeCorreoInven()throws Exception {
		try {
			

			this.cargarCombosFrameMensajeCorreoInvensForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameMensajeCorreoInvensForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleMensajeCorreoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean(); 
		this.detallemensajecorreoinvenConstantesFunciones=new DetalleMensajeCorreoInvenConstantesFunciones(); 
		this.detallemensajecorreoinvenBean=new DetalleMensajeCorreoInven();//(this.detallemensajecorreoinvenConstantesFunciones); 		
		this.detallemensajecorreoinvenReturnGeneral=new DetalleMensajeCorreoInvenParameterReturnGeneral(); 
		
		this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleMensajeCorreoInven(true);
			
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
			
			this.detallemensajecorreoinvenConstantesFunciones=new DetalleMensajeCorreoInvenConstantesFunciones(); 
			this.detallemensajecorreoinvenBean=new DetalleMensajeCorreoInven();//this.detallemensajecorreoinvenConstantesFunciones); 			
			this.detallemensajecorreoinvenReturnGeneral=new DetalleMensajeCorreoInvenParameterReturnGeneral(); 
		
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Mensaje Correo Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detallemensajecorreoinven=new DetalleMensajeCorreoInven();
			this.detallemensajecorreoinvens = new ArrayList<DetalleMensajeCorreoInven>();
			this.detallemensajecorreoinvensAux = new ArrayList<DetalleMensajeCorreoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic=new DetalleMensajeCorreoInvenLogic();
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.detallemensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallemensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven);	
					}
					
					if(this.jInternalFrameImportacionDetalleMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleMensajeCorreoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleMensajeCorreoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven);
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setVisible(false);
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven);
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleMensajeCorreoInven);
					this.jInternalFrameImportacionDetalleMensajeCorreoInven.setVisible(false);
					this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleMensajeCorreoInven);
					this.jInternalFrameOrderByDetalleMensajeCorreoInven.setVisible(false);
					this.jInternalFrameOrderByDetalleMensajeCorreoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleMensajeCorreoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallemensajecorreoinvenReturnGeneral=new DetalleMensajeCorreoInvenParameterReturnGeneral();
			
			this.detallemensajecorreoinvenParameterGeneral=new DetalleMensajeCorreoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMensajeCorreoInven=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleMensajeCorreoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleMensajeCorreoInven(false);
			
			this.setPermisosUsuarioDetalleMensajeCorreoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleMensajeCorreoInvenClasesRelacionadas();
			}
			
			if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleMensajeCorreoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleMensajeCorreoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleMensajeCorreoInven();
			}
			
			if(!this.isPermisoBusquedaDetalleMensajeCorreoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleMensajeCorreoInven,this.isPermisoPaginacionMedioDetalleMensajeCorreoInven,this.isPermisoPaginacionTodoDetalleMensajeCorreoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarDetalleMensajeCorreoInven());
				
				this.tiposColumnasSelect=DetalleMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarDetalleMensajeCorreoInven(true);
				
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
			//if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleMensajeCorreoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleMensajeCorreoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleMensajeCorreoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleMensajeCorreoInven() ;
			
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
			
			this.mensajecorreoinvenLogic=new MensajeCorreoInvenLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.moduloLogic=new ModuloLogic();
			this.usuarioLogic=new UsuarioLogic();
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
				detallemensajecorreoinvenImplementable= (DetalleMensajeCorreoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallemensajecorreoinvenImplementableHome= (DetalleMensajeCorreoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallemensajecorreoinvens= new ArrayList<DetalleMensajeCorreoInven>();
			this.detallemensajecorreoinvensEliminados= new ArrayList<DetalleMensajeCorreoInven>();
						
			this.isEsNuevoDetalleMensajeCorreoInven=false;
			this.esParaAccionDesdeFormularioDetalleMensajeCorreoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.mensajecorreoinvensForeignKey=new ArrayList<MensajeCorreoInven>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleMensajeCorreoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleMensajeCorreoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleMensajeCorreoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleMensajeCorreoInven();
			}
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleMensajeCorreoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleMensajeCorreoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleMensajeCorreoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleMensajeCorreoInven")) {
				iIndex=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleMensajeCorreoInven();	
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
	
	public void cargarCombosForeignKeyDetalleMensajeCorreoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleMensajeCorreoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleMensajeCorreoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleMensajeCorreoInven();
		
		this.cargarCombosFrameForeignKeyDetalleMensajeCorreoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleMensajeCorreoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleMensajeCorreoInven();
		}
	}
	
	

	public void cargarCombosForeignKeyMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMensajeCorreoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
				this.cargarCombosFrameMensajeCorreoInvensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMensajeCorreoInven(this.mensajecorreoinvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUsuario(this.usuariosForeignKey);

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
	
	public void jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			
			if(jTableDatosDetalleMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosDetalleMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosDetalleMensajeCorreoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleMensajeCorreoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleMensajeCorreoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(true);			
			//this.detallemensajecorreoinven=new DetalleMensajeCorreoInven();
			//this.detallemensajecorreoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven() ;
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleMensajeCorreoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallemensajecorreoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);				
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleMensajeCorreoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRows().length;			
			}
			
			detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleMensajeCorreoInven--;			
				//DetalleMensajeCorreoInven detallemensajecorreoinvenAux= new DetalleMensajeCorreoInven();			
				//detallemensajecorreoinvenAux.setId(this.iIdNuevoDetalleMensajeCorreoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleMensajeCorreoInven detallemensajecorreoinvenOrigen=new DetalleMensajeCorreoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenOrigen : detallemensajecorreoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallemensajecorreoinvenOrigen =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallemensajecorreoinvenOrigen =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleMensajeCorreoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallemensajecorreoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleMensajeCorreoInven(detallemensajecorreoinvenOrigen,this.detallemensajecorreoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().add(this.detallemensajecorreoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinvens.add(this.detallemensajecorreoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
				
				this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleMensajeCorreoInven(), this.getIndiceNuevoDetalleMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosDetalleMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();									
		
			DetalleMensajeCorreoInven detallemensajecorreoinvenOrigen=new DetalleMensajeCorreoInven();
			DetalleMensajeCorreoInven detallemensajecorreoinvenDestino=new DetalleMensajeCorreoInven();
				
			detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallemensajecorreoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleMensajeCorreoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenOrigen =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallemensajecorreoinvenOrigen =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallemensajecorreoinvenDestino =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallemensajecorreoinvenDestino =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallemensajecorreoinvenOrigen =detallemensajecorreoinvensSeleccionados.get(0);
				detallemensajecorreoinvenDestino =detallemensajecorreoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleMensajeCorreoInven(detallemensajecorreoinvenOrigen,detallemensajecorreoinvenDestino,true,false);
				
				detallemensajecorreoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallemensajecorreoinvenDestino,detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallemensajecorreoinvenDestino,detallemensajecorreoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
				
				//this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleMensajeCorreoInven(), this.getIndiceNuevoDetalleMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosDetalleMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleMensajeCorreoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelAccionesDetalleMensajeCorreoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleMensajeCorreoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleMensajeCorreoInven();
			
			this.abrirFrameOrderByDetalleMensajeCorreoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleMensajeCorreoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleMensajeCorreoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSize(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.iWidthFormulario,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jContentPaneDetalleDetalleMensajeCorreoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jContentPaneDetalleDetalleMensajeCorreoInven.getWidth(),DetalleMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jContentPaneDetalleDetalleMensajeCorreoInven.getWidth(),DetalleMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jContentPaneDetalleDetalleMensajeCorreoInven.getWidth(),DetalleMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleMensajeCorreoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMensajeCorreoInven,false,this);
				} else {
					this.jInternalFrameOrderByDetalleMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleMensajeCorreoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleMensajeCorreoInven);
				this.jInternalFrameOrderByDetalleMensajeCorreoInven.setVisible(false);
				this.jInternalFrameOrderByDetalleMensajeCorreoInven.setSelected(false);
				
				this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleMensajeCorreoInven"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleMensajeCorreoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleMensajeCorreoInven==null) {
				
				this.jInternalFrameImportacionDetalleMensajeCorreoInven=new ImportacionJInternalFrame(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleMensajeCorreoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleMensajeCorreoInven);
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.setVisible(false);
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSelected(false);


				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleMensajeCorreoInven"));
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleMensajeCorreoInven"));
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleMensajeCorreoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven==null) {
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven=new ReporteDinamicoJInternalFrame(DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven);
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleMensajeCorreoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleMensajeCorreoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleMensajeCorreoInven);
			
	       	this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.dispose();
			//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameOrderByDetalleMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameOrderByDetalleMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleMensajeCorreoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameImportacionDetalleMensajeCorreoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleMensajeCorreoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleMensajeCorreoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(true);
			//this.isEsNuevoDetalleMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false) ;
			
			if(detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleMensajeCorreoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleMensajeCorreoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleMensajeCorreoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(true);
			//this.isEsNuevoDetalleMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallemensajecorreoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false) ;
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleMensajeCorreoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaMensajeCorreoInven(List<MensajeCorreoInven> mensajecorreoinvensForeignKey)throws Exception{
		TableColumn tableColumnMensajeCorreoInven=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN));
		TableCellEditor tableCellEditorMensajeCorreoInven =tableColumnMensajeCorreoInven.getCellEditor();

		MensajeCorreoInvenTableCell mensajecorreoinvenTableCellFk=(MensajeCorreoInvenTableCell)tableCellEditorMensajeCorreoInven;

		if(mensajecorreoinvenTableCellFk!=null) {
			mensajecorreoinvenTableCellFk.setmensajecorreoinvensForeignKey(mensajecorreoinvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mensajecorreoinvenTableCellFk.setRowActual(intSelectedRow);
			//mensajecorreoinvenTableCellFk.setmensajecorreoinvensForeignKeyActual(mensajecorreoinvensForeignKey);
		//}


		if(mensajecorreoinvenTableCellFk!=null) {
			mensajecorreoinvenTableCellFk.RecargarMensajeCorreoInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
				
	
	public void recargarComboTablaUsuario(List<Usuario> usuariosForeignKey)throws Exception{
		TableColumn tableColumnUsuario=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO));
		TableCellEditor tableCellEditorUsuario =tableColumnUsuario.getCellEditor();

		UsuarioTableCell usuarioTableCellFk=(UsuarioTableCell)tableCellEditorUsuario;

		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.setusuariosForeignKey(usuariosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//usuarioTableCellFk.setRowActual(intSelectedRow);
			//usuarioTableCellFk.setusuariosForeignKeyActual(usuariosForeignKey);
		//}


		if(usuarioTableCellFk!=null) {
			usuarioTableCellFk.RecargarUsuariosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleMensajeCorreoInven(false);
			
			//if(!this.isEsNuevoDetalleMensajeCorreoInven) {								
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				
			}
			
			if(this.permiteMantenimiento(this.detallemensajecorreoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleMensajeCorreoInven=true;
					this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
					this.isEsNuevoDetalleMensajeCorreoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleMensajeCorreoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleMensajeCorreoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(false);
			
												
				
				if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleMensajeCorreoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,detallemensajecorreoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallemensajecorreoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.detallemensajecorreoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.detallemensajecorreoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallemensajecorreoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleMensajeCorreoInvenModel) this.jTableDatosDetalleMensajeCorreoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleMensajeCorreoInven=true;
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
				this.isEsNuevoDetalleMensajeCorreoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(false);
				
				
				
				if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleMensajeCorreoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosDetalleMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosDetalleMensajeCorreoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleMensajeCorreoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(false) ;
			
			this.isEsNuevoDetalleMensajeCorreoInven=false;
			
			if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleMensajeCorreoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				
				//SI ES MANUAL
				if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleMensajeCorreoInven--;			
			//DetalleMensajeCorreoInven detallemensajecorreoinvenAux= new DetalleMensajeCorreoInven();			
			//detallemensajecorreoinvenAux.setId(this.iIdNuevoDetalleMensajeCorreoInven);
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleMensajeCorreoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
			
			this.detallemensajecorreoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().add(this.detallemensajecorreoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallemensajecorreoinvens.add(this.detallemensajecorreoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			
			this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleMensajeCorreoInven(), this.getIndiceNuevoDetalleMensajeCorreoInven());
			
			int iLastRow =  this.jTableDatosDetalleMensajeCorreoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleMensajeCorreoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleMensajeCorreoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();
			}
			
			//this.abrirFrameTreeDetalleMensajeCorreoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Mensaje Correo InvenES ?", "MANTENIMIENTO DE Detalle Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleMensajeCorreoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleMensajeCorreoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.procesarImportacionDetalleMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallemensajecorreoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleMensajeCorreoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleMensajeCorreoInven.setFileImportacion(this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleMensajeCorreoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleMensajeCorreoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		

		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleMensajeCorreoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleMensajeCorreoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MensajeCorreoInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MensajeCorreoInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MensajeCorreoInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MensajeCorreoInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					sNombreCampoCategoria="id_mensaje_correo_inven";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					sNombreCampoCategoriaValor="id_mensaje_correo_inven";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mensaje Correo Inven",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mensaje_correo_inven");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getmensajecorreoinven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(DetalleMensajeCorreoInven detallemensajecorreoinven:detallemensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallemensajecorreoinven.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelDetalleMensajeCorreoInven(row);				
			//	iRow++;
			//}				
			
			//for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleMensajeCorreoInven(detallemensajecorreoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleMensajeCorreoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleMensajeCorreoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleMensajeCorreoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleMensajeCorreoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleMensajeCorreoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleMensajeCorreoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleMensajeCorreoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleMensajeCorreoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleMensajeCorreoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleMensajeCorreoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleMensajeCorreoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleMensajeCorreoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleMensajeCorreoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleMensajeCorreoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleMensajeCorreoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleMensajeCorreoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven();
		
		this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleMensajeCorreoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleMensajeCorreoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleMensajeCorreoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleMensajeCorreoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleMensajeCorreoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionNuevoDetalleMensajeCorreoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionSinCerrarDetalleMensajeCorreoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxPostAccionSinMensajeDetalleMensajeCorreoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleMensajeCorreoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleMensajeCorreoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleMensajeCorreoInven() throws Exception {
		try	{
			if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleMensajeCorreoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleMensajeCorreoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleMensajeCorreoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleMensajeCorreoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleMensajeCorreoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleMensajeCorreoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoDetalleMensajeCorreoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.getSelectedItem()!=null){this.id_mensaje_correo_invenFK_IdMensajeCorreoInven=((MensajeCorreoInven)this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.getSelectedItem()!=null){this.id_usuarioFK_IdUsuario=((Usuario)this.jComboBoxid_usuarioFK_IdUsuarioDetalleMensajeCorreoInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleMensajeCorreoInven(Boolean esInicializar) throws Exception {				
		if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleMensajeCorreoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleMensajeCorreoInven() throws Exception {
		this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleMensajeCorreoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleMensajeCorreoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleMensajeCorreoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallemensajecorreoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleMensajeCorreoInven.setModel(new DetalleMensajeCorreoInvenModel(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleMensajeCorreoInven.setModel(new DetalleMensajeCorreoInvenModel(this.detallemensajecorreoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleMensajeCorreoInven!=null && this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleMensajeCorreoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,detallemensajecorreoinvenConstantesFunciones.resaltarSeleccionarDetalleMensajeCorreoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,detallemensajecorreoinvenConstantesFunciones.resaltarSeleccionarDetalleMensajeCorreoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostraridDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallemensajecorreoinvenConstantesFunciones.resaltaridDetalleMensajeCorreoInven,this.detallemensajecorreoinvenConstantesFunciones.activaridDetalleMensajeCorreoInven,this,true,"idDetalleMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallemensajecorreoinvenConstantesFunciones.resaltaridDetalleMensajeCorreoInven,this.detallemensajecorreoinvenConstantesFunciones.activaridDetalleMensajeCorreoInven,this,true,"idDetalleMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MensajeCorreoInvenTableCell(this.mensajecorreoinvensForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new MensajeCorreoInvenTableCell(this.mensajecorreoinvensForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenDetalleMensajeCorreoInven,true,"id_mensaje_correo_invenDetalleMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empresaDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empresaDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_empresaDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empresaDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_empresaDetalleMensajeCorreoInven,false,"id_empresaDetalleMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_sucursalDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_sucursalDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_sucursalDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_sucursalDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_sucursalDetalleMensajeCorreoInven,false,"id_sucursalDetalleMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_moduloDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_moduloDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_moduloDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_moduloDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_moduloDetalleMensajeCorreoInven,false,"id_moduloDetalleMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_usuarioDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_usuarioDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_usuarioDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_usuarioDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_usuarioDetalleMensajeCorreoInven,true,"id_usuarioDetalleMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empleadoDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empleadoDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_empleadoDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empleadoDetalleMensajeCorreoInven,this,this.detallemensajecorreoinvenConstantesFunciones.activarid_empleadoDetalleMensajeCorreoInven,true,"id_empleadoDetalleMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.detallemensajecorreoinvenConstantesFunciones.mostraresta_activoDetalleMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detallemensajecorreoinvenConstantesFunciones.resaltaresta_activoDetalleMensajeCorreoInven,this.detallemensajecorreoinvenConstantesFunciones.activaresta_activoDetalleMensajeCorreoInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detallemensajecorreoinvenConstantesFunciones.resaltaresta_activoDetalleMensajeCorreoInven,this.detallemensajecorreoinvenConstantesFunciones.activaresta_activoDetalleMensajeCorreoInven,this,true,"esta_activoDetalleMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleMensajeCorreoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleMensajeCorreoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleMensajeCorreoInven.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleMensajeCorreoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleMensajeCorreoInven.moveColumn(this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleMensajeCorreoInven.moveColumn(this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleMensajeCorreoInven.moveColumn(this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleMensajeCorreoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleMensajeCorreoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleMensajeCorreoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleMensajeCorreoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleMensajeCorreoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleMensajeCorreoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallemensajecorreoinvens.size()-1;
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
		//this.jTableDatosDetalleMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleMensajeCorreoInven();
			
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
				
				//this.isEsNuevoDetalleMensajeCorreoInven=false;
					
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
				if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallemensajecorreoinven.getsType().equals("DUPLICADO")
				   || this.detallemensajecorreoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleMensajeCorreoInven=true;
				
				} else {
					this.isEsNuevoDetalleMensajeCorreoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.detallemensajecorreoinven.getId()>=0 && !this.detallemensajecorreoinven.getIsNew()) {						
						this.isEsNuevoDetalleMensajeCorreoInven=false;
						
					} else {
						this.isEsNuevoDetalleMensajeCorreoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleMensajeCorreoInven(esRelaciones);						
				
				this.seleccionarDetalleMensajeCorreoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallemensajecorreoinven.getId()<0) {
					this.isEsNuevoDetalleMensajeCorreoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleMensajeCorreoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleMensajeCorreoInven(evt,rowIndex);
				}	
				
				if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleMensajeCorreoInven: " + this.dDif); 
					}
				}								
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleMensajeCorreoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallemensajecorreoinven)) {
					if(this.detallemensajecorreoinven.getId()>0) {
						this.detallemensajecorreoinven.setIsDeleted(true);
						
						this.detallemensajecorreoinvensEliminados.add(this.detallemensajecorreoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().remove(this.detallemensajecorreoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinvens.remove(this.detallemensajecorreoinven);				
					}
					
					
					((DetalleMensajeCorreoInvenModel) this.jTableDatosDetalleMensajeCorreoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleMensajeCorreoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleMensajeCorreoInven) {
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//MensajeCorreoInven
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_mensaje_correo_invenDetalleMensajeCorreoInven) {
						//this.cargarCombosMensajeCorreoInvensForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_mensaje_correo_inven());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.mensajecorreoinvensForeignKey=new ArrayList<MensajeCorreoInven>();

						if(detallemensajecorreoinven.getMensajeCorreoInven()!=null) {
							this.mensajecorreoinvensForeignKey.add(detallemensajecorreoinven.getMensajeCorreoInven());
						}

						this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
						this.cargarCombosFrameMensajeCorreoInvensForeignKey("Todos");
					}
					this.setActualMensajeCorreoInvenForeignKey(this.detallemensajecorreoinven.getid_mensaje_correo_inven(),false,"Formulario");

					//Empresa
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_empresaDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_empresaDetalleMensajeCorreoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_empresa());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallemensajecorreoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallemensajecorreoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallemensajecorreoinven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_sucursalDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_sucursalDetalleMensajeCorreoInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_sucursal());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallemensajecorreoinven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallemensajecorreoinven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallemensajecorreoinven.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_moduloDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_moduloDetalleMensajeCorreoInven) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_modulo());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(detallemensajecorreoinven.getModulo()!=null) {
							this.modulosForeignKey.add(detallemensajecorreoinven.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.detallemensajecorreoinven.getid_modulo(),false,"Formulario");

					//Usuario
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_usuarioDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_usuarioDetalleMensajeCorreoInven) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_usuario());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(detallemensajecorreoinven.getUsuario()!=null) {
							this.usuariosForeignKey.add(detallemensajecorreoinven.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.detallemensajecorreoinven.getid_usuario(),false,"Formulario");

					//Empleado
					if(!this.detallemensajecorreoinvenConstantesFunciones.cargarid_empleadoDetalleMensajeCorreoInven || this.detallemensajecorreoinvenConstantesFunciones.event_dependid_empleadoDetalleMensajeCorreoInven) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.detallemensajecorreoinven.getid_empleado());
									//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(detallemensajecorreoinven.getEmpleado()!=null) {
							this.empleadosForeignKey.add(detallemensajecorreoinven.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.detallemensajecorreoinven.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleMensajeCorreoInven(detallemensajecorreoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(detallemensajecorreoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleMensajeCorreoInven(detallemensajecorreoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleMensajeCorreoInven(detallemensajecorreoinven);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setText(detallemensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setSelected(detallemensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleMensajeCorreoInven detallemensajecorreoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallemensajecorreoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleMensajeCorreoInven detallemensajecorreoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallemensajecorreoinvenLocal=this.detallemensajecorreoinven;
			} else {
				detallemensajecorreoinvenLocal=this.detallemensajecorreoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallemensajecorreoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleMensajeCorreoInven(detallemensajecorreoinvenLocal,true);
					
					if(detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallemensajecorreoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallemensajecorreoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(detallemensajecorreoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(detallemensajecorreoinven);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(detallemensajecorreoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.getText()==null || this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.getText()=="" || this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setText("0");
			}

			if(conColumnasBase) {detallemensajecorreoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelIdDetalleMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallemensajecorreoinven.setesta_activo(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelesta_activoDetalleMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinvenBean,DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallemensajecorreoinvenBean.getid_mensaje_correo_inven()!=null && !detallemensajecorreoinvenBean.getid_mensaje_correo_inven().equals(-1L))) {detallemensajecorreoinven.setid_mensaje_correo_inven(detallemensajecorreoinvenBean.getid_mensaje_correo_inven());}
			if(conDefault || (!conDefault && detallemensajecorreoinvenBean.getid_empleado()!=null && !detallemensajecorreoinvenBean.getid_empleado().equals(-1L))) {detallemensajecorreoinven.setid_empleado(detallemensajecorreoinvenBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinvenOrigen,DetalleMensajeCorreoInven detallemensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallemensajecorreoinvenOrigen.getId()!=null && !detallemensajecorreoinvenOrigen.getId().equals(0L))) {detallemensajecorreoinven.setId(detallemensajecorreoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && detallemensajecorreoinvenOrigen.getid_mensaje_correo_inven()!=null && !detallemensajecorreoinvenOrigen.getid_mensaje_correo_inven().equals(-1L))) {detallemensajecorreoinven.setid_mensaje_correo_inven(detallemensajecorreoinvenOrigen.getid_mensaje_correo_inven());}
			if(conDefault || (!conDefault && detallemensajecorreoinvenOrigen.getid_empleado()!=null && !detallemensajecorreoinvenOrigen.getid_empleado().equals(-1L))) {detallemensajecorreoinven.setid_empleado(detallemensajecorreoinvenOrigen.getid_empleado());}
			if(conDefault || (!conDefault && detallemensajecorreoinvenOrigen.getesta_activo()!=null && !detallemensajecorreoinvenOrigen.getesta_activo().equals(false))) {detallemensajecorreoinven.setesta_activo(detallemensajecorreoinvenOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setText(detallemensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setSelected(detallemensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleMensajeCorreoInven(DetalleMensajeCorreoInvenBean detallemensajecorreoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setText(detallemensajecorreoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setSelected(detallemensajecorreoinvenBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleMensajeCorreoInven(DetalleMensajeCorreoInvenParameterReturnGeneral detallemensajecorreoinvenReturnGeneral,DetalleMensajeCorreoInvenBean detallemensajecorreoinvenBean,Boolean conDefault) throws Exception { 
		try {
			DetalleMensajeCorreoInven detallemensajecorreoinvenLocal=new DetalleMensajeCorreoInven();
			
			detallemensajecorreoinvenLocal=detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallemensajecorreoinvenLocal.getId()!=null && !detallemensajecorreoinvenLocal.getId().equals(0L))) {detallemensajecorreoinvenBean.setId(detallemensajecorreoinvenLocal.getId());}}
			if(conDefault || (!conDefault && detallemensajecorreoinvenLocal.getid_mensaje_correo_inven()!=null && !detallemensajecorreoinvenLocal.getid_mensaje_correo_inven().equals(-1L))) {detallemensajecorreoinvenBean.setid_mensaje_correo_inven(detallemensajecorreoinvenLocal.getid_mensaje_correo_inven());}
			if(conDefault || (!conDefault && detallemensajecorreoinvenLocal.getid_empleado()!=null && !detallemensajecorreoinvenLocal.getid_empleado().equals(-1L))) {detallemensajecorreoinvenBean.setid_empleado(detallemensajecorreoinvenLocal.getid_empleado());}
			if(conDefault || (!conDefault && detallemensajecorreoinvenLocal.getesta_activo()!=null && !detallemensajecorreoinvenLocal.getesta_activo().equals(false))) {detallemensajecorreoinvenBean.setesta_activo(detallemensajecorreoinvenLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleMensajeCorreoInvenGenerico(Long idDetalleMensajeCorreoInvenSeleccionado,JComboBox jComboBoxDetalleMensajeCorreoInven,List<DetalleMensajeCorreoInven> detallemensajecorreoinvensLocal)throws Exception {
		try {
			DetalleMensajeCorreoInven  detallemensajecorreoinvenTemp=null;

			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensLocal) {
				if(detallemensajecorreoinvenAux.getId()!=null && detallemensajecorreoinvenAux.getId().equals(idDetalleMensajeCorreoInvenSeleccionado)) {
					detallemensajecorreoinvenTemp=detallemensajecorreoinvenAux;
					break;
				}
			}

			jComboBoxDetalleMensajeCorreoInven.setSelectedItem(detallemensajecorreoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleMensajeCorreoInvenGenerico(JComboBox jComboBoxDetalleMensajeCorreoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleMensajeCorreoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleMensajeCorreoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallemensajecorreoinven=(DetalleMensajeCorreoInven) detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallemensajecorreoinven =(DetalleMensajeCorreoInven) detallemensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("MensajeCorreoInven")) {
			//sDescripcion=this.getActualMensajeCorreoInvenForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getmensajecorreoinven_descripcion();
			} else {
				//sDescripcion=this.getActualMensajeCorreoInvenForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getmensajecorreoinven_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!detallemensajecorreoinven.getIsNew() && !detallemensajecorreoinven.getIsChanged() && !detallemensajecorreoinven.getIsDeleted()) {
				sDescripcion=detallemensajecorreoinven.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=detallemensajecorreoinven.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleMensajeCorreoInven detallemensajecorreoinvenRow=new DetalleMensajeCorreoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallemensajecorreoinvenRow=(DetalleMensajeCorreoInven) detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallemensajecorreoinvenRow=(DetalleMensajeCorreoInven) detallemensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));			
			this.jButtonDuplicarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven && this.isPermisoDuplicarDetalleMensajeCorreoInven));			
			this.jButtonCopiarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven && this.isPermisoCopiarDetalleMensajeCorreoInven));
			this.jButtonVerFormDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven && this.isPermisoVerFormDetalleMensajeCorreoInven));
			
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));			
			
			this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven && this.isPermisoEliminarDetalleMensajeCorreoInven));
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven);							
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));						
			this.jButtonDuplicarToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven && this.isPermisoDuplicarDetalleMensajeCorreoInven));						
			this.jButtonCopiarToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven && this.isPermisoCopiarDetalleMensajeCorreoInven));			
			this.jButtonVerFormToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven && this.isPermisoVerFormDetalleMensajeCorreoInven));			
			this.jButtonAbrirOrderByToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));
			this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));			
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven  && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven && this.isPermisoEliminarDetalleMensajeCorreoInven));
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarToolBarDetalleMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven);				
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));			
			this.jMenuItemDuplicarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven && this.isPermisoDuplicarDetalleMensajeCorreoInven));			
			this.jMenuItemCopiarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven && this.isPermisoCopiarDetalleMensajeCorreoInven));			
			this.jMenuItemVerFormDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven && this.isPermisoVerFormDetalleMensajeCorreoInven));			
			this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));			
			//this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));
			this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));			
			//this.jMenuItemDetalleMostrarOcultarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven && this.isPermisoOrdenDetalleMensajeCorreoInven));			
			this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven));			
			this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven && this.isPermisoNuevoDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));									
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemModificarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemActualizarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven && this.isPermisoActualizarDetalleMensajeCorreoInven));	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemEliminarDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven && this.isPermisoEliminarDetalleMensajeCorreoInven));
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemCancelarDetalleMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven);				
			}
			
			this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));						
			this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=this.jButtonNuevoDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven=this.jButtonDuplicarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven=this.jButtonCopiarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven=this.jButtonVerFormDetalleMensajeCorreoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleMensajeCorreoInven=this.jButtonAbrirOrderByDetalleMensajeCorreoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=this.jButtonModificarDetalleMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=this.jButtonNuevoToolBarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarToolBarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarToolBarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarToolBarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarToolBarDetalleMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=this.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=this.jMenuItemNuevoDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemModificarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemActualizarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemEliminarDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemCancelarDetalleMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleMensajeCorreoInven(Boolean esInicializar) {
		if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleMensajeCorreoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleMensajeCorreoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleMensajeCorreoInven() {
		this.jButtonNuevoDetalleMensajeCorreoInven.setVisible(this.isPermisoNuevoDetalleMensajeCorreoInven);			
		this.jButtonDuplicarDetalleMensajeCorreoInven.setVisible(this.isPermisoDuplicarDetalleMensajeCorreoInven);			
		this.jButtonCopiarDetalleMensajeCorreoInven.setVisible(this.isPermisoCopiarDetalleMensajeCorreoInven);			
		this.jButtonVerFormDetalleMensajeCorreoInven.setVisible(this.isPermisoVerFormDetalleMensajeCorreoInven);			
		
		this.jButtonAbrirOrderByDetalleMensajeCorreoInven.setVisible(this.isPermisoOrdenDetalleMensajeCorreoInven);					
		
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.setVisible(this.isPermisoNuevoDetalleMensajeCorreoInven);			
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarDetalleMensajeCorreoInven.setVisible(this.isPermisoActualizarDetalleMensajeCorreoInven);	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.setVisible(this.isPermisoActualizarDetalleMensajeCorreoInven);	
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.setVisible(this.isPermisoEliminarDetalleMensajeCorreoInven);
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven);						
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.setVisible(this.isPermisoGuardarCambiosDetalleMensajeCorreoInven);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.setVisible(this.isPermisoActualizarDetalleMensajeCorreoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleMensajeCorreoInven() {
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarDetalleMensajeCorreoInven.setVisible(this.isPermisoActualizarDetalleMensajeCorreoInven);	
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.setVisible(this.isPermisoActualizarDetalleMensajeCorreoInven);	
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.setVisible(this.isPermisoEliminarDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven);							
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven && this.isPermisoGuardarCambiosDetalleMensajeCorreoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleMensajeCorreoInven() {
		if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleMensajeCorreoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleMensajeCorreoInven() {
	}
	
	public void jTableDatosDetalleMensajeCorreoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleMensajeCorreoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallemensajecorreoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomensajecorreoinven=true;

			idTienePermisomensajecorreoinven=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisomensajecorreoinven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.mensajecorreoinvenBeanSwingJInternalFrame=new MensajeCorreoInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mensajecorreoinvenBeanSwingJInternalFrame.getMensajeCorreoInvenLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_mensaje_correo_inven()!=null) {
					this.mensajecorreoinvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mensajecorreoinvenBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_mensaje_correo_inven());
					this.mensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaMensajeCorreoInven();
				}

				JInternalFrameBase jinternalFrame =this.mensajecorreoinvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBordermensajecorreoinven=(TitledBorder)this.mensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMensajeCorreoInven.getBorder();

				titledBordermensajecorreoinven.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Mensaje Correo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_mensaje_correo_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mensaje_correo_inven = "+this.detallemensajecorreoinven.getid_mensaje_correo_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallemensajecorreoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallemensajecorreoinven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.detallemensajecorreoinven.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.detallemensajecorreoinven.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoDetalleMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebDetalleMensajeCorreoInven(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.detallemensajecorreoinvenLogic.getConnexion());

				if(this.detallemensajecorreoinven.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.detallemensajecorreoinven.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosDetalleMensajeCorreoInven.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderDetalleMensajeCorreoInven.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.detallemensajecorreoinven.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoDetalleMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.getdetallemensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallemensajecorreoinven==null) {
						this.detallemensajecorreoinven = new DetalleMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);
				}

				if(this.detallemensajecorreoinven.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.detallemensajecorreoinven.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdEmpleado();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdMensajeCorreoInven();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdModulo();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdSucursal();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDetalleMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);

			this.getDetalleMensajeCorreoInvensFK_IdUsuario();

			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);

			//if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallemensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleMensajeCorreoInven() {
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.dispose();
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.dispose();
			this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven=null;
		}
		
		if(this.jInternalFrameImportacionDetalleMensajeCorreoInven!=null) {
			this.jInternalFrameImportacionDetalleMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleMensajeCorreoInven.dispose();
			this.jInternalFrameImportacionDetalleMensajeCorreoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleMensajeCorreoInven();
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleMensajeCorreoInven")) {
				jButtonDuplicarDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleMensajeCorreoInven")) {
				jButtonCopiarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleMensajeCorreoInven")) {
				jButtonVerFormDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleMensajeCorreoInven")) {
				jButtonDuplicarDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleMensajeCorreoInven")) {
				jButtonDuplicarDetalleMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleMensajeCorreoInven")) {
				jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleMensajeCorreoInven")) {
				jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleMensajeCorreoInven")) {
				jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleMensajeCorreoInven")) {
				jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleMensajeCorreoInven")) {
				jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleMensajeCorreoInven")) {
				jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleMensajeCorreoInven")) {
				jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleMensajeCorreoInven")) {
				jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleMensajeCorreoInven")) {
				jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleMensajeCorreoInven")) {
				jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleMensajeCorreoInven")) {
				jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleMensajeCorreoInven")) {
				jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleMensajeCorreoInven")) {
				jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleMensajeCorreoInven")) {
				jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleMensajeCorreoInven")) {
				jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleMensajeCorreoInven")) {
				jButtonMostrarOcultarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleMensajeCorreoInven")) {
				jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleMensajeCorreoInven")) {
				jButtonCopiarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleMensajeCorreoInven")) {
				jButtonVerFormDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleMensajeCorreoInven")) {
				jButtonCopiarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleMensajeCorreoInven")) {
				jButtonVerFormDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleMensajeCorreoInven")) {
				jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleMensajeCorreoInven")) {
				jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleMensajeCorreoInven")) {
				jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleMensajeCorreoInven")) {
				jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleMensajeCorreoInven")) {
				jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleMensajeCorreoInven")) {
				jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleMensajeCorreoInven")) {
				jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleMensajeCorreoInven")) {
				jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleMensajeCorreoInven")) {
				jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleMensajeCorreoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven")) {
				jButtonAbrirOrderByDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleMensajeCorreoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleMensajeCorreoInven")) {
				jButtonMostrarOcultarDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleMensajeCorreoInven")) {
				jButtonCerrarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleMensajeCorreoInven")) {
				jButtonGenerarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleMensajeCorreoInven")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleMensajeCorreoInven")) {
				jButtonCerrarImportacionDetalleMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleMensajeCorreoInven")) {
				
				jButtonGenerarImportacionDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleMensajeCorreoInven")) {
				
				jButtonAbrirImportacionDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleMensajeCorreoInven")) {
				jComboBoxTiposAccionesDetalleMensajeCorreoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleMensajeCorreoInven")) {
				jComboBoxTiposRelacionesDetalleMensajeCorreoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleMensajeCorreoInven")) {
				jComboBoxTiposAccionesDetalleMensajeCorreoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleMensajeCorreoInven")) {
				
				jComboBoxTiposSeleccionarDetalleMensajeCorreoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleMensajeCorreoInven")) {
				jTextFieldValorCampoGeneralDetalleMensajeCorreoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleMensajeCorreoInven")) {
				jButtonAbrirOrderByDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleMensajeCorreoInven")) {
				jButtonAbrirOrderByDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleMensajeCorreoInven")) {
				jButtonCerrarOrderByDetalleMensajeCorreoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonidDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_usuarioDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empleadoDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoDetalleMensajeCorreoInven")) {
				this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMensajeCorreoInvenDetalleMensajeCorreoInven")) {
				this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUsuarioDetalleMensajeCorreoInven")) {
				this.jButtonFK_IdUsuarioDetalleMensajeCorreoInvenActionPerformed(evt);
			}
			
			;
			
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleMensajeCorreoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleMensajeCorreoInven detallemensajecorreoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallemensajecorreoinvenLocal=this.detallemensajecorreoinven;
			} else {
				detallemensajecorreoinvenLocal=this.detallemensajecorreoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
							
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
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
			
			


			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
								
						
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
								
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
							
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
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
			
			


			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
								
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleMensajeCorreoInven")) {
					jCheckBoxSeleccionarTodosDetalleMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleMensajeCorreoInven")) {
					jCheckBoxSeleccionadosDetalleMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleMensajeCorreoInven")) {
					
				}
				
				


				
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
												
				
				


				
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
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
			
			


			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallemensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallemensajecorreoinven);
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
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
				
				


				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleMensajeCorreoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallemensajecorreoinvenAnterior =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleMensajeCorreoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleMensajeCorreoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallemensajecorreoinven =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallemensajecorreoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleMensajeCorreoInven")) {
				
				}
				
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleMensajeCorreoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleMensajeCorreoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleMensajeCorreoInven")) {
			
			}
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleMensajeCorreoInven();
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleMensajeCorreoInven")) {
				jButtonDuplicarDetalleMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleMensajeCorreoInven")) {
				jButtonCopiarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleMensajeCorreoInven")) {
				jButtonVerFormDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleMensajeCorreoInven")) {
				jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleMensajeCorreoInven")) {
				jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleMensajeCorreoInven")) {
				jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleMensajeCorreoInven")) {
				jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleMensajeCorreoInven")) {
				jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleMensajeCorreoInven")) {
				jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleMensajeCorreoInven")) {
				jButtonAbrirOrderByDetalleMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleMensajeCorreoInven")) {
				jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleMensajeCorreoInven")) {
				jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleMensajeCorreoInven")) {
				jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonidDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_usuarioDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_usuarioDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoDetalleMensajeCorreoInvenUpdate")) {
				this.jButtonid_empleadoDetalleMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empleadoDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDetalleMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoDetalleMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleMensajeCorreoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleMensajeCorreoInven")) {
				closingInternalFrameDetalleMensajeCorreoInven();
				
			} else if(sTipo.equals("jButtonCancelarDetalleMensajeCorreoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleMensajeCorreoInven = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(DetalleMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleMensajeCorreoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(null);
			}
			
			DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallemensajecorreoinven,new Object(),this.detallemensajecorreoinvenParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallemensajecorreoinven)) {
			if(!esControlTabla) {
				if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);			
				}
				
				if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.procesarEventosDetalleMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.detallemensajecorreoinven,this.detallemensajecorreoinvenParameterGeneral,this.isEsNuevoDetalleMensajeCorreoInven,classes);//this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral,this.detallemensajecorreoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleMensajeCorreoInven(classes,this.detallemensajecorreoinvenReturnGeneral,this.detallemensajecorreoinvenBean,false);
					}
						
					if(this.detallemensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven());	
					}
						
					if(this.detallemensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven(),classes);//this.detallemensajecorreoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleMensajeCorreoInven(this.detallemensajecorreoinven,classes);//this.detallemensajecorreoinvenBean);									
				}
			
				if(DetalleMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleMensajeCorreoInven(this.detallemensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleMensajeCorreoInven(this.detallemensajecorreoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallemensajecorreoinvenAnterior!=null) {
						this.detallemensajecorreoinven=this.detallemensajecorreoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.procesarEventosDetalleMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.detallemensajecorreoinven,this.detallemensajecorreoinvenParameterGeneral,this.isEsNuevoDetalleMensajeCorreoInven,classes);//this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallemensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven(),detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven(),this.detallemensajecorreoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleMensajeCorreoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleMensajeCorreoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleMensajeCorreoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleMensajeCorreoInven() throws Exception {
		
		DetalleMensajeCorreoInvenModel detallemensajecorreoinvenModel=(DetalleMensajeCorreoInvenModel)this.jTableDatosDetalleMensajeCorreoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallemensajecorreoinvenModel.detallemensajecorreoinvens=this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallemensajecorreoinvenModel.detallemensajecorreoinvens=this.detallemensajecorreoinvens;
		}
		
		
		((DetalleMensajeCorreoInvenModel) this.jTableDatosDetalleMensajeCorreoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleMensajeCorreoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallemensajecorreoinvenAnterior(),this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallemensajecorreoinvenAnterior(),this.detallemensajecorreoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleMensajeCorreoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
										
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallemensajecorreoinven,new Object(),generalEntityParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfDetalleMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleMensajeCorreoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallemensajecorreoinven,new Object(),generalEntityParameterGeneral,this.detallemensajecorreoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleMensajeCorreoInven(DetalleMensajeCorreoInvenBean detallemensajecorreoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleMensajeCorreoInven(ArrayList<Classe> classes,DetalleMensajeCorreoInvenReturnGeneral detallemensajecorreoinvenReturnGeneral,DetalleMensajeCorreoInvenBean detallemensajecorreoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallemensajecorreoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven = new DetalleMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.detallemensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setVisible(false);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.detallemensajecorreoinvenLogic=this.detallemensajecorreoinvenLogic;
		
		this.cargarCombosFrameForeignKeyDetalleMensajeCorreoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleMensajeCorreoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleMensajeCorreoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleMensajeCorreoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleMensajeCorreoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleMensajeCorreoInven"));
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarDetalleMensajeCorreoInven"));

		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemModificarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarDetalleMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleMensajeCorreoInven"));
						
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemActualizarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarDetalleMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleMensajeCorreoInven"));
								
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemEliminarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarDetalleMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemCancelarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleMensajeCorreoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemDetalleCerrarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleMensajeCorreoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonidDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleMensajeCorreoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleMensajeCorreoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleMensajeCorreoInven"));
		}
		
		this.jTableDatosDetalleMensajeCorreoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleMensajeCorreoInven"));
		
		this.jTableDatosDetalleMensajeCorreoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleMensajeCorreoInven"));
		
		this.jButtonNuevoDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoDetalleMensajeCorreoInven"));
		
		this.jButtonDuplicarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarDetalleMensajeCorreoInven"));
		
		this.jButtonCopiarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"CopiarDetalleMensajeCorreoInven"));
		
		this.jButtonVerFormDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"VerFormDetalleMensajeCorreoInven"));
		
		
		this.jButtonNuevoToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleMensajeCorreoInven"));
			
		this.jButtonDuplicarToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemNuevoDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleMensajeCorreoInven"));
			
		this.jMenuItemDuplicarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleMensajeCorreoInven"));		
		
		
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleMensajeCorreoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarDetalleMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonModificarToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemModificarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarDetalleMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonActualizarToolBarDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleMensajeCorreoInven"));
				
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemActualizarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarDetalleMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonEliminarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleMensajeCorreoInven"));
						
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemEliminarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarDetalleMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonCancelarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemCancelarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleMensajeCorreoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleMensajeCorreoInven"));		
		
		
		this.jButtonCerrarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarDetalleMensajeCorreoInven"));
		
		
		this.jButtonCerrarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemCerrarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleMensajeCorreoInven"));
			
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jMenuItemDetalleCerrarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleMensajeCorreoInven"));
		}
		
		this.jButtonCopiarToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleMensajeCorreoInven"));
			
		this.jButtonVerFormToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleMensajeCorreoInven"));
		
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleMensajeCorreoInven"));
			
		this.jMenuItemCopiarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleMensajeCorreoInven"));		
		
		this.jMenuItemVerFormDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleMensajeCorreoInven"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleMensajeCorreoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleMensajeCorreoInven"));		
		
		
		
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleMensajeCorreoInven"));
					
		this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleMensajeCorreoInven"));
		
		this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleMensajeCorreoInven"));		
		
		
		
		this.jButtonAnterioresDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresDetalleMensajeCorreoInven"));
		
		
		this.jButtonAnterioresToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleMensajeCorreoInven"));
		
		this.jMenuItemAnterioresDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleMensajeCorreoInven"));		
		
		
		this.jButtonSiguientesDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesDetalleMensajeCorreoInven"));
		
		
		this.jButtonSiguientesToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemSiguientesDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleMensajeCorreoInven"));
			
		this.jMenuItemAbrirOrderByDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleMensajeCorreoInven"));
			
		this.jMenuItemMostrarOcultarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleMensajeCorreoInven"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleMensajeCorreoInven"));
			
		this.jMenuItemDetalleMostarOcultarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleMensajeCorreoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleMensajeCorreoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleMensajeCorreoInven"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleMensajeCorreoInven"));

		this.jCheckBoxSeleccionadosDetalleMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleMensajeCorreoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleMensajeCorreoInven"));
			
		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleMensajeCorreoInven"));
					
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleMensajeCorreoInven"));
			
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonidDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleMensajeCorreoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoDetalleMensajeCorreoInven"));

			this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdMensajeCorreoInvenDetalleMensajeCorreoInven"));

			this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioDetalleMensajeCorreoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoDetalleMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleMensajeCorreoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleMensajeCorreoInven"));				
			//this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleMensajeCorreoInven"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleMensajeCorreoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleMensajeCorreoInven"));
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleMensajeCorreoInven"));
				this.jInternalFrameImportacionDetalleMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleMensajeCorreoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleMensajeCorreoInven"));
			
			this.jButtonAbrirOrderByToolBarDetalleMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleMensajeCorreoInven"));			
			
			if(this.jInternalFrameOrderByDetalleMensajeCorreoInven!=null) {
				this.jInternalFrameOrderByDetalleMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleMensajeCorreoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jTabbedPaneRelacionesDetalleMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleMensajeCorreoInven"));
		
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
            		closingInternalFrameDetalleMensajeCorreoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleMensajeCorreoInven = (JInternalFrameBase)event.getSource();
	            	
	            DetalleMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(DetalleMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleMensajeCorreoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleMensajeCorreoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleMensajeCorreoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleMensajeCorreoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleMensajeCorreoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleMensajeCorreoInven";
		inputMap = this.jButtonModificarDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleMensajeCorreoInven";
		inputMap = this.jButtonActualizarDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleMensajeCorreoInven";
		inputMap = this.jButtonEliminarDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCancelarDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleMensajeCorreoInven";
		inputMap = this.jButtonCerrarDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleMensajeCorreoInven";
		inputMap = this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonGuardarCambiosDetalleMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleMensajeCorreoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleMensajeCorreoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonidDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empresaDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_sucursalDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_moduloDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_usuarioDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonid_empleadoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jButtonesta_activoDetalleMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleMensajeCorreoInvenBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoDetalleMensajeCorreoInven"));

		this.jButtonFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdMensajeCorreoInvenDetalleMensajeCorreoInven"));

		this.jButtonFK_IdUsuarioDetalleMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdUsuarioDetalleMensajeCorreoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleMensajeCorreoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleMensajeCorreoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
					detallemensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvens) {
					detallemensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
						detallemensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvens) {
						detallemensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
					
						if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							detallemensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvens) {
						
						if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							detallemensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleMensajeCorreoInven.getSelectedRows();
			
			DetalleMensajeCorreoInven detallemensajecorreoinvenLocal=new DetalleMensajeCorreoInven();
			
			//this.seleccionarTodosDetalleMensajeCorreoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallemensajecorreoinvenLocal =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens().toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallemensajecorreoinvenLocal =(DetalleMensajeCorreoInven) this.detallemensajecorreoinvens.toArray()[this.jTableDatosDetalleMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallemensajecorreoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
						detallemensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvens) {
						detallemensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleMensajeCorreoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleMensajeCorreoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleMensajeCorreoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvens) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleMensajeCorreoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleMensajeCorreoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleMensajeCorreoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleMensajeCorreoInven(conSplash);
				
					this.generarReporteDetalleMensajeCorreoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleMensajeCorreoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleMensajeCorreoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleMensajeCorreoInven();
				
				this.exportarDetalleMensajeCorreoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleMensajeCorreoInvens();
				//this.importarDetalleMensajeCorreoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleMensajeCorreoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleMensajeCorreoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleMensajeCorreoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleMensajeCorreoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleMensajeCorreoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleMensajeCorreoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleMensajeCorreoInven(conSplash);
					
						//this.actualizarParametrosGeneralDetalleMensajeCorreoInven();
						
						this.generarReporteProcesoAccionDetalleMensajeCorreoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Mensaje Correo InvenES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleMensajeCorreoInven();
				
						this.actualizarParametrosGeneralDetalleMensajeCorreoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallemensajecorreoinvenReturnGeneral=detallemensajecorreoinvenLogic.procesarAccionDetalleMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens(),this.detallemensajecorreoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleMensajeCorreoInven();
					
					DetalleMensajeCorreoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxTiposAccionesFormularioDetalleMensajeCorreoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleMensajeCorreoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleMensajeCorreoInven();
			
			if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
			DetalleMensajeCorreoInven detallemensajecorreoinven=new DetalleMensajeCorreoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleMensajeCorreoInven.getSelectedItem();
			
			
			
			
			detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallemensajecorreoinvensSeleccionados.size()==1) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
					detallemensajecorreoinven=detallemensajecorreoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleMensajeCorreoInven();
			
      		//this.finishProcessDetalleMensajeCorreoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleMensajeCorreoInvenReturnGeneral() throws Exception {
		if(this.detallemensajecorreoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallemensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallemensajecorreoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallemensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallemensajecorreoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallemensajecorreoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
		}
		
		if(this.detallemensajecorreoinvenReturnGeneral.getConRetornoLista() || this.detallemensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.detallemensajecorreoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInvens(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallemensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallemensajecorreoinvenLogic.setDetalleMensajeCorreoInven(this.detallemensajecorreoinvenReturnGeneral.getDetalleMensajeCorreoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleMensajeCorreoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleMensajeCorreoInven() throws Exception {
		
		
	}
	
	public ArrayList<DetalleMensajeCorreoInven> getDetalleMensajeCorreoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleMensajeCorreoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens()) {
					if(detallemensajecorreoinvenAux.getIsSelected()) {
						detallemensajecorreoinvensSeleccionados.add(detallemensajecorreoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:this.detallemensajecorreoinvens) {
					if(detallemensajecorreoinvenAux.getIsSelected()) {
						detallemensajecorreoinvensSeleccionados.add(detallemensajecorreoinvenAux);				
					}
				}
			}
			
			if(detallemensajecorreoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallemensajecorreoinvensSeleccionados.addAll(this.detallemensajecorreoinvenLogic.getDetalleMensajeCorreoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallemensajecorreoinvensSeleccionados.addAll(this.detallemensajecorreoinvens);				
					}
				}
			}
		} else {
			detallemensajecorreoinvensSeleccionados.add(this.detallemensajecorreoinven);
		}
		
		return detallemensajecorreoinvensSeleccionados;
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
	
	public void generarReporteDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleMensajeCorreoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleMensajeCorreoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Mensaje Correo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleMensajeCorreoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleMensajeCorreoInven();
		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleMensajeCorreoInven();
		
		
		//this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados ,detallemensajecorreoinvenImplementable,detallemensajecorreoinvenImplementableHome);
	}
	
	public void mostrarImportacionDetalleMensajeCorreoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleMensajeCorreoInven();
		
		this.abrirFrameImportacionDetalleMensajeCorreoInven();		
		
			
		//this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados ,detallemensajecorreoinvenImplementable,detallemensajecorreoinvenImplementableHome);
	}
	
	public void importarDetalleMensajeCorreoInvens() throws Exception {		
	
	}
	
	public void exportarDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleMensajeCorreoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleMensajeCorreoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Mensaje Correo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleMensajeCorreoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleMensajeCorreoInven(detallemensajecorreoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallemensajecorreoinvenAux.setsDetalleGeneralEntityReporte(detallemensajecorreoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleMensajeCorreoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallemensajecorreoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getmensajecorreoinven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallemensajecorreoinven.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleMensajeCorreoInven(row);				
				iRow++;
			}				
			
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleMensajeCorreoInven(detallemensajecorreoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();		
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallemensajecorreoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallemensajecorreoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallemensajecorreoinven");
			//elementRoot.appendChild(element);
		
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
				element = document.createElement("detallemensajecorreoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleMensajeCorreoInven(detallemensajecorreoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleMensajeCorreoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getmensajecorreoinven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallemensajecorreoinven.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlDetalleMensajeCorreoInven(DetalleMensajeCorreoInven detallemensajecorreoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallemensajecorreoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallemensajecorreoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmensajecorreoinven_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDMENSAJECORREOINVEN);
		elementmensajecorreoinven_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getmensajecorreoinven_descripcion()));
		element.appendChild(elementmensajecorreoinven_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementusuario_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementempleado_descripcion = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(detallemensajecorreoinven.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementesta_activo = document.createElement(DetalleMensajeCorreoInvenConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(detallemensajecorreoinven.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoDetalleMensajeCorreoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados=new ArrayList<DetalleMensajeCorreoInven>();
		
		detallemensajecorreoinvensSeleccionados=this.getDetalleMensajeCorreoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleMensajeCorreoInven(detallemensajecorreoinvensSeleccionados);
		
		this.generarReporteDetalleMensajeCorreoInvens("Todos",detallemensajecorreoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleMensajeCorreoInven(ArrayList<DetalleMensajeCorreoInven> detallemensajecorreoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleMensajeCorreoInven detallemensajecorreoinvenAux:detallemensajecorreoinvensSeleccionados) {
				detallemensajecorreoinvenAux.setsDetalleGeneralEntityReporte(detallemensajecorreoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getmensajecorreoinven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(detallemensajecorreoinvenAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					detallemensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detallemensajecorreoinvenAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleMensajeCorreoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarDetalleMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleMensajeCorreoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=true;
		} else {
			this.actualizarEstadoPanelsDetalleMensajeCorreoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleMensajeCorreoInven=false;
			//this.isVisibilidadCeldaVerFormDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarDetalleMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!detallemensajecorreoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;												
			}
			
			this.jButtonCerrarDetalleMensajeCorreoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleMensajeCorreoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.detallemensajecorreoinven)) {
			this.isVisibilidadCeldaActualizarDetalleMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarDetalleMensajeCorreoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleMensajeCorreoInven() {
	}
	
	public void actualizarEstadoPanelsDetalleMensajeCorreoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleMensajeCorreoInven!=null) {
				this.jScrollPanelDatosDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleMensajeCorreoInven!=null) {
				this.jPanelPaginacionDetalleMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
					this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallemensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesDetalleMensajeCorreoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaMensajeCorreoInven(Boolean isParaMensajeCorreoInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMensajeCorreoInvenNegation=!isParaMensajeCorreoInven;

			this.isVisibilidadFK_IdEmpleado=isParaMensajeCorreoInvenNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaMensajeCorreoInven;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaMensajeCorreoInvenNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdEmpleado=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdEmpleado=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaUsuario;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);}

			this.isVisibilidadFK_IdUsuario=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdUsuario) {this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(jPanelFK_IdUsuarioDetalleMensajeCorreoInven);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		
		if(this.detallemensajecorreoinvenSessionBean==null) {
			this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		}
		
		this.detallemensajecorreoinvenSessionBean.setsUltimaBusquedaDetalleMensajeCorreoInven(this.getsAccionBusqueda());
		this.detallemensajecorreoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallemensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			detallemensajecorreoinvenSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallemensajecorreoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMensajeCorreoInven")) {
			detallemensajecorreoinvenSessionBean.setid_mensaje_correo_inven(this.getid_mensaje_correo_invenFK_IdMensajeCorreoInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			detallemensajecorreoinvenSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallemensajecorreoinvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			detallemensajecorreoinvenSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleMensajeCorreoInvenSessionBean detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		
		if(this.detallemensajecorreoinvenSessionBean==null) {
			this.detallemensajecorreoinvenSessionBean=new DetalleMensajeCorreoInvenSessionBean();
		}
		
		if(this.detallemensajecorreoinvenSessionBean.getsUltimaBusquedaDetalleMensajeCorreoInven()!=null&&!this.detallemensajecorreoinvenSessionBean.getsUltimaBusquedaDetalleMensajeCorreoInven().equals("")) {
			this.setsAccionBusqueda(detallemensajecorreoinvenSessionBean.getsUltimaBusquedaDetalleMensajeCorreoInven());
			this.setiNumeroPaginacion(detallemensajecorreoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallemensajecorreoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(detallemensajecorreoinvenSessionBean.getid_empleado());
				detallemensajecorreoinvenSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallemensajecorreoinvenSessionBean.getid_empresa());
				detallemensajecorreoinvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMensajeCorreoInven")) {
				this.setid_mensaje_correo_invenFK_IdMensajeCorreoInven(detallemensajecorreoinvenSessionBean.getid_mensaje_correo_inven());
				detallemensajecorreoinvenSessionBean.setid_mensaje_correo_inven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(detallemensajecorreoinvenSessionBean.getid_modulo());
				detallemensajecorreoinvenSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallemensajecorreoinvenSessionBean.getid_sucursal());
				detallemensajecorreoinvenSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(detallemensajecorreoinvenSessionBean.getid_usuario());
				detallemensajecorreoinvenSessionBean.setid_usuario(-1L);
			}
		}
		
		this.detallemensajecorreoinvenSessionBean.setsUltimaBusquedaDetalleMensajeCorreoInven("");
		this.detallemensajecorreoinvenSessionBean.setiNumeroPaginacion(DetalleMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION);
		this.detallemensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleMensajeCorreoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleMensajeCorreoInven() {
		this.updateBorderResaltarBusquedasFormularioDetalleMensajeCorreoInven();
		this.updateVisibilidadBusquedasFormularioDetalleMensajeCorreoInven();
		this.updateHabilitarBusquedasFormularioDetalleMensajeCorreoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleMensajeCorreoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponents().length>0) {
	

		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdEmpleadoDetalleMensajeCorreoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdEmpleadoDetalleMensajeCorreoInven);
			}
		}

		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			}
		}

		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdUsuarioDetalleMensajeCorreoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdUsuarioDetalleMensajeCorreoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleMensajeCorreoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdEmpleadoDetalleMensajeCorreoInven);
			if(!this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdEmpleadoDetalleMensajeCorreoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			if(!this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdUsuarioDetalleMensajeCorreoInven);
			if(!this.detallemensajecorreoinvenConstantesFunciones.mostrarFK_IdUsuarioDetalleMensajeCorreoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleMensajeCorreoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdEmpleadoDetalleMensajeCorreoInven);
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setEnabledAt(index,this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdEmpleadoDetalleMensajeCorreoInven);
			}

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setEnabledAt(index,this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			}

			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdUsuarioDetalleMensajeCorreoInven);
				this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setEnabledAt(index,this.detallemensajecorreoinvenConstantesFunciones.activarFK_IdUsuarioDetalleMensajeCorreoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleMensajeCorreoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleMensajeCorreoInven);

			this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);

			this.detallemensajecorreoinvenConstantesFunciones.setResaltarFK_IdEmpleadoDetalleMensajeCorreoInven(resaltar);

			jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdEmpleadoDetalleMensajeCorreoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMensajeCorreoInven")) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);

			this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);

			this.detallemensajecorreoinvenConstantesFunciones.setResaltarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven(resaltar);

			jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenDetalleMensajeCorreoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUsuario")) {
			index= this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdUsuarioDetalleMensajeCorreoInven);

			this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleMensajeCorreoInven.getComponent(index);

			this.detallemensajecorreoinvenConstantesFunciones.setResaltarFK_IdUsuarioDetalleMensajeCorreoInven(resaltar);

			jPanel.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarFK_IdUsuarioDetalleMensajeCorreoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleMensajeCorreoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleMensajeCorreoInven() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleMensajeCorreoInven();
		this.updateVisibilidadResaltarControlesFormularioDetalleMensajeCorreoInven();
		this.updateHabilitarResaltarControlesFormularioDetalleMensajeCorreoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltaridDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltaridDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empresaDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empresaDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_sucursalDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_sucursalDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_moduloDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_moduloDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_usuarioDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_usuarioDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empleadoDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltarid_empleadoDetalleMensajeCorreoInven);}
		if(this.detallemensajecorreoinvenConstantesFunciones.resaltaresta_activoDetalleMensajeCorreoInven!=null && this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setBorder(this.detallemensajecorreoinvenConstantesFunciones.resaltaresta_activoDetalleMensajeCorreoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleMensajeCorreoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
	
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostraridDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelidDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostraridDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_mensaje_correo_invenDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empresaDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_empresaDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empresaDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_sucursalDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_sucursalDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_sucursalDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_moduloDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_moduloDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_moduloDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_usuarioDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_usuarioDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_usuarioDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empleadoDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelid_empleadoDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostrarid_empleadoDetalleMensajeCorreoInven);
		//this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostraresta_activoDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jPanelesta_activoDetalleMensajeCorreoInven.setVisible(this.detallemensajecorreoinvenConstantesFunciones.mostraresta_activoDetalleMensajeCorreoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleMensajeCorreoInven!=null) {
	
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jLabelidDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activaridDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_mensaje_correo_invenDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empresaDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_empresaDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_sucursalDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_sucursalDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_moduloDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_moduloDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_usuarioDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_usuarioDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jComboBoxid_empleadoDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activarid_empleadoDetalleMensajeCorreoInven);
		this.jInternalFrameDetalleFormDetalleMensajeCorreoInven.jCheckBoxesta_activoDetalleMensajeCorreoInven.setEnabled(this.detallemensajecorreoinvenConstantesFunciones.activaresta_activoDetalleMensajeCorreoInven);
		}
	}
	
		
}