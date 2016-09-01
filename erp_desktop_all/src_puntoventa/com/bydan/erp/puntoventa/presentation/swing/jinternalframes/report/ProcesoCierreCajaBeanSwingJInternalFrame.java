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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.ProcesoCierreCajaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ProcesoCierreCajaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ProcesoCierreCajaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCierreCajaBeanSwingJInternalFrame extends ProcesoCierreCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCierreCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCierreCaja> procesocierrecajaValidator = new ClassValidator<ProcesoCierreCaja>(ProcesoCierreCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCierreCaja procesocierrecaja;	
	public ProcesoCierreCaja procesocierrecajaAux;
	public ProcesoCierreCaja procesocierrecajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCierreCaja procesocierrecajaTotales;
	public Long idProcesoCierreCajaActual;
	public Long iIdNuevoProcesoCierreCaja=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCierreCaja;
	public Boolean isPermisoNuevoProcesoCierreCaja;
	public Boolean isPermisoActualizarProcesoCierreCaja;
	public Boolean isPermisoActualizarOriginalProcesoCierreCaja;
	public Boolean isPermisoEliminarProcesoCierreCaja;
	public Boolean isPermisoGuardarCambiosProcesoCierreCaja;
	public Boolean isPermisoConsultaProcesoCierreCaja;
	public Boolean isPermisoBusquedaProcesoCierreCaja;
	public Boolean isPermisoReporteProcesoCierreCaja;
	public Boolean isPermisoPaginacionMedioProcesoCierreCaja;
	public Boolean isPermisoPaginacionAltoProcesoCierreCaja;
	public Boolean isPermisoPaginacionTodoProcesoCierreCaja;
	public Boolean isPermisoCopiarProcesoCierreCaja;
	public Boolean isPermisoVerFormProcesoCierreCaja;
	public Boolean isPermisoDuplicarProcesoCierreCaja;
	public Boolean isPermisoOrdenProcesoCierreCaja;
	
	
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
	
	public ProcesoCierreCajaParameterReturnGeneral procesocierrecajaReturnGeneral;
	public ProcesoCierreCajaParameterReturnGeneral procesocierrecajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCierreCaja=false;
	public Boolean esParaAccionDesdeFormularioProcesoCierreCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCierreCajaSessionBeanAdditional procesocierrecajaSessionBeanAdditional=null;
	
	public ProcesoCierreCajaSessionBeanAdditional getProcesoCierreCajaSessionBeanAdditional() {
		return this.procesocierrecajaSessionBeanAdditional;
	}
	
	public void setProcesoCierreCajaSessionBeanAdditional(ProcesoCierreCajaSessionBeanAdditional procesocierrecajaSessionBeanAdditional) {
		try {
			this.procesocierrecajaSessionBeanAdditional=procesocierrecajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCierreCajaBeanSwingJInternalFrameAdditional procesocierrecajaBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCierreCajaBeanSwingJInternalFrame
	
	public ProcesoCierreCajaBeanSwingJInternalFrameAdditional getProcesoCierreCajaBeanSwingJInternalFrameAdditional() {
		return this.procesocierrecajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCierreCajaBeanSwingJInternalFrameAdditional(ProcesoCierreCajaBeanSwingJInternalFrameAdditional procesocierrecajaBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocierrecajaBeanSwingJInternalFrameAdditional=procesocierrecajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCierreCajaLogic procesocierrecajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCierreCaja procesocierrecajaBean;
	public ProcesoCierreCajaConstantesFunciones procesocierrecajaConstantesFunciones;
	//public ProcesoCierreCajaParameterReturnGeneral procesocierrecajaReturnGeneral;
	
	//FK
	
	public UsuarioLogic usuarioLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCierreCaja> procesocierrecajas;	
	//public List<ProcesoCierreCaja> procesocierrecajasEliminados;
	//public List<ProcesoCierreCaja> procesocierrecajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCierreCaja=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCierreCaja=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCierreCaja=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCierreCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaModificarProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCierreCaja=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCierreCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCierreCaja=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoProcesoCierreCaja() {
		return this.iIdNuevoProcesoCierreCaja;
	}

	public void setiIdNuevoProcesoCierreCaja(Long iIdNuevoProcesoCierreCaja) {
		this.iIdNuevoProcesoCierreCaja = iIdNuevoProcesoCierreCaja;
	}
	
	public Long getidProcesoCierreCajaActual() {
		return this.idProcesoCierreCajaActual;
	}

	public void setidProcesoCierreCajaActual(Long idProcesoCierreCajaActual) {
		this.idProcesoCierreCajaActual = idProcesoCierreCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCierreCaja getprocesocierrecaja() {
		return this.procesocierrecaja;
	}

	public void setprocesocierrecaja(ProcesoCierreCaja procesocierrecaja) {
		this.procesocierrecaja = procesocierrecaja;
	}
	
	public ProcesoCierreCaja getprocesocierrecajaAux() {
		return this.procesocierrecajaAux;
	}

	public void setprocesocierrecajaAux(ProcesoCierreCaja procesocierrecajaAux) {
		this.procesocierrecajaAux = procesocierrecajaAux;
	}				
	
	public ProcesoCierreCaja getprocesocierrecajaAnterior() {
		return this.procesocierrecajaAnterior;
	}

	public void setprocesocierrecajaAnterior(ProcesoCierreCaja procesocierrecajaAnterior) {
		this.procesocierrecajaAnterior = procesocierrecajaAnterior;
	}	
	
	public ProcesoCierreCaja getprocesocierrecajaTotales() {
		return this.procesocierrecajaTotales;
	}

	public void setprocesocierrecajaTotales(ProcesoCierreCaja procesocierrecajaTotales) {
		this.procesocierrecajaTotales = procesocierrecajaTotales;
	}	
	
	public ProcesoCierreCaja getprocesocierrecajaBean() {
		return this.procesocierrecajaBean;
	}

	public void setprocesocierrecajaBean(ProcesoCierreCaja procesocierrecajaBean) {
		this.procesocierrecajaBean = procesocierrecajaBean;
	}	
	
	public ProcesoCierreCajaParameterReturnGeneral getprocesocierrecajaReturnGeneral() {
		return this.procesocierrecajaReturnGeneral;
	}

	public void setprocesocierrecajaReturnGeneral(ProcesoCierreCajaParameterReturnGeneral procesocierrecajaReturnGeneral) {
		this.procesocierrecajaReturnGeneral = procesocierrecajaReturnGeneral;
	}	
	
	
	public Long id_usuarioBusquedaProcesoCierreCaja=-1L;

	public Long getid_usuarioBusquedaProcesoCierreCaja() {
		return this.id_usuarioBusquedaProcesoCierreCaja;
	}

	public void setid_usuarioBusquedaProcesoCierreCaja(Long id_usuarioBusquedaProcesoCierreCaja) {
		this.id_usuarioBusquedaProcesoCierreCaja = id_usuarioBusquedaProcesoCierreCaja;
	}

;
	public Long id_cajaBusquedaProcesoCierreCaja=-1L;

	public Long getid_cajaBusquedaProcesoCierreCaja() {
		return this.id_cajaBusquedaProcesoCierreCaja;
	}

	public void setid_cajaBusquedaProcesoCierreCaja(Long id_cajaBusquedaProcesoCierreCaja) {
		this.id_cajaBusquedaProcesoCierreCaja = id_cajaBusquedaProcesoCierreCaja;
	}

;
	public Date fechaBusquedaProcesoCierreCaja=new Date();

	public Date getfechaBusquedaProcesoCierreCaja() {
		return this.fechaBusquedaProcesoCierreCaja;
	}

	public void setfechaBusquedaProcesoCierreCaja(Date fechaBusquedaProcesoCierreCaja) {
		this.fechaBusquedaProcesoCierreCaja = fechaBusquedaProcesoCierreCaja;
	}

	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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
	
	
	public ProcesoCierreCajaLogic getProcesoCierreCajaLogic()	{		
		return procesocierrecajaLogic;
	}

	public void setProcesoCierreCajaLogic(ProcesoCierreCajaLogic procesocierrecajaLogic) {
		this.procesocierrecajaLogic = procesocierrecajaLogic;
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
	
	public Boolean getIsEsNuevoProcesoCierreCaja() {
		return isEsNuevoProcesoCierreCaja;
	}

	public void setIsEsNuevoProcesoCierreCaja(Boolean isEsNuevoProcesoCierreCaja) {
		this.isEsNuevoProcesoCierreCaja = isEsNuevoProcesoCierreCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCierreCaja() {
		return esParaAccionDesdeFormularioProcesoCierreCaja;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCierreCaja(Boolean esParaAccionDesdeFormularioProcesoCierreCaja) {
		this.esParaAccionDesdeFormularioProcesoCierreCaja = esParaAccionDesdeFormularioProcesoCierreCaja;
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

			if(this.procesocierrecajaSessionBean==null) {
				this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
			}

			if(!this.procesocierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(procesocierrecajaSessionBean.getlidUsuarioActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocierrecajaSessionBean==null) {
				this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
			}

			if(!this.procesocierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(procesocierrecajaSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

					if(this.procesocierrecaja!=null) {
						this.procesocierrecaja.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
						this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioProcesoCierreCaja.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja!=null) {
						jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja!=null) {
							//jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioProcesoCierreCajaGenerico)throws Exception
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
				jComboBoxid_usuarioProcesoCierreCajaGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioProcesoCierreCajaGenerico!=null && jComboBoxid_usuarioProcesoCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_usuarioProcesoCierreCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.procesocierrecaja!=null) {
						this.procesocierrecaja.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
						this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaProcesoCierreCaja.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja!=null) {
						jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja!=null) {
							//jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.getItemCount()>0) {
								jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedIndex(0);
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

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaProcesoCierreCajaGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaProcesoCierreCajaGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaProcesoCierreCajaGenerico!=null && jComboBoxid_cajaProcesoCierreCajaGenerico.getItemCount()>0) {
					jComboBoxid_cajaProcesoCierreCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(ProcesoCierreCaja procesocierrecaja,JComboBox jComboBoxid_usuarioProcesoCierreCajaGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioProcesoCierreCajaGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioProcesoCierreCajaGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				procesocierrecaja.setid_usuario(usuarioAux.getId());
				procesocierrecaja.setusuario_descripcion(ProcesoCierreCajaConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				procesocierrecaja.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(ProcesoCierreCaja procesocierrecaja,JComboBox jComboBoxid_cajaProcesoCierreCajaGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaProcesoCierreCajaGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaProcesoCierreCajaGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				procesocierrecaja.setid_caja(cajaAux.getId());
				procesocierrecaja.setcaja_descripcion(ProcesoCierreCajaConstantesFunciones.getCajaDescripcion(cajaAux));
				procesocierrecaja.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { 
					}

					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.addItem(usuario);
							}
						}

						if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { 
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { 
					}

					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCierreCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.addItem(caja);
							}
						}

						if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCierreCaja() throws Exception {
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
		
	public ProcesoCierreCajaParameterReturnGeneral getProcesoCierreCajaParameterGeneral() {
		return this.procesocierrecajaParameterGeneral;
	}
	
	public void setProcesoCierreCajaParameterGeneral(ProcesoCierreCajaParameterReturnGeneral procesocierrecajaParameterGeneral) {
		this.procesocierrecajaParameterGeneral = procesocierrecajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCierreCaja() {
		return isPermisoTodoProcesoCierreCaja;
	}

	public void setIsPermisoTodoProcesoCierreCaja(Boolean isPermisoTodoProcesoCierreCaja) {
		this.isPermisoTodoProcesoCierreCaja = isPermisoTodoProcesoCierreCaja;
	}

	public Boolean getIsPermisoNuevoProcesoCierreCaja() {
		return isPermisoNuevoProcesoCierreCaja;
	}

	public void setIsPermisoNuevoProcesoCierreCaja(Boolean isPermisoNuevoProcesoCierreCaja) {
		this.isPermisoNuevoProcesoCierreCaja = isPermisoNuevoProcesoCierreCaja;
	}

	public Boolean getIsPermisoActualizarProcesoCierreCaja() {
		return isPermisoActualizarProcesoCierreCaja;
	}

	public void setIsPermisoActualizarProcesoCierreCaja(Boolean isPermisoActualizarProcesoCierreCaja) {
		this.isPermisoActualizarProcesoCierreCaja = isPermisoActualizarProcesoCierreCaja;
	}

	public Boolean getIsPermisoEliminarProcesoCierreCaja() {
		return isPermisoEliminarProcesoCierreCaja;
	}

	public void setIsPermisoEliminarProcesoCierreCaja(Boolean isPermisoEliminarProcesoCierreCaja) {
		this.isPermisoEliminarProcesoCierreCaja = isPermisoEliminarProcesoCierreCaja;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCierreCaja() {
		return isPermisoGuardarCambiosProcesoCierreCaja;
	}

	public void setIsPermisoGuardarCambiosProcesoCierreCaja(Boolean isPermisoGuardarCambiosProcesoCierreCaja) {
		this.isPermisoGuardarCambiosProcesoCierreCaja = isPermisoGuardarCambiosProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoConsultaProcesoCierreCaja() {
		return isPermisoConsultaProcesoCierreCaja;
	}

	public void setIsPermisoConsultaProcesoCierreCaja(Boolean isPermisoConsultaProcesoCierreCaja) {
		this.isPermisoConsultaProcesoCierreCaja = isPermisoConsultaProcesoCierreCaja;
	}

	public Boolean getIsPermisoBusquedaProcesoCierreCaja() {
		return isPermisoBusquedaProcesoCierreCaja;
	}

	public void setIsPermisoBusquedaProcesoCierreCaja(Boolean isPermisoBusquedaProcesoCierreCaja) {
		this.isPermisoBusquedaProcesoCierreCaja = isPermisoBusquedaProcesoCierreCaja;
	}

	public Boolean getIsPermisoReporteProcesoCierreCaja() {
		return isPermisoReporteProcesoCierreCaja;
	}

	public void setIsPermisoReporteProcesoCierreCaja(Boolean isPermisoReporteProcesoCierreCaja) {
		this.isPermisoReporteProcesoCierreCaja = isPermisoReporteProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCierreCaja() {
		return isPermisoPaginacionMedioProcesoCierreCaja;
	}

	public void setIsPermisoPaginacionMedioProcesoCierreCaja(Boolean isPermisoPaginacionMedioProcesoCierreCaja) {
		this.isPermisoPaginacionMedioProcesoCierreCaja = isPermisoPaginacionMedioProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCierreCaja() {
		return isPermisoPaginacionTodoProcesoCierreCaja;
	}

	public void setIsPermisoPaginacionTodoProcesoCierreCaja(Boolean isPermisoPaginacionTodoProcesoCierreCaja) {
		this.isPermisoPaginacionTodoProcesoCierreCaja = isPermisoPaginacionTodoProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCierreCaja() {
		return isPermisoPaginacionAltoProcesoCierreCaja;
	}

	public void setIsPermisoPaginacionAltoProcesoCierreCaja(Boolean isPermisoPaginacionAltoProcesoCierreCaja) {
		this.isPermisoPaginacionAltoProcesoCierreCaja = isPermisoPaginacionAltoProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoCopiarProcesoCierreCaja() {
		return isPermisoCopiarProcesoCierreCaja;
	}

	public void setIsPermisoCopiarProcesoCierreCaja(Boolean isPermisoCopiarProcesoCierreCaja) {
		this.isPermisoCopiarProcesoCierreCaja = isPermisoCopiarProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoVerFormProcesoCierreCaja() {
		return isPermisoVerFormProcesoCierreCaja;
	}

	public void setIsPermisoVerFormProcesoCierreCaja(Boolean isPermisoVerFormProcesoCierreCaja) {
		this.isPermisoVerFormProcesoCierreCaja = isPermisoVerFormProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCierreCaja() {
		return isPermisoDuplicarProcesoCierreCaja;
	}

	public void setIsPermisoDuplicarProcesoCierreCaja(Boolean isPermisoDuplicarProcesoCierreCaja) {
		this.isPermisoDuplicarProcesoCierreCaja = isPermisoDuplicarProcesoCierreCaja;
	}
	
	public Boolean getIsPermisoOrdenProcesoCierreCaja() {
		return isPermisoOrdenProcesoCierreCaja;
	}

	public void setIsPermisoOrdenProcesoCierreCaja(Boolean isPermisoOrdenProcesoCierreCaja) {
		this.isPermisoOrdenProcesoCierreCaja = isPermisoOrdenProcesoCierreCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCierreCaja() {
		return isVisibilidadCeldaNuevoProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCierreCaja(Boolean isVisibilidadCeldaNuevoProcesoCierreCaja) {
		this.isVisibilidadCeldaNuevoProcesoCierreCaja = isVisibilidadCeldaNuevoProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCierreCaja() {
		return isVisibilidadCeldaDuplicarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCierreCaja(Boolean isVisibilidadCeldaDuplicarProcesoCierreCaja) {
		this.isVisibilidadCeldaDuplicarProcesoCierreCaja = isVisibilidadCeldaDuplicarProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCierreCaja() {
		return isVisibilidadCeldaCopiarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCierreCaja(Boolean isVisibilidadCeldaCopiarProcesoCierreCaja) {
		this.isVisibilidadCeldaCopiarProcesoCierreCaja = isVisibilidadCeldaCopiarProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCierreCaja() {
		return isVisibilidadCeldaVerFormProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCierreCaja(Boolean isVisibilidadCeldaVerFormProcesoCierreCaja) {
		this.isVisibilidadCeldaVerFormProcesoCierreCaja = isVisibilidadCeldaVerFormProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCierreCaja() {
		return isVisibilidadCeldaOrdenProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCierreCaja(Boolean isVisibilidadCeldaOrdenProcesoCierreCaja) {
		this.isVisibilidadCeldaOrdenProcesoCierreCaja = isVisibilidadCeldaOrdenProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCierreCaja() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCierreCaja(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja = isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCierreCaja() {
		return isVisibilidadCeldaModificarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaModificarProcesoCierreCaja(Boolean isVisibilidadCeldaModificarProcesoCierreCaja) {
		this.isVisibilidadCeldaModificarProcesoCierreCaja = isVisibilidadCeldaModificarProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCierreCaja() {
		return isVisibilidadCeldaActualizarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCierreCaja(Boolean isVisibilidadCeldaActualizarProcesoCierreCaja) {
		this.isVisibilidadCeldaActualizarProcesoCierreCaja = isVisibilidadCeldaActualizarProcesoCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCierreCaja() {
		return isVisibilidadCeldaEliminarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCierreCaja(Boolean isVisibilidadCeldaEliminarProcesoCierreCaja) {
		this.isVisibilidadCeldaEliminarProcesoCierreCaja = isVisibilidadCeldaEliminarProcesoCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCierreCaja() {
		return isVisibilidadCeldaCancelarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCierreCaja(Boolean isVisibilidadCeldaCancelarProcesoCierreCaja) {
		this.isVisibilidadCeldaCancelarProcesoCierreCaja = isVisibilidadCeldaCancelarProcesoCierreCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCierreCaja() {
		return isVisibilidadCeldaGuardarProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCierreCaja(Boolean isVisibilidadCeldaGuardarProcesoCierreCaja) {
		this.isVisibilidadCeldaGuardarProcesoCierreCaja = isVisibilidadCeldaGuardarProcesoCierreCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCierreCaja() {
		return isVisibilidadCeldaGuardarCambiosProcesoCierreCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCierreCaja(Boolean isVisibilidadCeldaGuardarCambiosProcesoCierreCaja) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja = isVisibilidadCeldaGuardarCambiosProcesoCierreCaja;
	}
		
	public ProcesoCierreCajaSessionBean getprocesocierrecajaSessionBean() {
		return this.procesocierrecajaSessionBean;
	}
	
	public void setprocesocierrecajaSessionBean(ProcesoCierreCajaSessionBean procesocierrecajaSessionBean) {
		this.procesocierrecajaSessionBean=procesocierrecajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCierreCaja() {
		return this.isVisibilidadBusquedaProcesoCierreCaja;
	}

	public void setisVisibilidadBusquedaProcesoCierreCaja(Boolean isVisibilidadBusquedaProcesoCierreCaja) {
		this.isVisibilidadBusquedaProcesoCierreCaja=isVisibilidadBusquedaProcesoCierreCaja;
	}

	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
	}

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja)throws Exception {
		try {
			
				this.setActualParaGuardarUsuarioForeignKey(procesocierrecaja,null);
				this.setActualParaGuardarCajaForeignKey(procesocierrecaja,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCierreCaja procesocierrecaja,ProcesoCierreCaja procesocierrecajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCierreCaja(procesocierrecaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocierrecajaAux.setId(procesocierrecaja.getId());
		procesocierrecajaAux.setVersionRow(procesocierrecaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCierreCaja procesocierrecajaLocal) throws Exception {
		
		if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCierreCaja procesocierrecajaLocal) throws Exception {	
		if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				procesocierrecajaLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				procesocierrecajaLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCierreCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocierrecajaValidator.getInvalidValues(this.procesocierrecaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCierreCaja procesocierrecaja,List<ProcesoCierreCaja> procesocierrecajas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCierreCaja procesocierrecaja,List<ProcesoCierreCaja> procesocierrecajas) throws Exception {
		try	{			
			ProcesoCierreCajaConstantesFunciones.actualizarSelectedLista(procesocierrecaja,procesocierrecajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCierreCaja> procesocierrecajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocierrecajasLocal=this.procesocierrecajaLogic.getProcesoCierreCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocierrecajasLocal=this.procesocierrecajas;
			}
			//ARCHITECTURE
		
			for(ProcesoCierreCaja procesocierrecajaLocal:procesocierrecajasLocal) {
				if(this.permiteMantenimiento(procesocierrecajaLocal) && procesocierrecajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCierreCajaConstantesFunciones.getProcesoCierreCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCierreCajaConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelid_usuarioProcesoCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreCajaConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelid_cajaProcesoCierreCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCierreCajaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelfechaProcesoCierreCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelid_usuarioProcesoCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelid_cajaProcesoCierreCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelfechaProcesoCierreCaja,"");
		
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
		this.iIdNuevoProcesoCierreCaja--;	
		
		
		this.procesocierrecajaAux=new ProcesoCierreCaja();
		
		this.procesocierrecajaAux.setId(this.iIdNuevoProcesoCierreCaja);
		this.procesocierrecajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocierrecajaLogic.getProcesoCierreCajas().add(this.procesocierrecajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocierrecajas.add(this.procesocierrecajaAux);
		}
		//ARCHITECTURE
		
		this.procesocierrecaja=this.procesocierrecajaAux;
		
		if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecaja);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreCaja(this.procesocierrecaja);
		}
				
		//this.setDefaultControlesProcesoCierreCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCierreCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreCaja(this.procesocierrecajaBean,this.procesocierrecaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreCaja(this.procesocierrecajaReturnGeneral,this.procesocierrecajaBean,false);
		
		if(this.procesocierrecajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja());
		}
		
		if(this.procesocierrecajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja(),classes);//this.procesocierrecajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCierreCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCierreCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.RecargarFormProcesoCierreCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCierreCaja(false);
						
			if(procesocierrecajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreCaja();
			}
			
			this.actualizarVisualTableDatosProcesoCierreCaja();
			
			this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreCaja(), this.getIndiceNuevoProcesoCierreCaja());
			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCierreCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCierreCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setEnabled(isHabilitar && this.procesocierrecajaConstantesFunciones.activarfechaProcesoCierreCaja);	
		//
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setEnabled(isHabilitar && this.procesocierrecajaConstantesFunciones.activarid_usuarioProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setEnabled(isHabilitar && this.procesocierrecajaConstantesFunciones.activarid_cajaProcesoCierreCaja);
	};
	
	public void setDefaultControlesProcesoCierreCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCierreCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocierrecajaSessionBean.setConGuardarRelaciones(true);			
			this.procesocierrecajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.setVisible(true);
			
					
		} else {
			//this.procesocierrecajaSessionBean.setConGuardarRelaciones(false);			
			this.procesocierrecajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCierreCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
				if(procesocierrecajaAux.getId().equals(this.iIdNuevoProcesoCierreCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajas) {
				if(procesocierrecajaAux.getId().equals(this.iIdNuevoProcesoCierreCaja)) {
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
	
	public int getIndiceActualProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
				if(procesocierrecajaAux.getId().equals(procesocierrecaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajas) {
				if(procesocierrecajaAux.getId().equals(procesocierrecaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCierreCaja(ProcesoCierreCaja procesocierrecajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
				if(procesocierrecajaAux.getProcesoCierreCajaOriginal().getId().equals(procesocierrecajaOriginal.getId())) {
					existe=true;
					procesocierrecajaOriginal.setId(procesocierrecajaAux.getId());
					procesocierrecajaOriginal.setVersionRow(procesocierrecajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajas) {
				if(procesocierrecajaAux.getProcesoCierreCajaOriginal().getId().equals(procesocierrecajaOriginal.getId())) {
					existe=true;
					procesocierrecajaOriginal.setId(procesocierrecajaAux.getId());
					procesocierrecajaOriginal.setVersionRow(procesocierrecajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCierreCaja(Boolean esParaCancelar) throws Exception {
		procesocierrecajasAux=new ArrayList<ProcesoCierreCaja>();
		procesocierrecajaAux=new ProcesoCierreCaja();
		
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
					if(procesocierrecajaAux.getId()<0) {
						procesocierrecajasAux.add(procesocierrecajaAux);
					}		
				}
				this.iIdNuevoProcesoCierreCaja=0L;
				this.procesocierrecajaLogic.getProcesoCierreCajas().removeAll(procesocierrecajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajas) {
					if(procesocierrecajaAux.getId()<0) {
						procesocierrecajasAux.add(procesocierrecajaAux);
					}		
				}
				this.iIdNuevoProcesoCierreCaja=0L;
				this.procesocierrecajas.removeAll(procesocierrecajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreCaja 
					&& this.procesocierrecajaLogic.getProcesoCierreCajas().size()>0
					) {
					procesocierrecajaAux=this.procesocierrecajaLogic.getProcesoCierreCajas().get(this.procesocierrecajaLogic.getProcesoCierreCajas().size() - 1);
				
					if(procesocierrecajaAux.getId()<0) {
						this.procesocierrecajaLogic.getProcesoCierreCajas().remove(procesocierrecajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCierreCaja && this.procesocierrecajas.size()>0) {
					procesocierrecajaAux=this.procesocierrecajas.get(this.procesocierrecajas.size() - 1);
				
					if(procesocierrecajaAux.getId()<0) {
						this.procesocierrecajas.remove(procesocierrecajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCierreCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocierrecaja.getId()<0) {
				this.procesocierrecajaLogic.getProcesoCierreCajas().remove(this.procesocierrecaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocierrecaja.getId()<0) {
				this.procesocierrecajas.remove(this.procesocierrecaja);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCierreCaja(List<ProcesoCierreCaja> procesocierrecajasAux) throws Exception {
		ProcesoCierreCajaConstantesFunciones.setEstadosInicialesProcesoCierreCaja(procesocierrecajasAux);
	}
	
	public void setEstadosInicialesProcesoCierreCaja(ProcesoCierreCaja procesocierrecajaAux) throws Exception {
		ProcesoCierreCajaConstantesFunciones.setEstadosInicialesProcesoCierreCaja(procesocierrecajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCierreCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCierreCajaActual()) {
				if(!this.isEsNuevoProcesoCierreCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCierreCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCierreCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Cierre Caja ?", "MANTENIMIENTO DE Proceso Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCierreCaja procesocierrecaja) throws Exception {
		ProcesoCierreCajaConstantesFunciones.seleccionarAsignar(this.procesocierrecaja,procesocierrecaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCierreCaja=this.isPermisoActualizarOriginalProcesoCierreCaja;
			
			
			this.seleccionarAsignar(procesocierrecaja);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocierrecajaSessionBean.setsFuncionBusquedaRapida(this.procesocierrecajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCierreCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCierreCaja(esParaCancelar);				
				this.cancelarNuevoProcesoCierreCaja(esParaCancelar);								
			}
			
			this.procesocierrecaja=new ProcesoCierreCaja();
			
			this.inicializarProcesoCierreCaja();
			
			this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCierreCaja() throws Exception {
		try {
			ProcesoCierreCajaConstantesFunciones.inicializarProcesoCierreCaja(this.procesocierrecaja);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocierrecajaLogic.getProcesoCierreCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCierreCajas(String sAccionBusqueda,List<ProcesoCierreCaja> procesocierrecajasParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCierreCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCierreCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCierreCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCierreCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Cierre Cajas");		
		parameters.put("busquedapor", ProcesoCierreCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCierreCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCierreCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCierreCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCierreCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCierreCajaBean.TraerProcesoCierreCajaBeans(procesocierrecajasParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCierreCajaActionPerformed(null);
					//this.generarExcelReporteProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCierreCajas(sAccionBusqueda,sTipoArchivoReporte,procesocierrecajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreCaja> procesocierrecajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCierreCaja procesocierrecaja : procesocierrecajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCierreCajaConstantesFunciones.generarExcelReporteDataProcesoCierreCaja("NORMAL",row,workbook,procesocierrecaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCierreCaja(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCierreCajaConstantesFunciones.generarExcelReporteHeaderProcesoCierreCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreCaja> procesocierrecajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCierreCaja procesocierrecaja : procesocierrecajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCierreCajaConstantesFunciones.getProcesoCierreCajaDescripcion(procesocierrecaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierrecaja.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierrecaja.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocierrecaja.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCierreCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCierreCaja> procesocierrecajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCierreCaja> procesocierrecajasRespaldo=null;
		
		classes=ProcesoCierreCajaConstantesFunciones.getClassesRelationshipsOfProcesoCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocierrecajaLogic.setDatosCliente(this.datosCliente);
		this.procesocierrecajaLogic.setDatosDeep(this.datosDeep);
		this.procesocierrecajaLogic.setIsConDeep(true);
		
		procesocierrecajasRespaldo=this.procesocierrecajaLogic.getProcesoCierreCajas();
		
		this.procesocierrecajaLogic.setProcesoCierreCajas(procesocierrecajasParaReportes);	
		this.procesocierrecajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocierrecajasParaReportes=this.procesocierrecajaLogic.getProcesoCierreCajas();
		this.procesocierrecajaLogic.setProcesoCierreCajas(procesocierrecajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCierreCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCierreCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCierreCaja procesocierrecaja : procesocierrecajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCierreCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCierreCajaConstantesFunciones.generarExcelReporteDataProcesoCierreCaja("NORMAL",row,workbook,procesocierrecaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCierreCajaConstantesFunciones.getProcesoCierreCajaDescripcion(procesocierrecaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCierreCaja() throws Exception {		
		this.startProcessProcesoCierreCaja(true);
	}
	
	public void startProcessProcesoCierreCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCierreCaja ,this.jPanelParametrosReportesProcesoCierreCaja, this.jScrollPanelDatosProcesoCierreCaja,this.jPanelPaginacionProcesoCierreCaja, this.jScrollPanelDatosEdicionProcesoCierreCaja, this.jPanelAccionesProcesoCierreCaja,this.jPanelAccionesFormularioProcesoCierreCaja,this.jmenuBarProcesoCierreCaja,this.jmenuBarDetalleProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreCaja=this.jTabbedPaneBusquedasProcesoCierreCaja; 
		
		final JPanel jPanelParametrosReportesProcesoCierreCaja=this.jPanelParametrosReportesProcesoCierreCaja;
		//final JScrollPane jScrollPanelDatosProcesoCierreCaja=this.jScrollPanelDatosProcesoCierreCaja;
		final JTable jTableDatosProcesoCierreCaja=this.jTableDatosProcesoCierreCaja;		
		final JPanel jPanelPaginacionProcesoCierreCaja=this.jPanelPaginacionProcesoCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreCaja=this.jScrollPanelDatosEdicionProcesoCierreCaja;
		final JPanel jPanelAccionesProcesoCierreCaja=this.jPanelAccionesProcesoCierreCaja;
		
		JPanel jPanelCamposAuxiliarProcesoCierreCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			jPanelCamposAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelCamposProcesoCierreCaja;
			jPanelAccionesFormularioAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelAccionesFormularioProcesoCierreCaja;
		}
		
		final JPanel jPanelCamposProcesoCierreCaja=jPanelCamposAuxiliarProcesoCierreCaja;
		final JPanel jPanelAccionesFormularioProcesoCierreCaja=jPanelAccionesFormularioAuxiliarProcesoCierreCaja;
		
		
		final JMenuBar jmenuBarProcesoCierreCaja=this.jmenuBarProcesoCierreCaja;
		final JToolBar jTtoolBarProcesoCierreCaja=this.jTtoolBarProcesoCierreCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jmenuBarDetalleProcesoCierreCaja;
			jTtoolBarDetalleAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jTtoolBarDetalleProcesoCierreCaja;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreCaja=jmenuBarDetalleAuxiliarProcesoCierreCaja;
		final JToolBar jTtoolBarDetalleProcesoCierreCaja=jTtoolBarDetalleAuxiliarProcesoCierreCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreCaja;
			processRunnable.jTableDatos=jTableDatosProcesoCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreCaja ,jPanelParametrosReportesProcesoCierreCaja,jTableDatosProcesoCierreCaja, /*jScrollPanelDatosProcesoCierreCaja,*/jPanelCamposProcesoCierreCaja,jPanelPaginacionProcesoCierreCaja, /*jScrollPanelDatosEdicionProcesoCierreCaja,*/ jPanelAccionesProcesoCierreCaja,jPanelAccionesFormularioProcesoCierreCaja,jmenuBarProcesoCierreCaja,jmenuBarDetalleProcesoCierreCaja,jTtoolBarProcesoCierreCaja,jTtoolBarDetalleProcesoCierreCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCierreCaja ,jPanelParametrosReportesProcesoCierreCaja, jScrollPanelDatosProcesoCierreCaja,jPanelPaginacionProcesoCierreCaja, jScrollPanelDatosEdicionProcesoCierreCaja, jPanelAccionesProcesoCierreCaja,jPanelAccionesFormularioProcesoCierreCaja,jmenuBarProcesoCierreCaja,jmenuBarDetalleProcesoCierreCaja,jTtoolBarProcesoCierreCaja,jTtoolBarDetalleProcesoCierreCaja);
						
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
	
	public void finishProcessProcesoCierreCaja() {// throws Exception 
		this.finishProcessProcesoCierreCaja(true);
	}
	
	public void finishProcessProcesoCierreCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCierreCaja ,this.jPanelParametrosReportesProcesoCierreCaja, this.jScrollPanelDatosProcesoCierreCaja,this.jPanelPaginacionProcesoCierreCaja, this.jScrollPanelDatosEdicionProcesoCierreCaja, this.jPanelAccionesProcesoCierreCaja,this.jPanelAccionesFormularioProcesoCierreCaja,this.jmenuBarProcesoCierreCaja,this.jmenuBarDetalleProcesoCierreCaja,this.jTtoolBarProcesoCierreCaja,this.jTtoolBarDetalleProcesoCierreCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCierreCaja=this.jTabbedPaneBusquedasProcesoCierreCaja; 
		
		final JPanel jPanelParametrosReportesProcesoCierreCaja=this.jPanelParametrosReportesProcesoCierreCaja;
		//final JScrollPane jScrollPanelDatosProcesoCierreCaja=this.jScrollPanelDatosProcesoCierreCaja;
		final JTable jTableDatosProcesoCierreCaja=this.jTableDatosProcesoCierreCaja;		
		final JPanel jPanelPaginacionProcesoCierreCaja=this.jPanelPaginacionProcesoCierreCaja;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCierreCaja=this.jScrollPanelDatosEdicionProcesoCierreCaja;
		final JPanel jPanelAccionesProcesoCierreCaja=this.jPanelAccionesProcesoCierreCaja;
		
		JPanel jPanelCamposAuxiliarProcesoCierreCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCierreCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			jPanelCamposAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelCamposProcesoCierreCaja;
			jPanelAccionesFormularioAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelAccionesFormularioProcesoCierreCaja;
		}
		
		final JPanel jPanelCamposProcesoCierreCaja=jPanelCamposAuxiliarProcesoCierreCaja;
		final JPanel jPanelAccionesFormularioProcesoCierreCaja=jPanelAccionesFormularioAuxiliarProcesoCierreCaja;
		
		
		final JMenuBar jmenuBarProcesoCierreCaja=this.jmenuBarProcesoCierreCaja;		
		final JToolBar jTtoolBarProcesoCierreCaja=this.jTtoolBarProcesoCierreCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCierreCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCierreCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			jmenuBarDetalleAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jmenuBarDetalleProcesoCierreCaja;
			jTtoolBarDetalleAuxiliarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jTtoolBarDetalleProcesoCierreCaja;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCierreCaja=jmenuBarDetalleAuxiliarProcesoCierreCaja;
		final JToolBar jTtoolBarDetalleProcesoCierreCaja=jTtoolBarDetalleAuxiliarProcesoCierreCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCierreCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCierreCaja;
			processRunnable.jTableDatos=jTableDatosProcesoCierreCaja;
			processRunnable.jPanelCampos=jPanelCamposProcesoCierreCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCierreCaja;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCierreCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCierreCaja;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCierreCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCierreCaja;
			processRunnable.jTtoolBar=jTtoolBarProcesoCierreCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCierreCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCierreCaja ,jPanelParametrosReportesProcesoCierreCaja, jTableDatosProcesoCierreCaja,/*jScrollPanelDatosProcesoCierreCaja,*/jPanelCamposProcesoCierreCaja,jPanelPaginacionProcesoCierreCaja, /*jScrollPanelDatosEdicionProcesoCierreCaja,*/ jPanelAccionesProcesoCierreCaja,jPanelAccionesFormularioProcesoCierreCaja,jmenuBarProcesoCierreCaja,jmenuBarDetalleProcesoCierreCaja,jTtoolBarProcesoCierreCaja,jTtoolBarDetalleProcesoCierreCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCierreCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCierreCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCierreCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCierreCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCierreCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCierreCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocierrecajaConstantesFunciones.getsFinalQueryProcesoCierreCaja();
		String  finalQueryPaginacionTodos=this.procesocierrecajaConstantesFunciones.getsFinalQueryProcesoCierreCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCierreCajaConstantesFunciones.getArrayColumnasGlobalesNoProcesoCierreCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCierreCajaConstantesFunciones.getArrayColumnasGlobalesProcesoCierreCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCierreCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocierrecajasEliminados= new ArrayList<ProcesoCierreCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCierreCaja();
		
				///*ProcesoCierreCajaSessionBean*/this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
			
			if(this.procesocierrecajaSessionBean==null) {
				this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
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
					this.iNumeroPaginacion=ProcesoCierreCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCierreCajaConstantesFunciones.getClassesForeignKeysOfProcesoCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocierrecaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocierrecajasAux= new ArrayList<ProcesoCierreCaja>();
			
				
			procesocierrecajaLogic.setDatosCliente(this.datosCliente);
			procesocierrecajaLogic.setDatosDeep(this.datosDeep);
			procesocierrecajaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCierreCaja")) {
				this.sDetalleReporte=ProcesoCierreCajaConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreCaja(id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocierrecajaLogic.getProcesoCierreCajasBusquedaProcesoCierreCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreCajaConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreCaja(id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreCajaConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreCaja(id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocierrecajaLogic.getProcesoCierreCajas()==null||procesocierrecajaLogic.getProcesoCierreCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocierrecajas==null|| procesocierrecajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierrecajasAux=new ArrayList<ProcesoCierreCaja>();
						procesocierrecajasAux.addAll(procesocierrecajaLogic.getProcesoCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierrecajasAux=new ArrayList<ProcesoCierreCaja>();
							procesocierrecajasAux.addAll(procesocierrecajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocierrecajaLogic.getProcesoCierreCajasBusquedaProcesoCierreCaja(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCierreCajaConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreCaja(id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCierreCajaConstantesFunciones.getDetalleIndiceBusquedaProcesoCierreCaja(id_usuarioBusquedaProcesoCierreCaja,id_cajaBusquedaProcesoCierreCaja,fechaBusquedaProcesoCierreCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCierreCajas("BusquedaProcesoCierreCaja",procesocierrecajaLogic.getProcesoCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCierreCajas("BusquedaProcesoCierreCaja",procesocierrecajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierrecajaLogic.setProcesoCierreCajas(new ArrayList<ProcesoCierreCaja>());
						procesocierrecajaLogic.getProcesoCierreCajas().addAll(procesocierrecajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierrecajas=new ArrayList<ProcesoCierreCaja>();
							procesocierrecajas.addAll(procesocierrecajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCierreCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCierreCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierrecajaLogic.getProcesoCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierrecajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocierrecajaLogic.getProcesoCierreCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocierrecajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCierreCaja procesocierrecaja) {
		Boolean permite=true;
		
		if(this.procesocierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCierreCajaConstantesFunciones.getOrderByListaProcesoCierreCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCierreCajaConstantesFunciones.getOrderByListaProcesoCierreCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreCaja procesocierrecaja:procesocierrecajaLogic.getProcesoCierreCajas()) {
				if(procesocierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierrecajaTotales=procesocierrecaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajas) {
				if(procesocierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierrecajaTotales=procesocierrecaja;
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
			this.procesocierrecajaAux=new ProcesoCierreCaja();
			this.procesocierrecajaAux.setsType(Constantes2.S_TOTALES);
			this.procesocierrecajaAux.setIsNew(false);
			this.procesocierrecajaAux.setIsChanged(false);
			this.procesocierrecajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCierreCajaConstantesFunciones.TotalizarValoresFilaProcesoCierreCaja(this.procesocierrecajaLogic.getProcesoCierreCajas(),this.procesocierrecajaAux);
				
				//this.procesocierrecajaLogic.getProcesoCierreCajas().add(this.procesocierrecajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCierreCajaConstantesFunciones.TotalizarValoresFilaProcesoCierreCaja(this.procesocierrecajas,this.procesocierrecajaAux);
				
				this.procesocierrecajas.add(this.procesocierrecajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocierrecajaTotales=new ProcesoCierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierrecajaLogic.getProcesoCierreCajas().remove(procesocierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocierrecajas.remove(procesocierrecajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocierrecajaTotales=new ProcesoCierreCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCierreCaja procesocierrecaja:procesocierrecajaLogic.getProcesoCierreCajas()) {
				if(procesocierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierrecajaTotales=procesocierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreCajaConstantesFunciones.TotalizarValoresFilaProcesoCierreCaja(this.procesocierrecajaLogic.getProcesoCierreCajas(),procesocierrecajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCierreCaja procesocierrecaja:this.procesocierrecajas) {
				if(procesocierrecaja.getsType().equals(Constantes2.S_TOTALES)) {
					procesocierrecajaTotales=procesocierrecaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCierreCajaConstantesFunciones.TotalizarValoresFilaProcesoCierreCaja(this.procesocierrecajas,procesocierrecajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCierreCajasBusquedaProcesoCierreCaja()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCierreCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreCajasFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCierreCajasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCierreCajasBusquedaProcesoCierreCaja(String sFinalQuery,Long id_usuario,Long id_caja,Date fecha)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierrecajaLogic.getProcesoCierreCajasBusquedaProcesoCierreCaja(sFinalQuery,this.pagination,id_usuario,id_caja,fecha);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreCajasFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierrecajaLogic.getProcesoCierreCajasFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCierreCajasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocierrecajaLogic.getProcesoCierreCajasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosProcesoCierreCaja() {
		this.isPermisoTodoProcesoCierreCaja=false;
		this.isPermisoNuevoProcesoCierreCaja=false;
		this.isPermisoActualizarProcesoCierreCaja=false;
		this.isPermisoActualizarOriginalProcesoCierreCaja=false;
		this.isPermisoEliminarProcesoCierreCaja=false;
		this.isPermisoGuardarCambiosProcesoCierreCaja=false;
		this.isPermisoConsultaProcesoCierreCaja=true;
		this.isPermisoBusquedaProcesoCierreCaja=true;
		this.isPermisoReporteProcesoCierreCaja=true;
		this.isPermisoOrdenProcesoCierreCaja=false;		
		this.isPermisoPaginacionMedioProcesoCierreCaja=false;		
		this.isPermisoPaginacionAltoProcesoCierreCaja=false;		
		this.isPermisoPaginacionTodoProcesoCierreCaja=false;		
		this.isPermisoCopiarProcesoCierreCaja=false;		
		this.isPermisoVerFormProcesoCierreCaja=false;		
		this.isPermisoDuplicarProcesoCierreCaja=false;
		this.isPermisoOrdenProcesoCierreCaja=false;
	}
	
	public void setPermisosUsuarioProcesoCierreCaja(Boolean isPermiso) {
		this.isPermisoTodoProcesoCierreCaja=isPermiso;
		this.isPermisoNuevoProcesoCierreCaja=isPermiso;
		this.isPermisoActualizarProcesoCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreCaja=isPermiso;
		this.isPermisoEliminarProcesoCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreCaja=isPermiso;
		this.isPermisoConsultaProcesoCierreCaja=isPermiso;
		this.isPermisoBusquedaProcesoCierreCaja=isPermiso;
		this.isPermisoReporteProcesoCierreCaja=isPermiso;
		this.isPermisoOrdenProcesoCierreCaja=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCierreCaja=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCierreCaja=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCierreCaja=isPermiso;		
		this.isPermisoCopiarProcesoCierreCaja=isPermiso;		
		this.isPermisoVerFormProcesoCierreCaja=isPermiso;		
		this.isPermisoDuplicarProcesoCierreCaja=isPermiso;
		this.isPermisoOrdenProcesoCierreCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCierreCaja(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCierreCaja=isPermiso;
		this.isPermisoNuevoProcesoCierreCaja=isPermiso;
		this.isPermisoActualizarProcesoCierreCaja=isPermiso;
		this.isPermisoActualizarOriginalProcesoCierreCaja=isPermiso;
		this.isPermisoEliminarProcesoCierreCaja=isPermiso;
		this.isPermisoGuardarCambiosProcesoCierreCaja=isPermiso;
		//this.isPermisoConsultaProcesoCierreCaja=isPermiso;
		//this.isPermisoBusquedaProcesoCierreCaja=isPermiso;
		//this.isPermisoReporteProcesoCierreCaja=isPermiso;
		//this.isPermisoOrdenProcesoCierreCaja=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCierreCaja=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCierreCaja=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCierreCaja=isPermiso;		
		//this.isPermisoCopiarProcesoCierreCaja=isPermiso;		
		//this.isPermisoDuplicarProcesoCierreCaja=isPermiso;
		//this.isPermisoOrdenProcesoCierreCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCierreCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCierreCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCierreCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCierreCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCierreCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCierreCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCierreCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCierreCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCierreCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCierreCaja=this.isPermisoActualizarProcesoCierreCaja;
			this.isPermisoEliminarProcesoCierreCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCierreCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCierreCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCierreCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCierreCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCierreCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCierreCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCierreCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCierreCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCierreCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCierreCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCierreCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCierreCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCierreCaja.setToolTipText(this.jTableDatosProcesoCierreCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCierreCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCierreCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCierreCaja() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCierreCajaListas()throws Exception {
		try	{						
			
				this.usuariosForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCierreCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCierreCajaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCierreCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {
			if(this.procesocierrecajaSessionBean==null) {
				this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean();
			}

			if(!this.procesocierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.procesocierrecajaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCierreCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(procesocierrecaja.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCierreCaja()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.procesocierrecajaConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCierreCaja()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCierreCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCierreCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCierreCaja()throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCierreCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCierreCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ProcesoCierreCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCierreCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCierreCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocierrecajaSessionBean=new ProcesoCierreCajaSessionBean(); 
		this.procesocierrecajaConstantesFunciones=new ProcesoCierreCajaConstantesFunciones(); 
		this.procesocierrecajaBean=new ProcesoCierreCaja();//(this.procesocierrecajaConstantesFunciones); 		
		this.procesocierrecajaReturnGeneral=new ProcesoCierreCajaParameterReturnGeneral(); 
		
		this.procesocierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCierreCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCierreCaja(true);
			
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
			
			this.procesocierrecajaConstantesFunciones=new ProcesoCierreCajaConstantesFunciones(); 
			this.procesocierrecajaBean=new ProcesoCierreCaja();//this.procesocierrecajaConstantesFunciones); 			
			this.procesocierrecajaReturnGeneral=new ProcesoCierreCajaParameterReturnGeneral(); 
		
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Cierre Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesocierrecaja=new ProcesoCierreCaja();
			this.procesocierrecajas = new ArrayList<ProcesoCierreCaja>();
			this.procesocierrecajasAux = new ArrayList<ProcesoCierreCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic=new ProcesoCierreCajaLogic();
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCierreCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreCaja);	
					}
					
					if(this.jInternalFrameImportacionProcesoCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCierreCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCierreCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreCaja);
				this.jInternalFrameDetalleFormProcesoCierreCaja.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCierreCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreCaja);
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreCaja);
					this.jInternalFrameImportacionProcesoCierreCaja.setVisible(false);
					this.jInternalFrameImportacionProcesoCierreCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCierreCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreCaja);
					this.jInternalFrameOrderByProcesoCierreCaja.setVisible(false);
					this.jInternalFrameOrderByProcesoCierreCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCierreCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCierreCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocierrecajaReturnGeneral=new ProcesoCierreCajaParameterReturnGeneral();
			
			this.procesocierrecajaParameterGeneral=new ProcesoCierreCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocierrecajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCierreCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierrecajaSessionBean.getEsGuardarRelacionado(),this.procesocierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCierreCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocierrecajaSessionBean.getEsGuardarRelacionado(),this.procesocierrecajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreCaja=true;
			this.isVisibilidadCeldaCopiarProcesoCierreCaja=true;
			this.isVisibilidadCeldaVerFormProcesoCierreCaja=true;
			this.isVisibilidadCeldaOrdenProcesoCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			
			
			this.isVisibilidadBusquedaProcesoCierreCaja=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCierreCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCierreCaja(false);
			
			this.setPermisosUsuarioProcesoCierreCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocierrecajaSessionBean.getEsGuardarRelacionado() && this.procesocierrecajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCierreCajaClasesRelacionadas();
			}
			
			if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCierreCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCierreCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreCaja();
			}
			
			if(!this.isPermisoBusquedaProcesoCierreCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCierreCajaConstantesFunciones.getTiposSeleccionarProcesoCierreCaja());
				
				this.tiposColumnasSelect=ProcesoCierreCajaConstantesFunciones.getTiposSeleccionarProcesoCierreCaja(true);
				
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
			//if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCierreCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoCierreCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoCierreCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreCaja() ;
			
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
			
			this.usuarioLogic=new UsuarioLogic();
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocierrecajaImplementable= (ProcesoCierreCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocierrecajaImplementableHome= (ProcesoCierreCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCierreCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocierrecajas= new ArrayList<ProcesoCierreCaja>();
			this.procesocierrecajasEliminados= new ArrayList<ProcesoCierreCaja>();
						
			this.isEsNuevoProcesoCierreCaja=false;
			this.esParaAccionDesdeFormularioProcesoCierreCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCierreCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCierreCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCierreCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCierreCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCierreCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCierreCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCierreCaja();
			}
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCierreCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCierreCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCierreCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCierreCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCierreCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCierreCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCierreCaja")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCierreCaja();	
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
	
	public void cargarCombosForeignKeyProcesoCierreCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCierreCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCierreCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCierreCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCierreCaja();
		
		this.cargarCombosFrameForeignKeyProcesoCierreCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCierreCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCierreCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			
			if(jTableDatosProcesoCierreCaja.getRowCount()>=1) {
				jTableDatosProcesoCierreCaja.removeRowSelectionInterval(0, jTableDatosProcesoCierreCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCierreCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCierreCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCierreCaja(true);			
			//this.procesocierrecaja=new ProcesoCierreCaja();
			//this.procesocierrecaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja() ;
			
			if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocierrecaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);				
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCierreCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCierreCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCierreCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreCaja.getSelectedRows().length;			
			}
			
			procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCierreCaja--;			
				//ProcesoCierreCaja procesocierrecajaAux= new ProcesoCierreCaja();			
				//procesocierrecajaAux.setId(this.iIdNuevoProcesoCierreCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCierreCaja procesocierrecajaOrigen=new ProcesoCierreCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCierreCaja procesocierrecajaOrigen : procesocierrecajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocierrecajaOrigen =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocierrecajaOrigen =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCierreCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocierrecaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCierreCaja(procesocierrecajaOrigen,this.procesocierrecaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierrecajaLogic.getProcesoCierreCajas().add(this.procesocierrecajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierrecajas.add(this.procesocierrecajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
				
				this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreCaja(), this.getIndiceNuevoProcesoCierreCaja());
				
				int iLastRow =  this.jTableDatosProcesoCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();									
		
			ProcesoCierreCaja procesocierrecajaOrigen=new ProcesoCierreCaja();
			ProcesoCierreCaja procesocierrecajaDestino=new ProcesoCierreCaja();
				
			procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCierreCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocierrecajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCierreCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierrecajaOrigen =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierrecajaOrigen =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocierrecajaDestino =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocierrecajaDestino =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocierrecajaOrigen =procesocierrecajasSeleccionados.get(0);
				procesocierrecajaDestino =procesocierrecajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCierreCaja(procesocierrecajaOrigen,procesocierrecajaDestino,true,false);
				
				procesocierrecajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocierrecajaDestino,procesocierrecajaLogic.getProcesoCierreCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocierrecajaDestino,procesocierrecajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
				
				//this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreCaja(), this.getIndiceNuevoProcesoCierreCaja());
				
				int iLastRow =  this.jTableDatosProcesoCierreCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCierreCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCierreCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCierreCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCierreCaja.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCierreCaja.setVisible(!isVisible);
			this.jPanelAccionesProcesoCierreCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCierreCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCierreCaja();
			
			this.abrirFrameOrderByProcesoCierreCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCierreCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCierreCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCierreCaja.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCierreCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCierreCaja.setSize(this.jInternalFrameDetalleFormProcesoCierreCaja.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCierreCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCierreCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCierreCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCierreCaja.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCierreCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreCaja.jContentPaneDetalleProcesoCierreCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreCaja.jContentPaneDetalleProcesoCierreCaja.getWidth(),ProcesoCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreCaja.jContentPaneDetalleProcesoCierreCaja.getWidth(),ProcesoCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCierreCaja.jContentPaneDetalleProcesoCierreCaja.getWidth(),ProcesoCierreCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCierreCaja.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCierreCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCierreCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreCaja,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCierreCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCierreCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCierreCaja);
				this.jInternalFrameOrderByProcesoCierreCaja.setVisible(false);
				this.jInternalFrameOrderByProcesoCierreCaja.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreCaja"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCierreCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCierreCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCierreCaja==null) {
				
				this.jInternalFrameImportacionProcesoCierreCaja=new ImportacionJInternalFrame(ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCierreCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCierreCaja);
				this.jInternalFrameImportacionProcesoCierreCaja.setVisible(false);
				this.jInternalFrameImportacionProcesoCierreCaja.setSelected(false);


				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreCaja"));
				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreCaja"));
				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCierreCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreCaja==null) {
				this.jInternalFrameReporteDinamicoProcesoCierreCaja=new ReporteDinamicoJInternalFrame(ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCierreCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCierreCaja);
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreCaja"));
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreCaja"));
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCierreCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCierreCaja);
			
	       	this.jInternalFrameDetalleFormProcesoCierreCaja.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCierreCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCierreCaja.dispose();
			//this.jInternalFrameDetalleFormProcesoCierreCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCierreCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCierreCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCierreCaja.setVisible(true);
	        this.jInternalFrameImportacionProcesoCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCierreCaja.setVisible(true);
	        this.jInternalFrameOrderByProcesoCierreCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCierreCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCierreCaja.setVisible(false);
	        this.jInternalFrameOrderByProcesoCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCierreCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCierreCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCierreCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCierreCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCierreCaja.setVisible(false);
	        this.jInternalFrameImportacionProcesoCierreCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCierreCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCierreCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCierreCaja(true);
			//this.isEsNuevoProcesoCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreCaja(false) ;
			
			if(procesocierrecajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCierreCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCierreCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCierreCaja(true);
			//this.isEsNuevoProcesoCierreCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocierrecaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCierreCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCierreCaja(false) ;
			
			if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCierreCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCierreCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreCaja(false);
			
			//if(!this.isEsNuevoProcesoCierreCaja) {								
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				
			}
			
			if(this.permiteMantenimiento(this.procesocierrecaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCierreCaja=true;
					this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
					this.isEsNuevoProcesoCierreCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCierreCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCierreCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreCaja(false);
			
												
				
				if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCierreCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCierreCajaActionPerformed(evt,procesocierrecajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCierreCaja(this.procesocierrecaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocierrecajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocierrecaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.procesocierrecaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				this.procesocierrecaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocierrecaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCierreCajaModel) this.jTableDatosProcesoCierreCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCierreCaja=true;
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
				this.isEsNuevoProcesoCierreCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCierreCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(false);
				
				this.habilitarDeshabilitarControlesProcesoCierreCaja(false);
				
				
				
				if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCierreCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCierreCaja.getRowCount()>=1) {
				jTableDatosProcesoCierreCaja.removeRowSelectionInterval(0, jTableDatosProcesoCierreCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCierreCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCierreCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(false) ;
			
			this.isEsNuevoProcesoCierreCaja=false;
			
			if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCierreCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCierreCaja(false);
				
				//SI ES MANUAL
				if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCierreCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCierreCaja--;			
			//ProcesoCierreCaja procesocierrecajaAux= new ProcesoCierreCaja();			
			//procesocierrecajaAux.setId(this.iIdNuevoProcesoCierreCaja);
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCierreCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
			
			this.procesocierrecaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocierrecajaLogic.getProcesoCierreCajas().add(this.procesocierrecajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocierrecajas.add(this.procesocierrecajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			
			this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(this.getIndiceNuevoProcesoCierreCaja(), this.getIndiceNuevoProcesoCierreCaja());
			
			int iLastRow =  this.jTableDatosProcesoCierreCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCierreCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCierreCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreCaja(false);
			
			//SI ES MANUAL
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreCaja();
			}
			
			//this.abrirFrameTreeProcesoCierreCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCierreCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCierreCaja.setFileImportacion(this.jInternalFrameImportacionProcesoCierreCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCierreCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCierreCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCierreCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCierreCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		

		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCierreCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCierreCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(ProcesoCierreCaja procesocierrecaja:procesocierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierrecaja.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(ProcesoCierreCaja procesocierrecaja:procesocierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierrecaja.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCierreCajaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoCierreCaja procesocierrecaja:procesocierrecajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocierrecaja.getfecha());
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
			//	this.getFilaCabeceraExportarExcelProcesoCierreCaja(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCierreCaja(procesocierrecajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoCierreCaja(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreCaja(false);
			
			//SI ES MANUAL
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCierreCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreCaja(false);
			
			//SI ES MANUAL
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCierreCaja(false);
			
			//SI ES MANUAL
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCierreCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCierreCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCierreCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCierreCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCierreCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCierreCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCierreCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCierreCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCierreCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCierreCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCierreCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCierreCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCierreCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCierreCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCierreCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCierreCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCierreCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCierreCaja();
		
		this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCierreCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCierreCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCierreCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionNuevoProcesoCierreCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionSinCerrarProcesoCierreCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionSinMensajeProcesoCierreCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCierreCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCierreCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCierreCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
				this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionNuevoProcesoCierreCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionSinCerrarProcesoCierreCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCierreCaja.jCheckBoxPostAccionSinMensajeProcesoCierreCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCierreCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCierreCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCierreCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCierreCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCierreCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCierreCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCierreCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCierreCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCierreCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCierreCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCierreCaja() throws Exception {
		try	{
			if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCierreCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCierreCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCierreCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCierreCaja.addItem(reporte);
			}
			
			
			if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCierreCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCierreCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCierreCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCierreCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCierreCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCierreCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCierreCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.getSelectedItem()!=null){this.id_usuarioBusquedaProcesoCierreCaja=((Usuario)this.jComboBoxid_usuarioBusquedaProcesoCierreCajaProcesoCierreCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.getSelectedItem()!=null){this.id_cajaBusquedaProcesoCierreCaja=((Caja)this.jComboBoxid_cajaBusquedaProcesoCierreCajaProcesoCierreCaja.getSelectedItem()).getId();}
		this.fechaBusquedaProcesoCierreCaja=new Date(this.jDateChooserfechaBusquedaProcesoCierreCajaProcesoCierreCaja.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCierreCaja(Boolean esInicializar) throws Exception {				
		if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCierreCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCierreCaja() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCierreCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCierreCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCierreCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocierrecajaLogic.getProcesoCierreCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocierrecajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCierreCaja.setModel(new ProcesoCierreCajaModel(this.procesocierrecajaLogic.getProcesoCierreCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCierreCaja.setModel(new ProcesoCierreCajaModel(this.procesocierrecajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCierreCaja!=null && this.jInternalFrameOrderByProcesoCierreCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCierreCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,procesocierrecajaConstantesFunciones.resaltarSeleccionarProcesoCierreCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCierreCajaConstantesFunciones.SCLASSWEBTITULO,procesocierrecajaConstantesFunciones.resaltarSeleccionarProcesoCierreCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,ProcesoCierreCajaConstantesFunciones.LABEL_ID));

		if(this.procesocierrecajaConstantesFunciones.mostraridProcesoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocierrecajaConstantesFunciones.resaltaridProcesoCierreCaja,this.procesocierrecajaConstantesFunciones.activaridProcesoCierreCaja,this,true,"idProcesoCierreCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocierrecajaConstantesFunciones.resaltaridProcesoCierreCaja,this.procesocierrecajaConstantesFunciones.activaridProcesoCierreCaja,this,true,"idProcesoCierreCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO));

		if(this.procesocierrecajaConstantesFunciones.mostrarid_usuarioProcesoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.procesocierrecajaConstantesFunciones.resaltarid_usuarioProcesoCierreCaja,this,this.procesocierrecajaConstantesFunciones.activarid_usuarioProcesoCierreCaja));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.procesocierrecajaConstantesFunciones.resaltarid_usuarioProcesoCierreCaja,this,this.procesocierrecajaConstantesFunciones.activarid_usuarioProcesoCierreCaja,false,"id_usuarioProcesoCierreCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA));

		if(this.procesocierrecajaConstantesFunciones.mostrarid_cajaProcesoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.procesocierrecajaConstantesFunciones.resaltarid_cajaProcesoCierreCaja,this,this.procesocierrecajaConstantesFunciones.activarid_cajaProcesoCierreCaja));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.procesocierrecajaConstantesFunciones.resaltarid_cajaProcesoCierreCaja,this,this.procesocierrecajaConstantesFunciones.activarid_cajaProcesoCierreCaja,true,"id_cajaProcesoCierreCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,ProcesoCierreCajaConstantesFunciones.LABEL_FECHA));

		if(this.procesocierrecajaConstantesFunciones.mostrarfechaProcesoCierreCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCierreCajaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesocierrecajaConstantesFunciones.resaltarfechaProcesoCierreCaja,this.procesocierrecajaConstantesFunciones.activarfechaProcesoCierreCaja,this,true,"fechaProcesoCierreCaja","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesocierrecajaConstantesFunciones.resaltarfechaProcesoCierreCaja,this.procesocierrecajaConstantesFunciones.activarfechaProcesoCierreCaja,this,true,"fechaProcesoCierreCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoCierreCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCierreCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocierrecajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCierreCaja.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCierreCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCierreCaja.moveColumn(this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCierreCaja.moveColumn(this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCierreCaja.moveColumn(this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCierreCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCierreCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCierreCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCierreCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCierreCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCierreCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCierreCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocierrecajaLogic.getProcesoCierreCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocierrecajas.size()-1;
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
		//this.jTableDatosProcesoCierreCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCierreCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCierreCaja();
			
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
				
				//this.isEsNuevoProcesoCierreCaja=false;
					
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
				if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocierrecaja.getsType().equals("DUPLICADO")
				   || this.procesocierrecaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCierreCaja=true;
				
				} else {
					this.isEsNuevoProcesoCierreCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocierrecaja.getId()>=0 && !this.procesocierrecaja.getIsNew()) {						
						this.isEsNuevoProcesoCierreCaja=false;
						
					} else {
						this.isEsNuevoProcesoCierreCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCierreCaja(esRelaciones);						
				
				this.seleccionarProcesoCierreCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocierrecaja.getId()<0) {
					this.isEsNuevoProcesoCierreCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCierreCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCierreCaja(evt,rowIndex);
				}	
				
				if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCierreCaja: " + this.dDif); 
					}
				}								
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCierreCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocierrecaja)) {
					if(this.procesocierrecaja.getId()>0) {
						this.procesocierrecaja.setIsDeleted(true);
						
						this.procesocierrecajasEliminados.add(this.procesocierrecaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocierrecajaLogic.getProcesoCierreCajas().remove(this.procesocierrecaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocierrecajas.remove(this.procesocierrecaja);				
					}
					
					
					((ProcesoCierreCajaModel) this.jTableDatosProcesoCierreCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCierreCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCierreCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCierreCaja) {
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCierreCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCierreCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Usuario
					if(!this.procesocierrecajaConstantesFunciones.cargarid_usuarioProcesoCierreCaja || this.procesocierrecajaConstantesFunciones.event_dependid_usuarioProcesoCierreCaja) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.procesocierrecaja.getid_usuario());
									//this.inicializarActualizarBindingProcesoCierreCaja(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(procesocierrecaja.getUsuario()!=null) {
							this.usuariosForeignKey.add(procesocierrecaja.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.procesocierrecaja.getid_usuario(),false,"Formulario");

					//Caja
					if(!this.procesocierrecajaConstantesFunciones.cargarid_cajaProcesoCierreCaja || this.procesocierrecajaConstantesFunciones.event_dependid_cajaProcesoCierreCaja) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.procesocierrecaja.getid_caja());
									//this.inicializarActualizarBindingProcesoCierreCaja(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(procesocierrecaja.getCaja()!=null) {
							this.cajasForeignKey.add(procesocierrecaja.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.procesocierrecaja.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCierreCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCierreCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCierreCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCierreCaja(procesocierrecaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCierreCaja(procesocierrecaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCierreCaja(procesocierrecaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreCaja(procesocierrecaja);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setText(procesocierrecaja.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setDate(procesocierrecaja.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCierreCaja procesocierrecajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocierrecajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCierreCaja procesocierrecajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocierrecajaLocal=this.procesocierrecaja;
			} else {
				procesocierrecajaLocal=this.procesocierrecajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocierrecajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCierreCaja(procesocierrecajaLocal,true);
					
					if(procesocierrecajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocierrecajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocierrecajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreCaja(procesocierrecaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(procesocierrecaja);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCierreCaja(procesocierrecaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.getText()==null || this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.getText()=="" || this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setText("0");
			}

			if(conColumnasBase) {procesocierrecaja.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelIdProcesoCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocierrecaja.setfecha(this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCierreCajaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCierreCaja.jLabelfechaProcesoCierreCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCierreCaja(ProcesoCierreCaja procesocierrecajaBean,ProcesoCierreCaja procesocierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesocierrecajaBean.getid_caja()!=null && !procesocierrecajaBean.getid_caja().equals(-1L))) {procesocierrecaja.setid_caja(procesocierrecajaBean.getid_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCierreCaja(ProcesoCierreCaja procesocierrecajaOrigen,ProcesoCierreCaja procesocierrecaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierrecajaOrigen.getId()!=null && !procesocierrecajaOrigen.getId().equals(0L))) {procesocierrecaja.setId(procesocierrecajaOrigen.getId());}}
			if(conDefault || (!conDefault && procesocierrecajaOrigen.getid_caja()!=null && !procesocierrecajaOrigen.getid_caja().equals(-1L))) {procesocierrecaja.setid_caja(procesocierrecajaOrigen.getid_caja());}
			if(conDefault || (!conDefault && procesocierrecajaOrigen.getfecha()!=null && !procesocierrecajaOrigen.getfecha().equals(new Date()))) {procesocierrecaja.setfecha(procesocierrecajaOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setText(procesocierrecaja.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setDate(procesocierrecaja.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCierreCaja(ProcesoCierreCajaBean procesocierrecajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setText(procesocierrecajaBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setDate(procesocierrecajaBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCierreCaja(ProcesoCierreCajaParameterReturnGeneral procesocierrecajaReturnGeneral,ProcesoCierreCajaBean procesocierrecajaBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCierreCaja procesocierrecajaLocal=new ProcesoCierreCaja();
			
			procesocierrecajaLocal=procesocierrecajaReturnGeneral.getProcesoCierreCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocierrecajaLocal.getId()!=null && !procesocierrecajaLocal.getId().equals(0L))) {procesocierrecajaBean.setId(procesocierrecajaLocal.getId());}}
			if(conDefault || (!conDefault && procesocierrecajaLocal.getid_caja()!=null && !procesocierrecajaLocal.getid_caja().equals(-1L))) {procesocierrecajaBean.setid_caja(procesocierrecajaLocal.getid_caja());}
			if(conDefault || (!conDefault && procesocierrecajaLocal.getfecha()!=null && !procesocierrecajaLocal.getfecha().equals(new Date()))) {procesocierrecajaBean.setfecha(procesocierrecajaLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCierreCajaGenerico(Long idProcesoCierreCajaSeleccionado,JComboBox jComboBoxProcesoCierreCaja,List<ProcesoCierreCaja> procesocierrecajasLocal)throws Exception {
		try {
			ProcesoCierreCaja  procesocierrecajaTemp=null;

			for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasLocal) {
				if(procesocierrecajaAux.getId()!=null && procesocierrecajaAux.getId().equals(idProcesoCierreCajaSeleccionado)) {
					procesocierrecajaTemp=procesocierrecajaAux;
					break;
				}
			}

			jComboBoxProcesoCierreCaja.setSelectedItem(procesocierrecajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCierreCajaGenerico(JComboBox jComboBoxProcesoCierreCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCierreCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCierreCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierrecaja=(ProcesoCierreCaja) procesocierrecajaLogic.getProcesoCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierrecaja =(ProcesoCierreCaja) procesocierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!procesocierrecaja.getIsNew() && !procesocierrecaja.getIsChanged() && !procesocierrecaja.getIsDeleted()) {
				sDescripcion=procesocierrecaja.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierrecaja.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!procesocierrecaja.getIsNew() && !procesocierrecaja.getIsChanged() && !procesocierrecaja.getIsDeleted()) {
				sDescripcion=procesocierrecaja.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocierrecaja.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCierreCaja procesocierrecajaRow=new ProcesoCierreCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierrecajaRow=(ProcesoCierreCaja) procesocierrecajaLogic.getProcesoCierreCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocierrecajaRow=(ProcesoCierreCaja) procesocierrecajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCierreCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));			
			this.jButtonDuplicarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreCaja && this.isPermisoDuplicarProcesoCierreCaja));			
			this.jButtonCopiarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreCaja && this.isPermisoCopiarProcesoCierreCaja));
			this.jButtonVerFormProcesoCierreCaja.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreCaja && this.isPermisoVerFormProcesoCierreCaja));
			
			this.jButtonAbrirOrderByProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));			
			
			this.jButtonNuevoRelacionesProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));			
			this.jButtonNuevoGuardarCambiosProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaModificarProcesoCierreCaja && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreCaja && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreCaja && this.isPermisoEliminarProcesoCierreCaja));
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreCaja);							
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));						
			this.jButtonDuplicarToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreCaja && this.isPermisoDuplicarProcesoCierreCaja));						
			this.jButtonCopiarToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreCaja && this.isPermisoCopiarProcesoCierreCaja));			
			this.jButtonVerFormToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreCaja && this.isPermisoVerFormProcesoCierreCaja));			
			this.jButtonAbrirOrderByToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));
			this.jButtonNuevoRelacionesToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));			
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaModificarProcesoCierreCaja && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreCaja  && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreCaja && this.isPermisoEliminarProcesoCierreCaja));
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarToolBarProcesoCierreCaja.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreCaja);				
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));			
			this.jMenuItemDuplicarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaDuplicarProcesoCierreCaja && this.isPermisoDuplicarProcesoCierreCaja));			
			this.jMenuItemCopiarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaCopiarProcesoCierreCaja && this.isPermisoCopiarProcesoCierreCaja));			
			this.jMenuItemVerFormProcesoCierreCaja.setVisible((this.isVisibilidadCeldaVerFormProcesoCierreCaja && this.isPermisoVerFormProcesoCierreCaja));			
			this.jMenuItemAbrirOrderByProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));			
			//this.jMenuItemMostrarOcultarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));
			this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaOrdenProcesoCierreCaja && this.isPermisoOrdenProcesoCierreCaja));			
			this.jMenuItemNuevoRelacionesProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja));			
			this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja.setVisible((this.isVisibilidadCeldaNuevoProcesoCierreCaja && this.isPermisoNuevoProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));									
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemModificarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaModificarProcesoCierreCaja && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemActualizarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaActualizarProcesoCierreCaja && this.isPermisoActualizarProcesoCierreCaja));	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemEliminarProcesoCierreCaja.setVisible((this.isVisibilidadCeldaEliminarProcesoCierreCaja && this.isPermisoEliminarProcesoCierreCaja));
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemCancelarProcesoCierreCaja.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreCaja);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));						
			this.jMenuItemGuardarCambiosTablaProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=this.jButtonNuevoProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCierreCaja=this.jButtonDuplicarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCierreCaja=this.jButtonCopiarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCierreCaja=this.jButtonVerFormProcesoCierreCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCierreCaja=this.jButtonAbrirOrderByProcesoCierreCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=this.jButtonNuevoRelacionesProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaModificarProcesoCierreCaja=this.jButtonModificarProcesoCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=this.jButtonGuardarCambiosTablaProcesoCierreCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=this.jButtonNuevoToolBarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=this.jButtonNuevoRelacionesToolBarProcesoCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarToolBarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarToolBarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarToolBarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarToolBarProcesoCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreCaja=this.jButtonGuardarCambiosToolBarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=this.jMenuItemNuevoProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=this.jMenuItemNuevoRelacionesProcesoCierreCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.isVisibilidadCeldaModificarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemModificarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemActualizarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemEliminarProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemCancelarProcesoCierreCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCierreCaja=this.jMenuItemGuardarCambiosProcesoCierreCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=this.jMenuItemGuardarCambiosTablaProcesoCierreCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCierreCaja(Boolean esInicializar) {
		if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCierreCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCierreCaja() {
		this.jButtonNuevoProcesoCierreCaja.setVisible(this.isPermisoNuevoProcesoCierreCaja);			
		this.jButtonDuplicarProcesoCierreCaja.setVisible(this.isPermisoDuplicarProcesoCierreCaja);			
		this.jButtonCopiarProcesoCierreCaja.setVisible(this.isPermisoCopiarProcesoCierreCaja);			
		this.jButtonVerFormProcesoCierreCaja.setVisible(this.isPermisoVerFormProcesoCierreCaja);			
		
		this.jButtonAbrirOrderByProcesoCierreCaja.setVisible(this.isPermisoOrdenProcesoCierreCaja);					
		
		this.jButtonNuevoRelacionesProcesoCierreCaja.setVisible(this.isPermisoNuevoProcesoCierreCaja);			
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarProcesoCierreCaja.setVisible(this.isPermisoActualizarProcesoCierreCaja);	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.setVisible(this.isPermisoActualizarProcesoCierreCaja);	
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.setVisible(this.isPermisoEliminarProcesoCierreCaja);
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreCaja);						
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.setVisible(this.isPermisoGuardarCambiosProcesoCierreCaja);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.setVisible(this.isPermisoActualizarProcesoCierreCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreCaja() {
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarProcesoCierreCaja.setVisible(this.isPermisoActualizarProcesoCierreCaja);	
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.setVisible(this.isPermisoActualizarProcesoCierreCaja);	
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.setVisible(this.isPermisoEliminarProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.setVisible(this.isVisibilidadCeldaCancelarProcesoCierreCaja);							
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.setVisible((this.isVisibilidadCeldaGuardarProcesoCierreCaja && this.isPermisoGuardarCambiosProcesoCierreCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCierreCaja() {
		if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCierreCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCierreCaja() {
	}
	
	public void jTableDatosProcesoCierreCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCierreCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierrecaja==null) {
						this.procesocierrecaja = new ProcesoCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				}

				if(this.procesocierrecaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocierrecaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioProcesoCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebProcesoCierreCaja(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.procesocierrecajaLogic.getConnexion());

				if(this.procesocierrecaja.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.procesocierrecaja.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreCaja=(TitledBorder)this.jScrollPanelDatosProcesoCierreCaja.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderProcesoCierreCaja.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioProcesoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierrecaja==null) {
						this.procesocierrecaja = new ProcesoCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				}

				if(this.procesocierrecaja.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.procesocierrecaja.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaProcesoCierreCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebProcesoCierreCaja(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCierreCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCierreCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.procesocierrecajaLogic.getConnexion());

				if(this.procesocierrecaja.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.procesocierrecaja.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCierreCaja=(TitledBorder)this.jScrollPanelDatosProcesoCierreCaja.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderProcesoCierreCaja.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaProcesoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierrecaja==null) {
						this.procesocierrecaja = new ProcesoCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				}

				if(this.procesocierrecaja.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.procesocierrecaja.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoCierreCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.getprocesocierrecaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocierrecaja==null) {
						this.procesocierrecaja = new ProcesoCierreCaja();
					}

					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);
				}

				if(this.procesocierrecaja.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesocierrecaja.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCierreCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCierreCajaProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);

			this.getProcesoCierreCajasBusquedaProcesoCierreCaja();

			this.inicializarActualizarBindingProcesoCierreCaja(false);

			//if(ProcesoCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);

			this.getProcesoCierreCajasFK_IdCaja();

			this.inicializarActualizarBindingProcesoCierreCaja(false);

			//if(ProcesoCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioProcesoCierreCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);

			this.getProcesoCierreCajasFK_IdUsuario();

			this.inicializarActualizarBindingProcesoCierreCaja(false);

			//if(ProcesoCierreCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocierrecajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCierreCaja() {
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCierreCaja.dispose();
			this.jInternalFrameDetalleFormProcesoCierreCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
			this.jInternalFrameReporteDinamicoProcesoCierreCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCierreCaja.dispose();
			this.jInternalFrameReporteDinamicoProcesoCierreCaja=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCierreCaja!=null) {
			this.jInternalFrameImportacionProcesoCierreCaja.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCierreCaja.dispose();
			this.jInternalFrameImportacionProcesoCierreCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCierreCaja();
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCierreCaja")) {
				jButtonDuplicarProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCierreCaja")) {
				jButtonCopiarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCierreCaja")) {
				jButtonVerFormProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCierreCaja")) {
				jButtonDuplicarProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCierreCaja")) {
				jButtonDuplicarProcesoCierreCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCierreCaja")) {
				jButtonModificarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCierreCaja")) {
				jButtonModificarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCierreCaja")) {
				jButtonModificarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCierreCaja")) {
				jButtonActualizarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCierreCaja")) {
				jButtonActualizarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCierreCaja")) {
				jButtonActualizarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCierreCaja")) {
				jButtonEliminarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCierreCaja")) {
				jButtonEliminarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCierreCaja")) {
				jButtonEliminarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCierreCaja")) {
				jButtonCancelarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCierreCaja")) {
				jButtonCancelarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCierreCaja")) {
				jButtonCancelarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCierreCaja")) {
				jButtonCerrarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCierreCaja")) {
				jButtonCerrarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCierreCaja")) {
				jButtonCerrarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCierreCaja")) {
				jButtonMostrarOcultarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCierreCaja")) {
				jButtonCancelarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCierreCaja")) {
				jButtonCopiarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCierreCaja")) {
				jButtonVerFormProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCierreCaja")) {
				jButtonCopiarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCierreCaja")) {
				jButtonVerFormProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCierreCaja")) {
				jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCierreCaja")) {
				jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCierreCaja")) {
				jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCierreCaja")) {
				jButtonAnterioresProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCierreCaja")) {
				jButtonAnterioresProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCierreCaja")) {
				jButtonAnterioresProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCierreCaja")) {
				jButtonSiguientesProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCierreCaja")) {
				jButtonSiguientesProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCierreCaja")) {
				jButtonSiguientesProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCierreCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCierreCaja")) {
				jButtonAbrirOrderByProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCierreCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCierreCaja")) {
				jButtonMostrarOcultarProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreCaja")) {
				jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCierreCaja")) {
				jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCierreCaja")) {
				jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoCierreCaja")) {
				jButtonProcesarInformacionProcesoCierreCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCierreCaja")) {
				jButtonCerrarReporteDinamicoProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCierreCaja")) {
				jButtonGenerarReporteDinamicoProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCierreCaja")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCierreCaja")) {
				jButtonCerrarImportacionProcesoCierreCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCierreCaja")) {
				
				jButtonGenerarImportacionProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCierreCaja")) {
				
				jButtonAbrirImportacionProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCierreCaja")) {
				jComboBoxTiposAccionesProcesoCierreCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCierreCaja")) {
				jComboBoxTiposRelacionesProcesoCierreCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCierreCaja")) {
				jComboBoxTiposAccionesProcesoCierreCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCierreCaja")) {
				
				jComboBoxTiposSeleccionarProcesoCierreCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCierreCaja")) {
				jTextFieldValorCampoGeneralProcesoCierreCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCierreCaja")) {
				jButtonAbrirOrderByProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCierreCaja")) {
				jButtonAbrirOrderByProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCierreCaja")) {
				jButtonCerrarOrderByProcesoCierreCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreCajaBusqueda")) {
				this.jButtonidProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioProcesoCierreCajaUpdate")) {
				this.jButtonid_usuarioProcesoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioProcesoCierreCajaBusqueda")) {
				this.jButtonid_usuarioProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaProcesoCierreCajaUpdate")) {
				this.jButtonid_cajaProcesoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaProcesoCierreCajaBusqueda")) {
				this.jButtonid_cajaProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoCierreCajaBusqueda")) {
				this.jButtonfechaProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCierreCajaProcesoCierreCaja")) {
				this.jButtonBusquedaProcesoCierreCajaProcesoCierreCajaActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCierreCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCierreCaja procesocierrecajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocierrecajaLocal=this.procesocierrecaja;
			} else {
				procesocierrecajaLocal=this.procesocierrecajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
							
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
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
			
			


			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
								
						
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
								
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
							
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
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
			
			


			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
								
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCierreCaja")) {
					jCheckBoxSeleccionarTodosProcesoCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCierreCaja")) {
					jCheckBoxSeleccionadosProcesoCierreCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCierreCaja")) {
					
				}
				
				


				
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
												
				
				


				
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
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
			
			


			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCierreCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocierrecaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocierrecaja);
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
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
				
				


				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCierreCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCierreCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCierreCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocierrecajaAnterior =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCierreCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCierreCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocierrecaja =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocierrecaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCierreCaja")) {
				
				}
				
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCierreCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCierreCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCierreCaja")) {
			
			}
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCierreCaja();
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCierreCaja")) {
				jButtonDuplicarProcesoCierreCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCierreCaja")) {
				jButtonCopiarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCierreCaja")) {
				jButtonVerFormProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCierreCaja")) {
				jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCierreCaja")) {
				jButtonModificarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCierreCaja")) {
				jButtonActualizarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCierreCaja")) {
				jButtonEliminarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCierreCaja")) {
				jButtonCancelarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCierreCaja")) {
				jButtonCerrarProcesoCierreCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCierreCaja")) {
				jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCierreCaja")) {
				jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCierreCaja")) {
				jButtonAbrirOrderByProcesoCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCierreCaja")) {
				jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCierreCaja")) {
				jButtonAnterioresProcesoCierreCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCierreCaja")) {
				jButtonSiguientesProcesoCierreCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCierreCajaBusqueda")) {
				this.jButtonidProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioProcesoCierreCajaUpdate")) {
				this.jButtonid_usuarioProcesoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioProcesoCierreCajaBusqueda")) {
				this.jButtonid_usuarioProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaProcesoCierreCajaUpdate")) {
				this.jButtonid_cajaProcesoCierreCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaProcesoCierreCajaBusqueda")) {
				this.jButtonid_cajaProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoCierreCajaBusqueda")) {
				this.jButtonfechaProcesoCierreCajaBusquedaActionPerformed(evt);
			}
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCierreCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCierreCaja")) {
				closingInternalFrameProcesoCierreCaja();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCierreCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCierreCaja = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCierreCajaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCierreCajaActionPerformed(null);
			}
			
			ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocierrecaja,new Object(),this.procesocierrecajaParameterGeneral,this.procesocierrecajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCierreCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocierrecaja)) {
			if(!esControlTabla) {
				if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);			
				}
				
				if(this.procesocierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCierreCaja(this.procesocierrecaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCierreCaja(this.procesocierrecajaReturnGeneral,this.procesocierrecajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreCaja(classes,this.procesocierrecajaReturnGeneral,this.procesocierrecajaBean,false);
					}
						
					if(this.procesocierrecajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja());	
					}
						
					if(this.procesocierrecajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja(),classes);//this.procesocierrecajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCierreCaja(this.procesocierrecaja,classes);//this.procesocierrecajaBean);									
				}
			
				if(ProcesoCierreCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCierreCaja(this.procesocierrecaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCierreCaja(this.procesocierrecaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocierrecajaAnterior!=null) {
						this.procesocierrecaja=this.procesocierrecajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocierrecajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocierrecajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja(),procesocierrecajaLogic.getProcesoCierreCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocierrecajaReturnGeneral.getProcesoCierreCaja(),this.procesocierrecajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCierreCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCierreCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCierreCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCierreCaja() throws Exception {
		
		ProcesoCierreCajaModel procesocierrecajaModel=(ProcesoCierreCajaModel)this.jTableDatosProcesoCierreCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocierrecajaModel.procesocierrecajas=this.procesocierrecajaLogic.getProcesoCierreCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocierrecajaModel.procesocierrecajas=this.procesocierrecajas;
		}
		
		
		((ProcesoCierreCajaModel) this.jTableDatosProcesoCierreCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCierreCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocierrecajaAnterior(),this.procesocierrecajaLogic.getProcesoCierreCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocierrecajaAnterior(),this.procesocierrecajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCierreCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
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
										
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierrecaja,new Object(),generalEntityParameterGeneral,this.procesocierrecajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocierrecajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCierreCajaConstantesFunciones.getClassesRelationshipsOfProcesoCierreCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCierreCajaConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCierreCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCierreCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCierreCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocierrecaja,new Object(),generalEntityParameterGeneral,this.procesocierrecajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCierreCaja(ProcesoCierreCajaBean procesocierrecajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCierreCaja(ArrayList<Classe> classes,ProcesoCierreCajaReturnGeneral procesocierrecajaReturnGeneral,ProcesoCierreCajaBean procesocierrecajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocierrecaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCierreCaja = new ProcesoCierreCajaDetalleFormJInternalFrame(jDesktopPane,this.procesocierrecajaSessionBean.getConGuardarRelaciones(),this.procesocierrecajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCierreCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.procesocierrecajaLogic=this.procesocierrecajaLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCierreCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCierreCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCierreCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCierreCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCierreCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreCaja"));
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreCaja"));

		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreCaja"));
					
		this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemModificarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreCaja"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreCaja"));
						
		this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemActualizarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreCaja"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreCaja"));
								
		this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemEliminarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreCaja"));
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreCaja"));
					
		this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemCancelarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemDetalleCerrarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreCaja"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreCaja"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonidProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonfechaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCierreCaja"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCierreCaja"));
		}
		
		this.jTableDatosProcesoCierreCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCierreCaja"));
		
		this.jTableDatosProcesoCierreCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCierreCaja"));
		
		this.jButtonNuevoProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoProcesoCierreCaja"));
		
		this.jButtonDuplicarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCierreCaja"));
		
		this.jButtonCopiarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"CopiarProcesoCierreCaja"));
		
		this.jButtonVerFormProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"VerFormProcesoCierreCaja"));
		
		
		this.jButtonNuevoToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCierreCaja"));
			
		this.jButtonDuplicarToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCierreCaja"));
			
		this.jMenuItemNuevoProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCierreCaja"));
			
		this.jMenuItemDuplicarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCierreCaja"));		
		
		
		this.jButtonNuevoRelacionesProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCierreCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCierreCaja"));
			
		this.jMenuItemNuevoRelacionesProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarProcesoCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonModificarToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCierreCaja"));
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemModificarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonActualizarToolBarProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCierreCaja"));
				
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemActualizarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarProcesoCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonEliminarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCierreCaja"));
						
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemEliminarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarProcesoCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonCancelarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCierreCaja"));
			
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemCancelarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCierreCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCierreCaja"));		
		
		
		this.jButtonCerrarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarProcesoCierreCaja"));
		
		
		this.jButtonCerrarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCierreCaja"));
			
		this.jMenuItemCerrarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCierreCaja"));
			
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jMenuItemDetalleCerrarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCierreCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCierreCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCierreCaja"));
		}
		
		this.jButtonCopiarToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCierreCaja"));
			
		this.jButtonVerFormToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCierreCaja"));
		
		this.jMenuItemGuardarCambiosProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCierreCaja"));
			
		this.jMenuItemCopiarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCierreCaja"));		
		
		this.jMenuItemVerFormProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCierreCaja"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCierreCaja"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCierreCaja"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCierreCaja"));
					
		this.jButtonRecargarInformacionToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCierreCaja"));
		
		this.jMenuItemRecargarInformacionProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCierreCaja"));		
		
		
		
		this.jButtonAnterioresProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCierreCaja"));
		
		
		this.jButtonAnterioresToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCierreCaja"));
		
		this.jMenuItemAnterioresProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCierreCaja"));		
		
		
		this.jButtonSiguientesProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCierreCaja"));
		
		
		this.jButtonSiguientesToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCierreCaja"));
			
		this.jMenuItemSiguientesProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCierreCaja"));
			
		this.jMenuItemAbrirOrderByProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCierreCaja"));
			
		this.jMenuItemMostrarOcultarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCierreCaja"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCierreCaja"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCierreCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCierreCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCierreCaja"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCierreCaja"));		
		
		
		this.jButtonProcesarInformacionProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoCierreCaja"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCierreCaja"));

		this.jCheckBoxSeleccionadosProcesoCierreCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCierreCaja"));
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCierreCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCierreCaja"));
			
		this.jComboBoxTiposAccionesProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCierreCaja"));
					
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCierreCaja"));
			
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCierreCaja"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonidProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonfechaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreCajaProcesoCierreCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCierreCaja!=null) {
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreCaja"));
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreCaja"));
				this.jInternalFrameReporteDinamicoProcesoCierreCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCierreCaja"));				
			//this.jButtonGenerarReporteDinamicoProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCierreCaja"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCierreCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCierreCaja!=null) {
				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCierreCaja"));
				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCierreCaja"));
				this.jInternalFrameImportacionProcesoCierreCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCierreCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCierreCaja"));
			
			this.jButtonAbrirOrderByToolBarProcesoCierreCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCierreCaja"));			
			
			if(this.jInternalFrameOrderByProcesoCierreCaja!=null) {
				this.jInternalFrameOrderByProcesoCierreCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCierreCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCierreCaja.jTabbedPaneRelacionesProcesoCierreCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCierreCaja"));
		
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
            		closingInternalFrameProcesoCierreCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCierreCaja = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCierreCajaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCierreCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCierreCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCierreCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCierreCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCierreCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCierreCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCierreCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCierreCaja";
		inputMap = this.jButtonNuevoProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCierreCaja";
		inputMap = this.jButtonNuevoRelacionesProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCierreCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCierreCaja";
		inputMap = this.jButtonModificarProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCierreCaja";
		inputMap = this.jButtonActualizarProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCierreCaja";
		inputMap = this.jButtonEliminarProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCierreCaja";
		inputMap = this.jButtonCancelarProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCierreCaja";
		inputMap = this.jButtonCerrarProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCierreCaja";
		inputMap = this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonGuardarCambiosProcesoCierreCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCierreCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCierreCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCierreCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCierreCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCierreCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonidProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_usuarioProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioProcesoCierreCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonid_cajaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaProcesoCierreCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCierreCaja.jButtonfechaProcesoCierreCajaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoCierreCajaBusqueda"));
		
		
		this.jButtonBusquedaProcesoCierreCajaProcesoCierreCaja.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCierreCajaProcesoCierreCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCierreCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCierreCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCierreCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCierreCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
					procesocierrecajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajas) {
					procesocierrecajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
						procesocierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajas) {
						procesocierrecajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCierreCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCierreCaja.getSelectedRows();
			
			ProcesoCierreCaja procesocierrecajaLocal=new ProcesoCierreCaja();
			
			//this.seleccionarTodosProcesoCierreCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocierrecajaLocal =(ProcesoCierreCaja) this.procesocierrecajaLogic.getProcesoCierreCajas().toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocierrecajaLocal =(ProcesoCierreCaja) this.procesocierrecajas.toArray()[this.jTableDatosProcesoCierreCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocierrecajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
						procesocierrecajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajas) {
						procesocierrecajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCierreCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCierreCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCierreCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCierreCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCierreCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCierreCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCierreCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajaLogic.getProcesoCierreCajas()) {
				
						if(sTipoSeleccionar.equals(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesocierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajas) {
					
						if(sTipoSeleccionar.equals(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesocierrecajaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCierreCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCierreCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCierreCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCierreCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCierreCaja(conSplash);
				
					this.generarReporteProcesoCierreCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCierreCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreCaja();
				
				this.exportarProcesoCierreCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCierreCajas();
				//this.importarProcesoCierreCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCierreCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCierreCajasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCierreCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCierreCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCierreCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCierreCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCierreCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCierreCaja(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCierreCaja();
						
						this.generarReporteProcesoAccionProcesoCierreCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCierreCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Cierre CajaS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Cierre Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCierreCaja();
				
						this.actualizarParametrosGeneralProcesoCierreCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocierrecajaReturnGeneral=procesocierrecajaLogic.procesarAccionProcesoCierreCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocierrecajaLogic.getProcesoCierreCajas(),this.procesocierrecajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCierreCaja();
					
					ProcesoCierreCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCierreCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCierreCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxTiposAccionesFormularioProcesoCierreCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCierreCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCierreCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCierreCaja();
			
			if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
			ProcesoCierreCaja procesocierrecaja=new ProcesoCierreCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCierreCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCierreCaja.getSelectedItem();
			
			
			
			
			procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocierrecajasSeleccionados.size()==1) {
				for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
					procesocierrecaja=procesocierrecajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCierreCaja();
			
      		//this.finishProcessProcesoCierreCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCierreCajaReturnGeneral() throws Exception {
		if(this.procesocierrecajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocierrecajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocierrecajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocierrecajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocierrecajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCierreCaja(false);
		}
		
		if(this.procesocierrecajaReturnGeneral.getConRetornoLista() || this.procesocierrecajaReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocierrecajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesocierrecajaLogic.setProcesoCierreCajas(this.procesocierrecajaReturnGeneral.getProcesoCierreCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCierreCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCierreCaja() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCierreCaja> getProcesoCierreCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCierreCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajaLogic.getProcesoCierreCajas()) {
					if(procesocierrecajaAux.getIsSelected()) {
						procesocierrecajasSeleccionados.add(procesocierrecajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCierreCaja procesocierrecajaAux:this.procesocierrecajas) {
					if(procesocierrecajaAux.getIsSelected()) {
						procesocierrecajasSeleccionados.add(procesocierrecajaAux);				
					}
				}
			}
			
			if(procesocierrecajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocierrecajasSeleccionados.addAll(this.procesocierrecajaLogic.getProcesoCierreCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocierrecajasSeleccionados.addAll(this.procesocierrecajas);				
					}
				}
			}
		} else {
			procesocierrecajasSeleccionados.add(this.procesocierrecaja);
		}
		
		return procesocierrecajasSeleccionados;
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
	
	public void generarReporteProcesoCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCierreCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCierreCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCierreCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCierreCaja();
		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCierreCaja();
		
		
		//this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados ,procesocierrecajaImplementable,procesocierrecajaImplementableHome);
	}
	
	public void mostrarImportacionProcesoCierreCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCierreCaja();
		
		this.abrirFrameImportacionProcesoCierreCaja();		
		
			
		//this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados ,procesocierrecajaImplementable,procesocierrecajaImplementableHome);
	}
	
	public void importarProcesoCierreCajas() throws Exception {		
	
	}
	
	public void exportarProcesoCierreCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCierreCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCierreCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCierreCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Cierre Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCierreCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCierreCaja(procesocierrecajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocierrecajaAux.setsDetalleGeneralEntityReporte(procesocierrecajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCierreCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCierreCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCierreCajaConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocierrecaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierrecaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierrecaja.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierrecaja.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocierrecaja.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCierreCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCierreCaja(row);				
				iRow++;
			}				
			
			for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCierreCaja(procesocierrecajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCierreCajasSeleccionados() throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();		
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocierrecaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocierrecajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocierrecaja");
			//elementRoot.appendChild(element);
		
			for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
				element = document.createElement("procesocierrecaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCierreCaja(procesocierrecajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Cierre Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCierreCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierrecaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierrecaja.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierrecaja.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocierrecaja.getfecha());				
	}
	
	public void setFilaDatosExportarXmlProcesoCierreCaja(ProcesoCierreCaja procesocierrecaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCierreCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocierrecaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCierreCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocierrecaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementusuario_descripcion = document.createElement(ProcesoCierreCajaConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(procesocierrecaja.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcaja_descripcion = document.createElement(ProcesoCierreCajaConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(procesocierrecaja.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha = document.createElement(ProcesoCierreCajaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesocierrecaja.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoProcesoCierreCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados=new ArrayList<ProcesoCierreCaja>();
		
		procesocierrecajasSeleccionados=this.getProcesoCierreCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCierreCaja(procesocierrecajasSeleccionados);
		
		this.generarReporteProcesoCierreCajas("Todos",procesocierrecajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCierreCaja(ArrayList<ProcesoCierreCaja> procesocierrecajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCierreCaja procesocierrecajaAux:procesocierrecajasSeleccionados) {
				procesocierrecajaAux.setsDetalleGeneralEntityReporte(procesocierrecajaAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCierreCajaConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					procesocierrecajaAux.setsDescripcionGeneralEntityReporte1(procesocierrecajaAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreCajaConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					procesocierrecajaAux.setsDescripcionGeneralEntityReporte1(procesocierrecajaAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCierreCajaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesocierrecajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesocierrecajaAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCierreCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCierreCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCierreCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=true;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=true;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=true;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=true;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=true;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
			this.isVisibilidadCeldaModificarProcesoCierreCaja=true;
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
			this.isVisibilidadCeldaCancelarProcesoCierreCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCierreCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=true;
		} else {
			this.actualizarEstadoPanelsProcesoCierreCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCierreCaja=false;
			//this.isVisibilidadCeldaVerFormProcesoCierreCaja=false;
			this.isVisibilidadCeldaDuplicarProcesoCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocierrecajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!procesocierrecajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;												
			}
			
			this.jButtonCerrarProcesoCierreCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocierrecaja)) {
			this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
			this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCierreCaja=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCierreCaja=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCierreCaja=false;
		//this.isVisibilidadCeldaModificarProcesoCierreCaja=true;
		this.isVisibilidadCeldaActualizarProcesoCierreCaja=false;
		this.isVisibilidadCeldaEliminarProcesoCierreCaja=false;
		//this.isVisibilidadCeldaCancelarProcesoCierreCaja=true;			
		this.isVisibilidadCeldaGuardarProcesoCierreCaja=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCierreCaja() {
	}
	
	public void actualizarEstadoPanelsProcesoCierreCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCierreCaja!=null) {
				this.jScrollPanelDatosEdicionProcesoCierreCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCierreCaja!=null) {
				this.jScrollPanelDatosProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCierreCaja!=null) {
				this.jPanelPaginacionProcesoCierreCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
					this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocierrecajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCierreCaja!=null) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCierreCaja!=null) {
				this.jPanelParametrosReportesProcesoCierreCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaProcesoCierreCaja=isParaUsuario;
			if(!this.isVisibilidadBusquedaProcesoCierreCaja) {this.jTabbedPaneBusquedasProcesoCierreCaja.remove(jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaProcesoCierreCaja=isParaCaja;
			if(!this.isVisibilidadBusquedaProcesoCierreCaja) {this.jTabbedPaneBusquedasProcesoCierreCaja.remove(jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);}
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
			
			this.inicializarActualizarBindingTablaProcesoCierreCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCierreCaja() {
		this.updateBorderResaltarBusquedasFormularioProcesoCierreCaja();
		this.updateVisibilidadBusquedasFormularioProcesoCierreCaja();
		this.updateHabilitarBusquedasFormularioProcesoCierreCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCierreCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCierreCaja.getComponents().length>0) {
	

		if(this.procesocierrecajaConstantesFunciones.resaltarBusquedaProcesoCierreCajaProcesoCierreCaja!=null) {
			index= this.jTabbedPaneBusquedasProcesoCierreCaja.indexOfComponent(this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreCaja.getComponent(index);
				jPanel.setBorder(this.procesocierrecajaConstantesFunciones.resaltarBusquedaProcesoCierreCajaProcesoCierreCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCierreCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreCaja.indexOfComponent(this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocierrecajaConstantesFunciones.mostrarBusquedaProcesoCierreCajaProcesoCierreCaja);
			if(!this.procesocierrecajaConstantesFunciones.mostrarBusquedaProcesoCierreCajaProcesoCierreCaja && index>-1) {
				this.jTabbedPaneBusquedasProcesoCierreCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCierreCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCierreCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCierreCaja.indexOfComponent(this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocierrecajaConstantesFunciones.activarBusquedaProcesoCierreCajaProcesoCierreCaja);
				this.jTabbedPaneBusquedasProcesoCierreCaja.setEnabledAt(index,this.procesocierrecajaConstantesFunciones.activarBusquedaProcesoCierreCajaProcesoCierreCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCierreCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCierreCaja")) {
			index= this.jTabbedPaneBusquedasProcesoCierreCaja.indexOfComponent(this.jPanelBusquedaProcesoCierreCajaProcesoCierreCaja);

			this.jTabbedPaneBusquedasProcesoCierreCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCierreCaja.getComponent(index);

			this.procesocierrecajaConstantesFunciones.setResaltarBusquedaProcesoCierreCajaProcesoCierreCaja(resaltar);

			jPanel.setBorder(this.procesocierrecajaConstantesFunciones.resaltarBusquedaProcesoCierreCajaProcesoCierreCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCierreCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCierreCaja() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCierreCaja();
		this.updateVisibilidadResaltarControlesFormularioProcesoCierreCaja();
		this.updateHabilitarResaltarControlesFormularioProcesoCierreCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocierrecajaConstantesFunciones.resaltaridProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setBorder(this.procesocierrecajaConstantesFunciones.resaltaridProcesoCierreCaja);}
		if(this.procesocierrecajaConstantesFunciones.resaltarid_usuarioProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setBorder(this.procesocierrecajaConstantesFunciones.resaltarid_usuarioProcesoCierreCaja);}
		if(this.procesocierrecajaConstantesFunciones.resaltarid_cajaProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setBorder(this.procesocierrecajaConstantesFunciones.resaltarid_cajaProcesoCierreCaja);}
		if(this.procesocierrecajaConstantesFunciones.resaltarfechaProcesoCierreCaja!=null && this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setBorder(this.procesocierrecajaConstantesFunciones.resaltarfechaProcesoCierreCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCierreCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostraridProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelidProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostraridProcesoCierreCaja);
		//this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarid_usuarioProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelid_usuarioProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarid_usuarioProcesoCierreCaja);
		//this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarid_cajaProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelid_cajaProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarid_cajaProcesoCierreCaja);
		//this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarfechaProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jPanelfechaProcesoCierreCaja.setVisible(this.procesocierrecajaConstantesFunciones.mostrarfechaProcesoCierreCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCierreCaja() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCierreCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCierreCaja!=null) {
	
		this.jInternalFrameDetalleFormProcesoCierreCaja.jTextFieldidProcesoCierreCaja.setEnabled(this.procesocierrecajaConstantesFunciones.activaridProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_usuarioProcesoCierreCaja.setEnabled(this.procesocierrecajaConstantesFunciones.activarid_usuarioProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jComboBoxid_cajaProcesoCierreCaja.setEnabled(this.procesocierrecajaConstantesFunciones.activarid_cajaProcesoCierreCaja);
		this.jInternalFrameDetalleFormProcesoCierreCaja.jDateChooserfechaProcesoCierreCaja.setEnabled(this.procesocierrecajaConstantesFunciones.activarfechaProcesoCierreCaja);
		}
	}
	
		
}