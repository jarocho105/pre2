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

import com.bydan.erp.inventario.util.MailMensajeCorreoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.MailMensajeCorreoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.MailMensajeCorreoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.MailMensajeCorreoInvenBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MailMensajeCorreoInvenBeanSwingJInternalFrame extends MailMensajeCorreoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MailMensajeCorreoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MailMensajeCorreoInven> mailmensajecorreoinvenValidator = new ClassValidator<MailMensajeCorreoInven>(MailMensajeCorreoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MailMensajeCorreoInven mailmensajecorreoinven;	
	public MailMensajeCorreoInven mailmensajecorreoinvenAux;
	public MailMensajeCorreoInven mailmensajecorreoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MailMensajeCorreoInven mailmensajecorreoinvenTotales;
	public Long idMailMensajeCorreoInvenActual;
	public Long iIdNuevoMailMensajeCorreoInven=0L;
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
	
	public Boolean isPermisoTodoMailMensajeCorreoInven;
	public Boolean isPermisoNuevoMailMensajeCorreoInven;
	public Boolean isPermisoActualizarMailMensajeCorreoInven;
	public Boolean isPermisoActualizarOriginalMailMensajeCorreoInven;
	public Boolean isPermisoEliminarMailMensajeCorreoInven;
	public Boolean isPermisoGuardarCambiosMailMensajeCorreoInven;
	public Boolean isPermisoConsultaMailMensajeCorreoInven;
	public Boolean isPermisoBusquedaMailMensajeCorreoInven;
	public Boolean isPermisoReporteMailMensajeCorreoInven;
	public Boolean isPermisoPaginacionMedioMailMensajeCorreoInven;
	public Boolean isPermisoPaginacionAltoMailMensajeCorreoInven;
	public Boolean isPermisoPaginacionTodoMailMensajeCorreoInven;
	public Boolean isPermisoCopiarMailMensajeCorreoInven;
	public Boolean isPermisoVerFormMailMensajeCorreoInven;
	public Boolean isPermisoDuplicarMailMensajeCorreoInven;
	public Boolean isPermisoOrdenMailMensajeCorreoInven;
	
	
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
	
	public MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenReturnGeneral;
	public MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMailMensajeCorreoInven=false;
	public Boolean esParaAccionDesdeFormularioMailMensajeCorreoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MailMensajeCorreoInvenSessionBeanAdditional mailmensajecorreoinvenSessionBeanAdditional=null;
	
	public MailMensajeCorreoInvenSessionBeanAdditional getMailMensajeCorreoInvenSessionBeanAdditional() {
		return this.mailmensajecorreoinvenSessionBeanAdditional;
	}
	
	public void setMailMensajeCorreoInvenSessionBeanAdditional(MailMensajeCorreoInvenSessionBeanAdditional mailmensajecorreoinvenSessionBeanAdditional) {
		try {
			this.mailmensajecorreoinvenSessionBeanAdditional=mailmensajecorreoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional mailmensajecorreoinvenBeanSwingJInternalFrameAdditional=null;
	//public class MailMensajeCorreoInvenBeanSwingJInternalFrame
	
	public MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional getMailMensajeCorreoInvenBeanSwingJInternalFrameAdditional() {
		return this.mailmensajecorreoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setMailMensajeCorreoInvenBeanSwingJInternalFrameAdditional(MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional mailmensajecorreoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.mailmensajecorreoinvenBeanSwingJInternalFrameAdditional=mailmensajecorreoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MailMensajeCorreoInven mailmensajecorreoinvenBean;
	public MailMensajeCorreoInvenConstantesFunciones mailmensajecorreoinvenConstantesFunciones;
	//public MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenReturnGeneral;
	
	//FK
	
	public MensajeCorreoInvenLogic mensajecorreoinvenLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<MailMensajeCorreoInven> mailmensajecorreoinvens;	
	//public List<MailMensajeCorreoInven> mailmensajecorreoinvensEliminados;
	//public List<MailMensajeCorreoInven> mailmensajecorreoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaDuplicarMailMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaCopiarMailMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaVerFormMailMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaOrdenMailMensajeCorreoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaCancelarMailMensajeCorreoInven=false;
	public Boolean isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMensajeCorreoInven=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoMailMensajeCorreoInven() {
		return this.iIdNuevoMailMensajeCorreoInven;
	}

	public void setiIdNuevoMailMensajeCorreoInven(Long iIdNuevoMailMensajeCorreoInven) {
		this.iIdNuevoMailMensajeCorreoInven = iIdNuevoMailMensajeCorreoInven;
	}
	
	public Long getidMailMensajeCorreoInvenActual() {
		return this.idMailMensajeCorreoInvenActual;
	}

	public void setidMailMensajeCorreoInvenActual(Long idMailMensajeCorreoInvenActual) {
		this.idMailMensajeCorreoInvenActual = idMailMensajeCorreoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MailMensajeCorreoInven getmailmensajecorreoinven() {
		return this.mailmensajecorreoinven;
	}

	public void setmailmensajecorreoinven(MailMensajeCorreoInven mailmensajecorreoinven) {
		this.mailmensajecorreoinven = mailmensajecorreoinven;
	}
	
	public MailMensajeCorreoInven getmailmensajecorreoinvenAux() {
		return this.mailmensajecorreoinvenAux;
	}

	public void setmailmensajecorreoinvenAux(MailMensajeCorreoInven mailmensajecorreoinvenAux) {
		this.mailmensajecorreoinvenAux = mailmensajecorreoinvenAux;
	}				
	
	public MailMensajeCorreoInven getmailmensajecorreoinvenAnterior() {
		return this.mailmensajecorreoinvenAnterior;
	}

	public void setmailmensajecorreoinvenAnterior(MailMensajeCorreoInven mailmensajecorreoinvenAnterior) {
		this.mailmensajecorreoinvenAnterior = mailmensajecorreoinvenAnterior;
	}	
	
	public MailMensajeCorreoInven getmailmensajecorreoinvenTotales() {
		return this.mailmensajecorreoinvenTotales;
	}

	public void setmailmensajecorreoinvenTotales(MailMensajeCorreoInven mailmensajecorreoinvenTotales) {
		this.mailmensajecorreoinvenTotales = mailmensajecorreoinvenTotales;
	}	
	
	public MailMensajeCorreoInven getmailmensajecorreoinvenBean() {
		return this.mailmensajecorreoinvenBean;
	}

	public void setmailmensajecorreoinvenBean(MailMensajeCorreoInven mailmensajecorreoinvenBean) {
		this.mailmensajecorreoinvenBean = mailmensajecorreoinvenBean;
	}	
	
	public MailMensajeCorreoInvenParameterReturnGeneral getmailmensajecorreoinvenReturnGeneral() {
		return this.mailmensajecorreoinvenReturnGeneral;
	}

	public void setmailmensajecorreoinvenReturnGeneral(MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenReturnGeneral) {
		this.mailmensajecorreoinvenReturnGeneral = mailmensajecorreoinvenReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MailMensajeCorreoInvenLogic getMailMensajeCorreoInvenLogic()	{		
		return mailmensajecorreoinvenLogic;
	}

	public void setMailMensajeCorreoInvenLogic(MailMensajeCorreoInvenLogic mailmensajecorreoinvenLogic) {
		this.mailmensajecorreoinvenLogic = mailmensajecorreoinvenLogic;
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
	
	public Boolean getIsEsNuevoMailMensajeCorreoInven() {
		return isEsNuevoMailMensajeCorreoInven;
	}

	public void setIsEsNuevoMailMensajeCorreoInven(Boolean isEsNuevoMailMensajeCorreoInven) {
		this.isEsNuevoMailMensajeCorreoInven = isEsNuevoMailMensajeCorreoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioMailMensajeCorreoInven() {
		return esParaAccionDesdeFormularioMailMensajeCorreoInven;
	}
	
	public void setEsParaAccionDesdeFormularioMailMensajeCorreoInven(Boolean esParaAccionDesdeFormularioMailMensajeCorreoInven) {
		this.esParaAccionDesdeFormularioMailMensajeCorreoInven = esParaAccionDesdeFormularioMailMensajeCorreoInven;
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

			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {
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
					mensajecorreoinvenLogic.getEntityWithConnection(mailmensajecorreoinvenSessionBean.getlidMensajeCorreoInvenActual());
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

			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(mailmensajecorreoinvenSessionBean.getlidEmpresaActual());
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

			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(mailmensajecorreoinvenSessionBean.getlidSucursalActual());
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

			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(mailmensajecorreoinvenSessionBean.getlidModuloActual());
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

					if(this.mailmensajecorreoinven!=null) {
						this.mailmensajecorreoinven.setMensajeCorreoInven(mensajecorreoinvenTemp);
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					}
				} else {
					//jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(mensajecorreoinvenTemp!=null && jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven!=null) {
						jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
					} else {
						if(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven!=null) {
							//jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinvenTemp);
							if(jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.getItemCount()>0) {
								jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualMensajeCorreoInvenForeignKeyGenerico(Long idMensajeCorreoInvenSeleccionado,JComboBox jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico.setSelectedItem(mensajecorreoinvenTemp);
			} else {
				if(jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico!=null && jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.mailmensajecorreoinven!=null) {
						this.mailmensajecorreoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMailMensajeCorreoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMailMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_empresaMailMensajeCorreoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMailMensajeCorreoInvenGenerico!=null && jComboBoxid_empresaMailMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaMailMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.mailmensajecorreoinven!=null) {
						this.mailmensajecorreoinven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMailMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_sucursalMailMensajeCorreoInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMailMensajeCorreoInvenGenerico!=null && jComboBoxid_sucursalMailMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMailMensajeCorreoInvenGenerico.setSelectedIndex(0);
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

					if(this.mailmensajecorreoinven!=null) {
						this.mailmensajecorreoinven.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloMailMensajeCorreoInven.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloMailMensajeCorreoInvenGenerico)throws Exception
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
				jComboBoxid_moduloMailMensajeCorreoInvenGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloMailMensajeCorreoInvenGenerico!=null && jComboBoxid_moduloMailMensajeCorreoInvenGenerico.getItemCount()>0) {
					jComboBoxid_moduloMailMensajeCorreoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMensajeCorreoInvenForeignKey(MailMensajeCorreoInven mailmensajecorreoinven,JComboBox jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			MensajeCorreoInven  mensajecorreoinvenAux=new MensajeCorreoInven();

			if(jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico==null) {
				mensajecorreoinvenAux=(MensajeCorreoInven)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getSelectedItem();
			} else {
				mensajecorreoinvenAux=(MensajeCorreoInven)jComboBoxid_mensaje_correo_invenMailMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(mensajecorreoinvenAux!=null && mensajecorreoinvenAux.getId()!=null) {
				mailmensajecorreoinven.setid_mensaje_correo_inven(mensajecorreoinvenAux.getId());
				mailmensajecorreoinven.setmensajecorreoinven_descripcion(MailMensajeCorreoInvenConstantesFunciones.getMensajeCorreoInvenDescripcion(mensajecorreoinvenAux));
				mailmensajecorreoinven.setMensajeCorreoInven(mensajecorreoinvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MailMensajeCorreoInven mailmensajecorreoinven,JComboBox jComboBoxid_empresaMailMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMailMensajeCorreoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMailMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mailmensajecorreoinven.setid_empresa(empresaAux.getId());
				mailmensajecorreoinven.setempresa_descripcion(MailMensajeCorreoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mailmensajecorreoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MailMensajeCorreoInven mailmensajecorreoinven,JComboBox jComboBoxid_sucursalMailMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMailMensajeCorreoInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMailMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				mailmensajecorreoinven.setid_sucursal(sucursalAux.getId());
				mailmensajecorreoinven.setsucursal_descripcion(MailMensajeCorreoInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				mailmensajecorreoinven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(MailMensajeCorreoInven mailmensajecorreoinven,JComboBox jComboBoxid_moduloMailMensajeCorreoInvenGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloMailMensajeCorreoInvenGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloMailMensajeCorreoInvenGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				mailmensajecorreoinven.setid_modulo(moduloAux.getId());
				mailmensajecorreoinven.setmodulo_descripcion(MailMensajeCorreoInvenConstantesFunciones.getModuloDescripcion(moduloAux));
				mailmensajecorreoinven.setModulo(moduloAux);			}
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

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.removeAllItems();

							for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvensForeignKey) {
								this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.addItem(mensajecorreoinven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
					}

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMensajeCorreoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.removeAllItems();

							for(MensajeCorreoInven mensajecorreoinven:this.mensajecorreoinvensForeignKey) {
								this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.addItem(mensajecorreoinven);
							}
						}

						if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
					}

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
					}

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { 
					}

					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameMensajeCorreoInvenForeignKey(MensajeCorreoInven mensajecorreoinven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinven);
						}
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setSelectedItem(mensajecorreoinven);
						} else {
							this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesMailMensajeCorreoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MailMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesMailMensajeCorreoInven(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MailMensajeCorreoInvenConstantesFunciones.refrescarForeignKeysDescripcionesMailMensajeCorreoInven(this.mailmensajecorreoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(MensajeCorreoInven.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(this.mailmensajecorreoinvens);
			mailmensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MailMensajeCorreoInvenParameterReturnGeneral getMailMensajeCorreoInvenParameterGeneral() {
		return this.mailmensajecorreoinvenParameterGeneral;
	}
	
	public void setMailMensajeCorreoInvenParameterGeneral(MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenParameterGeneral) {
		this.mailmensajecorreoinvenParameterGeneral = mailmensajecorreoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMailMensajeCorreoInven() {
		return isPermisoTodoMailMensajeCorreoInven;
	}

	public void setIsPermisoTodoMailMensajeCorreoInven(Boolean isPermisoTodoMailMensajeCorreoInven) {
		this.isPermisoTodoMailMensajeCorreoInven = isPermisoTodoMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoNuevoMailMensajeCorreoInven() {
		return isPermisoNuevoMailMensajeCorreoInven;
	}

	public void setIsPermisoNuevoMailMensajeCorreoInven(Boolean isPermisoNuevoMailMensajeCorreoInven) {
		this.isPermisoNuevoMailMensajeCorreoInven = isPermisoNuevoMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoActualizarMailMensajeCorreoInven() {
		return isPermisoActualizarMailMensajeCorreoInven;
	}

	public void setIsPermisoActualizarMailMensajeCorreoInven(Boolean isPermisoActualizarMailMensajeCorreoInven) {
		this.isPermisoActualizarMailMensajeCorreoInven = isPermisoActualizarMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoEliminarMailMensajeCorreoInven() {
		return isPermisoEliminarMailMensajeCorreoInven;
	}

	public void setIsPermisoEliminarMailMensajeCorreoInven(Boolean isPermisoEliminarMailMensajeCorreoInven) {
		this.isPermisoEliminarMailMensajeCorreoInven = isPermisoEliminarMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoGuardarCambiosMailMensajeCorreoInven() {
		return isPermisoGuardarCambiosMailMensajeCorreoInven;
	}

	public void setIsPermisoGuardarCambiosMailMensajeCorreoInven(Boolean isPermisoGuardarCambiosMailMensajeCorreoInven) {
		this.isPermisoGuardarCambiosMailMensajeCorreoInven = isPermisoGuardarCambiosMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoConsultaMailMensajeCorreoInven() {
		return isPermisoConsultaMailMensajeCorreoInven;
	}

	public void setIsPermisoConsultaMailMensajeCorreoInven(Boolean isPermisoConsultaMailMensajeCorreoInven) {
		this.isPermisoConsultaMailMensajeCorreoInven = isPermisoConsultaMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoBusquedaMailMensajeCorreoInven() {
		return isPermisoBusquedaMailMensajeCorreoInven;
	}

	public void setIsPermisoBusquedaMailMensajeCorreoInven(Boolean isPermisoBusquedaMailMensajeCorreoInven) {
		this.isPermisoBusquedaMailMensajeCorreoInven = isPermisoBusquedaMailMensajeCorreoInven;
	}

	public Boolean getIsPermisoReporteMailMensajeCorreoInven() {
		return isPermisoReporteMailMensajeCorreoInven;
	}

	public void setIsPermisoReporteMailMensajeCorreoInven(Boolean isPermisoReporteMailMensajeCorreoInven) {
		this.isPermisoReporteMailMensajeCorreoInven = isPermisoReporteMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioMailMensajeCorreoInven() {
		return isPermisoPaginacionMedioMailMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionMedioMailMensajeCorreoInven(Boolean isPermisoPaginacionMedioMailMensajeCorreoInven) {
		this.isPermisoPaginacionMedioMailMensajeCorreoInven = isPermisoPaginacionMedioMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoMailMensajeCorreoInven() {
		return isPermisoPaginacionTodoMailMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionTodoMailMensajeCorreoInven(Boolean isPermisoPaginacionTodoMailMensajeCorreoInven) {
		this.isPermisoPaginacionTodoMailMensajeCorreoInven = isPermisoPaginacionTodoMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoMailMensajeCorreoInven() {
		return isPermisoPaginacionAltoMailMensajeCorreoInven;
	}

	public void setIsPermisoPaginacionAltoMailMensajeCorreoInven(Boolean isPermisoPaginacionAltoMailMensajeCorreoInven) {
		this.isPermisoPaginacionAltoMailMensajeCorreoInven = isPermisoPaginacionAltoMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoCopiarMailMensajeCorreoInven() {
		return isPermisoCopiarMailMensajeCorreoInven;
	}

	public void setIsPermisoCopiarMailMensajeCorreoInven(Boolean isPermisoCopiarMailMensajeCorreoInven) {
		this.isPermisoCopiarMailMensajeCorreoInven = isPermisoCopiarMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoVerFormMailMensajeCorreoInven() {
		return isPermisoVerFormMailMensajeCorreoInven;
	}

	public void setIsPermisoVerFormMailMensajeCorreoInven(Boolean isPermisoVerFormMailMensajeCorreoInven) {
		this.isPermisoVerFormMailMensajeCorreoInven = isPermisoVerFormMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoDuplicarMailMensajeCorreoInven() {
		return isPermisoDuplicarMailMensajeCorreoInven;
	}

	public void setIsPermisoDuplicarMailMensajeCorreoInven(Boolean isPermisoDuplicarMailMensajeCorreoInven) {
		this.isPermisoDuplicarMailMensajeCorreoInven = isPermisoDuplicarMailMensajeCorreoInven;
	}
	
	public Boolean getIsPermisoOrdenMailMensajeCorreoInven() {
		return isPermisoOrdenMailMensajeCorreoInven;
	}

	public void setIsPermisoOrdenMailMensajeCorreoInven(Boolean isPermisoOrdenMailMensajeCorreoInven) {
		this.isPermisoOrdenMailMensajeCorreoInven = isPermisoOrdenMailMensajeCorreoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMailMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoMailMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoMailMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoMailMensajeCorreoInven = isVisibilidadCeldaNuevoMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMailMensajeCorreoInven() {
		return isVisibilidadCeldaDuplicarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaDuplicarMailMensajeCorreoInven(Boolean isVisibilidadCeldaDuplicarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven = isVisibilidadCeldaDuplicarMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMailMensajeCorreoInven() {
		return isVisibilidadCeldaCopiarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCopiarMailMensajeCorreoInven(Boolean isVisibilidadCeldaCopiarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaCopiarMailMensajeCorreoInven = isVisibilidadCeldaCopiarMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMailMensajeCorreoInven() {
		return isVisibilidadCeldaVerFormMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaVerFormMailMensajeCorreoInven(Boolean isVisibilidadCeldaVerFormMailMensajeCorreoInven) {
		this.isVisibilidadCeldaVerFormMailMensajeCorreoInven = isVisibilidadCeldaVerFormMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMailMensajeCorreoInven() {
		return isVisibilidadCeldaOrdenMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaOrdenMailMensajeCorreoInven(Boolean isVisibilidadCeldaOrdenMailMensajeCorreoInven) {
		this.isVisibilidadCeldaOrdenMailMensajeCorreoInven = isVisibilidadCeldaOrdenMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven() {
		return isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven(Boolean isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven) {
		this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven = isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMailMensajeCorreoInven() {
		return isVisibilidadCeldaModificarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaModificarMailMensajeCorreoInven(Boolean isVisibilidadCeldaModificarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaModificarMailMensajeCorreoInven = isVisibilidadCeldaModificarMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMailMensajeCorreoInven() {
		return isVisibilidadCeldaActualizarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaActualizarMailMensajeCorreoInven(Boolean isVisibilidadCeldaActualizarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaActualizarMailMensajeCorreoInven = isVisibilidadCeldaActualizarMailMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarMailMensajeCorreoInven() {
		return isVisibilidadCeldaEliminarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaEliminarMailMensajeCorreoInven(Boolean isVisibilidadCeldaEliminarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaEliminarMailMensajeCorreoInven = isVisibilidadCeldaEliminarMailMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarMailMensajeCorreoInven() {
		return isVisibilidadCeldaCancelarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaCancelarMailMensajeCorreoInven(Boolean isVisibilidadCeldaCancelarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaCancelarMailMensajeCorreoInven = isVisibilidadCeldaCancelarMailMensajeCorreoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarMailMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarMailMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarMailMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarMailMensajeCorreoInven = isVisibilidadCeldaGuardarMailMensajeCorreoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven() {
		return isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven(Boolean isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven) {
		this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven = isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven;
	}
		
	public MailMensajeCorreoInvenSessionBean getmailmensajecorreoinvenSessionBean() {
		return this.mailmensajecorreoinvenSessionBean;
	}
	
	public void setmailmensajecorreoinvenSessionBean(MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean) {
		this.mailmensajecorreoinvenSessionBean=mailmensajecorreoinvenSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven)throws Exception {
		try {
			
				this.setActualParaGuardarMensajeCorreoInvenForeignKey(mailmensajecorreoinven,null);
				this.setActualParaGuardarEmpresaForeignKey(mailmensajecorreoinven,null);
				this.setActualParaGuardarSucursalForeignKey(mailmensajecorreoinven,null);
				this.setActualParaGuardarModuloForeignKey(mailmensajecorreoinven,null);
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
	
	public void bugActualizarReferenciaActual(MailMensajeCorreoInven mailmensajecorreoinven,MailMensajeCorreoInven mailmensajecorreoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMailMensajeCorreoInven(mailmensajecorreoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mailmensajecorreoinvenAux.setId(mailmensajecorreoinven.getId());
		mailmensajecorreoinvenAux.setVersionRow(mailmensajecorreoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMailMensajeCorreoInven();
		
			int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = mailmensajecorreoinvenValidator.getInvalidValues(this.mailmensajecorreoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			mailmensajecorreoinvenLogic.setDatosCliente(datosCliente);
			mailmensajecorreoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				mailmensajecorreoinvenAux=new  MailMensajeCorreoInven();
				
				mailmensajecorreoinvenAux.setIsNew(true);
				mailmensajecorreoinvenAux.setIsChanged(true);
				
				mailmensajecorreoinvenAux.setMailMensajeCorreoInvenOriginal(this.mailmensajecorreoinven);
				
				mailmensajecorreoinvenAux.setId(this.mailmensajecorreoinven.getId());	
				mailmensajecorreoinvenAux.setVersionRow(this.mailmensajecorreoinven.getVersionRow());	
				mailmensajecorreoinvenAux.setid_mensaje_correo_inven(this.mailmensajecorreoinven.getid_mensaje_correo_inven());	
				mailmensajecorreoinvenAux.setid_empresa(this.mailmensajecorreoinven.getid_empresa());	
				mailmensajecorreoinvenAux.setid_sucursal(this.mailmensajecorreoinven.getid_sucursal());	
				mailmensajecorreoinvenAux.setid_modulo(this.mailmensajecorreoinven.getid_modulo());	
				mailmensajecorreoinvenAux.setmail(this.mailmensajecorreoinven.getmail());	
				mailmensajecorreoinvenAux.setesta_activo(this.mailmensajecorreoinven.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvens();//WithConnection
						//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesMailMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvenRelaciones(mailmensajecorreoinvenAux);//WithConnection
								//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				mailmensajecorreoinvenAux=new  MailMensajeCorreoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.mailmensajecorreoinven.getId()>=0)) {
						
					mailmensajecorreoinvenAux.setIsNew(false);
				}
				
				mailmensajecorreoinvenAux.setIsDeleted(false);
			
				mailmensajecorreoinvenAux.setId(this.mailmensajecorreoinven.getId());	
				mailmensajecorreoinvenAux.setVersionRow(this.mailmensajecorreoinven.getVersionRow());	
				mailmensajecorreoinvenAux.setid_mensaje_correo_inven(this.mailmensajecorreoinven.getid_mensaje_correo_inven());	
				mailmensajecorreoinvenAux.setid_empresa(this.mailmensajecorreoinven.getid_empresa());	
				mailmensajecorreoinvenAux.setid_sucursal(this.mailmensajecorreoinven.getid_sucursal());	
				mailmensajecorreoinvenAux.setid_modulo(this.mailmensajecorreoinven.getid_modulo());	
				mailmensajecorreoinvenAux.setmail(this.mailmensajecorreoinven.getmail());	
				mailmensajecorreoinvenAux.setesta_activo(this.mailmensajecorreoinven.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvens();//WithConnection
						//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);
					
					this.refrescarForeignKeysDescripcionesMailMensajeCorreoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvenRelaciones(mailmensajecorreoinvenAux);//WithConnection
								//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mailmensajecorreoinven,mailmensajecorreoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				mailmensajecorreoinvenAux=new  MailMensajeCorreoInven();
				
				mailmensajecorreoinvenAux.setIsNew(false);
				mailmensajecorreoinvenAux.setIsChanged(false);
				
				mailmensajecorreoinvenAux.setIsDeleted(true);
				
				mailmensajecorreoinvenAux.setId(this.mailmensajecorreoinven.getId());	
				mailmensajecorreoinvenAux.setVersionRow(this.mailmensajecorreoinven.getVersionRow());	
				mailmensajecorreoinvenAux.setid_mensaje_correo_inven(this.mailmensajecorreoinven.getid_mensaje_correo_inven());	
				mailmensajecorreoinvenAux.setid_empresa(this.mailmensajecorreoinven.getid_empresa());	
				mailmensajecorreoinvenAux.setid_sucursal(this.mailmensajecorreoinven.getid_sucursal());	
				mailmensajecorreoinvenAux.setid_modulo(this.mailmensajecorreoinven.getid_modulo());	
				mailmensajecorreoinvenAux.setmail(this.mailmensajecorreoinven.getmail());	
				mailmensajecorreoinvenAux.setesta_activo(this.mailmensajecorreoinven.getesta_activo());	
				
				if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.mailmensajecorreoinvenAux.getId()>=0) {	
						this.mailmensajecorreoinvensEliminados.add(mailmensajecorreoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvens();//WithConnection
						//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvenRelaciones(mailmensajecorreoinvenAux);//WithConnection
								//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
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
							if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(mailmensajecorreoinvenAux,mailmensajecorreoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(this.mailmensajecorreoinvensEliminados);
					
					mailmensajecorreoinvenLogic.saveMailMensajeCorreoInvens();//WithConnection
					//mailmensajecorreoinvenLogic.getSetVersionRowMailMensajeCorreoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMailMensajeCorreoInven();
				
				this.mailmensajecorreoinvensEliminados= new ArrayList<MailMensajeCorreoInven>();		
			}
			
			if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Mail Mensaje Correo Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.mailmensajecorreoinven=mailmensajecorreoinvenAux;
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
      		//this.finishProcessMailMensajeCorreoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(MailMensajeCorreoInven mailmensajecorreoinvenLocal) throws Exception {
		
		if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MailMensajeCorreoInven mailmensajecorreoinvenLocal) throws Exception {	
		if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(MensajeCorreoInvenDetalleFormJInternalFrame.class)) {
				MensajeCorreoInvenBeanSwingJInternalFrame mensajecorreoinvenBeanSwingJInternalFrameLocal=(MensajeCorreoInvenBeanSwingJInternalFrame) ((MensajeCorreoInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mensajecorreoinvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMensajeCorreoInven(mensajecorreoinvenBeanSwingJInternalFrameLocal.getmensajecorreoinven(),true);
				mensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarLista(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven,this.mensajecorreoinvensForeignKey);

				mensajecorreoinvenBeanSwingJInternalFrameLocal.actualizarRelaciones(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven);

				mailmensajecorreoinvenLocal.setMensajeCorreoInven(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven);

				this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
				this.cargarCombosFrameMensajeCorreoInvensForeignKey("Formulario");
				this.setActualMensajeCorreoInvenForeignKey(mensajecorreoinvenBeanSwingJInternalFrameLocal.mensajecorreoinven.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mailmensajecorreoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				mailmensajecorreoinvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				mailmensajecorreoinvenLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMailMensajeCorreoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mailmensajecorreoinvenValidator.getInvalidValues(this.mailmensajecorreoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MailMensajeCorreoInven mailmensajecorreoinven,List<MailMensajeCorreoInven> mailmensajecorreoinvens) throws Exception {
		try	{		
			MailMensajeCorreoInvenConstantesFunciones.actualizarLista(mailmensajecorreoinven,mailmensajecorreoinvens,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MailMensajeCorreoInven mailmensajecorreoinven,List<MailMensajeCorreoInven> mailmensajecorreoinvens) throws Exception {
		try	{			
			MailMensajeCorreoInvenConstantesFunciones.actualizarSelectedLista(mailmensajecorreoinven,mailmensajecorreoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MailMensajeCorreoInven> mailmensajecorreoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mailmensajecorreoinvensLocal=this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mailmensajecorreoinvensLocal=this.mailmensajecorreoinvens;
			}
			//ARCHITECTURE
		
			for(MailMensajeCorreoInven mailmensajecorreoinvenLocal:mailmensajecorreoinvensLocal) {
				if(this.permiteMantenimiento(mailmensajecorreoinvenLocal) && mailmensajecorreoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MailMensajeCorreoInvenConstantesFunciones.getMailMensajeCorreoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.IDMENSAJECORREOINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_mensaje_correo_invenMailMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_empresaMailMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_sucursalMailMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_moduloMailMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.MAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelmailMailMensajeCorreoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MailMensajeCorreoInvenConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelesta_activoMailMensajeCorreoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_mensaje_correo_invenMailMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_empresaMailMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_sucursalMailMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelid_moduloMailMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelmailMailMensajeCorreoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelesta_activoMailMensajeCorreoInven,"");
		
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
		this.iIdNuevoMailMensajeCorreoInven--;	
		
		
		this.mailmensajecorreoinvenAux=new MailMensajeCorreoInven();
		
		this.mailmensajecorreoinvenAux.setId(this.iIdNuevoMailMensajeCorreoInven);
		this.mailmensajecorreoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().add(this.mailmensajecorreoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mailmensajecorreoinvens.add(this.mailmensajecorreoinvenAux);
		}
		//ARCHITECTURE
		
		this.mailmensajecorreoinven=this.mailmensajecorreoinvenAux;
		
		if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyMailMensajeCorreoInven(this.mailmensajecorreoinven);
		}
				
		//this.setDefaultControlesMailMensajeCorreoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMailMensajeCorreoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMailMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMailMensajeCorreoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinvenBean,this.mailmensajecorreoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			classes=MailMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMailMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.procesarEventosMailMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this.mailmensajecorreoinven,this.mailmensajecorreoinvenParameterGeneral,this.isEsNuevoMailMensajeCorreoInven,classes);//this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral,this.mailmensajecorreoinvenBean,false);
		
		if(this.mailmensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven());
		}
		
		if(this.mailmensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven(),classes);//this.mailmensajecorreoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMailMensajeCorreoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMailMensajeCorreoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarFormMailMensajeCorreoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
						
			if(mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMailMensajeCorreoInven();
			}
			
			this.actualizarVisualTableDatosMailMensajeCorreoInven();
			
			this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMailMensajeCorreoInven(), this.getIndiceNuevoMailMensajeCorreoInven());
			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
						
			this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMailMensajeCorreoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activarmailMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activaresta_activoMailMensajeCorreoInven);	
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenMailMensajeCorreoInven);//
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activarid_empresaMailMensajeCorreoInven);//
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activarid_sucursalMailMensajeCorreoInven);//
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setEnabled(isHabilitar && this.mailmensajecorreoinvenConstantesFunciones.activarid_moduloMailMensajeCorreoInven);
	};
	
	public void setDefaultControlesMailMensajeCorreoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMailMensajeCorreoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(true);			
			this.mailmensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.setVisible(true);
			
					
		} else {
			//this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(false);			
			this.mailmensajecorreoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMailMensajeCorreoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				if(mailmensajecorreoinvenAux.getId().equals(this.iIdNuevoMailMensajeCorreoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvens) {
				if(mailmensajecorreoinvenAux.getId().equals(this.iIdNuevoMailMensajeCorreoInven)) {
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
	
	public int getIndiceActualMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				if(mailmensajecorreoinvenAux.getId().equals(mailmensajecorreoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvens) {
				if(mailmensajecorreoinvenAux.getId().equals(mailmensajecorreoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				if(mailmensajecorreoinvenAux.getMailMensajeCorreoInvenOriginal().getId().equals(mailmensajecorreoinvenOriginal.getId())) {
					existe=true;
					mailmensajecorreoinvenOriginal.setId(mailmensajecorreoinvenAux.getId());
					mailmensajecorreoinvenOriginal.setVersionRow(mailmensajecorreoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvens) {
				if(mailmensajecorreoinvenAux.getMailMensajeCorreoInvenOriginal().getId().equals(mailmensajecorreoinvenOriginal.getId())) {
					existe=true;
					mailmensajecorreoinvenOriginal.setId(mailmensajecorreoinvenAux.getId());
					mailmensajecorreoinvenOriginal.setVersionRow(mailmensajecorreoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMailMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
		mailmensajecorreoinvenAux=new MailMensajeCorreoInven();
		
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
					if(mailmensajecorreoinvenAux.getId()<0) {
						mailmensajecorreoinvensAux.add(mailmensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoMailMensajeCorreoInven=0L;
				this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().removeAll(mailmensajecorreoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvens) {
					if(mailmensajecorreoinvenAux.getId()<0) {
						mailmensajecorreoinvensAux.add(mailmensajecorreoinvenAux);
					}		
				}
				this.iIdNuevoMailMensajeCorreoInven=0L;
				this.mailmensajecorreoinvens.removeAll(mailmensajecorreoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMailMensajeCorreoInven 
					&& this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()>0
					) {
					mailmensajecorreoinvenAux=this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().get(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size() - 1);
				
					if(mailmensajecorreoinvenAux.getId()<0) {
						this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().remove(mailmensajecorreoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMailMensajeCorreoInven && this.mailmensajecorreoinvens.size()>0) {
					mailmensajecorreoinvenAux=this.mailmensajecorreoinvens.get(this.mailmensajecorreoinvens.size() - 1);
				
					if(mailmensajecorreoinvenAux.getId()<0) {
						this.mailmensajecorreoinvens.remove(mailmensajecorreoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMailMensajeCorreoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mailmensajecorreoinven.getId()<0) {
				this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().remove(this.mailmensajecorreoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mailmensajecorreoinven.getId()<0) {
				this.mailmensajecorreoinvens.remove(this.mailmensajecorreoinven);
			}
		}			
	}
	
	public void setEstadosInicialesMailMensajeCorreoInven(List<MailMensajeCorreoInven> mailmensajecorreoinvensAux) throws Exception {
		MailMensajeCorreoInvenConstantesFunciones.setEstadosInicialesMailMensajeCorreoInven(mailmensajecorreoinvensAux);
	}
	
	public void setEstadosInicialesMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinvenAux) throws Exception {
		MailMensajeCorreoInvenConstantesFunciones.setEstadosInicialesMailMensajeCorreoInven(mailmensajecorreoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMailMensajeCorreoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMailMensajeCorreoInvenActual()) {
				if(!this.isEsNuevoMailMensajeCorreoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMailMensajeCorreoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMailMensajeCorreoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mail Mensaje Correo Inven ?", "MANTENIMIENTO DE Mail Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MailMensajeCorreoInven mailmensajecorreoinven) throws Exception {
		MailMensajeCorreoInvenConstantesFunciones.seleccionarAsignar(this.mailmensajecorreoinven,mailmensajecorreoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMailMensajeCorreoInven=this.isPermisoActualizarOriginalMailMensajeCorreoInven;
			
			
			this.seleccionarAsignar(mailmensajecorreoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MailMensajeCorreoInvenConstantesFunciones.quitarEspaciosMailMensajeCorreoInven(this.mailmensajecorreoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mailmensajecorreoinvenSessionBean.setsFuncionBusquedaRapida(this.mailmensajecorreoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMailMensajeCorreoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMailMensajeCorreoInven(esParaCancelar);				
				this.cancelarNuevoMailMensajeCorreoInven(esParaCancelar);								
			}
			
			this.mailmensajecorreoinven=new MailMensajeCorreoInven();
			
			this.inicializarMailMensajeCorreoInven();
			
			this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMailMensajeCorreoInven() throws Exception {
		try {
			MailMensajeCorreoInvenConstantesFunciones.inicializarMailMensajeCorreoInven(this.mailmensajecorreoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMailMensajeCorreoInvens(String sAccionBusqueda,List<MailMensajeCorreoInven> mailmensajecorreoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="MailMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MailMensajeCorreoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MailMensajeCorreoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MailMensajeCorreoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mail Mensaje Correo Invenes");		
		parameters.put("busquedapor", MailMensajeCorreoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMailMensajeCorreoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MailMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MailMensajeCorreoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMailMensajeCorreoInven=new JRBeanArrayDataSource(MailMensajeCorreoInvenJInternalFrame.TraerMailMensajeCorreoInvenBeans(mailmensajecorreoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMailMensajeCorreoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MailMensajeCorreoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MailMensajeCorreoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MailMensajeCorreoInvenBean.TraerMailMensajeCorreoInvenBeans(mailmensajecorreoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInvenActionPerformed(null);
					//this.generarExcelReporteMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMailMensajeCorreoInvens(sAccionBusqueda,sTipoArchivoReporte,mailmensajecorreoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMailMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MailMensajeCorreoInven> mailmensajecorreoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MailMensajeCorreoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMailMensajeCorreoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MailMensajeCorreoInven mailmensajecorreoinven : mailmensajecorreoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MailMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataMailMensajeCorreoInven("NORMAL",row,workbook,mailmensajecorreoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMailMensajeCorreoInven(String sTipo,Row row,Workbook workbook) {
		
		MailMensajeCorreoInvenConstantesFunciones.generarExcelReporteHeaderMailMensajeCorreoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMailMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MailMensajeCorreoInven> mailmensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MailMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MailMensajeCorreoInven mailmensajecorreoinven : mailmensajecorreoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.getMailMensajeCorreoInvenDescripcion(mailmensajecorreoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mailmensajecorreoinven.getmensajecorreoinven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mailmensajecorreoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mailmensajecorreoinven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mailmensajecorreoinven.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mailmensajecorreoinven.getmail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(mailmensajecorreoinven.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMailMensajeCorreoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<MailMensajeCorreoInven> mailmensajecorreoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MailMensajeCorreoInven> mailmensajecorreoinvensRespaldo=null;
		
		classes=MailMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMailMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mailmensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
		this.mailmensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
		this.mailmensajecorreoinvenLogic.setIsConDeep(true);
		
		mailmensajecorreoinvensRespaldo=this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens();
		
		this.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(mailmensajecorreoinvensParaReportes);	
		this.mailmensajecorreoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mailmensajecorreoinvensParaReportes=this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens();
		this.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(mailmensajecorreoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MailMensajeCorreoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMailMensajeCorreoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MailMensajeCorreoInven mailmensajecorreoinven : mailmensajecorreoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMailMensajeCorreoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MailMensajeCorreoInvenConstantesFunciones.generarExcelReporteDataMailMensajeCorreoInven("NORMAL",row,workbook,mailmensajecorreoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.getMailMensajeCorreoInvenDescripcion(mailmensajecorreoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMailMensajeCorreoInven() throws Exception {		
		this.startProcessMailMensajeCorreoInven(true);
	}
	
	public void startProcessMailMensajeCorreoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMailMensajeCorreoInven ,this.jPanelParametrosReportesMailMensajeCorreoInven, this.jScrollPanelDatosMailMensajeCorreoInven,this.jPanelPaginacionMailMensajeCorreoInven, this.jScrollPanelDatosEdicionMailMensajeCorreoInven, this.jPanelAccionesMailMensajeCorreoInven,this.jPanelAccionesFormularioMailMensajeCorreoInven,this.jmenuBarMailMensajeCorreoInven,this.jmenuBarDetalleMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasMailMensajeCorreoInven=this.jTabbedPaneBusquedasMailMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesMailMensajeCorreoInven=this.jPanelParametrosReportesMailMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosMailMensajeCorreoInven=this.jScrollPanelDatosMailMensajeCorreoInven;
		final JTable jTableDatosMailMensajeCorreoInven=this.jTableDatosMailMensajeCorreoInven;		
		final JPanel jPanelPaginacionMailMensajeCorreoInven=this.jPanelPaginacionMailMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionMailMensajeCorreoInven=this.jScrollPanelDatosEdicionMailMensajeCorreoInven;
		final JPanel jPanelAccionesMailMensajeCorreoInven=this.jPanelAccionesMailMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarMailMensajeCorreoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelCamposMailMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelAccionesFormularioMailMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposMailMensajeCorreoInven=jPanelCamposAuxiliarMailMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioMailMensajeCorreoInven=jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarMailMensajeCorreoInven=this.jmenuBarMailMensajeCorreoInven;
		final JToolBar jTtoolBarMailMensajeCorreoInven=this.jTtoolBarMailMensajeCorreoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMailMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMailMensajeCorreoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jmenuBarDetalleMailMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTtoolBarDetalleMailMensajeCorreoInven;
		}
		
		final JMenuBar jmenuBarDetalleMailMensajeCorreoInven=jmenuBarDetalleAuxiliarMailMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleMailMensajeCorreoInven=jTtoolBarDetalleAuxiliarMailMensajeCorreoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMailMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMailMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosMailMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposMailMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionMailMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesMailMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMailMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarMailMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMailMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarMailMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMailMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMailMensajeCorreoInven ,jPanelParametrosReportesMailMensajeCorreoInven,jTableDatosMailMensajeCorreoInven, /*jScrollPanelDatosMailMensajeCorreoInven,*/jPanelCamposMailMensajeCorreoInven,jPanelPaginacionMailMensajeCorreoInven, /*jScrollPanelDatosEdicionMailMensajeCorreoInven,*/ jPanelAccionesMailMensajeCorreoInven,jPanelAccionesFormularioMailMensajeCorreoInven,jmenuBarMailMensajeCorreoInven,jmenuBarDetalleMailMensajeCorreoInven,jTtoolBarMailMensajeCorreoInven,jTtoolBarDetalleMailMensajeCorreoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMailMensajeCorreoInven ,jPanelParametrosReportesMailMensajeCorreoInven, jScrollPanelDatosMailMensajeCorreoInven,jPanelPaginacionMailMensajeCorreoInven, jScrollPanelDatosEdicionMailMensajeCorreoInven, jPanelAccionesMailMensajeCorreoInven,jPanelAccionesFormularioMailMensajeCorreoInven,jmenuBarMailMensajeCorreoInven,jmenuBarDetalleMailMensajeCorreoInven,jTtoolBarMailMensajeCorreoInven,jTtoolBarDetalleMailMensajeCorreoInven);
						
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
	
	public void finishProcessMailMensajeCorreoInven() {// throws Exception 
		this.finishProcessMailMensajeCorreoInven(true);
	}
	
	public void finishProcessMailMensajeCorreoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMailMensajeCorreoInven ,this.jPanelParametrosReportesMailMensajeCorreoInven, this.jScrollPanelDatosMailMensajeCorreoInven,this.jPanelPaginacionMailMensajeCorreoInven, this.jScrollPanelDatosEdicionMailMensajeCorreoInven, this.jPanelAccionesMailMensajeCorreoInven,this.jPanelAccionesFormularioMailMensajeCorreoInven,this.jmenuBarMailMensajeCorreoInven,this.jmenuBarDetalleMailMensajeCorreoInven,this.jTtoolBarMailMensajeCorreoInven,this.jTtoolBarDetalleMailMensajeCorreoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasMailMensajeCorreoInven=this.jTabbedPaneBusquedasMailMensajeCorreoInven; 
		
		final JPanel jPanelParametrosReportesMailMensajeCorreoInven=this.jPanelParametrosReportesMailMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosMailMensajeCorreoInven=this.jScrollPanelDatosMailMensajeCorreoInven;
		final JTable jTableDatosMailMensajeCorreoInven=this.jTableDatosMailMensajeCorreoInven;		
		final JPanel jPanelPaginacionMailMensajeCorreoInven=this.jPanelPaginacionMailMensajeCorreoInven;
		//final JScrollPane jScrollPanelDatosEdicionMailMensajeCorreoInven=this.jScrollPanelDatosEdicionMailMensajeCorreoInven;
		final JPanel jPanelAccionesMailMensajeCorreoInven=this.jPanelAccionesMailMensajeCorreoInven;
		
		JPanel jPanelCamposAuxiliarMailMensajeCorreoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			jPanelCamposAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelCamposMailMensajeCorreoInven;
			jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelAccionesFormularioMailMensajeCorreoInven;
		}
		
		final JPanel jPanelCamposMailMensajeCorreoInven=jPanelCamposAuxiliarMailMensajeCorreoInven;
		final JPanel jPanelAccionesFormularioMailMensajeCorreoInven=jPanelAccionesFormularioAuxiliarMailMensajeCorreoInven;
		
		
		final JMenuBar jmenuBarMailMensajeCorreoInven=this.jmenuBarMailMensajeCorreoInven;		
		final JToolBar jTtoolBarMailMensajeCorreoInven=this.jTtoolBarMailMensajeCorreoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarMailMensajeCorreoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMailMensajeCorreoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			jmenuBarDetalleAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jmenuBarDetalleMailMensajeCorreoInven;
			jTtoolBarDetalleAuxiliarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTtoolBarDetalleMailMensajeCorreoInven;		
		}
		
		final JMenuBar jmenuBarDetalleMailMensajeCorreoInven=jmenuBarDetalleAuxiliarMailMensajeCorreoInven;
		final JToolBar jTtoolBarDetalleMailMensajeCorreoInven=jTtoolBarDetalleAuxiliarMailMensajeCorreoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMailMensajeCorreoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMailMensajeCorreoInven;
			processRunnable.jTableDatos=jTableDatosMailMensajeCorreoInven;
			processRunnable.jPanelCampos=jPanelCamposMailMensajeCorreoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionMailMensajeCorreoInven;
			processRunnable.jPanelAcciones=jPanelAccionesMailMensajeCorreoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMailMensajeCorreoInven;
			
			
			processRunnable.jmenuBar=jmenuBarMailMensajeCorreoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMailMensajeCorreoInven;
			processRunnable.jTtoolBar=jTtoolBarMailMensajeCorreoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMailMensajeCorreoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMailMensajeCorreoInven ,jPanelParametrosReportesMailMensajeCorreoInven, jTableDatosMailMensajeCorreoInven,/*jScrollPanelDatosMailMensajeCorreoInven,*/jPanelCamposMailMensajeCorreoInven,jPanelPaginacionMailMensajeCorreoInven, /*jScrollPanelDatosEdicionMailMensajeCorreoInven,*/ jPanelAccionesMailMensajeCorreoInven,jPanelAccionesFormularioMailMensajeCorreoInven,jmenuBarMailMensajeCorreoInven,jmenuBarDetalleMailMensajeCorreoInven,jTtoolBarMailMensajeCorreoInven,jTtoolBarDetalleMailMensajeCorreoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMailMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMailMensajeCorreoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMailMensajeCorreoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMailMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMailMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMailMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMailMensajeCorreoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMailMensajeCorreoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMailMensajeCorreoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mailmensajecorreoinvenConstantesFunciones.getsFinalQueryMailMensajeCorreoInven();
		String  finalQueryPaginacionTodos=this.mailmensajecorreoinvenConstantesFunciones.getsFinalQueryMailMensajeCorreoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MailMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesNoMailMensajeCorreoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MailMensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesMailMensajeCorreoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MailMensajeCorreoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mailmensajecorreoinvensEliminados= new ArrayList<MailMensajeCorreoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMailMensajeCorreoInven();
		
				///*MailMensajeCorreoInvenSessionBean*/this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			
			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
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
					this.iNumeroPaginacion=MailMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MailMensajeCorreoInvenConstantesFunciones.getClassesForeignKeysOfMailMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mailmensajecorreoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mailmensajecorreoinvensAux= new ArrayList<MailMensajeCorreoInven>();
			
				
			mailmensajecorreoinvenLogic.setDatosCliente(this.datosCliente);
			mailmensajecorreoinvenLogic.setDatosDeep(this.datosDeep);
			mailmensajecorreoinvenLogic.setIsConDeep(true);
			
			
			mailmensajecorreoinvenLogic.getMailMensajeCorreoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					mailmensajecorreoinvenLogic.getTodosMailMensajeCorreoInvens(finalQueryGlobal,pagination);
					
					//mailmensajecorreoinvenLogic.getTodosMailMensajeCorreoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()==null|| mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mailmensajecorreoinvensAux= new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvensAux= new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mailmensajecorreoinvenLogic.getTodosMailMensajeCorreoInvens(finalQueryGlobal+"",this.pagination);												
							
							//mailmensajecorreoinvenLogic.getTodosMailMensajeCorreoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());					
							mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(mailmensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvens.addAll(mailmensajecorreoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMailMensajeCorreoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMailMensajeCorreoInven=this.idActual;
				
				} else if(this.idMailMensajeCorreoInvenActual!=null && this.idMailMensajeCorreoInvenActual!=0L) {
					idMailMensajeCorreoInven=idMailMensajeCorreoInvenActual;
				}
				
					
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndicePorId(idMailMensajeCorreoInven);
				
				this.mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					mailmensajecorreoinvenLogic.getEntity(idMailMensajeCorreoInven);
					
					//mailmensajecorreoinvenLogic.getEntityWithConnection(idMailMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().add(mailmensajecorreoinvenLogic.getMailMensajeCorreoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
					this.mailmensajecorreoinvens.add(mailmensajecorreoinven);
				}
				
				if(mailmensajecorreoinvenLogic.getMailMensajeCorreoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()==null||mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mailmensajecorreoinvens==null|| mailmensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
						mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMailMensajeCorreoInvens("FK_IdEmpresa",mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMailMensajeCorreoInvens("FK_IdEmpresa",mailmensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
						mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(mailmensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvens.addAll(mailmensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMensajeCorreoInven")) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdMensajeCorreoInven(finalQueryGlobal,pagination,id_mensaje_correo_invenFK_IdMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()==null||mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mailmensajecorreoinvens==null|| mailmensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
						mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdMensajeCorreoInven(finalQueryGlobal,pagination,id_mensaje_correo_invenFK_IdMensajeCorreoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdMensajeCorreoInven(id_mensaje_correo_invenFK_IdMensajeCorreoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMailMensajeCorreoInvens("FK_IdMensajeCorreoInven",mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMailMensajeCorreoInvens("FK_IdMensajeCorreoInven",mailmensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
						mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(mailmensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvens.addAll(mailmensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()==null||mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mailmensajecorreoinvens==null|| mailmensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
						mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMailMensajeCorreoInvens("FK_IdModulo",mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMailMensajeCorreoInvens("FK_IdModulo",mailmensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
						mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(mailmensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvens.addAll(mailmensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()==null||mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mailmensajecorreoinvens==null|| mailmensajecorreoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
						mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvensAux=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvensAux.addAll(mailmensajecorreoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MailMensajeCorreoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMailMensajeCorreoInvens("FK_IdSucursal",mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMailMensajeCorreoInvens("FK_IdSucursal",mailmensajecorreoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(new ArrayList<MailMensajeCorreoInven>());
						mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().addAll(mailmensajecorreoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvens=new ArrayList<MailMensajeCorreoInven>();
							mailmensajecorreoinvens.addAll(mailmensajecorreoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMailMensajeCorreoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMailMensajeCorreoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mailmensajecorreoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mailmensajecorreoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MailMensajeCorreoInven mailmensajecorreoinven) {
		Boolean permite=true;
		
		if(this.mailmensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MailMensajeCorreoInvenConstantesFunciones.getOrderByListaMailMensajeCorreoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MailMensajeCorreoInvenConstantesFunciones.getOrderByListaMailMensajeCorreoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				if(mailmensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mailmensajecorreoinvenTotales=mailmensajecorreoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MailMensajeCorreoInven mailmensajecorreoinven:this.mailmensajecorreoinvens) {
				if(mailmensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mailmensajecorreoinvenTotales=mailmensajecorreoinven;
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
			this.mailmensajecorreoinvenAux=new MailMensajeCorreoInven();
			this.mailmensajecorreoinvenAux.setsType(Constantes2.S_TOTALES);
			this.mailmensajecorreoinvenAux.setIsNew(false);
			this.mailmensajecorreoinvenAux.setIsChanged(false);
			this.mailmensajecorreoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MailMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMailMensajeCorreoInven(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this.mailmensajecorreoinvenAux);
				
				this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().add(this.mailmensajecorreoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MailMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMailMensajeCorreoInven(this.mailmensajecorreoinvens,this.mailmensajecorreoinvenAux);
				
				this.mailmensajecorreoinvens.add(this.mailmensajecorreoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mailmensajecorreoinvenTotales=new MailMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().remove(mailmensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mailmensajecorreoinvens.remove(mailmensajecorreoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mailmensajecorreoinvenTotales=new MailMensajeCorreoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				if(mailmensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mailmensajecorreoinvenTotales=mailmensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MailMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMailMensajeCorreoInven(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),mailmensajecorreoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MailMensajeCorreoInven mailmensajecorreoinven:this.mailmensajecorreoinvens) {
				if(mailmensajecorreoinven.getsType().equals(Constantes2.S_TOTALES)) {
					mailmensajecorreoinvenTotales=mailmensajecorreoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MailMensajeCorreoInvenConstantesFunciones.TotalizarValoresFilaMailMensajeCorreoInven(this.mailmensajecorreoinvens,mailmensajecorreoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMailMensajeCorreoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMailMensajeCorreoInvensFK_IdMensajeCorreoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdMensajeCorreoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMailMensajeCorreoInvensFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMailMensajeCorreoInvensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMailMensajeCorreoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMailMensajeCorreoInvensFK_IdMensajeCorreoInven(String sFinalQuery,Long id_mensaje_correo_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdMensajeCorreoInven(sFinalQuery,this.pagination,id_mensaje_correo_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMailMensajeCorreoInvensFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMailMensajeCorreoInvensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLogic.getMailMensajeCorreoInvensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosMailMensajeCorreoInven() {
		this.isPermisoTodoMailMensajeCorreoInven=false;
		this.isPermisoNuevoMailMensajeCorreoInven=false;
		this.isPermisoActualizarMailMensajeCorreoInven=false;
		this.isPermisoActualizarOriginalMailMensajeCorreoInven=false;
		this.isPermisoEliminarMailMensajeCorreoInven=false;
		this.isPermisoGuardarCambiosMailMensajeCorreoInven=false;
		this.isPermisoConsultaMailMensajeCorreoInven=false;
		this.isPermisoBusquedaMailMensajeCorreoInven=false;
		this.isPermisoReporteMailMensajeCorreoInven=false;		
		this.isPermisoOrdenMailMensajeCorreoInven=false;		
		this.isPermisoPaginacionMedioMailMensajeCorreoInven=false;		
		this.isPermisoPaginacionAltoMailMensajeCorreoInven=false;
		this.isPermisoPaginacionTodoMailMensajeCorreoInven=false;
		this.isPermisoCopiarMailMensajeCorreoInven=false;		
		this.isPermisoVerFormMailMensajeCorreoInven=false;		
		this.isPermisoDuplicarMailMensajeCorreoInven=false;		
		this.isPermisoOrdenMailMensajeCorreoInven=false;		
	}
	
	public void setPermisosUsuarioMailMensajeCorreoInven(Boolean isPermiso) {
		this.isPermisoTodoMailMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoMailMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarMailMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalMailMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarMailMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosMailMensajeCorreoInven=isPermiso;
		this.isPermisoConsultaMailMensajeCorreoInven=isPermiso;
		this.isPermisoBusquedaMailMensajeCorreoInven=isPermiso;
		this.isPermisoReporteMailMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenMailMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionMedioMailMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionAltoMailMensajeCorreoInven=isPermiso;		
		this.isPermisoPaginacionTodoMailMensajeCorreoInven=isPermiso;		
		this.isPermisoCopiarMailMensajeCorreoInven=isPermiso;		
		this.isPermisoVerFormMailMensajeCorreoInven=isPermiso;		
		this.isPermisoDuplicarMailMensajeCorreoInven=isPermiso;
		this.isPermisoOrdenMailMensajeCorreoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMailMensajeCorreoInven(Boolean isPermiso) {
		//this.isPermisoTodoMailMensajeCorreoInven=isPermiso;
		this.isPermisoNuevoMailMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarMailMensajeCorreoInven=isPermiso;
		this.isPermisoActualizarOriginalMailMensajeCorreoInven=isPermiso;
		this.isPermisoEliminarMailMensajeCorreoInven=isPermiso;
		this.isPermisoGuardarCambiosMailMensajeCorreoInven=isPermiso;
		//this.isPermisoConsultaMailMensajeCorreoInven=isPermiso;
		//this.isPermisoBusquedaMailMensajeCorreoInven=isPermiso;
		//this.isPermisoReporteMailMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenMailMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionMedioMailMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionAltoMailMensajeCorreoInven=isPermiso;		
		//this.isPermisoPaginacionTodoMailMensajeCorreoInven=isPermiso;		
		//this.isPermisoCopiarMailMensajeCorreoInven=isPermiso;		
		//this.isPermisoDuplicarMailMensajeCorreoInven=isPermiso;
		//this.isPermisoOrdenMailMensajeCorreoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMailMensajeCorreoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MailMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMailMensajeCorreoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMailMensajeCorreoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMailMensajeCorreoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMailMensajeCorreoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMailMensajeCorreoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMailMensajeCorreoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MailMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMailMensajeCorreoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMailMensajeCorreoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMailMensajeCorreoInven=this.isPermisoActualizarMailMensajeCorreoInven;
			this.isPermisoEliminarMailMensajeCorreoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMailMensajeCorreoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMailMensajeCorreoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMailMensajeCorreoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMailMensajeCorreoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMailMensajeCorreoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMailMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMailMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMailMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMailMensajeCorreoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMailMensajeCorreoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMailMensajeCorreoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMailMensajeCorreoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMailMensajeCorreoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMailMensajeCorreoInven.setToolTipText(this.jTableDatosMailMensajeCorreoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMailMensajeCorreoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMailMensajeCorreoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMailMensajeCorreoInven() throws Exception {
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
	public void inicializarCombosForeignKeyMailMensajeCorreoInvenListas()throws Exception {
		try	{						
			
				this.mensajecorreoinvensForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMailMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MailMensajeCorreoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMailMensajeCorreoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyMensajeCorreoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyMailMensajeCorreoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenReturnGeneral=new MailMensajeCorreoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalMensajeCorreoInven="";

				if(((this.mensajecorreoinvensForeignKey==null||this.mensajecorreoinvensForeignKey.size()<=0) && this.mailmensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenMailMensajeCorreoInven)
					 || (this.esRecargarFks && this.mailmensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenMailMensajeCorreoInven)) {

					if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MensajeCorreoInvenConstantesFunciones.getArrayColumnasGlobalesMensajeCorreoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMensajeCorreoInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MensajeCorreoInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalMensajeCorreoInven=Funciones.GetFinalQueryAppend(finalQueryGlobalMensajeCorreoInven, "");
						finalQueryGlobalMensajeCorreoInven+=MensajeCorreoInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMensajeCorreoInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMensajeCorreoInven=" WHERE " + ConstantesSql.ID + "="+mailmensajecorreoinvenSessionBean.getlidMensajeCorreoInvenActual();
					}
				} else {
					finalQueryGlobalMensajeCorreoInven="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.mailmensajecorreoinvenConstantesFunciones.cargarid_empresaMailMensajeCorreoInven)
					 || (this.esRecargarFks && this.mailmensajecorreoinvenConstantesFunciones.cargarid_empresaMailMensajeCorreoInven)) {

					if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+mailmensajecorreoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.mailmensajecorreoinvenConstantesFunciones.cargarid_sucursalMailMensajeCorreoInven)
					 || (this.esRecargarFks && this.mailmensajecorreoinvenConstantesFunciones.cargarid_sucursalMailMensajeCorreoInven)) {

					if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+mailmensajecorreoinvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.mailmensajecorreoinvenConstantesFunciones.cargarid_moduloMailMensajeCorreoInven)
					 || (this.esRecargarFks && this.mailmensajecorreoinvenConstantesFunciones.cargarid_moduloMailMensajeCorreoInven)) {

					if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+mailmensajecorreoinvenSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.cargarCombosLoteForeignKeyMailMensajeCorreoInven(finalQueryGlobalMensajeCorreoInven,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalMensajeCorreoInven.equals("NONE")) {
				this.mensajecorreoinvensForeignKey=mailmensajecorreoinvenReturnGeneral.getmensajecorreoinvensForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=mailmensajecorreoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=mailmensajecorreoinvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=mailmensajecorreoinvenReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMailMensajeCorreoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyMensajeCorreoInven()throws Exception {
		try {
			if(this.mailmensajecorreoinvenSessionBean==null) {
				this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
			}

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionMensajeCorreoInven()) {
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

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.mailmensajecorreoinvenSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
	
	public void initActionsCombosTodosForeignKeyMailMensajeCorreoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMailMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMailMensajeCorreoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMailMensajeCorreoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven)throws Exception {	
		try {
			
			this.setActualMensajeCorreoInvenForeignKey(mailmensajecorreoinven.getid_mensaje_correo_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMailMensajeCorreoInven()throws Exception {	
		try {
			
			this.setActualMensajeCorreoInvenForeignKey(this.mailmensajecorreoinvenConstantesFunciones.getid_mensaje_correo_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMailMensajeCorreoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMailMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMailMensajeCorreoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMailMensajeCorreoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMailMensajeCorreoInven()throws Exception {
		try {
			

			this.cargarCombosFrameMensajeCorreoInvensForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMailMensajeCorreoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameMensajeCorreoInvensForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMailMensajeCorreoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public MailMensajeCorreoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MailMensajeCorreoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MailMensajeCorreoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean(); 
		this.mailmensajecorreoinvenConstantesFunciones=new MailMensajeCorreoInvenConstantesFunciones(); 
		this.mailmensajecorreoinvenBean=new MailMensajeCorreoInven();//(this.mailmensajecorreoinvenConstantesFunciones); 		
		this.mailmensajecorreoinvenReturnGeneral=new MailMensajeCorreoInvenParameterReturnGeneral(); 
		
		this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MailMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MailMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MailMensajeCorreoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMailMensajeCorreoInven(true);
			
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
			
			this.mailmensajecorreoinvenConstantesFunciones=new MailMensajeCorreoInvenConstantesFunciones(); 
			this.mailmensajecorreoinvenBean=new MailMensajeCorreoInven();//this.mailmensajecorreoinvenConstantesFunciones); 			
			this.mailmensajecorreoinvenReturnGeneral=new MailMensajeCorreoInvenParameterReturnGeneral(); 
		
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mail Mensaje Correo Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.mailmensajecorreoinven=new MailMensajeCorreoInven();
			this.mailmensajecorreoinvens = new ArrayList<MailMensajeCorreoInven>();
			this.mailmensajecorreoinvensAux = new ArrayList<MailMensajeCorreoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic=new MailMensajeCorreoInvenLogic();
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.mailmensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mailmensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMailMensajeCorreoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMailMensajeCorreoInven);	
					}
					
					if(this.jInternalFrameImportacionMailMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMailMensajeCorreoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMailMensajeCorreoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMailMensajeCorreoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMailMensajeCorreoInven);
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.setVisible(false);
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven);
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMailMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMailMensajeCorreoInven);
					this.jInternalFrameImportacionMailMensajeCorreoInven.setVisible(false);
					this.jInternalFrameImportacionMailMensajeCorreoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMailMensajeCorreoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMailMensajeCorreoInven);
					this.jInternalFrameOrderByMailMensajeCorreoInven.setVisible(false);
					this.jInternalFrameOrderByMailMensajeCorreoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMailMensajeCorreoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MailMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mailmensajecorreoinvenReturnGeneral=new MailMensajeCorreoInvenParameterReturnGeneral();
			
			this.mailmensajecorreoinvenParameterGeneral=new MailMensajeCorreoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mailmensajecorreoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MailMensajeCorreoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaCopiarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaVerFormMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaOrdenMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMensajeCorreoInven=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMailMensajeCorreoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMailMensajeCorreoInven(false);
			
			this.setPermisosUsuarioMailMensajeCorreoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado() && this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMailMensajeCorreoInvenClasesRelacionadas();
			}
			
			if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMailMensajeCorreoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMailMensajeCorreoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMailMensajeCorreoInven();
			}
			
			if(!this.isPermisoBusquedaMailMensajeCorreoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMailMensajeCorreoInven,this.isPermisoPaginacionMedioMailMensajeCorreoInven,this.isPermisoPaginacionTodoMailMensajeCorreoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MailMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarMailMensajeCorreoInven());
				
				this.tiposColumnasSelect=MailMensajeCorreoInvenConstantesFunciones.getTiposSeleccionarMailMensajeCorreoInven(true);
				
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
			//if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMailMensajeCorreoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioMailMensajeCorreoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioMailMensajeCorreoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMailMensajeCorreoInven() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				mailmensajecorreoinvenImplementable= (MailMensajeCorreoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MailMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mailmensajecorreoinvenImplementableHome= (MailMensajeCorreoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MailMensajeCorreoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mailmensajecorreoinvens= new ArrayList<MailMensajeCorreoInven>();
			this.mailmensajecorreoinvensEliminados= new ArrayList<MailMensajeCorreoInven>();
						
			this.isEsNuevoMailMensajeCorreoInven=false;
			this.esParaAccionDesdeFormularioMailMensajeCorreoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.mensajecorreoinvensForeignKey=new ArrayList<MensajeCorreoInven>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMailMensajeCorreoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMailMensajeCorreoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MailMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMailMensajeCorreoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMailMensajeCorreoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMailMensajeCorreoInven();
			}
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMailMensajeCorreoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMailMensajeCorreoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMailMensajeCorreoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMailMensajeCorreoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MailMensajeCorreoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMailMensajeCorreoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMailMensajeCorreoInven")) {
				iIndex=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMailMensajeCorreoInven();	
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
	
	public void cargarCombosForeignKeyMailMensajeCorreoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMailMensajeCorreoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMailMensajeCorreoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMailMensajeCorreoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMailMensajeCorreoInven();
		
		this.cargarCombosFrameForeignKeyMailMensajeCorreoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMailMensajeCorreoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMailMensajeCorreoInven();
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
	
	public void jButtonNuevoMailMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			
			if(jTableDatosMailMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosMailMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosMailMensajeCorreoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoMailMensajeCorreoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMailMensajeCorreoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMailMensajeCorreoInven(true);			
			//this.mailmensajecorreoinven=new MailMensajeCorreoInven();
			//this.mailmensajecorreoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven() ;
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMailMensajeCorreoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mailmensajecorreoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);				
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MailMensajeCorreoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMailMensajeCorreoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMailMensajeCorreoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMailMensajeCorreoInven.getSelectedRows().length;			
			}
			
			mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMailMensajeCorreoInven--;			
				//MailMensajeCorreoInven mailmensajecorreoinvenAux= new MailMensajeCorreoInven();			
				//mailmensajecorreoinvenAux.setId(this.iIdNuevoMailMensajeCorreoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MailMensajeCorreoInven mailmensajecorreoinvenOrigen=new MailMensajeCorreoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MailMensajeCorreoInven mailmensajecorreoinvenOrigen : mailmensajecorreoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mailmensajecorreoinvenOrigen =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mailmensajecorreoinvenOrigen =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMailMensajeCorreoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mailmensajecorreoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMailMensajeCorreoInven(mailmensajecorreoinvenOrigen,this.mailmensajecorreoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().add(this.mailmensajecorreoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinvens.add(this.mailmensajecorreoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
				
				this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMailMensajeCorreoInven(), this.getIndiceNuevoMailMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosMailMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMailMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMailMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();									
		
			MailMensajeCorreoInven mailmensajecorreoinvenOrigen=new MailMensajeCorreoInven();
			MailMensajeCorreoInven mailmensajecorreoinvenDestino=new MailMensajeCorreoInven();
				
			mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMailMensajeCorreoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mailmensajecorreoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMailMensajeCorreoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenOrigen =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mailmensajecorreoinvenOrigen =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mailmensajecorreoinvenDestino =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mailmensajecorreoinvenDestino =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mailmensajecorreoinvenOrigen =mailmensajecorreoinvensSeleccionados.get(0);
				mailmensajecorreoinvenDestino =mailmensajecorreoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMailMensajeCorreoInven(mailmensajecorreoinvenOrigen,mailmensajecorreoinvenDestino,true,false);
				
				mailmensajecorreoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mailmensajecorreoinvenDestino,mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mailmensajecorreoinvenDestino,mailmensajecorreoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
				
				//this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMailMensajeCorreoInven(), this.getIndiceNuevoMailMensajeCorreoInven());
				
				int iLastRow =  this.jTableDatosMailMensajeCorreoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMailMensajeCorreoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMailMensajeCorreoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMailMensajeCorreoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelPaginacionMailMensajeCorreoInven.setVisible(!isVisible);
			this.jPanelAccionesMailMensajeCorreoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMailMensajeCorreoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMailMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMailMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMailMensajeCorreoInven();
			
			this.abrirFrameOrderByMailMensajeCorreoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMailMensajeCorreoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMailMensajeCorreoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMailMensajeCorreoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.isMaximum()) {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSize(this.jInternalFrameDetalleFormMailMensajeCorreoInven.iWidthFormulario,this.jInternalFrameDetalleFormMailMensajeCorreoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMailMensajeCorreoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMailMensajeCorreoInven.isMaximum()) {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jContentPaneDetalleMailMensajeCorreoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jContentPaneDetalleMailMensajeCorreoInven.getWidth(),MailMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jContentPaneDetalleMailMensajeCorreoInven.getWidth(),MailMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jContentPaneDetalleMailMensajeCorreoInven.getWidth(),MailMensajeCorreoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMailMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMailMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMailMensajeCorreoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMailMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMailMensajeCorreoInven,false,this);
				} else {
					this.jInternalFrameOrderByMailMensajeCorreoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMailMensajeCorreoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMailMensajeCorreoInven);
				this.jInternalFrameOrderByMailMensajeCorreoInven.setVisible(false);
				this.jInternalFrameOrderByMailMensajeCorreoInven.setSelected(false);
				
				this.jInternalFrameOrderByMailMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMailMensajeCorreoInven"));
				
				this.inicializarActualizarBindingTablaOrderByMailMensajeCorreoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMailMensajeCorreoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMailMensajeCorreoInven==null) {
				
				this.jInternalFrameImportacionMailMensajeCorreoInven=new ImportacionJInternalFrame(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMailMensajeCorreoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMailMensajeCorreoInven);
				this.jInternalFrameImportacionMailMensajeCorreoInven.setVisible(false);
				this.jInternalFrameImportacionMailMensajeCorreoInven.setSelected(false);


				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMailMensajeCorreoInven"));
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMailMensajeCorreoInven"));
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMailMensajeCorreoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMailMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven==null) {
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven=new ReporteDinamicoJInternalFrame(MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMailMensajeCorreoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven);
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMailMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMailMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMailMensajeCorreoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMailMensajeCorreoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMailMensajeCorreoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMailMensajeCorreoInven);
			
	       	this.jInternalFrameDetalleFormMailMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormMailMensajeCorreoInven.dispose();
			//this.jInternalFrameDetalleFormMailMensajeCorreoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMailMensajeCorreoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMailMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMailMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameImportacionMailMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMailMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMailMensajeCorreoInven.setVisible(true);
	        this.jInternalFrameOrderByMailMensajeCorreoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMailMensajeCorreoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMailMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameOrderByMailMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMailMensajeCorreoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMailMensajeCorreoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMailMensajeCorreoInven.setVisible(false);
	        this.jInternalFrameImportacionMailMensajeCorreoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMailMensajeCorreoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMailMensajeCorreoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMailMensajeCorreoInven(true);
			//this.isEsNuevoMailMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false) ;
			
			if(mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMailMensajeCorreoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMailMensajeCorreoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMailMensajeCorreoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMailMensajeCorreoInven(true);
			//this.isEsNuevoMailMensajeCorreoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mailmensajecorreoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false) ;
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMailMensajeCorreoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaMensajeCorreoInven(List<MensajeCorreoInven> mensajecorreoinvensForeignKey)throws Exception{
		TableColumn tableColumnMensajeCorreoInven=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN));
		TableCellEditor tableCellEditorMensajeCorreoInven =tableColumnMensajeCorreoInven.getCellEditor();

		MensajeCorreoInvenTableCell mensajecorreoinvenTableCellFk=(MensajeCorreoInvenTableCell)tableCellEditorMensajeCorreoInven;

		if(mensajecorreoinvenTableCellFk!=null) {
			mensajecorreoinvenTableCellFk.setmensajecorreoinvensForeignKey(mensajecorreoinvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mensajecorreoinvenTableCellFk.setRowActual(intSelectedRow);
			//mensajecorreoinvenTableCellFk.setmensajecorreoinvensForeignKeyActual(mensajecorreoinvensForeignKey);
		//}


		if(mensajecorreoinvenTableCellFk!=null) {
			mensajecorreoinvenTableCellFk.RecargarMensajeCorreoInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
				
	
	
	public void jButtonActualizarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMailMensajeCorreoInven(false);
			
			//if(!this.isEsNuevoMailMensajeCorreoInven) {								
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				
			}
			
			if(this.permiteMantenimiento(this.mailmensajecorreoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMailMensajeCorreoInven=true;
					this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
					this.isEsNuevoMailMensajeCorreoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMailMensajeCorreoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMailMensajeCorreoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesMailMensajeCorreoInven(false);
			
												
				
				if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMailMensajeCorreoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,mailmensajecorreoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMailMensajeCorreoInven(this.mailmensajecorreoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mailmensajecorreoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.mailmensajecorreoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				this.mailmensajecorreoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mailmensajecorreoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MailMensajeCorreoInvenModel) this.jTableDatosMailMensajeCorreoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMailMensajeCorreoInven=true;
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
				this.isEsNuevoMailMensajeCorreoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(false);
				
				this.habilitarDeshabilitarControlesMailMensajeCorreoInven(false);
				
				
				
				if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMailMensajeCorreoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMailMensajeCorreoInven.getRowCount()>=1) {
				jTableDatosMailMensajeCorreoInven.removeRowSelectionInterval(0, jTableDatosMailMensajeCorreoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMailMensajeCorreoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(false) ;
			
			this.isEsNuevoMailMensajeCorreoInven=false;
			
			if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMailMensajeCorreoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				
				//SI ES MANUAL
				if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMailMensajeCorreoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMailMensajeCorreoInven--;			
			//MailMensajeCorreoInven mailmensajecorreoinvenAux= new MailMensajeCorreoInven();			
			//mailmensajecorreoinvenAux.setId(this.iIdNuevoMailMensajeCorreoInven);
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMailMensajeCorreoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
			
			this.mailmensajecorreoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().add(this.mailmensajecorreoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mailmensajecorreoinvens.add(this.mailmensajecorreoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			
			this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(this.getIndiceNuevoMailMensajeCorreoInven(), this.getIndiceNuevoMailMensajeCorreoInven());
			
			int iLastRow =  this.jTableDatosMailMensajeCorreoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMailMensajeCorreoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMailMensajeCorreoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMailMensajeCorreoInven();
			}
			
			//this.abrirFrameTreeMailMensajeCorreoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Mail Mensaje Correo InvenES ?", "MANTENIMIENTO DE Mail Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMailMensajeCorreoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMailMensajeCorreoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.procesarImportacionMailMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.mailmensajecorreoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMailMensajeCorreoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMailMensajeCorreoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMailMensajeCorreoInven.setFileImportacion(this.jInternalFrameImportacionMailMensajeCorreoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMailMensajeCorreoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMailMensajeCorreoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		

		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MailMensajeCorreoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MailMensajeCorreoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MensajeCorreoInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MensajeCorreoInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MensajeCorreoInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MensajeCorreoInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_il_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_il_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_il_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_il_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					sNombreCampoCategoria="id_mensaje_correo_inven";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoria="mail";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					sNombreCampoCategoriaValor="id_mensaje_correo_inven";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoriaValor="mail";
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mensaje Correo Inven",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mensaje_correo_inven");
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mail");
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MailMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getmensajecorreoinven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getmail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(MailMensajeCorreoInven mailmensajecorreoinven:mailmensajecorreoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mailmensajecorreoinven.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelMailMensajeCorreoInven(row);				
			//	iRow++;
			//}				
			
			//for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMailMensajeCorreoInven(mailmensajecorreoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMailMensajeCorreoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMailMensajeCorreoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
			
			//SI ES MANUAL
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMailMensajeCorreoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMailMensajeCorreoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMailMensajeCorreoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMailMensajeCorreoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMailMensajeCorreoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMailMensajeCorreoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMailMensajeCorreoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosMailMensajeCorreoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosMailMensajeCorreoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMailMensajeCorreoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMailMensajeCorreoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMailMensajeCorreoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMailMensajeCorreoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMailMensajeCorreoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMailMensajeCorreoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMailMensajeCorreoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMailMensajeCorreoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMailMensajeCorreoInven();
		
		this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMailMensajeCorreoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMailMensajeCorreoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMailMensajeCorreoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMailMensajeCorreoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMailMensajeCorreoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionNuevoMailMensajeCorreoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMailMensajeCorreoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMailMensajeCorreoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionNuevoMailMensajeCorreoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionSinCerrarMailMensajeCorreoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxPostAccionSinMensajeMailMensajeCorreoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMailMensajeCorreoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMailMensajeCorreoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMailMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMailMensajeCorreoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMailMensajeCorreoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMailMensajeCorreoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMailMensajeCorreoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMailMensajeCorreoInven() throws Exception {
		try	{
			if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMailMensajeCorreoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMailMensajeCorreoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMailMensajeCorreoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMailMensajeCorreoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMailMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMailMensajeCorreoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMailMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMailMensajeCorreoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMailMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMailMensajeCorreoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMailMensajeCorreoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMailMensajeCorreoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMailMensajeCorreoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.getSelectedItem()!=null){this.id_mensaje_correo_invenFK_IdMensajeCorreoInven=((MensajeCorreoInven)this.jComboBoxid_mensaje_correo_invenFK_IdMensajeCorreoInvenMailMensajeCorreoInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMailMensajeCorreoInven(Boolean esInicializar) throws Exception {				
		if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMailMensajeCorreoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMailMensajeCorreoInven() throws Exception {
		this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMailMensajeCorreoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMailMensajeCorreoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMailMensajeCorreoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mailmensajecorreoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMailMensajeCorreoInven.setModel(new MailMensajeCorreoInvenModel(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMailMensajeCorreoInven.setModel(new MailMensajeCorreoInvenModel(this.mailmensajecorreoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMailMensajeCorreoInven!=null && this.jInternalFrameOrderByMailMensajeCorreoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMailMensajeCorreoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,mailmensajecorreoinvenConstantesFunciones.resaltarSeleccionarMailMensajeCorreoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MailMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO,mailmensajecorreoinvenConstantesFunciones.resaltarSeleccionarMailMensajeCorreoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_ID));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostraridMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltaridMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activaridMailMensajeCorreoInven,this,true,"idMailMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltaridMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activaridMailMensajeCorreoInven,this,true,"idMailMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MensajeCorreoInvenTableCell(this.mensajecorreoinvensForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenMailMensajeCorreoInven));
			tableColumn.setCellEditor(new MensajeCorreoInvenTableCell(this.mensajecorreoinvensForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenMailMensajeCorreoInven,true,"id_mensaje_correo_invenMailMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_empresaMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_empresaMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_empresaMailMensajeCorreoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_empresaMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_empresaMailMensajeCorreoInven,false,"id_empresaMailMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_sucursalMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_sucursalMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_sucursalMailMensajeCorreoInven));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_sucursalMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_sucursalMailMensajeCorreoInven,false,"id_sucursalMailMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_moduloMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_moduloMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_moduloMailMensajeCorreoInven));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.mailmensajecorreoinvenConstantesFunciones.resaltarid_moduloMailMensajeCorreoInven,this,this.mailmensajecorreoinvenConstantesFunciones.activarid_moduloMailMensajeCorreoInven,false,"id_moduloMailMensajeCorreoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostrarmailMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltarmailMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activarmailMailMensajeCorreoInven,this,true,"mailMailMensajeCorreoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltarmailMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activarmailMailMensajeCorreoInven,this,true,"mailMailMensajeCorreoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.mailmensajecorreoinvenConstantesFunciones.mostraresta_activoMailMensajeCorreoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltaresta_activoMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activaresta_activoMailMensajeCorreoInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.mailmensajecorreoinvenConstantesFunciones.resaltaresta_activoMailMensajeCorreoInven,this.mailmensajecorreoinvenConstantesFunciones.activaresta_activoMailMensajeCorreoInven,this,true,"esta_activoMailMensajeCorreoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MailMensajeCorreoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMailMensajeCorreoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMailMensajeCorreoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMailMensajeCorreoInven.addColumn(tableColumn);
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
			
			this.jTableDatosMailMensajeCorreoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMailMensajeCorreoInven.moveColumn(this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMailMensajeCorreoInven.moveColumn(this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMailMensajeCorreoInven.moveColumn(this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMailMensajeCorreoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMailMensajeCorreoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMailMensajeCorreoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMailMensajeCorreoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMailMensajeCorreoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMailMensajeCorreoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mailmensajecorreoinvens.size()-1;
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
		//this.jTableDatosMailMensajeCorreoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMailMensajeCorreoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMailMensajeCorreoInven();
			
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
				
				//this.isEsNuevoMailMensajeCorreoInven=false;
					
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
				if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMailMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mailmensajecorreoinven.getsType().equals("DUPLICADO")
				   || this.mailmensajecorreoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMailMensajeCorreoInven=true;
				
				} else {
					this.isEsNuevoMailMensajeCorreoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.mailmensajecorreoinven.getId()>=0 && !this.mailmensajecorreoinven.getIsNew()) {						
						this.isEsNuevoMailMensajeCorreoInven=false;
						
					} else {
						this.isEsNuevoMailMensajeCorreoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMailMensajeCorreoInven(esRelaciones);						
				
				this.seleccionarMailMensajeCorreoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mailmensajecorreoinven.getId()<0) {
					this.isEsNuevoMailMensajeCorreoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMailMensajeCorreoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMailMensajeCorreoInven(evt,rowIndex);
				}	
				
				if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MailMensajeCorreoInven: " + this.dDif); 
					}
				}								
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMailMensajeCorreoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mailmensajecorreoinven)) {
					if(this.mailmensajecorreoinven.getId()>0) {
						this.mailmensajecorreoinven.setIsDeleted(true);
						
						this.mailmensajecorreoinvensEliminados.add(this.mailmensajecorreoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().remove(this.mailmensajecorreoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinvens.remove(this.mailmensajecorreoinven);				
					}
					
					
					((MailMensajeCorreoInvenModel) this.jTableDatosMailMensajeCorreoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMailMensajeCorreoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMailMensajeCorreoInven) {
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMailMensajeCorreoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMailMensajeCorreoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//MensajeCorreoInven
					if(!this.mailmensajecorreoinvenConstantesFunciones.cargarid_mensaje_correo_invenMailMensajeCorreoInven || this.mailmensajecorreoinvenConstantesFunciones.event_dependid_mensaje_correo_invenMailMensajeCorreoInven) {
						//this.cargarCombosMensajeCorreoInvensForeignKeyLista(" where id="+this.mailmensajecorreoinven.getid_mensaje_correo_inven());
									//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
						this.mensajecorreoinvensForeignKey=new ArrayList<MensajeCorreoInven>();

						if(mailmensajecorreoinven.getMensajeCorreoInven()!=null) {
							this.mensajecorreoinvensForeignKey.add(mailmensajecorreoinven.getMensajeCorreoInven());
						}

						this.addItemDefectoCombosForeignKeyMensajeCorreoInven();
						this.cargarCombosFrameMensajeCorreoInvensForeignKey("Todos");
					}
					this.setActualMensajeCorreoInvenForeignKey(this.mailmensajecorreoinven.getid_mensaje_correo_inven(),false,"Formulario");

					//Empresa
					if(!this.mailmensajecorreoinvenConstantesFunciones.cargarid_empresaMailMensajeCorreoInven || this.mailmensajecorreoinvenConstantesFunciones.event_dependid_empresaMailMensajeCorreoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.mailmensajecorreoinven.getid_empresa());
									//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(mailmensajecorreoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(mailmensajecorreoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.mailmensajecorreoinven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.mailmensajecorreoinvenConstantesFunciones.cargarid_sucursalMailMensajeCorreoInven || this.mailmensajecorreoinvenConstantesFunciones.event_dependid_sucursalMailMensajeCorreoInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.mailmensajecorreoinven.getid_sucursal());
									//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(mailmensajecorreoinven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(mailmensajecorreoinven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.mailmensajecorreoinven.getid_sucursal(),false,"Formulario");

					//Modulo
					if(!this.mailmensajecorreoinvenConstantesFunciones.cargarid_moduloMailMensajeCorreoInven || this.mailmensajecorreoinvenConstantesFunciones.event_dependid_moduloMailMensajeCorreoInven) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.mailmensajecorreoinven.getid_modulo());
									//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(mailmensajecorreoinven.getModulo()!=null) {
							this.modulosForeignKey.add(mailmensajecorreoinven.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.mailmensajecorreoinven.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMailMensajeCorreoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMailMensajeCorreoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMailMensajeCorreoInven(mailmensajecorreoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMailMensajeCorreoInven(mailmensajecorreoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMailMensajeCorreoInven(mailmensajecorreoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMailMensajeCorreoInven(mailmensajecorreoinven);
	}
	
	public void setVariablesObjetoActualToFormularioMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setText(mailmensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setText(mailmensajecorreoinven.getmail());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setSelected(mailmensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MailMensajeCorreoInven mailmensajecorreoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mailmensajecorreoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MailMensajeCorreoInven mailmensajecorreoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mailmensajecorreoinvenLocal=this.mailmensajecorreoinven;
			} else {
				mailmensajecorreoinvenLocal=this.mailmensajecorreoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mailmensajecorreoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMailMensajeCorreoInven(mailmensajecorreoinvenLocal,true);
					
					if(mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mailmensajecorreoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mailmensajecorreoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(mailmensajecorreoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(mailmensajecorreoinven);
	}
	
	public void setVariablesFormularioToObjetoActualMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(mailmensajecorreoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.getText()==null || this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.getText()=="" || this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setText("0");
			}

			if(conColumnasBase) {mailmensajecorreoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MailMensajeCorreoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelIdMailMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mailmensajecorreoinven.setmail(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelmailMailMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mailmensajecorreoinven.setesta_activo(this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelesta_activoMailMensajeCorreoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinvenBean,MailMensajeCorreoInven mailmensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && mailmensajecorreoinvenBean.getid_mensaje_correo_inven()!=null && !mailmensajecorreoinvenBean.getid_mensaje_correo_inven().equals(-1L))) {mailmensajecorreoinven.setid_mensaje_correo_inven(mailmensajecorreoinvenBean.getid_mensaje_correo_inven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinvenOrigen,MailMensajeCorreoInven mailmensajecorreoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mailmensajecorreoinvenOrigen.getId()!=null && !mailmensajecorreoinvenOrigen.getId().equals(0L))) {mailmensajecorreoinven.setId(mailmensajecorreoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && mailmensajecorreoinvenOrigen.getid_mensaje_correo_inven()!=null && !mailmensajecorreoinvenOrigen.getid_mensaje_correo_inven().equals(-1L))) {mailmensajecorreoinven.setid_mensaje_correo_inven(mailmensajecorreoinvenOrigen.getid_mensaje_correo_inven());}
			if(conDefault || (!conDefault && mailmensajecorreoinvenOrigen.getmail()!=null && !mailmensajecorreoinvenOrigen.getmail().equals(""))) {mailmensajecorreoinven.setmail(mailmensajecorreoinvenOrigen.getmail());}
			if(conDefault || (!conDefault && mailmensajecorreoinvenOrigen.getesta_activo()!=null && !mailmensajecorreoinvenOrigen.getesta_activo().equals(false))) {mailmensajecorreoinven.setesta_activo(mailmensajecorreoinvenOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setText(mailmensajecorreoinven.getId().toString());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setText(mailmensajecorreoinven.getmail());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setSelected(mailmensajecorreoinven.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMailMensajeCorreoInven(MailMensajeCorreoInvenBean mailmensajecorreoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setText(mailmensajecorreoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setText(mailmensajecorreoinvenBean.getmail());
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setSelected(mailmensajecorreoinvenBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMailMensajeCorreoInven(MailMensajeCorreoInvenParameterReturnGeneral mailmensajecorreoinvenReturnGeneral,MailMensajeCorreoInvenBean mailmensajecorreoinvenBean,Boolean conDefault) throws Exception { 
		try {
			MailMensajeCorreoInven mailmensajecorreoinvenLocal=new MailMensajeCorreoInven();
			
			mailmensajecorreoinvenLocal=mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mailmensajecorreoinvenLocal.getId()!=null && !mailmensajecorreoinvenLocal.getId().equals(0L))) {mailmensajecorreoinvenBean.setId(mailmensajecorreoinvenLocal.getId());}}
			if(conDefault || (!conDefault && mailmensajecorreoinvenLocal.getid_mensaje_correo_inven()!=null && !mailmensajecorreoinvenLocal.getid_mensaje_correo_inven().equals(-1L))) {mailmensajecorreoinvenBean.setid_mensaje_correo_inven(mailmensajecorreoinvenLocal.getid_mensaje_correo_inven());}
			if(conDefault || (!conDefault && mailmensajecorreoinvenLocal.getmail()!=null && !mailmensajecorreoinvenLocal.getmail().equals(""))) {mailmensajecorreoinvenBean.setmail(mailmensajecorreoinvenLocal.getmail());}
			if(conDefault || (!conDefault && mailmensajecorreoinvenLocal.getesta_activo()!=null && !mailmensajecorreoinvenLocal.getesta_activo().equals(false))) {mailmensajecorreoinvenBean.setesta_activo(mailmensajecorreoinvenLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMailMensajeCorreoInvenGenerico(Long idMailMensajeCorreoInvenSeleccionado,JComboBox jComboBoxMailMensajeCorreoInven,List<MailMensajeCorreoInven> mailmensajecorreoinvensLocal)throws Exception {
		try {
			MailMensajeCorreoInven  mailmensajecorreoinvenTemp=null;

			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensLocal) {
				if(mailmensajecorreoinvenAux.getId()!=null && mailmensajecorreoinvenAux.getId().equals(idMailMensajeCorreoInvenSeleccionado)) {
					mailmensajecorreoinvenTemp=mailmensajecorreoinvenAux;
					break;
				}
			}

			jComboBoxMailMensajeCorreoInven.setSelectedItem(mailmensajecorreoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMailMensajeCorreoInvenGenerico(JComboBox jComboBoxMailMensajeCorreoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMailMensajeCorreoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMailMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMailMensajeCorreoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMailMensajeCorreoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMailMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMailMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mailmensajecorreoinven=(MailMensajeCorreoInven) mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mailmensajecorreoinven =(MailMensajeCorreoInven) mailmensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("MensajeCorreoInven")) {
			//sDescripcion=this.getActualMensajeCorreoInvenForeignKeyDescripcion((Long)value);
			if(!mailmensajecorreoinven.getIsNew() && !mailmensajecorreoinven.getIsChanged() && !mailmensajecorreoinven.getIsDeleted()) {
				sDescripcion=mailmensajecorreoinven.getmensajecorreoinven_descripcion();
			} else {
				//sDescripcion=this.getActualMensajeCorreoInvenForeignKeyDescripcion((Long)value);
				sDescripcion=mailmensajecorreoinven.getmensajecorreoinven_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mailmensajecorreoinven.getIsNew() && !mailmensajecorreoinven.getIsChanged() && !mailmensajecorreoinven.getIsDeleted()) {
				sDescripcion=mailmensajecorreoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mailmensajecorreoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!mailmensajecorreoinven.getIsNew() && !mailmensajecorreoinven.getIsChanged() && !mailmensajecorreoinven.getIsDeleted()) {
				sDescripcion=mailmensajecorreoinven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=mailmensajecorreoinven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!mailmensajecorreoinven.getIsNew() && !mailmensajecorreoinven.getIsChanged() && !mailmensajecorreoinven.getIsDeleted()) {
				sDescripcion=mailmensajecorreoinven.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=mailmensajecorreoinven.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MailMensajeCorreoInven mailmensajecorreoinvenRow=new MailMensajeCorreoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mailmensajecorreoinvenRow=(MailMensajeCorreoInven) mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mailmensajecorreoinvenRow=(MailMensajeCorreoInven) mailmensajecorreoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));			
			this.jButtonDuplicarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven && this.isPermisoDuplicarMailMensajeCorreoInven));			
			this.jButtonCopiarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMailMensajeCorreoInven && this.isPermisoCopiarMailMensajeCorreoInven));
			this.jButtonVerFormMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMailMensajeCorreoInven && this.isPermisoVerFormMailMensajeCorreoInven));
			
			this.jButtonAbrirOrderByMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));			
			
			this.jButtonNuevoRelacionesMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMailMensajeCorreoInven && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMailMensajeCorreoInven && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMailMensajeCorreoInven && this.isPermisoEliminarMailMensajeCorreoInven));
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMailMensajeCorreoInven);							
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));						
			this.jButtonDuplicarToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven && this.isPermisoDuplicarMailMensajeCorreoInven));						
			this.jButtonCopiarToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMailMensajeCorreoInven && this.isPermisoCopiarMailMensajeCorreoInven));			
			this.jButtonVerFormToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMailMensajeCorreoInven && this.isPermisoVerFormMailMensajeCorreoInven));			
			this.jButtonAbrirOrderByToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));
			this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));			
			this.jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));			
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMailMensajeCorreoInven && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMailMensajeCorreoInven  && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMailMensajeCorreoInven && this.isPermisoEliminarMailMensajeCorreoInven));
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarToolBarMailMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMailMensajeCorreoInven);				
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));			
			this.jMenuItemDuplicarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven && this.isPermisoDuplicarMailMensajeCorreoInven));			
			this.jMenuItemCopiarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaCopiarMailMensajeCorreoInven && this.isPermisoCopiarMailMensajeCorreoInven));			
			this.jMenuItemVerFormMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaVerFormMailMensajeCorreoInven && this.isPermisoVerFormMailMensajeCorreoInven));			
			this.jMenuItemAbrirOrderByMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));			
			//this.jMenuItemMostrarOcultarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));
			this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));			
			//this.jMenuItemDetalleMostrarOcultarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaOrdenMailMensajeCorreoInven && this.isPermisoOrdenMailMensajeCorreoInven));			
			this.jMenuItemNuevoRelacionesMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven));			
			this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaNuevoMailMensajeCorreoInven && this.isPermisoNuevoMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));									
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemModificarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaModificarMailMensajeCorreoInven && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemActualizarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaActualizarMailMensajeCorreoInven && this.isPermisoActualizarMailMensajeCorreoInven));	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemEliminarMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaEliminarMailMensajeCorreoInven && this.isPermisoEliminarMailMensajeCorreoInven));
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemCancelarMailMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMailMensajeCorreoInven);				
			}
			
			this.jMenuItemGuardarCambiosMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));						
			this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=this.jButtonNuevoMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven=this.jButtonDuplicarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCopiarMailMensajeCorreoInven=this.jButtonCopiarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaVerFormMailMensajeCorreoInven=this.jButtonVerFormMailMensajeCorreoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenMailMensajeCorreoInven=this.jButtonAbrirOrderByMailMensajeCorreoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=this.jButtonNuevoRelacionesMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=this.jButtonModificarMailMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=this.jButtonNuevoToolBarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarToolBarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarToolBarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarToolBarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarToolBarMailMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=this.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=this.jMenuItemNuevoMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=this.jMenuItemNuevoRelacionesMailMensajeCorreoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemModificarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemActualizarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemEliminarMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemCancelarMailMensajeCorreoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=this.jMenuItemGuardarCambiosMailMensajeCorreoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMailMensajeCorreoInven(Boolean esInicializar) {
		if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMailMensajeCorreoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualMailMensajeCorreoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMailMensajeCorreoInven() {
		this.jButtonNuevoMailMensajeCorreoInven.setVisible(this.isPermisoNuevoMailMensajeCorreoInven);			
		this.jButtonDuplicarMailMensajeCorreoInven.setVisible(this.isPermisoDuplicarMailMensajeCorreoInven);			
		this.jButtonCopiarMailMensajeCorreoInven.setVisible(this.isPermisoCopiarMailMensajeCorreoInven);			
		this.jButtonVerFormMailMensajeCorreoInven.setVisible(this.isPermisoVerFormMailMensajeCorreoInven);			
		
		this.jButtonAbrirOrderByMailMensajeCorreoInven.setVisible(this.isPermisoOrdenMailMensajeCorreoInven);					
		
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.setVisible(this.isPermisoNuevoMailMensajeCorreoInven);			
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarMailMensajeCorreoInven.setVisible(this.isPermisoActualizarMailMensajeCorreoInven);	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.setVisible(this.isPermisoActualizarMailMensajeCorreoInven);	
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.setVisible(this.isPermisoEliminarMailMensajeCorreoInven);
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMailMensajeCorreoInven);						
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.setVisible(this.isPermisoGuardarCambiosMailMensajeCorreoInven);							
		}
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.setVisible(this.isPermisoActualizarMailMensajeCorreoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMailMensajeCorreoInven() {
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarMailMensajeCorreoInven.setVisible(this.isPermisoActualizarMailMensajeCorreoInven);	
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.setVisible(this.isPermisoActualizarMailMensajeCorreoInven);	
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.setVisible(this.isPermisoEliminarMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.setVisible(this.isVisibilidadCeldaCancelarMailMensajeCorreoInven);							
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.setVisible((this.isVisibilidadCeldaGuardarMailMensajeCorreoInven && this.isPermisoGuardarCambiosMailMensajeCorreoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMailMensajeCorreoInven() {
		if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMailMensajeCorreoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMailMensajeCorreoInven() {
	}
	
	public void jTableDatosMailMensajeCorreoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMailMensajeCorreoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mailmensajecorreoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomensajecorreoinven=true;

			idTienePermisomensajecorreoinven=this.tienePermisosUsuarioEnPaginaWebMailMensajeCorreoInven(MensajeCorreoInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisomensajecorreoinven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMailMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);

				this.mensajecorreoinvenBeanSwingJInternalFrame=new MensajeCorreoInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mensajecorreoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mensajecorreoinvenBeanSwingJInternalFrame.getMensajeCorreoInvenLogic().setConnexion(this.mailmensajecorreoinvenLogic.getConnexion());

				if(this.mailmensajecorreoinven.getid_mensaje_correo_inven()!=null) {
					this.mensajecorreoinvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mensajecorreoinvenBeanSwingJInternalFrame.setIdActual(this.mailmensajecorreoinven.getid_mensaje_correo_inven());
					this.mensajecorreoinvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mensajecorreoinvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mensajecorreoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaMensajeCorreoInven();
				}

				JInternalFrameBase jinternalFrame =this.mensajecorreoinvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMailMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMailMensajeCorreoInven.getBorder();
				TitledBorder titledBordermensajecorreoinven=(TitledBorder)this.mensajecorreoinvenBeanSwingJInternalFrame.jScrollPanelDatosMensajeCorreoInven.getBorder();

				titledBordermensajecorreoinven.setTitle(titledBorderMailMensajeCorreoInven.getTitle() + " -> Mensaje Correo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getid_mensaje_correo_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mensaje_correo_inven = "+this.mailmensajecorreoinven.getid_mensaje_correo_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMailMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMailMensajeCorreoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMailMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mailmensajecorreoinvenLogic.getConnexion());

				if(this.mailmensajecorreoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mailmensajecorreoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMailMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMailMensajeCorreoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMailMensajeCorreoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mailmensajecorreoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMailMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMailMensajeCorreoInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMailMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.mailmensajecorreoinvenLogic.getConnexion());

				if(this.mailmensajecorreoinven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.mailmensajecorreoinven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMailMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMailMensajeCorreoInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMailMensajeCorreoInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.mailmensajecorreoinven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloMailMensajeCorreoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebMailMensajeCorreoInven(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMailMensajeCorreoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMailMensajeCorreoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.mailmensajecorreoinvenLogic.getConnexion());

				if(this.mailmensajecorreoinven.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.mailmensajecorreoinven.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMailMensajeCorreoInven=(TitledBorder)this.jScrollPanelDatosMailMensajeCorreoInven.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderMailMensajeCorreoInven.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.mailmensajecorreoinven.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmailMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getmail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mail like '%"+this.mailmensajecorreoinven.getmail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoMailMensajeCorreoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.getmailmensajecorreoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mailmensajecorreoinven==null) {
						this.mailmensajecorreoinven = new MailMensajeCorreoInven();
					}

					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);
				}

				if(this.mailmensajecorreoinven.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.mailmensajecorreoinven.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMailMensajeCorreoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);

			this.getMailMensajeCorreoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingMailMensajeCorreoInven(false);

			//if(MailMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);

			this.getMailMensajeCorreoInvensFK_IdMensajeCorreoInven();

			this.inicializarActualizarBindingMailMensajeCorreoInven(false);

			//if(MailMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);

			this.getMailMensajeCorreoInvensFK_IdModulo();

			this.inicializarActualizarBindingMailMensajeCorreoInven(false);

			//if(MailMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMailMensajeCorreoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);

			this.getMailMensajeCorreoInvensFK_IdSucursal();

			this.inicializarActualizarBindingMailMensajeCorreoInven(false);

			//if(MailMensajeCorreoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mailmensajecorreoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMailMensajeCorreoInven() {
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.dispose();
			this.jInternalFrameDetalleFormMailMensajeCorreoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
			this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.dispose();
			this.jInternalFrameReporteDinamicoMailMensajeCorreoInven=null;
		}
		
		if(this.jInternalFrameImportacionMailMensajeCorreoInven!=null) {
			this.jInternalFrameImportacionMailMensajeCorreoInven.setVisible(false);	    			
			this.jInternalFrameImportacionMailMensajeCorreoInven.dispose();
			this.jInternalFrameImportacionMailMensajeCorreoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMailMensajeCorreoInven();
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMailMensajeCorreoInven")) {
				jButtonDuplicarMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMailMensajeCorreoInven")) {
				jButtonCopiarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormMailMensajeCorreoInven")) {
				jButtonVerFormMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMailMensajeCorreoInven")) {
				jButtonDuplicarMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMailMensajeCorreoInven")) {
				jButtonDuplicarMailMensajeCorreoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMailMensajeCorreoInven")) {
				jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMailMensajeCorreoInven")) {
				jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMailMensajeCorreoInven")) {
				jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMailMensajeCorreoInven")) {
				jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMailMensajeCorreoInven")) {
				jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMailMensajeCorreoInven")) {
				jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarMailMensajeCorreoInven")) {
				jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMailMensajeCorreoInven")) {
				jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMailMensajeCorreoInven")) {
				jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarMailMensajeCorreoInven")) {
				jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMailMensajeCorreoInven")) {
				jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMailMensajeCorreoInven")) {
				jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarMailMensajeCorreoInven")) {
				jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMailMensajeCorreoInven")) {
				jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMailMensajeCorreoInven")) {
				jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMailMensajeCorreoInven")) {
				jButtonMostrarOcultarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMailMensajeCorreoInven")) {
				jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMailMensajeCorreoInven")) {
				jButtonCopiarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMailMensajeCorreoInven")) {
				jButtonVerFormMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMailMensajeCorreoInven")) {
				jButtonCopiarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMailMensajeCorreoInven")) {
				jButtonVerFormMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMailMensajeCorreoInven")) {
				jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMailMensajeCorreoInven")) {
				jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMailMensajeCorreoInven")) {
				jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMailMensajeCorreoInven")) {
				jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMailMensajeCorreoInven")) {
				jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMailMensajeCorreoInven")) {
				jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMailMensajeCorreoInven")) {
				jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMailMensajeCorreoInven")) {
				jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMailMensajeCorreoInven")) {
				jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMailMensajeCorreoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByMailMensajeCorreoInven")) {
				jButtonAbrirOrderByMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMailMensajeCorreoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarMailMensajeCorreoInven")) {
				jButtonMostrarOcultarMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMailMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMailMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMailMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMailMensajeCorreoInven")) {
				jButtonCerrarReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMailMensajeCorreoInven")) {
				jButtonGenerarReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMailMensajeCorreoInven")) {
				
				jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMailMensajeCorreoInven")) {
				jButtonCerrarImportacionMailMensajeCorreoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMailMensajeCorreoInven")) {
				
				jButtonGenerarImportacionMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMailMensajeCorreoInven")) {
				
				jButtonAbrirImportacionMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMailMensajeCorreoInven")) {
				jComboBoxTiposAccionesMailMensajeCorreoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMailMensajeCorreoInven")) {
				jComboBoxTiposRelacionesMailMensajeCorreoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMailMensajeCorreoInven")) {
				jComboBoxTiposAccionesMailMensajeCorreoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMailMensajeCorreoInven")) {
				
				jComboBoxTiposSeleccionarMailMensajeCorreoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMailMensajeCorreoInven")) {
				jTextFieldValorCampoGeneralMailMensajeCorreoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMailMensajeCorreoInven")) {
				jButtonAbrirOrderByMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMailMensajeCorreoInven")) {
				jButtonAbrirOrderByMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMailMensajeCorreoInven")) {
				jButtonCerrarOrderByMailMensajeCorreoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMailMensajeCorreoInvenBusqueda")) {
				this.jButtonidMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailMailMensajeCorreoInvenBusqueda")) {
				this.jButtonmailMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMailMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdMensajeCorreoInvenMailMensajeCorreoInven")) {
				this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInvenActionPerformed(evt);
			}
			
			;
			
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMailMensajeCorreoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MailMensajeCorreoInven mailmensajecorreoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				mailmensajecorreoinvenLocal=this.mailmensajecorreoinven;
			} else {
				mailmensajecorreoinvenLocal=this.mailmensajecorreoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
							
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
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
			
			


			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
								
						
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
								
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
							
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
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
			
			


			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
								
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMailMensajeCorreoInven")) {
					jCheckBoxSeleccionarTodosMailMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMailMensajeCorreoInven")) {
					jCheckBoxSeleccionadosMailMensajeCorreoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMailMensajeCorreoInven")) {
					
				}
				
				


				
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
												
				
				


				
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
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
			
			


			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mailmensajecorreoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mailmensajecorreoinven);
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
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
				
				


				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MailMensajeCorreoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MailMensajeCorreoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMailMensajeCorreoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mailmensajecorreoinvenAnterior =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMailMensajeCorreoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMailMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMailMensajeCorreoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mailmensajecorreoinven =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mailmensajecorreoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMailMensajeCorreoInven")) {
				
				}
				
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMailMensajeCorreoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMailMensajeCorreoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMailMensajeCorreoInven")) {
			
			}
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMailMensajeCorreoInven();
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMailMensajeCorreoInven")) {
				jButtonDuplicarMailMensajeCorreoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMailMensajeCorreoInven")) {
				jButtonCopiarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMailMensajeCorreoInven")) {
				jButtonVerFormMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMailMensajeCorreoInven")) {
				jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMailMensajeCorreoInven")) {
				jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMailMensajeCorreoInven")) {
				jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMailMensajeCorreoInven")) {
				jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMailMensajeCorreoInven")) {
				jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMailMensajeCorreoInven")) {
				jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMailMensajeCorreoInven")) {
				jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMailMensajeCorreoInven")) {
				jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMailMensajeCorreoInven")) {
				jButtonAbrirOrderByMailMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMailMensajeCorreoInven")) {
				jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMailMensajeCorreoInven")) {
				jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMailMensajeCorreoInven")) {
				jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMailMensajeCorreoInvenBusqueda")) {
				this.jButtonidMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_empresaMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_empresaMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_sucursalMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_sucursalMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloMailMensajeCorreoInvenUpdate")) {
				this.jButtonid_moduloMailMensajeCorreoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloMailMensajeCorreoInvenBusqueda")) {
				this.jButtonid_moduloMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailMailMensajeCorreoInvenBusqueda")) {
				this.jButtonmailMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoMailMensajeCorreoInvenBusqueda")) {
				this.jButtonesta_activoMailMensajeCorreoInvenBusquedaActionPerformed(evt);
			}
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMailMensajeCorreoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMailMensajeCorreoInven")) {
				closingInternalFrameMailMensajeCorreoInven();
				
			} else if(sTipo.equals("jButtonCancelarMailMensajeCorreoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormMailMensajeCorreoInven = (JInternalFrameBase)evt.getSource();
	            	
	            MailMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(MailMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormMailMensajeCorreoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMailMensajeCorreoInvenActionPerformed(null);
			}
			
			MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mailmensajecorreoinven,new Object(),this.mailmensajecorreoinvenParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMailMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMailMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMailMensajeCorreoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mailmensajecorreoinven)) {
			if(!esControlTabla) {
				if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);			
				}
				
				if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.procesarEventosMailMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this.mailmensajecorreoinven,this.mailmensajecorreoinvenParameterGeneral,this.isEsNuevoMailMensajeCorreoInven,classes);//this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral,this.mailmensajecorreoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMailMensajeCorreoInven(classes,this.mailmensajecorreoinvenReturnGeneral,this.mailmensajecorreoinvenBean,false);
					}
						
					if(this.mailmensajecorreoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven());	
					}
						
					if(this.mailmensajecorreoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven(),classes);//this.mailmensajecorreoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMailMensajeCorreoInven(this.mailmensajecorreoinven,classes);//this.mailmensajecorreoinvenBean);									
				}
			
				if(MailMensajeCorreoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMailMensajeCorreoInven(this.mailmensajecorreoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMailMensajeCorreoInven(this.mailmensajecorreoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mailmensajecorreoinvenAnterior!=null) {
						this.mailmensajecorreoinven=this.mailmensajecorreoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.procesarEventosMailMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this.mailmensajecorreoinven,this.mailmensajecorreoinvenParameterGeneral,this.isEsNuevoMailMensajeCorreoInven,classes);//this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mailmensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven(),mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven(),this.mailmensajecorreoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMailMensajeCorreoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosMailMensajeCorreoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMailMensajeCorreoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosMailMensajeCorreoInven() throws Exception {
		
		MailMensajeCorreoInvenModel mailmensajecorreoinvenModel=(MailMensajeCorreoInvenModel)this.jTableDatosMailMensajeCorreoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mailmensajecorreoinvenModel.mailmensajecorreoinvens=this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mailmensajecorreoinvenModel.mailmensajecorreoinvens=this.mailmensajecorreoinvens;
		}
		
		
		((MailMensajeCorreoInvenModel) this.jTableDatosMailMensajeCorreoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMailMensajeCorreoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmailmensajecorreoinvenAnterior(),this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmailmensajecorreoinvenAnterior(),this.mailmensajecorreoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMailMensajeCorreoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
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
										
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mailmensajecorreoinven,new Object(),generalEntityParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MailMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsOfMailMensajeCorreoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MailMensajeCorreoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfMailMensajeCorreoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMailMensajeCorreoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mailmensajecorreoinven,new Object(),generalEntityParameterGeneral,this.mailmensajecorreoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMailMensajeCorreoInven(MailMensajeCorreoInvenBean mailmensajecorreoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMailMensajeCorreoInven(ArrayList<Classe> classes,MailMensajeCorreoInvenReturnGeneral mailmensajecorreoinvenReturnGeneral,MailMensajeCorreoInvenBean mailmensajecorreoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mailmensajecorreoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven = new MailMensajeCorreoInvenDetalleFormJInternalFrame(jDesktopPane,this.mailmensajecorreoinvenSessionBean.getConGuardarRelaciones(),this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.setVisible(false);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.mailmensajecorreoinvenLogic=this.mailmensajecorreoinvenLogic;
		
		this.cargarCombosFrameForeignKeyMailMensajeCorreoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMailMensajeCorreoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMailMensajeCorreoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMailMensajeCorreoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMailMensajeCorreoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMailMensajeCorreoInven"));
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarMailMensajeCorreoInven"));

		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarMailMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemModificarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarMailMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarMailMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMailMensajeCorreoInven"));
						
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemActualizarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMailMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarMailMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarMailMensajeCorreoInven"));
								
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemEliminarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMailMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarMailMensajeCorreoInven"));
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarMailMensajeCorreoInven"));
					
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemCancelarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMailMensajeCorreoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemDetalleCerrarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMailMensajeCorreoInven"));		
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMailMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMailMensajeCorreoInven"));
		
		
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMailMensajeCorreoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonidMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonmailMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mailMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonesta_activoMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMailMensajeCorreoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMailMensajeCorreoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMailMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMailMensajeCorreoInven"));
		}
		
		this.jTableDatosMailMensajeCorreoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMailMensajeCorreoInven"));
		
		this.jTableDatosMailMensajeCorreoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMailMensajeCorreoInven"));
		
		this.jButtonNuevoMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoMailMensajeCorreoInven"));
		
		this.jButtonDuplicarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarMailMensajeCorreoInven"));
		
		this.jButtonCopiarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"CopiarMailMensajeCorreoInven"));
		
		this.jButtonVerFormMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"VerFormMailMensajeCorreoInven"));
		
		
		this.jButtonNuevoToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarMailMensajeCorreoInven"));
			
		this.jButtonDuplicarToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemNuevoMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMailMensajeCorreoInven"));
			
		this.jMenuItemDuplicarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMailMensajeCorreoInven"));		
		
		
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMailMensajeCorreoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemNuevoRelacionesMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMailMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarMailMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonModificarToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarMailMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemModificarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarMailMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ActualizarMailMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonActualizarToolBarMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMailMensajeCorreoInven"));
				
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemActualizarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMailMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarMailMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonEliminarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarMailMensajeCorreoInven"));
						
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemEliminarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMailMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarMailMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonCancelarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarMailMensajeCorreoInven"));
			
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemCancelarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMailMensajeCorreoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMailMensajeCorreoInven"));		
		
		
		this.jButtonCerrarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarMailMensajeCorreoInven"));
		
		
		this.jButtonCerrarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemCerrarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMailMensajeCorreoInven"));
			
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jMenuItemDetalleCerrarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMailMensajeCorreoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosMailMensajeCorreoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMailMensajeCorreoInven"));
		}
		
		this.jButtonCopiarToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarMailMensajeCorreoInven"));
			
		this.jButtonVerFormToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarMailMensajeCorreoInven"));
		
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMailMensajeCorreoInven"));
			
		this.jMenuItemCopiarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMailMensajeCorreoInven"));		
		
		this.jMenuItemVerFormMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMailMensajeCorreoInven"));		
		
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMailMensajeCorreoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMailMensajeCorreoInven"));		
		
		
		
		this.jButtonRecargarInformacionMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionMailMensajeCorreoInven"));
					
		this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMailMensajeCorreoInven"));
		
		this.jMenuItemRecargarInformacionMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMailMensajeCorreoInven"));		
		
		
		
		this.jButtonAnterioresMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresMailMensajeCorreoInven"));
		
		
		this.jButtonAnterioresToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMailMensajeCorreoInven"));
		
		this.jMenuItemAnterioresMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMailMensajeCorreoInven"));		
		
		
		this.jButtonSiguientesMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesMailMensajeCorreoInven"));
		
		
		this.jButtonSiguientesToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemSiguientesMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMailMensajeCorreoInven"));
			
		this.jMenuItemAbrirOrderByMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMailMensajeCorreoInven"));
			
		this.jMenuItemMostrarOcultarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMailMensajeCorreoInven"));
			
		this.jMenuItemDetalleAbrirOrderByMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMailMensajeCorreoInven"));
			
		this.jMenuItemDetalleMostarOcultarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMailMensajeCorreoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMailMensajeCorreoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMailMensajeCorreoInven"));
			
		this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMailMensajeCorreoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMailMensajeCorreoInven"));

		this.jCheckBoxSeleccionadosMailMensajeCorreoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMailMensajeCorreoInven"));
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMailMensajeCorreoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesMailMensajeCorreoInven"));
			
		this.jComboBoxTiposAccionesMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesMailMensajeCorreoInven"));
					
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMailMensajeCorreoInven"));
			
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMailMensajeCorreoInven"));		
		
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonidMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonmailMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mailMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonesta_activoMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMailMensajeCorreoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdMensajeCorreoInvenMailMensajeCorreoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMailMensajeCorreoInven!=null) {
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMailMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMailMensajeCorreoInven"));
				this.jInternalFrameReporteDinamicoMailMensajeCorreoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMailMensajeCorreoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMailMensajeCorreoInven"));				
			//this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMailMensajeCorreoInven"));
			//this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMailMensajeCorreoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMailMensajeCorreoInven!=null) {
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMailMensajeCorreoInven"));
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMailMensajeCorreoInven"));
				this.jInternalFrameImportacionMailMensajeCorreoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMailMensajeCorreoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByMailMensajeCorreoInven"));
			
			this.jButtonAbrirOrderByToolBarMailMensajeCorreoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMailMensajeCorreoInven"));			
			
			if(this.jInternalFrameOrderByMailMensajeCorreoInven!=null) {
				this.jInternalFrameOrderByMailMensajeCorreoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMailMensajeCorreoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTabbedPaneRelacionesMailMensajeCorreoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMailMensajeCorreoInven"));
		
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
            		closingInternalFrameMailMensajeCorreoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMailMensajeCorreoInven = (JInternalFrameBase)event.getSource();
	            	
	            MailMensajeCorreoInvenBeanSwingJInternalFrame jInternalFrameParent=(MailMensajeCorreoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormMailMensajeCorreoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMailMensajeCorreoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMailMensajeCorreoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMailMensajeCorreoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMailMensajeCorreoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMailMensajeCorreoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMailMensajeCorreoInven";
		inputMap = this.jButtonNuevoRelacionesMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMailMensajeCorreoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMailMensajeCorreoInven";
		inputMap = this.jButtonModificarMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMailMensajeCorreoInven";
		inputMap = this.jButtonActualizarMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMailMensajeCorreoInven";
		inputMap = this.jButtonEliminarMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMailMensajeCorreoInven";
		inputMap = this.jButtonCancelarMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMailMensajeCorreoInven";
		inputMap = this.jButtonCerrarMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMailMensajeCorreoInven";
		inputMap = this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonGuardarCambiosMailMensajeCorreoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMailMensajeCorreoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMailMensajeCorreoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMailMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMailMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMailMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMailMensajeCorreoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonidMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_mensaje_correo_invenMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_mensaje_correo_invenMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_empresaMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_sucursalMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMailMensajeCorreoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonid_moduloMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonmailMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"mailMailMensajeCorreoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jButtonesta_activoMailMensajeCorreoInvenBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoMailMensajeCorreoInvenBusqueda"));
		
		
		this.jButtonFK_IdMensajeCorreoInvenMailMensajeCorreoInven.addActionListener(new ButtonActionListener(this,"FK_IdMensajeCorreoInvenMailMensajeCorreoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMailMensajeCorreoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMailMensajeCorreoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMailMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMailMensajeCorreoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMailMensajeCorreoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
					mailmensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvens) {
					mailmensajecorreoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMailMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
						mailmensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvens) {
						mailmensajecorreoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
					
						if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							mailmensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvens) {
						
						if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							mailmensajecorreoinvenAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMailMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMailMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMailMensajeCorreoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMailMensajeCorreoInven.getSelectedRows();
			
			MailMensajeCorreoInven mailmensajecorreoinvenLocal=new MailMensajeCorreoInven();
			
			//this.seleccionarTodosMailMensajeCorreoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mailmensajecorreoinvenLocal =(MailMensajeCorreoInven) this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens().toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mailmensajecorreoinvenLocal =(MailMensajeCorreoInven) this.mailmensajecorreoinvens.toArray()[this.jTableDatosMailMensajeCorreoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mailmensajecorreoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
						mailmensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvens) {
						mailmensajecorreoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMailMensajeCorreoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMailMensajeCorreoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMailMensajeCorreoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMailMensajeCorreoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMailMensajeCorreoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMailMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMailMensajeCorreoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
				
						if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							mailmensajecorreoinvenAux.setmail(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvens) {
					
						if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							mailmensajecorreoinvenAux.setmail(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMailMensajeCorreoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMailMensajeCorreoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMailMensajeCorreoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMailMensajeCorreoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessMailMensajeCorreoInven(conSplash);
				
					this.generarReporteMailMensajeCorreoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMailMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMailMensajeCorreoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMailMensajeCorreoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMailMensajeCorreoInven();
				
				this.exportarMailMensajeCorreoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMailMensajeCorreoInvens();
				//this.importarMailMensajeCorreoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMailMensajeCorreoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMailMensajeCorreoInvensSeleccionados();
				//this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mail Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMailMensajeCorreoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMailMensajeCorreoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMailMensajeCorreoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(MailMensajeCorreoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMailMensajeCorreoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMailMensajeCorreoInven(conSplash);
					
						//this.actualizarParametrosGeneralMailMensajeCorreoInven();
						
						this.generarReporteProcesoAccionMailMensajeCorreoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Mail Mensaje Correo InvenES SELECCIONADOS?", "MANTENIMIENTO DE Mail Mensaje Correo Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMailMensajeCorreoInven();
				
						this.actualizarParametrosGeneralMailMensajeCorreoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mailmensajecorreoinvenReturnGeneral=mailmensajecorreoinvenLogic.procesarAccionMailMensajeCorreoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens(),this.mailmensajecorreoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMailMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMailMensajeCorreoInven();
					
					MailMensajeCorreoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMailMensajeCorreoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMailMensajeCorreoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxTiposAccionesFormularioMailMensajeCorreoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMailMensajeCorreoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMailMensajeCorreoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMailMensajeCorreoInven();
			
			if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
			MailMensajeCorreoInven mailmensajecorreoinven=new MailMensajeCorreoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMailMensajeCorreoInven.getSelectedItem();
			
			
			
			
			mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(mailmensajecorreoinvensSeleccionados.size()==1) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
					mailmensajecorreoinven=mailmensajecorreoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMailMensajeCorreoInven();
			
      		//this.finishProcessMailMensajeCorreoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMailMensajeCorreoInvenReturnGeneral() throws Exception {
		if(this.mailmensajecorreoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mailmensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mailmensajecorreoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mailmensajecorreoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mailmensajecorreoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mailmensajecorreoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
		}
		
		if(this.mailmensajecorreoinvenReturnGeneral.getConRetornoLista() || this.mailmensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.mailmensajecorreoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mailmensajecorreoinvenLogic.setMailMensajeCorreoInvens(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.mailmensajecorreoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mailmensajecorreoinvenLogic.setMailMensajeCorreoInven(this.mailmensajecorreoinvenReturnGeneral.getMailMensajeCorreoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMailMensajeCorreoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralMailMensajeCorreoInven() throws Exception {
		
		
	}
	
	public ArrayList<MailMensajeCorreoInven> getMailMensajeCorreoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMailMensajeCorreoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens()) {
					if(mailmensajecorreoinvenAux.getIsSelected()) {
						mailmensajecorreoinvensSeleccionados.add(mailmensajecorreoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MailMensajeCorreoInven mailmensajecorreoinvenAux:this.mailmensajecorreoinvens) {
					if(mailmensajecorreoinvenAux.getIsSelected()) {
						mailmensajecorreoinvensSeleccionados.add(mailmensajecorreoinvenAux);				
					}
				}
			}
			
			if(mailmensajecorreoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mailmensajecorreoinvensSeleccionados.addAll(this.mailmensajecorreoinvenLogic.getMailMensajeCorreoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mailmensajecorreoinvensSeleccionados.addAll(this.mailmensajecorreoinvens);				
					}
				}
			}
		} else {
			mailmensajecorreoinvensSeleccionados.add(this.mailmensajecorreoinven);
		}
		
		return mailmensajecorreoinvensSeleccionados;
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
	
	public void generarReporteMailMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMailMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMailMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMailMensajeCorreoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMailMensajeCorreoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mail Mensaje Correo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMailMensajeCorreoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMailMensajeCorreoInven();
		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMailMensajeCorreoInven();
		
		
		//this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados ,mailmensajecorreoinvenImplementable,mailmensajecorreoinvenImplementableHome);
	}
	
	public void mostrarImportacionMailMensajeCorreoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMailMensajeCorreoInven();
		
		this.abrirFrameImportacionMailMensajeCorreoInven();		
		
			
		//this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados ,mailmensajecorreoinvenImplementable,mailmensajecorreoinvenImplementableHome);
	}
	
	public void importarMailMensajeCorreoInvens() throws Exception {		
	
	}
	
	public void exportarMailMensajeCorreoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMailMensajeCorreoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMailMensajeCorreoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMailMensajeCorreoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mail Mensaje Correo Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMailMensajeCorreoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMailMensajeCorreoInven(mailmensajecorreoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mailmensajecorreoinvenAux.setsDetalleGeneralEntityReporte(mailmensajecorreoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMailMensajeCorreoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mailmensajecorreoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getmensajecorreoinven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getmail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mailmensajecorreoinven.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MailMensajeCorreoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMailMensajeCorreoInven(row);				
				iRow++;
			}				
			
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMailMensajeCorreoInven(mailmensajecorreoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMailMensajeCorreoInvensSeleccionados() throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();		
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mailmensajecorreoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mailmensajecorreoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mailmensajecorreoinven");
			//elementRoot.appendChild(element);
		
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
				element = document.createElement("mailmensajecorreoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMailMensajeCorreoInven(mailmensajecorreoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mail Mensaje Correo Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMailMensajeCorreoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getmensajecorreoinven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getmail());
		cell = row.createCell(iColumn++);cell.setCellValue(mailmensajecorreoinven.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlMailMensajeCorreoInven(MailMensajeCorreoInven mailmensajecorreoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MailMensajeCorreoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mailmensajecorreoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MailMensajeCorreoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mailmensajecorreoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmensajecorreoinven_descripcion = document.createElement(MailMensajeCorreoInvenConstantesFunciones.IDMENSAJECORREOINVEN);
		elementmensajecorreoinven_descripcion.appendChild(document.createTextNode(mailmensajecorreoinven.getmensajecorreoinven_descripcion()));
		element.appendChild(elementmensajecorreoinven_descripcion);

		Element elementempresa_descripcion = document.createElement(MailMensajeCorreoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mailmensajecorreoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MailMensajeCorreoInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(mailmensajecorreoinven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmodulo_descripcion = document.createElement(MailMensajeCorreoInvenConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(mailmensajecorreoinven.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementmail = document.createElement(MailMensajeCorreoInvenConstantesFunciones.MAIL);
		elementmail.appendChild(document.createTextNode(mailmensajecorreoinven.getmail().trim()));
		element.appendChild(elementmail);

		Element elementesta_activo = document.createElement(MailMensajeCorreoInvenConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(mailmensajecorreoinven.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoMailMensajeCorreoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados=new ArrayList<MailMensajeCorreoInven>();
		
		mailmensajecorreoinvensSeleccionados=this.getMailMensajeCorreoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMailMensajeCorreoInven(mailmensajecorreoinvensSeleccionados);
		
		this.generarReporteMailMensajeCorreoInvens("Todos",mailmensajecorreoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMailMensajeCorreoInven(ArrayList<MailMensajeCorreoInven> mailmensajecorreoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MailMensajeCorreoInven mailmensajecorreoinvenAux:mailmensajecorreoinvensSeleccionados) {
				mailmensajecorreoinvenAux.setsDetalleGeneralEntityReporte(mailmensajecorreoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMENSAJECORREOINVEN)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mailmensajecorreoinvenAux.getmensajecorreoinven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mailmensajecorreoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mailmensajecorreoinvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mailmensajecorreoinvenAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_MAIL)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(mailmensajecorreoinvenAux.getmail());
				}
				 else if(sTipoSeleccionar.equals(MailMensajeCorreoInvenConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					mailmensajecorreoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(mailmensajecorreoinvenAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MailMensajeCorreoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMailMensajeCorreoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=true;
				this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=true;
			}
			
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaModificarMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaCancelarMailMensajeCorreoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarMailMensajeCorreoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MailMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=true;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=true;
		} else {
			this.actualizarEstadoPanelsMailMensajeCorreoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMailMensajeCorreoInven=false;
			//this.isVisibilidadCeldaVerFormMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaDuplicarMailMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaGuardarCambiosMailMensajeCorreoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!mailmensajecorreoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;												
			}
			
			this.jButtonCerrarMailMensajeCorreoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMailMensajeCorreoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.mailmensajecorreoinven)) {
			this.isVisibilidadCeldaActualizarMailMensajeCorreoInven=false;
			this.isVisibilidadCeldaEliminarMailMensajeCorreoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMailMensajeCorreoInven() {
	}
	
	public void actualizarEstadoPanelsMailMensajeCorreoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosEdicionMailMensajeCorreoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMailMensajeCorreoInven!=null) {
				this.jScrollPanelDatosMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionMailMensajeCorreoInven!=null) {
				this.jPanelPaginacionMailMensajeCorreoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
					this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mailmensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMailMensajeCorreoInven!=null) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMailMensajeCorreoInven!=null) {
				this.jPanelParametrosReportesMailMensajeCorreoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaMensajeCorreoInven(Boolean isParaMensajeCorreoInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMensajeCorreoInvenNegation=!isParaMensajeCorreoInven;

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaMensajeCorreoInven;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasMailMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasMailMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasMailMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdMensajeCorreoInven=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdMensajeCorreoInven) {this.jTabbedPaneBusquedasMailMensajeCorreoInven.remove(jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		
		if(this.mailmensajecorreoinvenSessionBean==null) {
			this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		}
		
		this.mailmensajecorreoinvenSessionBean.setsUltimaBusquedaMailMensajeCorreoInven(this.getsAccionBusqueda());
		this.mailmensajecorreoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.mailmensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			mailmensajecorreoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMensajeCorreoInven")) {
			mailmensajecorreoinvenSessionBean.setid_mensaje_correo_inven(this.getid_mensaje_correo_invenFK_IdMensajeCorreoInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			mailmensajecorreoinvenSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			mailmensajecorreoinvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MailMensajeCorreoInvenSessionBean mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		
		if(this.mailmensajecorreoinvenSessionBean==null) {
			this.mailmensajecorreoinvenSessionBean=new MailMensajeCorreoInvenSessionBean();
		}
		
		if(this.mailmensajecorreoinvenSessionBean.getsUltimaBusquedaMailMensajeCorreoInven()!=null&&!this.mailmensajecorreoinvenSessionBean.getsUltimaBusquedaMailMensajeCorreoInven().equals("")) {
			this.setsAccionBusqueda(mailmensajecorreoinvenSessionBean.getsUltimaBusquedaMailMensajeCorreoInven());
			this.setiNumeroPaginacion(mailmensajecorreoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(mailmensajecorreoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(mailmensajecorreoinvenSessionBean.getid_empresa());
				mailmensajecorreoinvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMensajeCorreoInven")) {
				this.setid_mensaje_correo_invenFK_IdMensajeCorreoInven(mailmensajecorreoinvenSessionBean.getid_mensaje_correo_inven());
				mailmensajecorreoinvenSessionBean.setid_mensaje_correo_inven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(mailmensajecorreoinvenSessionBean.getid_modulo());
				mailmensajecorreoinvenSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(mailmensajecorreoinvenSessionBean.getid_sucursal());
				mailmensajecorreoinvenSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.mailmensajecorreoinvenSessionBean.setsUltimaBusquedaMailMensajeCorreoInven("");
		this.mailmensajecorreoinvenSessionBean.setiNumeroPaginacion(MailMensajeCorreoInvenConstantesFunciones.INUMEROPAGINACION);
		this.mailmensajecorreoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMailMensajeCorreoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMailMensajeCorreoInven() {
		this.updateBorderResaltarBusquedasFormularioMailMensajeCorreoInven();
		this.updateVisibilidadBusquedasFormularioMailMensajeCorreoInven();
		this.updateHabilitarBusquedasFormularioMailMensajeCorreoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioMailMensajeCorreoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponents().length>0) {
	

		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenMailMensajeCorreoInven!=null) {
			index= this.jTabbedPaneBusquedasMailMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponent(index);
				jPanel.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMailMensajeCorreoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMailMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			if(!this.mailmensajecorreoinvenConstantesFunciones.mostrarFK_IdMensajeCorreoInvenMailMensajeCorreoInven && index>-1) {
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMailMensajeCorreoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMailMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
				this.jTabbedPaneBusquedasMailMensajeCorreoInven.setEnabledAt(index,this.mailmensajecorreoinvenConstantesFunciones.activarFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMailMensajeCorreoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdMensajeCorreoInven")) {
			index= this.jTabbedPaneBusquedasMailMensajeCorreoInven.indexOfComponent(this.jPanelFK_IdMensajeCorreoInvenMailMensajeCorreoInven);

			this.jTabbedPaneBusquedasMailMensajeCorreoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMailMensajeCorreoInven.getComponent(index);

			this.mailmensajecorreoinvenConstantesFunciones.setResaltarFK_IdMensajeCorreoInvenMailMensajeCorreoInven(resaltar);

			jPanel.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarFK_IdMensajeCorreoInvenMailMensajeCorreoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMailMensajeCorreoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMailMensajeCorreoInven() throws Exception {

		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMailMensajeCorreoInven();
		this.updateVisibilidadResaltarControlesFormularioMailMensajeCorreoInven();
		this.updateHabilitarResaltarControlesFormularioMailMensajeCorreoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioMailMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltaridMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltaridMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_mensaje_correo_invenMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_empresaMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_empresaMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_sucursalMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_sucursalMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_moduloMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarid_moduloMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltarmailMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltarmailMailMensajeCorreoInven);}
		if(this.mailmensajecorreoinvenConstantesFunciones.resaltaresta_activoMailMensajeCorreoInven!=null && this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setBorderPainted(true);this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setBorder(this.mailmensajecorreoinvenConstantesFunciones.resaltaresta_activoMailMensajeCorreoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMailMensajeCorreoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
	
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostraridMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelidMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostraridMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelid_mensaje_correo_invenMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_mensaje_correo_invenMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_empresaMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelid_empresaMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_empresaMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_sucursalMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelid_sucursalMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_sucursalMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_moduloMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelid_moduloMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarid_moduloMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarmailMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelmailMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostrarmailMailMensajeCorreoInven);
		//this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostraresta_activoMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jPanelesta_activoMailMensajeCorreoInven.setVisible(this.mailmensajecorreoinvenConstantesFunciones.mostraresta_activoMailMensajeCorreoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMailMensajeCorreoInven() throws Exception {
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMailMensajeCorreoInven!=null) {
	
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jLabelidMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activaridMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_mensaje_correo_invenMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarid_mensaje_correo_invenMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_empresaMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarid_empresaMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_sucursalMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarid_sucursalMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jComboBoxid_moduloMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarid_moduloMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jTextAreamailMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activarmailMailMensajeCorreoInven);
		this.jInternalFrameDetalleFormMailMensajeCorreoInven.jCheckBoxesta_activoMailMensajeCorreoInven.setEnabled(this.mailmensajecorreoinvenConstantesFunciones.activaresta_activoMailMensajeCorreoInven);
		}
	}
	
		
}