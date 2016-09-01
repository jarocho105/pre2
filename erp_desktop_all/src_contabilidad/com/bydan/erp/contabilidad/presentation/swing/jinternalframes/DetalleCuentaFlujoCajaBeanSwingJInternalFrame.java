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

import com.bydan.erp.contabilidad.util.DetalleCuentaFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.DetalleCuentaFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.DetalleCuentaFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.DetalleCuentaFlujoCajaBean;
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
public class DetalleCuentaFlujoCajaBeanSwingJInternalFrame extends DetalleCuentaFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleCuentaFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleCuentaFlujoCaja> detallecuentaflujocajaValidator = new ClassValidator<DetalleCuentaFlujoCaja>(DetalleCuentaFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleCuentaFlujoCaja detallecuentaflujocaja;	
	public DetalleCuentaFlujoCaja detallecuentaflujocajaAux;
	public DetalleCuentaFlujoCaja detallecuentaflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleCuentaFlujoCaja detallecuentaflujocajaTotales;
	public Long idDetalleCuentaFlujoCajaActual;
	public Long iIdNuevoDetalleCuentaFlujoCaja=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoOperacion="";

	public List<TipoOperacion> tipooperacionsForeignKey;

	public List<TipoOperacion> gettipooperacionsForeignKey() {
		return tipooperacionsForeignKey;
	}

	public void settipooperacionsForeignKey(List<TipoOperacion> tipooperacionsForeignKey) {
		this.tipooperacionsForeignKey = tipooperacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoOperacion tipooperacionForeignKey;

	public TipoOperacion gettipooperacionForeignKey() {
		return tipooperacionForeignKey;
	}

	public void settipooperacionForeignKey(TipoOperacion tipooperacionForeignKey) {
		this.tipooperacionForeignKey = tipooperacionForeignKey;
	}

	public String sFinalQueryComboCuentaFlujoCaja="";

	public List<CuentaFlujoCaja> cuentaflujocajasForeignKey;

	public List<CuentaFlujoCaja> getcuentaflujocajasForeignKey() {
		return cuentaflujocajasForeignKey;
	}

	public void setcuentaflujocajasForeignKey(List<CuentaFlujoCaja> cuentaflujocajasForeignKey) {
		this.cuentaflujocajasForeignKey = cuentaflujocajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaFlujoCaja cuentaflujocajaForeignKey;

	public CuentaFlujoCaja getcuentaflujocajaForeignKey() {
		return cuentaflujocajaForeignKey;
	}

	public void setcuentaflujocajaForeignKey(CuentaFlujoCaja cuentaflujocajaForeignKey) {
		this.cuentaflujocajaForeignKey = cuentaflujocajaForeignKey;
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
	
	public Boolean isPermisoTodoDetalleCuentaFlujoCaja;
	public Boolean isPermisoNuevoDetalleCuentaFlujoCaja;
	public Boolean isPermisoActualizarDetalleCuentaFlujoCaja;
	public Boolean isPermisoActualizarOriginalDetalleCuentaFlujoCaja;
	public Boolean isPermisoEliminarDetalleCuentaFlujoCaja;
	public Boolean isPermisoGuardarCambiosDetalleCuentaFlujoCaja;
	public Boolean isPermisoConsultaDetalleCuentaFlujoCaja;
	public Boolean isPermisoBusquedaDetalleCuentaFlujoCaja;
	public Boolean isPermisoReporteDetalleCuentaFlujoCaja;
	public Boolean isPermisoPaginacionMedioDetalleCuentaFlujoCaja;
	public Boolean isPermisoPaginacionAltoDetalleCuentaFlujoCaja;
	public Boolean isPermisoPaginacionTodoDetalleCuentaFlujoCaja;
	public Boolean isPermisoCopiarDetalleCuentaFlujoCaja;
	public Boolean isPermisoVerFormDetalleCuentaFlujoCaja;
	public Boolean isPermisoDuplicarDetalleCuentaFlujoCaja;
	public Boolean isPermisoOrdenDetalleCuentaFlujoCaja;
	
	
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
	
	public DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaReturnGeneral;
	public DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleCuentaFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioDetalleCuentaFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleCuentaFlujoCajaSessionBeanAdditional detallecuentaflujocajaSessionBeanAdditional=null;
	
	public DetalleCuentaFlujoCajaSessionBeanAdditional getDetalleCuentaFlujoCajaSessionBeanAdditional() {
		return this.detallecuentaflujocajaSessionBeanAdditional;
	}
	
	public void setDetalleCuentaFlujoCajaSessionBeanAdditional(DetalleCuentaFlujoCajaSessionBeanAdditional detallecuentaflujocajaSessionBeanAdditional) {
		try {
			this.detallecuentaflujocajaSessionBeanAdditional=detallecuentaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional detallecuentaflujocajaBeanSwingJInternalFrameAdditional=null;
	//public class DetalleCuentaFlujoCajaBeanSwingJInternalFrame
	
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional getDetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional() {
		return this.detallecuentaflujocajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional(DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional detallecuentaflujocajaBeanSwingJInternalFrameAdditional) {
		try {
			this.detallecuentaflujocajaBeanSwingJInternalFrameAdditional=detallecuentaflujocajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleCuentaFlujoCaja detallecuentaflujocajaBean;
	public DetalleCuentaFlujoCajaConstantesFunciones detallecuentaflujocajaConstantesFunciones;
	//public DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaReturnGeneral;
	
	//FK
	
	public TipoOperacionLogic tipooperacionLogic;
	public CuentaFlujoCajaLogic cuentaflujocajaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleCuentaFlujoCaja> detallecuentaflujocajas;	
	//public List<DetalleCuentaFlujoCaja> detallecuentaflujocajasEliminados;
	//public List<DetalleCuentaFlujoCaja> detallecuentaflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdCuentaFlujoCaja=false;
	public Boolean isVisibilidadFK_IdTipoOperacion=false;
	
	public Long getiIdNuevoDetalleCuentaFlujoCaja() {
		return this.iIdNuevoDetalleCuentaFlujoCaja;
	}

	public void setiIdNuevoDetalleCuentaFlujoCaja(Long iIdNuevoDetalleCuentaFlujoCaja) {
		this.iIdNuevoDetalleCuentaFlujoCaja = iIdNuevoDetalleCuentaFlujoCaja;
	}
	
	public Long getidDetalleCuentaFlujoCajaActual() {
		return this.idDetalleCuentaFlujoCajaActual;
	}

	public void setidDetalleCuentaFlujoCajaActual(Long idDetalleCuentaFlujoCajaActual) {
		this.idDetalleCuentaFlujoCajaActual = idDetalleCuentaFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleCuentaFlujoCaja getdetallecuentaflujocaja() {
		return this.detallecuentaflujocaja;
	}

	public void setdetallecuentaflujocaja(DetalleCuentaFlujoCaja detallecuentaflujocaja) {
		this.detallecuentaflujocaja = detallecuentaflujocaja;
	}
	
	public DetalleCuentaFlujoCaja getdetallecuentaflujocajaAux() {
		return this.detallecuentaflujocajaAux;
	}

	public void setdetallecuentaflujocajaAux(DetalleCuentaFlujoCaja detallecuentaflujocajaAux) {
		this.detallecuentaflujocajaAux = detallecuentaflujocajaAux;
	}				
	
	public DetalleCuentaFlujoCaja getdetallecuentaflujocajaAnterior() {
		return this.detallecuentaflujocajaAnterior;
	}

	public void setdetallecuentaflujocajaAnterior(DetalleCuentaFlujoCaja detallecuentaflujocajaAnterior) {
		this.detallecuentaflujocajaAnterior = detallecuentaflujocajaAnterior;
	}	
	
	public DetalleCuentaFlujoCaja getdetallecuentaflujocajaTotales() {
		return this.detallecuentaflujocajaTotales;
	}

	public void setdetallecuentaflujocajaTotales(DetalleCuentaFlujoCaja detallecuentaflujocajaTotales) {
		this.detallecuentaflujocajaTotales = detallecuentaflujocajaTotales;
	}	
	
	public DetalleCuentaFlujoCaja getdetallecuentaflujocajaBean() {
		return this.detallecuentaflujocajaBean;
	}

	public void setdetallecuentaflujocajaBean(DetalleCuentaFlujoCaja detallecuentaflujocajaBean) {
		this.detallecuentaflujocajaBean = detallecuentaflujocajaBean;
	}	
	
	public DetalleCuentaFlujoCajaParameterReturnGeneral getdetallecuentaflujocajaReturnGeneral() {
		return this.detallecuentaflujocajaReturnGeneral;
	}

	public void setdetallecuentaflujocajaReturnGeneral(DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaReturnGeneral) {
		this.detallecuentaflujocajaReturnGeneral = detallecuentaflujocajaReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja=-1L;

	public Long getid_cuenta_flujo_cajaFK_IdCuentaFlujoCaja() {
		return this.id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja;
	}

	public void setid_cuenta_flujo_cajaFK_IdCuentaFlujoCaja(Long id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja) {
		this.id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja = id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja;
	}

	public Long id_tipo_operacionFK_IdTipoOperacion=-1L;

	public Long getid_tipo_operacionFK_IdTipoOperacion() {
		return this.id_tipo_operacionFK_IdTipoOperacion;
	}

	public void setid_tipo_operacionFK_IdTipoOperacion(Long id_tipo_operacionFK_IdTipoOperacion) {
		this.id_tipo_operacionFK_IdTipoOperacion = id_tipo_operacionFK_IdTipoOperacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleCuentaFlujoCajaLogic getDetalleCuentaFlujoCajaLogic()	{		
		return detallecuentaflujocajaLogic;
	}

	public void setDetalleCuentaFlujoCajaLogic(DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic) {
		this.detallecuentaflujocajaLogic = detallecuentaflujocajaLogic;
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
	
	public Boolean getIsEsNuevoDetalleCuentaFlujoCaja() {
		return isEsNuevoDetalleCuentaFlujoCaja;
	}

	public void setIsEsNuevoDetalleCuentaFlujoCaja(Boolean isEsNuevoDetalleCuentaFlujoCaja) {
		this.isEsNuevoDetalleCuentaFlujoCaja = isEsNuevoDetalleCuentaFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleCuentaFlujoCaja() {
		return esParaAccionDesdeFormularioDetalleCuentaFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleCuentaFlujoCaja(Boolean esParaAccionDesdeFormularioDetalleCuentaFlujoCaja) {
		this.esParaAccionDesdeFormularioDetalleCuentaFlujoCaja = esParaAccionDesdeFormularioDetalleCuentaFlujoCaja;
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
	
	
	public void cargarCombosTipoOperacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipooperacionsForeignKey=new ArrayList<TipoOperacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoOperacionLogic tipooperacionLogic=new TipoOperacionLogic();

			tipooperacionLogic.getTipoOperacionDataAccess().setIsForForeingKeyData(true);

			if(this.detallecuentaflujocajaSessionBean==null) {
				this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			}

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoOperacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipooperacionLogic.getTipoOperacionDataAccess().setIsForForeingKeyData(true);

					tipooperacionLogic.getTodosTipoOperacionsWithConnection(sFinalQuery,new Pagination());

					this.tipooperacionsForeignKey=tipooperacionLogic.getTipoOperacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoOperacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipooperacionLogic.getEntityWithConnection(detallecuentaflujocajaSessionBean.getlidTipoOperacionActual());
					this.tipooperacionsForeignKey.add(tipooperacionLogic.getTipoOperacion());
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

	public void cargarCombosCuentaFlujoCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentaflujocajasForeignKey=new ArrayList<CuentaFlujoCaja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaFlujoCajaLogic cuentaflujocajaLogic=new CuentaFlujoCajaLogic();

			cuentaflujocajaLogic.getCuentaFlujoCajaDataAccess().setIsForForeingKeyData(true);

			if(this.detallecuentaflujocajaSessionBean==null) {
				this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			}

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaFlujoCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getCuentaFlujoCajaDataAccess().setIsForForeingKeyData(true);

					cuentaflujocajaLogic.getTodosCuentaFlujoCajasWithConnection(sFinalQuery,new Pagination());

					this.cuentaflujocajasForeignKey=cuentaflujocajaLogic.getCuentaFlujoCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaFlujoCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentaflujocajaLogic.getEntityWithConnection(detallecuentaflujocajaSessionBean.getlidCuentaFlujoCajaActual());
					this.cuentaflujocajasForeignKey.add(cuentaflujocajaLogic.getCuentaFlujoCaja());
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallecuentaflujocajaSessionBean==null) {
				this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			}

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(detallecuentaflujocajaSessionBean.getlidCuentaContableActual());
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

	
	
	public void setActualTipoOperacionForeignKey(Long idTipoOperacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoOperacion  tipooperacionTemp=null;

			for(TipoOperacion tipooperacionAux:tipooperacionsForeignKey) {
				if(tipooperacionAux.getId()!=null && tipooperacionAux.getId().equals(idTipoOperacionSeleccionado)) {
					tipooperacionTemp=tipooperacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipooperacionTemp!=null) {

					if(this.detallecuentaflujocaja!=null) {
						this.detallecuentaflujocaja.setTipoOperacion(tipooperacionTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacionTemp);
					}
				} else {
					//jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacionTemp);
					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoOperacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipooperacionTemp!=null && jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja!=null) {
						jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacionTemp);
					} else {
						if(jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja!=null) {
							//jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacionTemp);
							if(jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.getItemCount()>0) {
								jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setSelectedIndex(0);
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

	public String getActualTipoOperacionForeignKeyDescripcion(Long idTipoOperacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoOperacion  tipooperacionTemp=null;

			for(TipoOperacion tipooperacionAux:tipooperacionsForeignKey) {
				if(tipooperacionAux.getId()!=null && tipooperacionAux.getId().equals(idTipoOperacionSeleccionado)) {
					tipooperacionTemp=tipooperacionAux;
					break;
				}
			}


			sDescripcion=TipoOperacionConstantesFunciones.getTipoOperacionDescripcion(tipooperacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoOperacionForeignKeyGenerico(Long idTipoOperacionSeleccionado,JComboBox jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoOperacion  tipooperacionTemp=null;

			for(TipoOperacion tipooperacionAux:tipooperacionsForeignKey) {
				if(tipooperacionAux.getId()!=null && tipooperacionAux.getId().equals(idTipoOperacionSeleccionado)) {
					tipooperacionTemp=tipooperacionAux;
					break;
				}
			}

			if(tipooperacionTemp!=null) {
				jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico.setSelectedItem(tipooperacionTemp);
			} else {
				if(jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico!=null && jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaFlujoCajaForeignKey(Long idCuentaFlujoCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaFlujoCaja  cuentaflujocajaTemp=null;

			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasForeignKey) {
				if(cuentaflujocajaAux.getId()!=null && cuentaflujocajaAux.getId().equals(idCuentaFlujoCajaSeleccionado)) {
					cuentaflujocajaTemp=cuentaflujocajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentaflujocajaTemp!=null) {

					if(this.detallecuentaflujocaja!=null) {
						this.detallecuentaflujocaja.setCuentaFlujoCaja(cuentaflujocajaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocajaTemp);
					}
				} else {
					//jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocajaTemp);
					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentaflujocajaTemp!=null && jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja!=null) {
						jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocajaTemp);
					} else {
						if(jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja!=null) {
							//jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocajaTemp);
							if(jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.getItemCount()>0) {
								jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setSelectedIndex(0);
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

	public String getActualCuentaFlujoCajaForeignKeyDescripcion(Long idCuentaFlujoCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaFlujoCaja  cuentaflujocajaTemp=null;

			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasForeignKey) {
				if(cuentaflujocajaAux.getId()!=null && cuentaflujocajaAux.getId().equals(idCuentaFlujoCajaSeleccionado)) {
					cuentaflujocajaTemp=cuentaflujocajaAux;
					break;
				}
			}


			sDescripcion=CuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaDescripcion(cuentaflujocajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaFlujoCajaForeignKeyGenerico(Long idCuentaFlujoCajaSeleccionado,JComboBox jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaFlujoCaja  cuentaflujocajaTemp=null;

			for(CuentaFlujoCaja cuentaflujocajaAux:cuentaflujocajasForeignKey) {
				if(cuentaflujocajaAux.getId()!=null && cuentaflujocajaAux.getId().equals(idCuentaFlujoCajaSeleccionado)) {
					cuentaflujocajaTemp=cuentaflujocajaAux;
					break;
				}
			}

			if(cuentaflujocajaTemp!=null) {
				jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico.setSelectedItem(cuentaflujocajaTemp);
			} else {
				if(jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico!=null && jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.detallecuentaflujocaja!=null) {
						this.detallecuentaflujocaja.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico)throws Exception
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
				jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico!=null && jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoOperacionForeignKey(DetalleCuentaFlujoCaja detallecuentaflujocaja,JComboBox jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoOperacion  tipooperacionAux=new TipoOperacion();

			if(jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico==null) {
				tipooperacionAux=(TipoOperacion)this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getSelectedItem();
			} else {
				tipooperacionAux=(TipoOperacion)jComboBoxid_tipo_operacionDetalleCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(tipooperacionAux!=null && tipooperacionAux.getId()!=null) {
				detallecuentaflujocaja.setid_tipo_operacion(tipooperacionAux.getId());
				detallecuentaflujocaja.settipooperacion_descripcion(DetalleCuentaFlujoCajaConstantesFunciones.getTipoOperacionDescripcion(tipooperacionAux));
				detallecuentaflujocaja.setTipoOperacion(tipooperacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaFlujoCajaForeignKey(DetalleCuentaFlujoCaja detallecuentaflujocaja,JComboBox jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaFlujoCaja  cuentaflujocajaAux=new CuentaFlujoCaja();

			if(jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico==null) {
				cuentaflujocajaAux=(CuentaFlujoCaja)this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getSelectedItem();
			} else {
				cuentaflujocajaAux=(CuentaFlujoCaja)jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(cuentaflujocajaAux!=null && cuentaflujocajaAux.getId()!=null) {
				detallecuentaflujocaja.setid_cuenta_flujo_caja(cuentaflujocajaAux.getId());
				detallecuentaflujocaja.setcuentaflujocaja_descripcion(DetalleCuentaFlujoCajaConstantesFunciones.getCuentaFlujoCajaDescripcion(cuentaflujocajaAux));
				detallecuentaflujocaja.setCuentaFlujoCaja(cuentaflujocajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(DetalleCuentaFlujoCaja detallecuentaflujocaja,JComboBox jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableDetalleCuentaFlujoCajaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				detallecuentaflujocaja.setid_cuenta_contable(cuentacontableAux.getId());
				detallecuentaflujocaja.setcuentacontable_descripcion(DetalleCuentaFlujoCajaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				detallecuentaflujocaja.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoOperacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoOperacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.removeAllItems();

							for(TipoOperacion tipooperacion:this.tipooperacionsForeignKey) {
								this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.addItem(tipooperacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
					}

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoOperacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.removeAllItems();

							for(TipoOperacion tipooperacion:this.tipooperacionsForeignKey) {
								this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.addItem(tipooperacion);
							}
						}

						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaFlujoCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaFlujoCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.removeAllItems();

							for(CuentaFlujoCaja cuentaflujocaja:this.cuentaflujocajasForeignKey) {
								this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.addItem(cuentaflujocaja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
					}

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.removeAllItems();

							for(CuentaFlujoCaja cuentaflujocaja:this.cuentaflujocajasForeignKey) {
								this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.addItem(cuentaflujocaja);
							}
						}

						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { 
					}

					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.addItem(cuentacontable);
							}
						}

						if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoOperacionForeignKey(TipoOperacion tipooperacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setSelectedItem(tipooperacion);
						} else {
							this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaFlujoCajaForeignKey(CuentaFlujoCaja cuentaflujocaja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocaja);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setSelectedItem(cuentaflujocaja);
						} else {
							this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleCuentaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleCuentaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja(this.detallecuentaflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(TipoOperacion.class));
		classes.add(new Classe(CuentaFlujoCaja.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(this.detallecuentaflujocajas);
			detallecuentaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleCuentaFlujoCajaParameterReturnGeneral getDetalleCuentaFlujoCajaParameterGeneral() {
		return this.detallecuentaflujocajaParameterGeneral;
	}
	
	public void setDetalleCuentaFlujoCajaParameterGeneral(DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaParameterGeneral) {
		this.detallecuentaflujocajaParameterGeneral = detallecuentaflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleCuentaFlujoCaja() {
		return isPermisoTodoDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoTodoDetalleCuentaFlujoCaja(Boolean isPermisoTodoDetalleCuentaFlujoCaja) {
		this.isPermisoTodoDetalleCuentaFlujoCaja = isPermisoTodoDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoNuevoDetalleCuentaFlujoCaja() {
		return isPermisoNuevoDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoNuevoDetalleCuentaFlujoCaja(Boolean isPermisoNuevoDetalleCuentaFlujoCaja) {
		this.isPermisoNuevoDetalleCuentaFlujoCaja = isPermisoNuevoDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoActualizarDetalleCuentaFlujoCaja() {
		return isPermisoActualizarDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoActualizarDetalleCuentaFlujoCaja(Boolean isPermisoActualizarDetalleCuentaFlujoCaja) {
		this.isPermisoActualizarDetalleCuentaFlujoCaja = isPermisoActualizarDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoEliminarDetalleCuentaFlujoCaja() {
		return isPermisoEliminarDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoEliminarDetalleCuentaFlujoCaja(Boolean isPermisoEliminarDetalleCuentaFlujoCaja) {
		this.isPermisoEliminarDetalleCuentaFlujoCaja = isPermisoEliminarDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleCuentaFlujoCaja() {
		return isPermisoGuardarCambiosDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosDetalleCuentaFlujoCaja(Boolean isPermisoGuardarCambiosDetalleCuentaFlujoCaja) {
		this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja = isPermisoGuardarCambiosDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaDetalleCuentaFlujoCaja() {
		return isPermisoConsultaDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoConsultaDetalleCuentaFlujoCaja(Boolean isPermisoConsultaDetalleCuentaFlujoCaja) {
		this.isPermisoConsultaDetalleCuentaFlujoCaja = isPermisoConsultaDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaDetalleCuentaFlujoCaja() {
		return isPermisoBusquedaDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoBusquedaDetalleCuentaFlujoCaja(Boolean isPermisoBusquedaDetalleCuentaFlujoCaja) {
		this.isPermisoBusquedaDetalleCuentaFlujoCaja = isPermisoBusquedaDetalleCuentaFlujoCaja;
	}

	public Boolean getIsPermisoReporteDetalleCuentaFlujoCaja() {
		return isPermisoReporteDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoReporteDetalleCuentaFlujoCaja(Boolean isPermisoReporteDetalleCuentaFlujoCaja) {
		this.isPermisoReporteDetalleCuentaFlujoCaja = isPermisoReporteDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleCuentaFlujoCaja() {
		return isPermisoPaginacionMedioDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioDetalleCuentaFlujoCaja(Boolean isPermisoPaginacionMedioDetalleCuentaFlujoCaja) {
		this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja = isPermisoPaginacionMedioDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleCuentaFlujoCaja() {
		return isPermisoPaginacionTodoDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoDetalleCuentaFlujoCaja(Boolean isPermisoPaginacionTodoDetalleCuentaFlujoCaja) {
		this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja = isPermisoPaginacionTodoDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleCuentaFlujoCaja() {
		return isPermisoPaginacionAltoDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoDetalleCuentaFlujoCaja(Boolean isPermisoPaginacionAltoDetalleCuentaFlujoCaja) {
		this.isPermisoPaginacionAltoDetalleCuentaFlujoCaja = isPermisoPaginacionAltoDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarDetalleCuentaFlujoCaja() {
		return isPermisoCopiarDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoCopiarDetalleCuentaFlujoCaja(Boolean isPermisoCopiarDetalleCuentaFlujoCaja) {
		this.isPermisoCopiarDetalleCuentaFlujoCaja = isPermisoCopiarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormDetalleCuentaFlujoCaja() {
		return isPermisoVerFormDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoVerFormDetalleCuentaFlujoCaja(Boolean isPermisoVerFormDetalleCuentaFlujoCaja) {
		this.isPermisoVerFormDetalleCuentaFlujoCaja = isPermisoVerFormDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarDetalleCuentaFlujoCaja() {
		return isPermisoDuplicarDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoDuplicarDetalleCuentaFlujoCaja(Boolean isPermisoDuplicarDetalleCuentaFlujoCaja) {
		this.isPermisoDuplicarDetalleCuentaFlujoCaja = isPermisoDuplicarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenDetalleCuentaFlujoCaja() {
		return isPermisoOrdenDetalleCuentaFlujoCaja;
	}

	public void setIsPermisoOrdenDetalleCuentaFlujoCaja(Boolean isPermisoOrdenDetalleCuentaFlujoCaja) {
		this.isPermisoOrdenDetalleCuentaFlujoCaja = isPermisoOrdenDetalleCuentaFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja = isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja = isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja = isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja = isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja = isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja = isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaModificarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaModificarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja = isVisibilidadCeldaModificarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja = isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja = isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja = isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja = isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja = isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja;
	}
		
	public DetalleCuentaFlujoCajaSessionBean getdetallecuentaflujocajaSessionBean() {
		return this.detallecuentaflujocajaSessionBean;
	}
	
	public void setdetallecuentaflujocajaSessionBean(DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean) {
		this.detallecuentaflujocajaSessionBean=detallecuentaflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdCuentaFlujoCaja() {
		return this.isVisibilidadFK_IdCuentaFlujoCaja;
	}

	public void setisVisibilidadFK_IdCuentaFlujoCaja(Boolean isVisibilidadFK_IdCuentaFlujoCaja) {
		this.isVisibilidadFK_IdCuentaFlujoCaja=isVisibilidadFK_IdCuentaFlujoCaja;
	}

	public Boolean getisVisibilidadFK_IdTipoOperacion() {
		return this.isVisibilidadFK_IdTipoOperacion;
	}

	public void setisVisibilidadFK_IdTipoOperacion(Boolean isVisibilidadFK_IdTipoOperacion) {
		this.isVisibilidadFK_IdTipoOperacion=isVisibilidadFK_IdTipoOperacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarTipoOperacionForeignKey(detallecuentaflujocaja,null);
				this.setActualParaGuardarCuentaFlujoCajaForeignKey(detallecuentaflujocaja,null);
				this.setActualParaGuardarCuentaContableForeignKey(detallecuentaflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(DetalleCuentaFlujoCaja detallecuentaflujocaja,DetalleCuentaFlujoCaja detallecuentaflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleCuentaFlujoCaja(detallecuentaflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallecuentaflujocajaAux.setId(detallecuentaflujocaja.getId());
		detallecuentaflujocajaAux.setVersionRow(detallecuentaflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleCuentaFlujoCaja();
		
			int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallecuentaflujocajaValidator.getInvalidValues(this.detallecuentaflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallecuentaflujocajaLogic.setDatosCliente(datosCliente);
			detallecuentaflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallecuentaflujocajaAux=new  DetalleCuentaFlujoCaja();
				
				detallecuentaflujocajaAux.setIsNew(true);
				detallecuentaflujocajaAux.setIsChanged(true);
				
				detallecuentaflujocajaAux.setDetalleCuentaFlujoCajaOriginal(this.detallecuentaflujocaja);
				
				detallecuentaflujocajaAux.setId(this.detallecuentaflujocaja.getId());	
				detallecuentaflujocajaAux.setVersionRow(this.detallecuentaflujocaja.getVersionRow());	
				detallecuentaflujocajaAux.setid_tipo_operacion(this.detallecuentaflujocaja.getid_tipo_operacion());	
				detallecuentaflujocajaAux.setid_cuenta_flujo_caja(this.detallecuentaflujocaja.getid_cuenta_flujo_caja());	
				detallecuentaflujocajaAux.setid_cuenta_contable(this.detallecuentaflujocaja.getid_cuenta_contable());	
				detallecuentaflujocajaAux.setesta_activo(this.detallecuentaflujocaja.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajas();//WithConnection
						//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajaRelaciones(detallecuentaflujocajaAux);//WithConnection
								//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallecuentaflujocajaAux=new  DetalleCuentaFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() && this.detallecuentaflujocaja.getId()>=0)) {
						
					detallecuentaflujocajaAux.setIsNew(false);
				}
				
				detallecuentaflujocajaAux.setIsDeleted(false);
			
				detallecuentaflujocajaAux.setId(this.detallecuentaflujocaja.getId());	
				detallecuentaflujocajaAux.setVersionRow(this.detallecuentaflujocaja.getVersionRow());	
				detallecuentaflujocajaAux.setid_tipo_operacion(this.detallecuentaflujocaja.getid_tipo_operacion());	
				detallecuentaflujocajaAux.setid_cuenta_flujo_caja(this.detallecuentaflujocaja.getid_cuenta_flujo_caja());	
				detallecuentaflujocajaAux.setid_cuenta_contable(this.detallecuentaflujocaja.getid_cuenta_contable());	
				detallecuentaflujocajaAux.setesta_activo(this.detallecuentaflujocaja.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajas();//WithConnection
						//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajaRelaciones(detallecuentaflujocajaAux);//WithConnection
								//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallecuentaflujocaja,detallecuentaflujocajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallecuentaflujocajaAux=new  DetalleCuentaFlujoCaja();
				
				detallecuentaflujocajaAux.setIsNew(false);
				detallecuentaflujocajaAux.setIsChanged(false);
				
				detallecuentaflujocajaAux.setIsDeleted(true);
				
				detallecuentaflujocajaAux.setId(this.detallecuentaflujocaja.getId());	
				detallecuentaflujocajaAux.setVersionRow(this.detallecuentaflujocaja.getVersionRow());	
				detallecuentaflujocajaAux.setid_tipo_operacion(this.detallecuentaflujocaja.getid_tipo_operacion());	
				detallecuentaflujocajaAux.setid_cuenta_flujo_caja(this.detallecuentaflujocaja.getid_cuenta_flujo_caja());	
				detallecuentaflujocajaAux.setid_cuenta_contable(this.detallecuentaflujocaja.getid_cuenta_contable());	
				detallecuentaflujocajaAux.setesta_activo(this.detallecuentaflujocaja.getesta_activo());	
				
				if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallecuentaflujocajaAux.getId()>=0) {	
						this.detallecuentaflujocajasEliminados.add(detallecuentaflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajas();//WithConnection
						//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajaRelaciones(detallecuentaflujocajaAux);//WithConnection
								//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
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
							if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallecuentaflujocajaAux,detallecuentaflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(this.detallecuentaflujocajasEliminados);
					
					detallecuentaflujocajaLogic.saveDetalleCuentaFlujoCajas();//WithConnection
					//detallecuentaflujocajaLogic.getSetVersionRowDetalleCuentaFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja();
				
				this.detallecuentaflujocajasEliminados= new ArrayList<DetalleCuentaFlujoCaja>();		
			}
			
			if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Cuenta Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallecuentaflujocaja=detallecuentaflujocajaAux;
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
      		//this.finishProcessDetalleCuentaFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleCuentaFlujoCaja detallecuentaflujocajaLocal) throws Exception {
		
		if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleCuentaFlujoCaja detallecuentaflujocajaLocal) throws Exception {	
		if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoOperacionDetalleFormJInternalFrame.class)) {
				TipoOperacionBeanSwingJInternalFrame tipooperacionBeanSwingJInternalFrameLocal=(TipoOperacionBeanSwingJInternalFrame) ((TipoOperacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipooperacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoOperacion(tipooperacionBeanSwingJInternalFrameLocal.gettipooperacion(),true);
				tipooperacionBeanSwingJInternalFrameLocal.actualizarLista(tipooperacionBeanSwingJInternalFrameLocal.tipooperacion,this.tipooperacionsForeignKey);

				tipooperacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipooperacionBeanSwingJInternalFrameLocal.tipooperacion);

				detallecuentaflujocajaLocal.setTipoOperacion(tipooperacionBeanSwingJInternalFrameLocal.tipooperacion);

				this.addItemDefectoCombosForeignKeyTipoOperacion();
				this.cargarCombosFrameTipoOperacionsForeignKey("Formulario");
				this.setActualTipoOperacionForeignKey(tipooperacionBeanSwingJInternalFrameLocal.tipooperacion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaFlujoCajaDetalleFormJInternalFrame.class)) {
				CuentaFlujoCajaBeanSwingJInternalFrame cuentaflujocajaBeanSwingJInternalFrameLocal=(CuentaFlujoCajaBeanSwingJInternalFrame) ((CuentaFlujoCajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentaflujocajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaFlujoCaja(cuentaflujocajaBeanSwingJInternalFrameLocal.getcuentaflujocaja(),true);
				cuentaflujocajaBeanSwingJInternalFrameLocal.actualizarLista(cuentaflujocajaBeanSwingJInternalFrameLocal.cuentaflujocaja,this.cuentaflujocajasForeignKey);

				cuentaflujocajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentaflujocajaBeanSwingJInternalFrameLocal.cuentaflujocaja);

				detallecuentaflujocajaLocal.setCuentaFlujoCaja(cuentaflujocajaBeanSwingJInternalFrameLocal.cuentaflujocaja);

				this.addItemDefectoCombosForeignKeyCuentaFlujoCaja();
				this.cargarCombosFrameCuentaFlujoCajasForeignKey("Formulario");
				this.setActualCuentaFlujoCajaForeignKey(cuentaflujocajaBeanSwingJInternalFrameLocal.cuentaflujocaja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				detallecuentaflujocajaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleCuentaFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallecuentaflujocajaValidator.getInvalidValues(this.detallecuentaflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleCuentaFlujoCaja detallecuentaflujocaja,List<DetalleCuentaFlujoCaja> detallecuentaflujocajas) throws Exception {
		try	{		
			DetalleCuentaFlujoCajaConstantesFunciones.actualizarLista(detallecuentaflujocaja,detallecuentaflujocajas,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleCuentaFlujoCaja detallecuentaflujocaja,List<DetalleCuentaFlujoCaja> detallecuentaflujocajas) throws Exception {
		try	{			
			DetalleCuentaFlujoCajaConstantesFunciones.actualizarSelectedLista(detallecuentaflujocaja,detallecuentaflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleCuentaFlujoCaja> detallecuentaflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallecuentaflujocajasLocal=this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallecuentaflujocajasLocal=this.detallecuentaflujocajas;
			}
			//ARCHITECTURE
		
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaLocal:detallecuentaflujocajasLocal) {
				if(this.permiteMantenimiento(detallecuentaflujocajaLocal) && detallecuentaflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleCuentaFlujoCajaConstantesFunciones.getDetalleCuentaFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleCuentaFlujoCajaConstantesFunciones.IDTIPOOPERACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_tipo_operacionDetalleCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleCuentaFlujoCajaConstantesFunciones.IDCUENTAFLUJOCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleCuentaFlujoCajaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_cuenta_contableDetalleCuentaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleCuentaFlujoCajaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelesta_activoDetalleCuentaFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_tipo_operacionDetalleCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelid_cuenta_contableDetalleCuentaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelesta_activoDetalleCuentaFlujoCaja,"");
		
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
		this.iIdNuevoDetalleCuentaFlujoCaja--;	
		
		
		this.detallecuentaflujocajaAux=new DetalleCuentaFlujoCaja();
		
		this.detallecuentaflujocajaAux.setId(this.iIdNuevoDetalleCuentaFlujoCaja);
		this.detallecuentaflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().add(this.detallecuentaflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallecuentaflujocajas.add(this.detallecuentaflujocajaAux);
		}
		//ARCHITECTURE
		
		this.detallecuentaflujocaja=this.detallecuentaflujocajaAux;
		
		if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
		}
				
		//this.setDefaultControlesDetalleCuentaFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleCuentaFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleCuentaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCuentaFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocajaBean,this.detallecuentaflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=DetalleCuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfDetalleCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.procesarEventosDetalleCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this.detallecuentaflujocaja,this.detallecuentaflujocajaParameterGeneral,this.isEsNuevoDetalleCuentaFlujoCaja,classes);//this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral,this.detallecuentaflujocajaBean,false);
		
		if(this.detallecuentaflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja());
		}
		
		if(this.detallecuentaflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja(),classes);//this.detallecuentaflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleCuentaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleCuentaFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarFormDetalleCuentaFlujoCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
						
			if(detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();
			}
			
			this.actualizarVisualTableDatosDetalleCuentaFlujoCaja();
			
			this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoDetalleCuentaFlujoCaja(), this.getIndiceNuevoDetalleCuentaFlujoCaja());
			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setEnabled(isHabilitar && this.detallecuentaflujocajaConstantesFunciones.activaresta_activoDetalleCuentaFlujoCaja);	
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setEnabled(isHabilitar && this.detallecuentaflujocajaConstantesFunciones.activarid_tipo_operacionDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setEnabled(isHabilitar && this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setEnabled(isHabilitar && this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_contableDetalleCuentaFlujoCaja);
	};
	
	public void setDefaultControlesDetalleCuentaFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleCuentaFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.detallecuentaflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setVisible(true);
			
					
		} else {
			//this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.detallecuentaflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleCuentaFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				if(detallecuentaflujocajaAux.getId().equals(this.iIdNuevoDetalleCuentaFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajas) {
				if(detallecuentaflujocajaAux.getId().equals(this.iIdNuevoDetalleCuentaFlujoCaja)) {
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
	
	public int getIndiceActualDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				if(detallecuentaflujocajaAux.getId().equals(detallecuentaflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajas) {
				if(detallecuentaflujocajaAux.getId().equals(detallecuentaflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				if(detallecuentaflujocajaAux.getDetalleCuentaFlujoCajaOriginal().getId().equals(detallecuentaflujocajaOriginal.getId())) {
					existe=true;
					detallecuentaflujocajaOriginal.setId(detallecuentaflujocajaAux.getId());
					detallecuentaflujocajaOriginal.setVersionRow(detallecuentaflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajas) {
				if(detallecuentaflujocajaAux.getDetalleCuentaFlujoCajaOriginal().getId().equals(detallecuentaflujocajaOriginal.getId())) {
					existe=true;
					detallecuentaflujocajaOriginal.setId(detallecuentaflujocajaAux.getId());
					detallecuentaflujocajaOriginal.setVersionRow(detallecuentaflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleCuentaFlujoCaja(Boolean esParaCancelar) throws Exception {
		detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
		detallecuentaflujocajaAux=new DetalleCuentaFlujoCaja();
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
					if(detallecuentaflujocajaAux.getId()<0) {
						detallecuentaflujocajasAux.add(detallecuentaflujocajaAux);
					}		
				}
				this.iIdNuevoDetalleCuentaFlujoCaja=0L;
				this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().removeAll(detallecuentaflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajas) {
					if(detallecuentaflujocajaAux.getId()<0) {
						detallecuentaflujocajasAux.add(detallecuentaflujocajaAux);
					}		
				}
				this.iIdNuevoDetalleCuentaFlujoCaja=0L;
				this.detallecuentaflujocajas.removeAll(detallecuentaflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleCuentaFlujoCaja 
					&& this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()>0
					) {
					detallecuentaflujocajaAux=this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().get(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size() - 1);
				
					if(detallecuentaflujocajaAux.getId()<0) {
						this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().remove(detallecuentaflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleCuentaFlujoCaja && this.detallecuentaflujocajas.size()>0) {
					detallecuentaflujocajaAux=this.detallecuentaflujocajas.get(this.detallecuentaflujocajas.size() - 1);
				
					if(detallecuentaflujocajaAux.getId()<0) {
						this.detallecuentaflujocajas.remove(detallecuentaflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleCuentaFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallecuentaflujocaja.getId()<0) {
				this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().remove(this.detallecuentaflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallecuentaflujocaja.getId()<0) {
				this.detallecuentaflujocajas.remove(this.detallecuentaflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleCuentaFlujoCaja(List<DetalleCuentaFlujoCaja> detallecuentaflujocajasAux) throws Exception {
		DetalleCuentaFlujoCajaConstantesFunciones.setEstadosInicialesDetalleCuentaFlujoCaja(detallecuentaflujocajasAux);
	}
	
	public void setEstadosInicialesDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocajaAux) throws Exception {
		DetalleCuentaFlujoCajaConstantesFunciones.setEstadosInicialesDetalleCuentaFlujoCaja(detallecuentaflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleCuentaFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleCuentaFlujoCajaActual()) {
				if(!this.isEsNuevoDetalleCuentaFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleCuentaFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleCuentaFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Cuenta Flujo Caja ?", "MANTENIMIENTO DE Detalle Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleCuentaFlujoCaja detallecuentaflujocaja) throws Exception {
		DetalleCuentaFlujoCajaConstantesFunciones.seleccionarAsignar(this.detallecuentaflujocaja,detallecuentaflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleCuentaFlujoCaja=this.isPermisoActualizarOriginalDetalleCuentaFlujoCaja;
			
			
			this.seleccionarAsignar(detallecuentaflujocaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleCuentaFlujoCajaConstantesFunciones.quitarEspaciosDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallecuentaflujocajaSessionBean.setsFuncionBusquedaRapida(this.detallecuentaflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleCuentaFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleCuentaFlujoCaja(esParaCancelar);				
				this.cancelarNuevoDetalleCuentaFlujoCaja(esParaCancelar);								
			}
			
			this.detallecuentaflujocaja=new DetalleCuentaFlujoCaja();
			
			this.inicializarDetalleCuentaFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleCuentaFlujoCaja() throws Exception {
		try {
			DetalleCuentaFlujoCajaConstantesFunciones.inicializarDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleCuentaFlujoCajas(String sAccionBusqueda,List<DetalleCuentaFlujoCaja> detallecuentaflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleCuentaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleCuentaFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleCuentaFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleCuentaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Cuenta Flujo Cajas");		
		parameters.put("busquedapor", DetalleCuentaFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleCuentaFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleCuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleCuentaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleCuentaFlujoCaja=new JRBeanArrayDataSource(DetalleCuentaFlujoCajaJInternalFrame.TraerDetalleCuentaFlujoCajaBeans(detallecuentaflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleCuentaFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleCuentaFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleCuentaFlujoCajaBean.TraerDetalleCuentaFlujoCajaBeans(detallecuentaflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(null);
					//this.generarExcelReporteDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleCuentaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,detallecuentaflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCuentaFlujoCaja> detallecuentaflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCuentaFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleCuentaFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleCuentaFlujoCaja detallecuentaflujocaja : detallecuentaflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleCuentaFlujoCajaConstantesFunciones.generarExcelReporteDataDetalleCuentaFlujoCaja("NORMAL",row,workbook,detallecuentaflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleCuentaFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		DetalleCuentaFlujoCajaConstantesFunciones.generarExcelReporteHeaderDetalleCuentaFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCuentaFlujoCaja> detallecuentaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCuentaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleCuentaFlujoCaja detallecuentaflujocaja : detallecuentaflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.getDetalleCuentaFlujoCajaDescripcion(detallecuentaflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecuentaflujocaja.gettipooperacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecuentaflujocaja.getcuentaflujocaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallecuentaflujocaja.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detallecuentaflujocaja.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleCuentaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleCuentaFlujoCaja> detallecuentaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleCuentaFlujoCaja> detallecuentaflujocajasRespaldo=null;
		
		classes=DetalleCuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfDetalleCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallecuentaflujocajaLogic.setDatosCliente(this.datosCliente);
		this.detallecuentaflujocajaLogic.setDatosDeep(this.datosDeep);
		this.detallecuentaflujocajaLogic.setIsConDeep(true);
		
		detallecuentaflujocajasRespaldo=this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas();
		
		this.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(detallecuentaflujocajasParaReportes);	
		this.detallecuentaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallecuentaflujocajasParaReportes=this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas();
		this.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(detallecuentaflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleCuentaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleCuentaFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleCuentaFlujoCaja detallecuentaflujocaja : detallecuentaflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleCuentaFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleCuentaFlujoCajaConstantesFunciones.generarExcelReporteDataDetalleCuentaFlujoCaja("NORMAL",row,workbook,detallecuentaflujocaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.getDetalleCuentaFlujoCajaDescripcion(detallecuentaflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleCuentaFlujoCaja() throws Exception {		
		this.startProcessDetalleCuentaFlujoCaja(true);
	}
	
	public void startProcessDetalleCuentaFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja ,this.jPanelParametrosReportesDetalleCuentaFlujoCaja, this.jScrollPanelDatosDetalleCuentaFlujoCaja,this.jPanelPaginacionDetalleCuentaFlujoCaja, this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja, this.jPanelAccionesDetalleCuentaFlujoCaja,this.jPanelAccionesFormularioDetalleCuentaFlujoCaja,this.jmenuBarDetalleCuentaFlujoCaja,this.jmenuBarDetalleDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleCuentaFlujoCaja=this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesDetalleCuentaFlujoCaja=this.jPanelParametrosReportesDetalleCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosDetalleCuentaFlujoCaja=this.jScrollPanelDatosDetalleCuentaFlujoCaja;
		final JTable jTableDatosDetalleCuentaFlujoCaja=this.jTableDatosDetalleCuentaFlujoCaja;		
		final JPanel jPanelPaginacionDetalleCuentaFlujoCaja=this.jPanelPaginacionDetalleCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionDetalleCuentaFlujoCaja=this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja;
		final JPanel jPanelAccionesDetalleCuentaFlujoCaja=this.jPanelAccionesDetalleCuentaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarDetalleCuentaFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			jPanelCamposAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelCamposDetalleCuentaFlujoCaja;
			jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelAccionesFormularioDetalleCuentaFlujoCaja;
		}
		
		final JPanel jPanelCamposDetalleCuentaFlujoCaja=jPanelCamposAuxiliarDetalleCuentaFlujoCaja;
		final JPanel jPanelAccionesFormularioDetalleCuentaFlujoCaja=jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja;
		
		
		final JMenuBar jmenuBarDetalleCuentaFlujoCaja=this.jmenuBarDetalleCuentaFlujoCaja;
		final JToolBar jTtoolBarDetalleCuentaFlujoCaja=this.jTtoolBarDetalleCuentaFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jmenuBarDetalleDetalleCuentaFlujoCaja;
			jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTtoolBarDetalleDetalleCuentaFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleDetalleCuentaFlujoCaja=jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja;
		final JToolBar jTtoolBarDetalleDetalleCuentaFlujoCaja=jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleCuentaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleCuentaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosDetalleCuentaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposDetalleCuentaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleCuentaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleCuentaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleCuentaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleCuentaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleCuentaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleCuentaFlujoCaja ,jPanelParametrosReportesDetalleCuentaFlujoCaja,jTableDatosDetalleCuentaFlujoCaja, /*jScrollPanelDatosDetalleCuentaFlujoCaja,*/jPanelCamposDetalleCuentaFlujoCaja,jPanelPaginacionDetalleCuentaFlujoCaja, /*jScrollPanelDatosEdicionDetalleCuentaFlujoCaja,*/ jPanelAccionesDetalleCuentaFlujoCaja,jPanelAccionesFormularioDetalleCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jmenuBarDetalleDetalleCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja,jTtoolBarDetalleDetalleCuentaFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleCuentaFlujoCaja ,jPanelParametrosReportesDetalleCuentaFlujoCaja, jScrollPanelDatosDetalleCuentaFlujoCaja,jPanelPaginacionDetalleCuentaFlujoCaja, jScrollPanelDatosEdicionDetalleCuentaFlujoCaja, jPanelAccionesDetalleCuentaFlujoCaja,jPanelAccionesFormularioDetalleCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jmenuBarDetalleDetalleCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja,jTtoolBarDetalleDetalleCuentaFlujoCaja);
						
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
	
	public void finishProcessDetalleCuentaFlujoCaja() {// throws Exception 
		this.finishProcessDetalleCuentaFlujoCaja(true);
	}
	
	public void finishProcessDetalleCuentaFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja ,this.jPanelParametrosReportesDetalleCuentaFlujoCaja, this.jScrollPanelDatosDetalleCuentaFlujoCaja,this.jPanelPaginacionDetalleCuentaFlujoCaja, this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja, this.jPanelAccionesDetalleCuentaFlujoCaja,this.jPanelAccionesFormularioDetalleCuentaFlujoCaja,this.jmenuBarDetalleCuentaFlujoCaja,this.jmenuBarDetalleDetalleCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleCuentaFlujoCaja=this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesDetalleCuentaFlujoCaja=this.jPanelParametrosReportesDetalleCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosDetalleCuentaFlujoCaja=this.jScrollPanelDatosDetalleCuentaFlujoCaja;
		final JTable jTableDatosDetalleCuentaFlujoCaja=this.jTableDatosDetalleCuentaFlujoCaja;		
		final JPanel jPanelPaginacionDetalleCuentaFlujoCaja=this.jPanelPaginacionDetalleCuentaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionDetalleCuentaFlujoCaja=this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja;
		final JPanel jPanelAccionesDetalleCuentaFlujoCaja=this.jPanelAccionesDetalleCuentaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarDetalleCuentaFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			jPanelCamposAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelCamposDetalleCuentaFlujoCaja;
			jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelAccionesFormularioDetalleCuentaFlujoCaja;
		}
		
		final JPanel jPanelCamposDetalleCuentaFlujoCaja=jPanelCamposAuxiliarDetalleCuentaFlujoCaja;
		final JPanel jPanelAccionesFormularioDetalleCuentaFlujoCaja=jPanelAccionesFormularioAuxiliarDetalleCuentaFlujoCaja;
		
		
		final JMenuBar jmenuBarDetalleCuentaFlujoCaja=this.jmenuBarDetalleCuentaFlujoCaja;		
		final JToolBar jTtoolBarDetalleCuentaFlujoCaja=this.jTtoolBarDetalleCuentaFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jmenuBarDetalleDetalleCuentaFlujoCaja;
			jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTtoolBarDetalleDetalleCuentaFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleCuentaFlujoCaja=jmenuBarDetalleAuxiliarDetalleCuentaFlujoCaja;
		final JToolBar jTtoolBarDetalleDetalleCuentaFlujoCaja=jTtoolBarDetalleAuxiliarDetalleCuentaFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleCuentaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleCuentaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosDetalleCuentaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposDetalleCuentaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleCuentaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleCuentaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleCuentaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleCuentaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarDetalleCuentaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleCuentaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleCuentaFlujoCaja ,jPanelParametrosReportesDetalleCuentaFlujoCaja, jTableDatosDetalleCuentaFlujoCaja,/*jScrollPanelDatosDetalleCuentaFlujoCaja,*/jPanelCamposDetalleCuentaFlujoCaja,jPanelPaginacionDetalleCuentaFlujoCaja, /*jScrollPanelDatosEdicionDetalleCuentaFlujoCaja,*/ jPanelAccionesDetalleCuentaFlujoCaja,jPanelAccionesFormularioDetalleCuentaFlujoCaja,jmenuBarDetalleCuentaFlujoCaja,jmenuBarDetalleDetalleCuentaFlujoCaja,jTtoolBarDetalleCuentaFlujoCaja,jTtoolBarDetalleDetalleCuentaFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleCuentaFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleCuentaFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleCuentaFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleCuentaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleCuentaFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallecuentaflujocajaConstantesFunciones.getsFinalQueryDetalleCuentaFlujoCaja();
		String  finalQueryPaginacionTodos=this.detallecuentaflujocajaConstantesFunciones.getsFinalQueryDetalleCuentaFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleCuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoDetalleCuentaFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleCuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesDetalleCuentaFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleCuentaFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallecuentaflujocajasEliminados= new ArrayList<DetalleCuentaFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleCuentaFlujoCaja();
		
				///*DetalleCuentaFlujoCajaSessionBean*/this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			
			if(this.detallecuentaflujocajaSessionBean==null) {
				this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=DetalleCuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleCuentaFlujoCajaConstantesFunciones.getClassesForeignKeysOfDetalleCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallecuentaflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallecuentaflujocajasAux= new ArrayList<DetalleCuentaFlujoCaja>();
			
				
			detallecuentaflujocajaLogic.setDatosCliente(this.datosCliente);
			detallecuentaflujocajaLogic.setDatosDeep(this.datosDeep);
			detallecuentaflujocajaLogic.setIsConDeep(true);
			
			
			detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallecuentaflujocajaLogic.getTodosDetalleCuentaFlujoCajas(finalQueryGlobal,pagination);
					
					//detallecuentaflujocajaLogic.getTodosDetalleCuentaFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()==null|| detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecuentaflujocajasAux= new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajasAux.addAll(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajasAux= new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajasAux.addAll(detallecuentaflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecuentaflujocajaLogic.getTodosDetalleCuentaFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//detallecuentaflujocajaLogic.getTodosDetalleCuentaFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());					
							detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(detallecuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajas.addAll(detallecuentaflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleCuentaFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleCuentaFlujoCaja=this.idActual;
				
				} else if(this.idDetalleCuentaFlujoCajaActual!=null && this.idDetalleCuentaFlujoCajaActual!=0L) {
					idDetalleCuentaFlujoCaja=idDetalleCuentaFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndicePorId(idDetalleCuentaFlujoCaja);
				
				this.detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallecuentaflujocajaLogic.getEntity(idDetalleCuentaFlujoCaja);
					
					//detallecuentaflujocajaLogic.getEntityWithConnection(idDetalleCuentaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().add(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
					this.detallecuentaflujocajas.add(detallecuentaflujocaja);
				}
				
				if(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()==null||detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallecuentaflujocajas==null|| detallecuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
						detallecuentaflujocajasAux.addAll(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajasAux.addAll(detallecuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdCuentaContable",detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdCuentaContable",detallecuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
						detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(detallecuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajas.addAll(detallecuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaFlujoCaja")) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaFlujoCaja(id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja(finalQueryGlobal,pagination,id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaFlujoCaja(id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaFlujoCaja(id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()==null||detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallecuentaflujocajas==null|| detallecuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
						detallecuentaflujocajasAux.addAll(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajasAux.addAll(detallecuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja(finalQueryGlobal,pagination,id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaFlujoCaja(id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaFlujoCaja(id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdCuentaFlujoCaja",detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdCuentaFlujoCaja",detallecuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
						detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(detallecuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajas.addAll(detallecuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoOperacion")) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoOperacion(id_tipo_operacionFK_IdTipoOperacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdTipoOperacion(finalQueryGlobal,pagination,id_tipo_operacionFK_IdTipoOperacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoOperacion(id_tipo_operacionFK_IdTipoOperacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoOperacion(id_tipo_operacionFK_IdTipoOperacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()==null||detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallecuentaflujocajas==null|| detallecuentaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
						detallecuentaflujocajasAux.addAll(detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajasAux=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajasAux.addAll(detallecuentaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdTipoOperacion(finalQueryGlobal,pagination,id_tipo_operacionFK_IdTipoOperacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoOperacion(id_tipo_operacionFK_IdTipoOperacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleCuentaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoOperacion(id_tipo_operacionFK_IdTipoOperacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdTipoOperacion",detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleCuentaFlujoCajas("FK_IdTipoOperacion",detallecuentaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(new ArrayList<DetalleCuentaFlujoCaja>());
						detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().addAll(detallecuentaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajas=new ArrayList<DetalleCuentaFlujoCaja>();
							detallecuentaflujocajas.addAll(detallecuentaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleCuentaFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleCuentaFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecuentaflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallecuentaflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleCuentaFlujoCaja detallecuentaflujocaja) {
		Boolean permite=true;
		
		if(this.detallecuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleCuentaFlujoCajaConstantesFunciones.getOrderByListaDetalleCuentaFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleCuentaFlujoCajaConstantesFunciones.getOrderByListaDetalleCuentaFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				if(detallecuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					detallecuentaflujocajaTotales=detallecuentaflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocaja:this.detallecuentaflujocajas) {
				if(detallecuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					detallecuentaflujocajaTotales=detallecuentaflujocaja;
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
			this.detallecuentaflujocajaAux=new DetalleCuentaFlujoCaja();
			this.detallecuentaflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.detallecuentaflujocajaAux.setIsNew(false);
			this.detallecuentaflujocajaAux.setIsChanged(false);
			this.detallecuentaflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleCuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaDetalleCuentaFlujoCaja(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this.detallecuentaflujocajaAux);
				
				this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().add(this.detallecuentaflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleCuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaDetalleCuentaFlujoCaja(this.detallecuentaflujocajas,this.detallecuentaflujocajaAux);
				
				this.detallecuentaflujocajas.add(this.detallecuentaflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallecuentaflujocajaTotales=new DetalleCuentaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().remove(detallecuentaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallecuentaflujocajas.remove(detallecuentaflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallecuentaflujocajaTotales=new DetalleCuentaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				if(detallecuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					detallecuentaflujocajaTotales=detallecuentaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleCuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaDetalleCuentaFlujoCaja(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),detallecuentaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleCuentaFlujoCaja detallecuentaflujocaja:this.detallecuentaflujocajas) {
				if(detallecuentaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					detallecuentaflujocajaTotales=detallecuentaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleCuentaFlujoCajaConstantesFunciones.TotalizarValoresFilaDetalleCuentaFlujoCaja(this.detallecuentaflujocajas,detallecuentaflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleCuentaFlujoCajasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaFlujoCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleCuentaFlujoCajasFK_IdTipoOperacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoOperacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleCuentaFlujoCajasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja(String sFinalQuery,Long id_cuenta_flujo_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja(sFinalQuery,this.pagination,id_cuenta_flujo_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleCuentaFlujoCajasFK_IdTipoOperacion(String sFinalQuery,Long id_tipo_operacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajasFK_IdTipoOperacion(sFinalQuery,this.pagination,id_tipo_operacion);
				
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
	
	public void inicializarPermisosDetalleCuentaFlujoCaja() {
		this.isPermisoTodoDetalleCuentaFlujoCaja=false;
		this.isPermisoNuevoDetalleCuentaFlujoCaja=false;
		this.isPermisoActualizarDetalleCuentaFlujoCaja=false;
		this.isPermisoActualizarOriginalDetalleCuentaFlujoCaja=false;
		this.isPermisoEliminarDetalleCuentaFlujoCaja=false;
		this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja=false;
		this.isPermisoConsultaDetalleCuentaFlujoCaja=false;
		this.isPermisoBusquedaDetalleCuentaFlujoCaja=false;
		this.isPermisoReporteDetalleCuentaFlujoCaja=false;		
		this.isPermisoOrdenDetalleCuentaFlujoCaja=false;		
		this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja=false;		
		this.isPermisoPaginacionAltoDetalleCuentaFlujoCaja=false;
		this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja=false;
		this.isPermisoCopiarDetalleCuentaFlujoCaja=false;		
		this.isPermisoVerFormDetalleCuentaFlujoCaja=false;		
		this.isPermisoDuplicarDetalleCuentaFlujoCaja=false;		
		this.isPermisoOrdenDetalleCuentaFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioDetalleCuentaFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoNuevoDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoEliminarDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoConsultaDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoBusquedaDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoReporteDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoOrdenDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoCopiarDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoVerFormDetalleCuentaFlujoCaja=isPermiso;		
		this.isPermisoDuplicarDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoOrdenDetalleCuentaFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleCuentaFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoNuevoDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoEliminarDetalleCuentaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja=isPermiso;
		//this.isPermisoConsultaDetalleCuentaFlujoCaja=isPermiso;
		//this.isPermisoBusquedaDetalleCuentaFlujoCaja=isPermiso;
		//this.isPermisoReporteDetalleCuentaFlujoCaja=isPermiso;
		//this.isPermisoOrdenDetalleCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleCuentaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja=isPermiso;		
		//this.isPermisoCopiarDetalleCuentaFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarDetalleCuentaFlujoCaja=isPermiso;
		//this.isPermisoOrdenDetalleCuentaFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleCuentaFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleCuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleCuentaFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleCuentaFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleCuentaFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleCuentaFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleCuentaFlujoCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleCuentaFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleCuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleCuentaFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleCuentaFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleCuentaFlujoCaja=this.isPermisoActualizarDetalleCuentaFlujoCaja;
			this.isPermisoEliminarDetalleCuentaFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleCuentaFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleCuentaFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleCuentaFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleCuentaFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleCuentaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleCuentaFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleCuentaFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleCuentaFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleCuentaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleCuentaFlujoCaja.setToolTipText(this.jTableDatosDetalleCuentaFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleCuentaFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleCuentaFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleCuentaFlujoCaja() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleCuentaFlujoCajaListas()throws Exception {
		try	{						
			
				this.tipooperacionsForeignKey=new ArrayList();
				this.cuentaflujocajasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleCuentaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleCuentaFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleCuentaFlujoCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyTipoOperacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoOperacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipooperacionsForeignKey==null||this.tipooperacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoOperacionConstantesFunciones.getArrayColumnasGlobalesTipoOperacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoOperacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoOperacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoOperacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaFlujoCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentaflujocajasForeignKey==null||this.cuentaflujocajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesCuentaFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaFlujoCajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaFlujoCajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaFlujoCajasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleCuentaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaReturnGeneral=new DetalleCuentaFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalTipoOperacion="";

				if(((this.tipooperacionsForeignKey==null||this.tipooperacionsForeignKey.size()<=0) && this.detallecuentaflujocajaConstantesFunciones.cargarid_tipo_operacionDetalleCuentaFlujoCaja)
					 || (this.esRecargarFks && this.detallecuentaflujocajaConstantesFunciones.cargarid_tipo_operacionDetalleCuentaFlujoCaja)) {

					if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoOperacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoOperacionConstantesFunciones.getArrayColumnasGlobalesTipoOperacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoOperacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoOperacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoOperacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoOperacion, "");
						finalQueryGlobalTipoOperacion+=TipoOperacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoOperacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoOperacion=" WHERE " + ConstantesSql.ID + "="+detallecuentaflujocajaSessionBean.getlidTipoOperacionActual();
					}
				} else {
					finalQueryGlobalTipoOperacion="NONE";
				}


				String finalQueryGlobalCuentaFlujoCaja="";

				if(((this.cuentaflujocajasForeignKey==null||this.cuentaflujocajasForeignKey.size()<=0) && this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja)
					 || (this.esRecargarFks && this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja)) {

					if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaFlujoCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CuentaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesCuentaFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaFlujoCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaFlujoCajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaFlujoCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaFlujoCaja, "");
						finalQueryGlobalCuentaFlujoCaja+=CuentaFlujoCajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaFlujoCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaFlujoCaja=" WHERE " + ConstantesSql.ID + "="+detallecuentaflujocajaSessionBean.getlidCuentaFlujoCajaActual();
					}
				} else {
					finalQueryGlobalCuentaFlujoCaja="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_contableDetalleCuentaFlujoCaja)
					 || (this.esRecargarFks && this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_contableDetalleCuentaFlujoCaja)) {

					if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+detallecuentaflujocajaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.cargarCombosLoteForeignKeyDetalleCuentaFlujoCaja(finalQueryGlobalTipoOperacion,finalQueryGlobalCuentaFlujoCaja,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalTipoOperacion.equals("NONE")) {
				this.tipooperacionsForeignKey=detallecuentaflujocajaReturnGeneral.gettipooperacionsForeignKey();
			}

			if(!finalQueryGlobalCuentaFlujoCaja.equals("NONE")) {
				this.cuentaflujocajasForeignKey=detallecuentaflujocajaReturnGeneral.getcuentaflujocajasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=detallecuentaflujocajaReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleCuentaFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoOperacion();
			this.addItemDefectoCombosForeignKeyCuentaFlujoCaja();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoOperacion()throws Exception {
		try {
			if(this.detallecuentaflujocajaSessionBean==null) {
				this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
			}

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoOperacion()) {
				TipoOperacion tipooperacion=new TipoOperacion();
				TipoOperacionConstantesFunciones.setTipoOperacionDescripcion(tipooperacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipooperacion.setId(null);

				if(!TipoOperacionConstantesFunciones.ExisteEnLista(this.tipooperacionsForeignKey,tipooperacion,true)) {

					this.tipooperacionsForeignKey.add(0,tipooperacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaFlujoCaja()throws Exception {
		try {

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaFlujoCaja()) {
				CuentaFlujoCaja cuentaflujocaja=new CuentaFlujoCaja();
				CuentaFlujoCajaConstantesFunciones.setCuentaFlujoCajaDescripcion(cuentaflujocaja,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentaflujocaja.setId(null);

				if(!CuentaFlujoCajaConstantesFunciones.ExisteEnLista(this.cuentaflujocajasForeignKey,cuentaflujocaja,true)) {

					this.cuentaflujocajasForeignKey.add(0,cuentaflujocaja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.detallecuentaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleCuentaFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleCuentaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleCuentaFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCuentaFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja)throws Exception {	
		try {
			
			this.setActualTipoOperacionForeignKey(detallecuentaflujocaja.getid_tipo_operacion(),false,"Formulario");
			this.setActualCuentaFlujoCajaForeignKey(detallecuentaflujocaja.getid_cuenta_flujo_caja(),false,"Formulario");
			this.setActualCuentaContableForeignKey(detallecuentaflujocaja.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleCuentaFlujoCaja()throws Exception {	
		try {
			
			this.setActualTipoOperacionForeignKey(this.detallecuentaflujocajaConstantesFunciones.getid_tipo_operacion(),false,"Formulario");
			this.setActualCuentaFlujoCajaForeignKey(this.detallecuentaflujocajaConstantesFunciones.getid_cuenta_flujo_caja(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.detallecuentaflujocajaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleCuentaFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleCuentaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleCuentaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleCuentaFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleCuentaFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameTipoOperacionsForeignKey("Todos");
			this.cargarCombosFrameCuentaFlujoCajasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleCuentaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoOperacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaFlujoCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleCuentaFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean(); 
		this.detallecuentaflujocajaConstantesFunciones=new DetalleCuentaFlujoCajaConstantesFunciones(); 
		this.detallecuentaflujocajaBean=new DetalleCuentaFlujoCaja();//(this.detallecuentaflujocajaConstantesFunciones); 		
		this.detallecuentaflujocajaReturnGeneral=new DetalleCuentaFlujoCajaParameterReturnGeneral(); 
		
		this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleCuentaFlujoCaja(true);
			
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
			
			this.detallecuentaflujocajaConstantesFunciones=new DetalleCuentaFlujoCajaConstantesFunciones(); 
			this.detallecuentaflujocajaBean=new DetalleCuentaFlujoCaja();//this.detallecuentaflujocajaConstantesFunciones); 			
			this.detallecuentaflujocajaReturnGeneral=new DetalleCuentaFlujoCajaParameterReturnGeneral(); 
		
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cuenta Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detallecuentaflujocaja=new DetalleCuentaFlujoCaja();
			this.detallecuentaflujocajas = new ArrayList<DetalleCuentaFlujoCaja>();
			this.detallecuentaflujocajasAux = new ArrayList<DetalleCuentaFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic=new DetalleCuentaFlujoCajaLogic();
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionDetalleCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleCuentaFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleCuentaFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja);
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja);
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleCuentaFlujoCaja);
					this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleCuentaFlujoCaja);
					this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleCuentaFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleCuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallecuentaflujocajaReturnGeneral=new DetalleCuentaFlujoCajaParameterReturnGeneral();
			
			this.detallecuentaflujocajaParameterGeneral=new DetalleCuentaFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallecuentaflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleCuentaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdCuentaFlujoCaja=true;
			this.isVisibilidadFK_IdTipoOperacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleCuentaFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleCuentaFlujoCaja(false);
			
			this.setPermisosUsuarioDetalleCuentaFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() && this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleCuentaFlujoCajaClasesRelacionadas();
			}
			
			if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleCuentaFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleCuentaFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleCuentaFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaDetalleCuentaFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja,this.isPermisoPaginacionMedioDetalleCuentaFlujoCaja,this.isPermisoPaginacionTodoDetalleCuentaFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleCuentaFlujoCajaConstantesFunciones.getTiposSeleccionarDetalleCuentaFlujoCaja());
				
				this.tiposColumnasSelect=DetalleCuentaFlujoCajaConstantesFunciones.getTiposSeleccionarDetalleCuentaFlujoCaja(true);
				
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
			//if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleCuentaFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleCuentaFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleCuentaFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCuentaFlujoCaja() ;
			
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
			
			this.tipooperacionLogic=new TipoOperacionLogic();
			this.cuentaflujocajaLogic=new CuentaFlujoCajaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detallecuentaflujocajaImplementable= (DetalleCuentaFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleCuentaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallecuentaflujocajaImplementableHome= (DetalleCuentaFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleCuentaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallecuentaflujocajas= new ArrayList<DetalleCuentaFlujoCaja>();
			this.detallecuentaflujocajasEliminados= new ArrayList<DetalleCuentaFlujoCaja>();
						
			this.isEsNuevoDetalleCuentaFlujoCaja=false;
			this.esParaAccionDesdeFormularioDetalleCuentaFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipooperacionsForeignKey=new ArrayList<TipoOperacion>() ;
			this.cuentaflujocajasForeignKey=new ArrayList<CuentaFlujoCaja>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleCuentaFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleCuentaFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleCuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleCuentaFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleCuentaFlujoCaja();
			}
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleCuentaFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleCuentaFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleCuentaFlujoCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleCuentaFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleCuentaFlujoCaja();	
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
	
	public void cargarCombosForeignKeyDetalleCuentaFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleCuentaFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleCuentaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleCuentaFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleCuentaFlujoCaja();
		
		this.cargarCombosFrameForeignKeyDetalleCuentaFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleCuentaFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleCuentaFlujoCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoOperacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoOperacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoOperacion();
				this.cargarCombosFrameTipoOperacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoOperacion(this.tipooperacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaFlujoCaja();
				this.cargarCombosFrameCuentaFlujoCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaFlujoCaja(this.cuentaflujocajasForeignKey);

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
	
	public void jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			
			if(jTableDatosDetalleCuentaFlujoCaja.getRowCount()>=1) {
				jTableDatosDetalleCuentaFlujoCaja.removeRowSelectionInterval(0, jTableDatosDetalleCuentaFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleCuentaFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleCuentaFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(true);			
			//this.detallecuentaflujocaja=new DetalleCuentaFlujoCaja();
			//this.detallecuentaflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja() ;
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCuentaFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallecuentaflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);				
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleCuentaFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRows().length;			
			}
			
			detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleCuentaFlujoCaja--;			
				//DetalleCuentaFlujoCaja detallecuentaflujocajaAux= new DetalleCuentaFlujoCaja();			
				//detallecuentaflujocajaAux.setId(this.iIdNuevoDetalleCuentaFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleCuentaFlujoCaja detallecuentaflujocajaOrigen=new DetalleCuentaFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaOrigen : detallecuentaflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallecuentaflujocajaOrigen =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallecuentaflujocajaOrigen =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleCuentaFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallecuentaflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleCuentaFlujoCaja(detallecuentaflujocajaOrigen,this.detallecuentaflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().add(this.detallecuentaflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocajas.add(this.detallecuentaflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
				
				this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoDetalleCuentaFlujoCaja(), this.getIndiceNuevoDetalleCuentaFlujoCaja());
				
				int iLastRow =  this.jTableDatosDetalleCuentaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleCuentaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();									
		
			DetalleCuentaFlujoCaja detallecuentaflujocajaOrigen=new DetalleCuentaFlujoCaja();
			DetalleCuentaFlujoCaja detallecuentaflujocajaDestino=new DetalleCuentaFlujoCaja();
				
			detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallecuentaflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaOrigen =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallecuentaflujocajaOrigen =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallecuentaflujocajaDestino =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallecuentaflujocajaDestino =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallecuentaflujocajaOrigen =detallecuentaflujocajasSeleccionados.get(0);
				detallecuentaflujocajaDestino =detallecuentaflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleCuentaFlujoCaja(detallecuentaflujocajaOrigen,detallecuentaflujocajaDestino,true,false);
				
				detallecuentaflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallecuentaflujocajaDestino,detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallecuentaflujocajaDestino,detallecuentaflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
				
				//this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoDetalleCuentaFlujoCaja(), this.getIndiceNuevoDetalleCuentaFlujoCaja());
				
				int iLastRow =  this.jTableDatosDetalleCuentaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleCuentaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleCuentaFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesDetalleCuentaFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleCuentaFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleCuentaFlujoCaja();
			
			this.abrirFrameOrderByDetalleCuentaFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleCuentaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleCuentaFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleCuentaFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSize(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jContentPaneDetalleDetalleCuentaFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jContentPaneDetalleDetalleCuentaFlujoCaja.getWidth(),DetalleCuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jContentPaneDetalleDetalleCuentaFlujoCaja.getWidth(),DetalleCuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jContentPaneDetalleDetalleCuentaFlujoCaja.getWidth(),DetalleCuentaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByDetalleCuentaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleCuentaFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleCuentaFlujoCaja);
				this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleCuentaFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleCuentaFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleCuentaFlujoCaja==null) {
				
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja=new ImportacionJInternalFrame(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleCuentaFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleCuentaFlujoCaja);
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleCuentaFlujoCaja"));
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleCuentaFlujoCaja"));
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleCuentaFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja=new ReporteDinamicoJInternalFrame(DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja);
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCuentaFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCuentaFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleCuentaFlujoCaja);
			
	       	this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleCuentaFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleCuentaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleCuentaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleCuentaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByDetalleCuentaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleCuentaFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleCuentaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderDetalleCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosDetalleCuentaFlujoCaja.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderDetalleCuentaFlujoCaja.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleCuentaFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleCuentaFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(true);
			//this.isEsNuevoDetalleCuentaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false) ;
			
			if(detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCuentaFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleCuentaFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleCuentaFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(true);
			//this.isEsNuevoDetalleCuentaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallecuentaflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false) ;
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleCuentaFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoOperacion(List<TipoOperacion> tipooperacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoOperacion=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION));
		TableCellEditor tableCellEditorTipoOperacion =tableColumnTipoOperacion.getCellEditor();

		TipoOperacionTableCell tipooperacionTableCellFk=(TipoOperacionTableCell)tableCellEditorTipoOperacion;

		if(tipooperacionTableCellFk!=null) {
			tipooperacionTableCellFk.settipooperacionsForeignKey(tipooperacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipooperacionTableCellFk.setRowActual(intSelectedRow);
			//tipooperacionTableCellFk.settipooperacionsForeignKeyActual(tipooperacionsForeignKey);
		//}


		if(tipooperacionTableCellFk!=null) {
			tipooperacionTableCellFk.RecargarTipoOperacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaFlujoCaja(List<CuentaFlujoCaja> cuentaflujocajasForeignKey)throws Exception{
		TableColumn tableColumnCuentaFlujoCaja=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA));
		TableCellEditor tableCellEditorCuentaFlujoCaja =tableColumnCuentaFlujoCaja.getCellEditor();

		CuentaFlujoCajaTableCell cuentaflujocajaTableCellFk=(CuentaFlujoCajaTableCell)tableCellEditorCuentaFlujoCaja;

		if(cuentaflujocajaTableCellFk!=null) {
			cuentaflujocajaTableCellFk.setcuentaflujocajasForeignKey(cuentaflujocajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentaflujocajaTableCellFk.setRowActual(intSelectedRow);
			//cuentaflujocajaTableCellFk.setcuentaflujocajasForeignKeyActual(cuentaflujocajasForeignKey);
		//}


		if(cuentaflujocajaTableCellFk!=null) {
			cuentaflujocajaTableCellFk.RecargarCuentaFlujoCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleCuentaFlujoCaja(false);
			
			//if(!this.isEsNuevoDetalleCuentaFlujoCaja) {								
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.detallecuentaflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleCuentaFlujoCaja=true;
					this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
					this.isEsNuevoDetalleCuentaFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleCuentaFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleCuentaFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(false);
			
												
				
				if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleCuentaFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,detallecuentaflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallecuentaflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.detallecuentaflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.detallecuentaflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallecuentaflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleCuentaFlujoCajaModel) this.jTableDatosDetalleCuentaFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleCuentaFlujoCaja=true;
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
				this.isEsNuevoDetalleCuentaFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(false);
				
				
				
				if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleCuentaFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleCuentaFlujoCaja.getRowCount()>=1) {
				jTableDatosDetalleCuentaFlujoCaja.removeRowSelectionInterval(0, jTableDatosDetalleCuentaFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleCuentaFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(false) ;
			
			this.isEsNuevoDetalleCuentaFlujoCaja=false;
			
			if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleCuentaFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				
				//SI ES MANUAL
				if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleCuentaFlujoCaja--;			
			//DetalleCuentaFlujoCaja detallecuentaflujocajaAux= new DetalleCuentaFlujoCaja();			
			//detallecuentaflujocajaAux.setId(this.iIdNuevoDetalleCuentaFlujoCaja);
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleCuentaFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
			
			this.detallecuentaflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().add(this.detallecuentaflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallecuentaflujocajas.add(this.detallecuentaflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			
			this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoDetalleCuentaFlujoCaja(), this.getIndiceNuevoDetalleCuentaFlujoCaja());
			
			int iLastRow =  this.jTableDatosDetalleCuentaFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleCuentaFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleCuentaFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();
			}
			
			//this.abrirFrameTreeDetalleCuentaFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Cuenta Flujo CajaS ?", "MANTENIMIENTO DE Detalle Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleCuentaFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.procesarImportacionDetalleCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallecuentaflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleCuentaFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setFileImportacion(this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleCuentaFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		

		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleCuentaFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleCuentaFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoOperacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoOperacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoOperacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoOperacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaFlujoCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaFlujoCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaFlujoCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaFlujoCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION:
					sNombreCampoCategoria="id_tipo_operacion";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA:
					sNombreCampoCategoria="id_cuenta_flujo_caja";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION:
					sNombreCampoCategoriaValor="id_tipo_operacion";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA:
					sNombreCampoCategoriaValor="id_cuenta_flujo_caja";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Operacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_operacion");
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Flujo Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_flujo_caja");
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleCuentaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION);
					iRow++;

					for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecuentaflujocaja.gettipooperacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA);
					iRow++;

					for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecuentaflujocaja.getcuentaflujocaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecuentaflujocaja.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(DetalleCuentaFlujoCaja detallecuentaflujocaja:detallecuentaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallecuentaflujocaja.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelDetalleCuentaFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleCuentaFlujoCaja(detallecuentaflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
			
			//SI ES MANUAL
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleCuentaFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleCuentaFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleCuentaFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleCuentaFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleCuentaFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleCuentaFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleCuentaFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleCuentaFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleCuentaFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleCuentaFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleCuentaFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleCuentaFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCuentaFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleCuentaFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleCuentaFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleCuentaFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCuentaFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCuentaFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCuentaFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleCuentaFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleCuentaFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleCuentaFlujoCaja() throws Exception {
		try	{
			if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleCuentaFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleCuentaFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleCuentaFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleCuentaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCuentaFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleCuentaFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleCuentaFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableDetalleCuentaFlujoCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.getSelectedItem()!=null){this.id_cuenta_flujo_cajaFK_IdCuentaFlujoCaja=((CuentaFlujoCaja)this.jComboBoxid_cuenta_flujo_cajaFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.getSelectedItem()!=null){this.id_tipo_operacionFK_IdTipoOperacion=((TipoOperacion)this.jComboBoxid_tipo_operacionFK_IdTipoOperacionDetalleCuentaFlujoCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleCuentaFlujoCaja(Boolean esInicializar) throws Exception {				
		if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleCuentaFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleCuentaFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleCuentaFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleCuentaFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallecuentaflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleCuentaFlujoCaja.setModel(new DetalleCuentaFlujoCajaModel(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleCuentaFlujoCaja.setModel(new DetalleCuentaFlujoCajaModel(this.detallecuentaflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja!=null && this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleCuentaFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,detallecuentaflujocajaConstantesFunciones.resaltarSeleccionarDetalleCuentaFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,detallecuentaflujocajaConstantesFunciones.resaltarSeleccionarDetalleCuentaFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.detallecuentaflujocajaConstantesFunciones.mostraridDetalleCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallecuentaflujocajaConstantesFunciones.resaltaridDetalleCuentaFlujoCaja,this.detallecuentaflujocajaConstantesFunciones.activaridDetalleCuentaFlujoCaja,this,true,"idDetalleCuentaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallecuentaflujocajaConstantesFunciones.resaltaridDetalleCuentaFlujoCaja,this.detallecuentaflujocajaConstantesFunciones.activaridDetalleCuentaFlujoCaja,this,true,"idDetalleCuentaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION));

		if(this.detallecuentaflujocajaConstantesFunciones.mostrarid_tipo_operacionDetalleCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoOperacionTableCell(this.tipooperacionsForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_tipo_operacionDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_tipo_operacionDetalleCuentaFlujoCaja));
			tableColumn.setCellEditor(new TipoOperacionTableCell(this.tipooperacionsForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_tipo_operacionDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_tipo_operacionDetalleCuentaFlujoCaja,true,"id_tipo_operacionDetalleCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA));

		if(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaFlujoCajaTableCell(this.cuentaflujocajasForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja));
			tableColumn.setCellEditor(new CuentaFlujoCajaTableCell(this.cuentaflujocajasForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,true,"id_cuenta_flujo_cajaDetalleCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableDetalleCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_contableDetalleCuentaFlujoCaja));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableDetalleCuentaFlujoCaja,this,this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_contableDetalleCuentaFlujoCaja,true,"id_cuenta_contableDetalleCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.detallecuentaflujocajaConstantesFunciones.mostraresta_activoDetalleCuentaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detallecuentaflujocajaConstantesFunciones.resaltaresta_activoDetalleCuentaFlujoCaja,this.detallecuentaflujocajaConstantesFunciones.activaresta_activoDetalleCuentaFlujoCaja));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detallecuentaflujocajaConstantesFunciones.resaltaresta_activoDetalleCuentaFlujoCaja,this.detallecuentaflujocajaConstantesFunciones.activaresta_activoDetalleCuentaFlujoCaja,this,true,"esta_activoDetalleCuentaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleCuentaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleCuentaFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleCuentaFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleCuentaFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleCuentaFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleCuentaFlujoCaja.moveColumn(this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleCuentaFlujoCaja.moveColumn(this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleCuentaFlujoCaja.moveColumn(this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleCuentaFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleCuentaFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleCuentaFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleCuentaFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleCuentaFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleCuentaFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallecuentaflujocajas.size()-1;
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
		//this.jTableDatosDetalleCuentaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleCuentaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleCuentaFlujoCaja();
			
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
				
				//this.isEsNuevoDetalleCuentaFlujoCaja=false;
					
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
				if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleCuentaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallecuentaflujocaja.getsType().equals("DUPLICADO")
				   || this.detallecuentaflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleCuentaFlujoCaja=true;
				
				} else {
					this.isEsNuevoDetalleCuentaFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.detallecuentaflujocaja.getId()>=0 && !this.detallecuentaflujocaja.getIsNew()) {						
						this.isEsNuevoDetalleCuentaFlujoCaja=false;
						
					} else {
						this.isEsNuevoDetalleCuentaFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleCuentaFlujoCaja(esRelaciones);						
				
				this.seleccionarDetalleCuentaFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallecuentaflujocaja.getId()<0) {
					this.isEsNuevoDetalleCuentaFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleCuentaFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleCuentaFlujoCaja(evt,rowIndex);
				}	
				
				if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleCuentaFlujoCaja: " + this.dDif); 
					}
				}								
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleCuentaFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallecuentaflujocaja)) {
					if(this.detallecuentaflujocaja.getId()>0) {
						this.detallecuentaflujocaja.setIsDeleted(true);
						
						this.detallecuentaflujocajasEliminados.add(this.detallecuentaflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().remove(this.detallecuentaflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocajas.remove(this.detallecuentaflujocaja);				
					}
					
					
					((DetalleCuentaFlujoCajaModel) this.jTableDatosDetalleCuentaFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleCuentaFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleCuentaFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleCuentaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoOperacion
					if(!this.detallecuentaflujocajaConstantesFunciones.cargarid_tipo_operacionDetalleCuentaFlujoCaja || this.detallecuentaflujocajaConstantesFunciones.event_dependid_tipo_operacionDetalleCuentaFlujoCaja) {
						//this.cargarCombosTipoOperacionsForeignKeyLista(" where id="+this.detallecuentaflujocaja.getid_tipo_operacion());
									//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
						this.tipooperacionsForeignKey=new ArrayList<TipoOperacion>();

						if(detallecuentaflujocaja.getTipoOperacion()!=null) {
							this.tipooperacionsForeignKey.add(detallecuentaflujocaja.getTipoOperacion());
						}

						this.addItemDefectoCombosForeignKeyTipoOperacion();
						this.cargarCombosFrameTipoOperacionsForeignKey("Todos");
					}
					this.setActualTipoOperacionForeignKey(this.detallecuentaflujocaja.getid_tipo_operacion(),false,"Formulario");

					//CuentaFlujoCaja
					if(!this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja || this.detallecuentaflujocajaConstantesFunciones.event_dependid_cuenta_flujo_cajaDetalleCuentaFlujoCaja) {
						//this.cargarCombosCuentaFlujoCajasForeignKeyLista(" where id="+this.detallecuentaflujocaja.getid_cuenta_flujo_caja());
									//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
						this.cuentaflujocajasForeignKey=new ArrayList<CuentaFlujoCaja>();

						if(detallecuentaflujocaja.getCuentaFlujoCaja()!=null) {
							this.cuentaflujocajasForeignKey.add(detallecuentaflujocaja.getCuentaFlujoCaja());
						}

						this.addItemDefectoCombosForeignKeyCuentaFlujoCaja();
						this.cargarCombosFrameCuentaFlujoCajasForeignKey("Todos");
					}
					this.setActualCuentaFlujoCajaForeignKey(this.detallecuentaflujocaja.getid_cuenta_flujo_caja(),false,"Formulario");

					//CuentaContable
					if(!this.detallecuentaflujocajaConstantesFunciones.cargarid_cuenta_contableDetalleCuentaFlujoCaja || this.detallecuentaflujocajaConstantesFunciones.event_dependid_cuenta_contableDetalleCuentaFlujoCaja) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.detallecuentaflujocaja.getid_cuenta_contable());
									//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(detallecuentaflujocaja.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(detallecuentaflujocaja.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.detallecuentaflujocaja.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleCuentaFlujoCaja(detallecuentaflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(detallecuentaflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleCuentaFlujoCaja(detallecuentaflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleCuentaFlujoCaja(detallecuentaflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setText(detallecuentaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setSelected(detallecuentaflujocaja.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleCuentaFlujoCaja detallecuentaflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallecuentaflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleCuentaFlujoCaja detallecuentaflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallecuentaflujocajaLocal=this.detallecuentaflujocaja;
			} else {
				detallecuentaflujocajaLocal=this.detallecuentaflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallecuentaflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleCuentaFlujoCaja(detallecuentaflujocajaLocal,true);
					
					if(detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallecuentaflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallecuentaflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(detallecuentaflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(detallecuentaflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(detallecuentaflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.getText()==null || this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setText("0");
			}

			if(conColumnasBase) {detallecuentaflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelIdDetalleCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallecuentaflujocaja.setesta_activo(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelesta_activoDetalleCuentaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocajaBean,DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detallecuentaflujocajaBean.getid_tipo_operacion()!=null && !detallecuentaflujocajaBean.getid_tipo_operacion().equals(-1L))) {detallecuentaflujocaja.setid_tipo_operacion(detallecuentaflujocajaBean.getid_tipo_operacion());}
			if(conDefault || (!conDefault && detallecuentaflujocajaBean.getid_cuenta_flujo_caja()!=null && !detallecuentaflujocajaBean.getid_cuenta_flujo_caja().equals(-1L))) {detallecuentaflujocaja.setid_cuenta_flujo_caja(detallecuentaflujocajaBean.getid_cuenta_flujo_caja());}
			if(conDefault || (!conDefault && detallecuentaflujocajaBean.getid_cuenta_contable()!=null && !detallecuentaflujocajaBean.getid_cuenta_contable().equals(-1L))) {detallecuentaflujocaja.setid_cuenta_contable(detallecuentaflujocajaBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocajaOrigen,DetalleCuentaFlujoCaja detallecuentaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallecuentaflujocajaOrigen.getId()!=null && !detallecuentaflujocajaOrigen.getId().equals(0L))) {detallecuentaflujocaja.setId(detallecuentaflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && detallecuentaflujocajaOrigen.getid_tipo_operacion()!=null && !detallecuentaflujocajaOrigen.getid_tipo_operacion().equals(-1L))) {detallecuentaflujocaja.setid_tipo_operacion(detallecuentaflujocajaOrigen.getid_tipo_operacion());}
			if(conDefault || (!conDefault && detallecuentaflujocajaOrigen.getid_cuenta_flujo_caja()!=null && !detallecuentaflujocajaOrigen.getid_cuenta_flujo_caja().equals(-1L))) {detallecuentaflujocaja.setid_cuenta_flujo_caja(detallecuentaflujocajaOrigen.getid_cuenta_flujo_caja());}
			if(conDefault || (!conDefault && detallecuentaflujocajaOrigen.getid_cuenta_contable()!=null && !detallecuentaflujocajaOrigen.getid_cuenta_contable().equals(-1L))) {detallecuentaflujocaja.setid_cuenta_contable(detallecuentaflujocajaOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && detallecuentaflujocajaOrigen.getesta_activo()!=null && !detallecuentaflujocajaOrigen.getesta_activo().equals(false))) {detallecuentaflujocaja.setesta_activo(detallecuentaflujocajaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setText(detallecuentaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setSelected(detallecuentaflujocaja.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleCuentaFlujoCaja(DetalleCuentaFlujoCajaBean detallecuentaflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setText(detallecuentaflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setSelected(detallecuentaflujocajaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleCuentaFlujoCaja(DetalleCuentaFlujoCajaParameterReturnGeneral detallecuentaflujocajaReturnGeneral,DetalleCuentaFlujoCajaBean detallecuentaflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			DetalleCuentaFlujoCaja detallecuentaflujocajaLocal=new DetalleCuentaFlujoCaja();
			
			detallecuentaflujocajaLocal=detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallecuentaflujocajaLocal.getId()!=null && !detallecuentaflujocajaLocal.getId().equals(0L))) {detallecuentaflujocajaBean.setId(detallecuentaflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && detallecuentaflujocajaLocal.getid_tipo_operacion()!=null && !detallecuentaflujocajaLocal.getid_tipo_operacion().equals(-1L))) {detallecuentaflujocajaBean.setid_tipo_operacion(detallecuentaflujocajaLocal.getid_tipo_operacion());}
			if(conDefault || (!conDefault && detallecuentaflujocajaLocal.getid_cuenta_flujo_caja()!=null && !detallecuentaflujocajaLocal.getid_cuenta_flujo_caja().equals(-1L))) {detallecuentaflujocajaBean.setid_cuenta_flujo_caja(detallecuentaflujocajaLocal.getid_cuenta_flujo_caja());}
			if(conDefault || (!conDefault && detallecuentaflujocajaLocal.getid_cuenta_contable()!=null && !detallecuentaflujocajaLocal.getid_cuenta_contable().equals(-1L))) {detallecuentaflujocajaBean.setid_cuenta_contable(detallecuentaflujocajaLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && detallecuentaflujocajaLocal.getesta_activo()!=null && !detallecuentaflujocajaLocal.getesta_activo().equals(false))) {detallecuentaflujocajaBean.setesta_activo(detallecuentaflujocajaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleCuentaFlujoCajaGenerico(Long idDetalleCuentaFlujoCajaSeleccionado,JComboBox jComboBoxDetalleCuentaFlujoCaja,List<DetalleCuentaFlujoCaja> detallecuentaflujocajasLocal)throws Exception {
		try {
			DetalleCuentaFlujoCaja  detallecuentaflujocajaTemp=null;

			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasLocal) {
				if(detallecuentaflujocajaAux.getId()!=null && detallecuentaflujocajaAux.getId().equals(idDetalleCuentaFlujoCajaSeleccionado)) {
					detallecuentaflujocajaTemp=detallecuentaflujocajaAux;
					break;
				}
			}

			jComboBoxDetalleCuentaFlujoCaja.setSelectedItem(detallecuentaflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleCuentaFlujoCajaGenerico(JComboBox jComboBoxDetalleCuentaFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleCuentaFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleCuentaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleCuentaFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleCuentaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecuentaflujocaja=(DetalleCuentaFlujoCaja) detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallecuentaflujocaja =(DetalleCuentaFlujoCaja) detallecuentaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoOperacion")) {
			//sDescripcion=this.getActualTipoOperacionForeignKeyDescripcion((Long)value);
			if(!detallecuentaflujocaja.getIsNew() && !detallecuentaflujocaja.getIsChanged() && !detallecuentaflujocaja.getIsDeleted()) {
				sDescripcion=detallecuentaflujocaja.gettipooperacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoOperacionForeignKeyDescripcion((Long)value);
				sDescripcion=detallecuentaflujocaja.gettipooperacion_descripcion();
			}
		}

		if(sTipo.equals("CuentaFlujoCaja")) {
			//sDescripcion=this.getActualCuentaFlujoCajaForeignKeyDescripcion((Long)value);
			if(!detallecuentaflujocaja.getIsNew() && !detallecuentaflujocaja.getIsChanged() && !detallecuentaflujocaja.getIsDeleted()) {
				sDescripcion=detallecuentaflujocaja.getcuentaflujocaja_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaFlujoCajaForeignKeyDescripcion((Long)value);
				sDescripcion=detallecuentaflujocaja.getcuentaflujocaja_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!detallecuentaflujocaja.getIsNew() && !detallecuentaflujocaja.getIsChanged() && !detallecuentaflujocaja.getIsDeleted()) {
				sDescripcion=detallecuentaflujocaja.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=detallecuentaflujocaja.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleCuentaFlujoCaja detallecuentaflujocajaRow=new DetalleCuentaFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecuentaflujocajaRow=(DetalleCuentaFlujoCaja) detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallecuentaflujocajaRow=(DetalleCuentaFlujoCaja) detallecuentaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));			
			this.jButtonDuplicarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja && this.isPermisoDuplicarDetalleCuentaFlujoCaja));			
			this.jButtonCopiarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja && this.isPermisoCopiarDetalleCuentaFlujoCaja));
			this.jButtonVerFormDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja && this.isPermisoVerFormDetalleCuentaFlujoCaja));
			
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));			
			
			this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja && this.isPermisoEliminarDetalleCuentaFlujoCaja));
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja);							
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));						
			this.jButtonDuplicarToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja && this.isPermisoDuplicarDetalleCuentaFlujoCaja));						
			this.jButtonCopiarToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja && this.isPermisoCopiarDetalleCuentaFlujoCaja));			
			this.jButtonVerFormToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja && this.isPermisoVerFormDetalleCuentaFlujoCaja));			
			this.jButtonAbrirOrderByToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));
			this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja  && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja && this.isPermisoEliminarDetalleCuentaFlujoCaja));
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarToolBarDetalleCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja);				
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));			
			this.jMenuItemDuplicarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja && this.isPermisoDuplicarDetalleCuentaFlujoCaja));			
			this.jMenuItemCopiarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja && this.isPermisoCopiarDetalleCuentaFlujoCaja));			
			this.jMenuItemVerFormDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja && this.isPermisoVerFormDetalleCuentaFlujoCaja));			
			this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));			
			//this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja && this.isPermisoOrdenDetalleCuentaFlujoCaja));			
			this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja && this.isPermisoNuevoDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemModificarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemActualizarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja && this.isPermisoActualizarDetalleCuentaFlujoCaja));	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemEliminarDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja && this.isPermisoEliminarDetalleCuentaFlujoCaja));
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemCancelarDetalleCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=this.jButtonNuevoDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja=this.jButtonDuplicarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja=this.jButtonCopiarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja=this.jButtonVerFormDetalleCuentaFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleCuentaFlujoCaja=this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=this.jButtonModificarDetalleCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=this.jButtonNuevoToolBarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarToolBarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarToolBarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarToolBarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarToolBarDetalleCuentaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=this.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=this.jMenuItemNuevoDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemModificarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemActualizarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemEliminarDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemCancelarDetalleCuentaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleCuentaFlujoCaja(Boolean esInicializar) {
		if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleCuentaFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleCuentaFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleCuentaFlujoCaja() {
		this.jButtonNuevoDetalleCuentaFlujoCaja.setVisible(this.isPermisoNuevoDetalleCuentaFlujoCaja);			
		this.jButtonDuplicarDetalleCuentaFlujoCaja.setVisible(this.isPermisoDuplicarDetalleCuentaFlujoCaja);			
		this.jButtonCopiarDetalleCuentaFlujoCaja.setVisible(this.isPermisoCopiarDetalleCuentaFlujoCaja);			
		this.jButtonVerFormDetalleCuentaFlujoCaja.setVisible(this.isPermisoVerFormDetalleCuentaFlujoCaja);			
		
		this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.setVisible(this.isPermisoOrdenDetalleCuentaFlujoCaja);					
		
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.setVisible(this.isPermisoNuevoDetalleCuentaFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarDetalleCuentaFlujoCaja.setVisible(this.isPermisoActualizarDetalleCuentaFlujoCaja);	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.setVisible(this.isPermisoActualizarDetalleCuentaFlujoCaja);	
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.setVisible(this.isPermisoEliminarDetalleCuentaFlujoCaja);
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja);						
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.setVisible(this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setVisible(this.isPermisoActualizarDetalleCuentaFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleCuentaFlujoCaja() {
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarDetalleCuentaFlujoCaja.setVisible(this.isPermisoActualizarDetalleCuentaFlujoCaja);	
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.setVisible(this.isPermisoActualizarDetalleCuentaFlujoCaja);	
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.setVisible(this.isPermisoEliminarDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja);							
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja && this.isPermisoGuardarCambiosDetalleCuentaFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleCuentaFlujoCaja() {
		if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleCuentaFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleCuentaFlujoCaja() {
	}
	
	public void jTableDatosDetalleCuentaFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleCuentaFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecuentaflujocaja==null) {
						this.detallecuentaflujocaja = new DetalleCuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}

				if(this.detallecuentaflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallecuentaflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipooperacion=true;

			idTienePermisotipooperacion=this.tienePermisosUsuarioEnPaginaWebDetalleCuentaFlujoCaja(TipoOperacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipooperacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);

				this.tipooperacionBeanSwingJInternalFrame=new TipoOperacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipooperacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipooperacionBeanSwingJInternalFrame.getTipoOperacionLogic().setConnexion(this.detallecuentaflujocajaLogic.getConnexion());

				if(this.detallecuentaflujocaja.getid_tipo_operacion()!=null) {
					this.tipooperacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipooperacionBeanSwingJInternalFrame.setIdActual(this.detallecuentaflujocaja.getid_tipo_operacion());
					this.tipooperacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipooperacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipooperacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoOperacion();
				}

				JInternalFrameBase jinternalFrame =this.tipooperacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosDetalleCuentaFlujoCaja.getBorder();
				TitledBorder titledBordertipooperacion=(TitledBorder)this.tipooperacionBeanSwingJInternalFrame.jScrollPanelDatosTipoOperacion.getBorder();

				titledBordertipooperacion.setTitle(titledBorderDetalleCuentaFlujoCaja.getTitle() + " -> Tipo Operacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecuentaflujocaja==null) {
						this.detallecuentaflujocaja = new DetalleCuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}

				if(this.detallecuentaflujocaja.getid_tipo_operacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_operacion = "+this.detallecuentaflujocaja.getid_tipo_operacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentaflujocaja=true;

			idTienePermisocuentaflujocaja=this.tienePermisosUsuarioEnPaginaWebDetalleCuentaFlujoCaja(CuentaFlujoCajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentaflujocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);

				this.cuentaflujocajaBeanSwingJInternalFrame=new CuentaFlujoCajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentaflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentaflujocajaBeanSwingJInternalFrame.getCuentaFlujoCajaLogic().setConnexion(this.detallecuentaflujocajaLogic.getConnexion());

				if(this.detallecuentaflujocaja.getid_cuenta_flujo_caja()!=null) {
					this.cuentaflujocajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentaflujocajaBeanSwingJInternalFrame.setIdActual(this.detallecuentaflujocaja.getid_cuenta_flujo_caja());
					this.cuentaflujocajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentaflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaFlujoCaja();
				}

				JInternalFrameBase jinternalFrame =this.cuentaflujocajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosDetalleCuentaFlujoCaja.getBorder();
				TitledBorder titledBordercuentaflujocaja=(TitledBorder)this.cuentaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosCuentaFlujoCaja.getBorder();

				titledBordercuentaflujocaja.setTitle(titledBorderDetalleCuentaFlujoCaja.getTitle() + " -> Cuenta Flujo Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecuentaflujocaja==null) {
						this.detallecuentaflujocaja = new DetalleCuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}

				if(this.detallecuentaflujocaja.getid_cuenta_flujo_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_flujo_caja = "+this.detallecuentaflujocaja.getid_cuenta_flujo_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebDetalleCuentaFlujoCaja(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleCuentaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleCuentaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.detallecuentaflujocajaLogic.getConnexion());

				if(this.detallecuentaflujocaja.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.detallecuentaflujocaja.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleCuentaFlujoCaja=(TitledBorder)this.jScrollPanelDatosDetalleCuentaFlujoCaja.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderDetalleCuentaFlujoCaja.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecuentaflujocaja==null) {
						this.detallecuentaflujocaja = new DetalleCuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}

				if(this.detallecuentaflujocaja.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.detallecuentaflujocaja.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoDetalleCuentaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.getdetallecuentaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallecuentaflujocaja==null) {
						this.detallecuentaflujocaja = new DetalleCuentaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);
				}

				if(this.detallecuentaflujocaja.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.detallecuentaflujocaja.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);

			this.getDetalleCuentaFlujoCajasFK_IdCuentaContable();

			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);

			//if(DetalleCuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);

			this.getDetalleCuentaFlujoCajasFK_IdCuentaFlujoCaja();

			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);

			//if(DetalleCuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoOperacionDetalleCuentaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);

			this.getDetalleCuentaFlujoCajasFK_IdTipoOperacion();

			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);

			//if(DetalleCuentaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallecuentaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleCuentaFlujoCaja() {
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.dispose();
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionDetalleCuentaFlujoCaja!=null) {
			this.jInternalFrameImportacionDetalleCuentaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleCuentaFlujoCaja.dispose();
			this.jInternalFrameImportacionDetalleCuentaFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleCuentaFlujoCaja();
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleCuentaFlujoCaja")) {
				jButtonDuplicarDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleCuentaFlujoCaja")) {
				jButtonCopiarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleCuentaFlujoCaja")) {
				jButtonVerFormDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleCuentaFlujoCaja")) {
				jButtonDuplicarDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleCuentaFlujoCaja")) {
				jButtonDuplicarDetalleCuentaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleCuentaFlujoCaja")) {
				jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleCuentaFlujoCaja")) {
				jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleCuentaFlujoCaja")) {
				jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleCuentaFlujoCaja")) {
				jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleCuentaFlujoCaja")) {
				jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleCuentaFlujoCaja")) {
				jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleCuentaFlujoCaja")) {
				jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleCuentaFlujoCaja")) {
				jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleCuentaFlujoCaja")) {
				jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleCuentaFlujoCaja")) {
				jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleCuentaFlujoCaja")) {
				jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleCuentaFlujoCaja")) {
				jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleCuentaFlujoCaja")) {
				jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleCuentaFlujoCaja")) {
				jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleCuentaFlujoCaja")) {
				jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleCuentaFlujoCaja")) {
				jButtonMostrarOcultarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleCuentaFlujoCaja")) {
				jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleCuentaFlujoCaja")) {
				jButtonCopiarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleCuentaFlujoCaja")) {
				jButtonVerFormDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleCuentaFlujoCaja")) {
				jButtonCopiarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleCuentaFlujoCaja")) {
				jButtonVerFormDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleCuentaFlujoCaja")) {
				jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleCuentaFlujoCaja")) {
				jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleCuentaFlujoCaja")) {
				jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleCuentaFlujoCaja")) {
				jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleCuentaFlujoCaja")) {
				jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleCuentaFlujoCaja")) {
				jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleCuentaFlujoCaja")) {
				jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleCuentaFlujoCaja")) {
				jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleCuentaFlujoCaja")) {
				jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleCuentaFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja")) {
				jButtonAbrirOrderByDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleCuentaFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleCuentaFlujoCaja")) {
				jButtonMostrarOcultarDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleCuentaFlujoCaja")) {
				jButtonCerrarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleCuentaFlujoCaja")) {
				jButtonGenerarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleCuentaFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleCuentaFlujoCaja")) {
				jButtonCerrarImportacionDetalleCuentaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleCuentaFlujoCaja")) {
				
				jButtonGenerarImportacionDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleCuentaFlujoCaja")) {
				
				jButtonAbrirImportacionDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleCuentaFlujoCaja")) {
				jComboBoxTiposAccionesDetalleCuentaFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleCuentaFlujoCaja")) {
				jComboBoxTiposRelacionesDetalleCuentaFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleCuentaFlujoCaja")) {
				jComboBoxTiposAccionesDetalleCuentaFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleCuentaFlujoCaja")) {
				
				jComboBoxTiposSeleccionarDetalleCuentaFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleCuentaFlujoCaja")) {
				jTextFieldValorCampoGeneralDetalleCuentaFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleCuentaFlujoCaja")) {
				jButtonAbrirOrderByDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleCuentaFlujoCaja")) {
				jButtonAbrirOrderByDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleCuentaFlujoCaja")) {
				jButtonCerrarOrderByDetalleCuentaFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonidDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_operacionDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_operacionDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonesta_activoDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableDetalleCuentaFlujoCaja")) {
				this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja")) {
				this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoOperacionDetalleCuentaFlujoCaja")) {
				this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleCuentaFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleCuentaFlujoCaja detallecuentaflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallecuentaflujocajaLocal=this.detallecuentaflujocaja;
			} else {
				detallecuentaflujocajaLocal=this.detallecuentaflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
							
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
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
			
			


			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
								
						
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
								
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
							
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
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
			
			


			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
								
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleCuentaFlujoCaja")) {
					jCheckBoxSeleccionarTodosDetalleCuentaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleCuentaFlujoCaja")) {
					jCheckBoxSeleccionadosDetalleCuentaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleCuentaFlujoCaja")) {
					
				}
				
				


				
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
												
				
				


				
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
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
			
			


			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallecuentaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallecuentaflujocaja);
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
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
				
				


				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleCuentaFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleCuentaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleCuentaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallecuentaflujocajaAnterior =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleCuentaFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleCuentaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallecuentaflujocaja =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallecuentaflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleCuentaFlujoCaja")) {
				
				}
				
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleCuentaFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleCuentaFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleCuentaFlujoCaja")) {
			
			}
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleCuentaFlujoCaja();
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleCuentaFlujoCaja")) {
				jButtonDuplicarDetalleCuentaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleCuentaFlujoCaja")) {
				jButtonCopiarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleCuentaFlujoCaja")) {
				jButtonVerFormDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleCuentaFlujoCaja")) {
				jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleCuentaFlujoCaja")) {
				jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleCuentaFlujoCaja")) {
				jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleCuentaFlujoCaja")) {
				jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleCuentaFlujoCaja")) {
				jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleCuentaFlujoCaja")) {
				jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleCuentaFlujoCaja")) {
				jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleCuentaFlujoCaja")) {
				jButtonAbrirOrderByDetalleCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleCuentaFlujoCaja")) {
				jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleCuentaFlujoCaja")) {
				jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleCuentaFlujoCaja")) {
				jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonidDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_operacionDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_operacionDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleCuentaFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoDetalleCuentaFlujoCajaBusqueda")) {
				this.jButtonesta_activoDetalleCuentaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleCuentaFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleCuentaFlujoCaja")) {
				closingInternalFrameDetalleCuentaFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarDetalleCuentaFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleCuentaFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleCuentaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(DetalleCuentaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleCuentaFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(null);
			}
			
			DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallecuentaflujocaja,new Object(),this.detallecuentaflujocajaParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleCuentaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleCuentaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleCuentaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallecuentaflujocaja)) {
			if(!esControlTabla) {
				if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);			
				}
				
				if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.procesarEventosDetalleCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this.detallecuentaflujocaja,this.detallecuentaflujocajaParameterGeneral,this.isEsNuevoDetalleCuentaFlujoCaja,classes);//this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral,this.detallecuentaflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleCuentaFlujoCaja(classes,this.detallecuentaflujocajaReturnGeneral,this.detallecuentaflujocajaBean,false);
					}
						
					if(this.detallecuentaflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja());	
					}
						
					if(this.detallecuentaflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja(),classes);//this.detallecuentaflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,classes);//this.detallecuentaflujocajaBean);									
				}
			
				if(DetalleCuentaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleCuentaFlujoCaja(this.detallecuentaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleCuentaFlujoCaja(this.detallecuentaflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallecuentaflujocajaAnterior!=null) {
						this.detallecuentaflujocaja=this.detallecuentaflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.procesarEventosDetalleCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this.detallecuentaflujocaja,this.detallecuentaflujocajaParameterGeneral,this.isEsNuevoDetalleCuentaFlujoCaja,classes);//this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja(),detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja(),this.detallecuentaflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleCuentaFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleCuentaFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleCuentaFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleCuentaFlujoCaja() throws Exception {
		
		DetalleCuentaFlujoCajaModel detallecuentaflujocajaModel=(DetalleCuentaFlujoCajaModel)this.jTableDatosDetalleCuentaFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallecuentaflujocajaModel.detallecuentaflujocajas=this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallecuentaflujocajaModel.detallecuentaflujocajas=this.detallecuentaflujocajas;
		}
		
		
		((DetalleCuentaFlujoCajaModel) this.jTableDatosDetalleCuentaFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleCuentaFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallecuentaflujocajaAnterior(),this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallecuentaflujocajaAnterior(),this.detallecuentaflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleCuentaFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecuentaflujocaja,new Object(),generalEntityParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleCuentaFlujoCajaConstantesFunciones.getClassesRelationshipsOfDetalleCuentaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleCuentaFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleCuentaFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleCuentaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallecuentaflujocaja,new Object(),generalEntityParameterGeneral,this.detallecuentaflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleCuentaFlujoCaja(DetalleCuentaFlujoCajaBean detallecuentaflujocajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleCuentaFlujoCaja(ArrayList<Classe> classes,DetalleCuentaFlujoCajaReturnGeneral detallecuentaflujocajaReturnGeneral,DetalleCuentaFlujoCajaBean detallecuentaflujocajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallecuentaflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja = new DetalleCuentaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones(),this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.detallecuentaflujocajaLogic=this.detallecuentaflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyDetalleCuentaFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleCuentaFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleCuentaFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleCuentaFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleCuentaFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleCuentaFlujoCaja"));
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarDetalleCuentaFlujoCaja"));

		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleCuentaFlujoCaja"));
					
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemModificarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarDetalleCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleCuentaFlujoCaja"));
						
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemActualizarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarDetalleCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleCuentaFlujoCaja"));
								
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemEliminarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarDetalleCuentaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleCuentaFlujoCaja"));
					
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemCancelarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleCuentaFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleCuentaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCuentaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCuentaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleCuentaFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonidDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleCuentaFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleCuentaFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleCuentaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleCuentaFlujoCaja"));
		}
		
		this.jTableDatosDetalleCuentaFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleCuentaFlujoCaja"));
		
		this.jTableDatosDetalleCuentaFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleCuentaFlujoCaja"));
		
		this.jButtonNuevoDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoDetalleCuentaFlujoCaja"));
		
		this.jButtonDuplicarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarDetalleCuentaFlujoCaja"));
		
		this.jButtonCopiarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarDetalleCuentaFlujoCaja"));
		
		this.jButtonVerFormDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormDetalleCuentaFlujoCaja"));
		
		
		this.jButtonNuevoToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleCuentaFlujoCaja"));
			
		this.jButtonDuplicarToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemNuevoDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleCuentaFlujoCaja"));
			
		this.jMenuItemDuplicarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleCuentaFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleCuentaFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleCuentaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarDetalleCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonModificarToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleCuentaFlujoCaja"));
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemModificarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarDetalleCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonActualizarToolBarDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleCuentaFlujoCaja"));
				
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemActualizarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarDetalleCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonEliminarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleCuentaFlujoCaja"));
						
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemEliminarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarDetalleCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonCancelarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleCuentaFlujoCaja"));
			
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemCancelarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleCuentaFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleCuentaFlujoCaja"));		
		
		
		this.jButtonCerrarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarDetalleCuentaFlujoCaja"));
		
		
		this.jButtonCerrarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemCerrarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleCuentaFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleCuentaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleCuentaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleCuentaFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleCuentaFlujoCaja"));
			
		this.jButtonVerFormToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleCuentaFlujoCaja"));
		
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleCuentaFlujoCaja"));
			
		this.jMenuItemCopiarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleCuentaFlujoCaja"));		
		
		this.jMenuItemVerFormDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleCuentaFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleCuentaFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleCuentaFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleCuentaFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleCuentaFlujoCaja"));
		
		this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleCuentaFlujoCaja"));		
		
		
		
		this.jButtonAnterioresDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresDetalleCuentaFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleCuentaFlujoCaja"));
		
		this.jMenuItemAnterioresDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleCuentaFlujoCaja"));		
		
		
		this.jButtonSiguientesDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesDetalleCuentaFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemSiguientesDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleCuentaFlujoCaja"));
			
		this.jMenuItemAbrirOrderByDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleCuentaFlujoCaja"));
			
		this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleCuentaFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleCuentaFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleCuentaFlujoCaja"));

		this.jCheckBoxSeleccionadosDetalleCuentaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleCuentaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleCuentaFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleCuentaFlujoCaja"));
			
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleCuentaFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleCuentaFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleCuentaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonidDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleCuentaFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDetalleCuentaFlujoCaja"));

			this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja"));

			this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoOperacionDetalleCuentaFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCuentaFlujoCaja"));
				this.jInternalFrameReporteDinamicoDetalleCuentaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCuentaFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleCuentaFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleCuentaFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleCuentaFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleCuentaFlujoCaja"));
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleCuentaFlujoCaja"));
				this.jInternalFrameImportacionDetalleCuentaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleCuentaFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleCuentaFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarDetalleCuentaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleCuentaFlujoCaja"));			
			
			if(this.jInternalFrameOrderByDetalleCuentaFlujoCaja!=null) {
				this.jInternalFrameOrderByDetalleCuentaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleCuentaFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleCuentaFlujoCaja"));
		
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
            		closingInternalFrameDetalleCuentaFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleCuentaFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            DetalleCuentaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(DetalleCuentaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleCuentaFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleCuentaFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleCuentaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleCuentaFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleCuentaFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleCuentaFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonModificarDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonActualizarDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonEliminarDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCancelarDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCerrarDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleCuentaFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonGuardarCambiosDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleCuentaFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleCuentaFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleCuentaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonidDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_operacionDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableDetalleCuentaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoDetalleCuentaFlujoCajaBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDetalleCuentaFlujoCaja"));

		this.jButtonFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja"));

		this.jButtonFK_IdTipoOperacionDetalleCuentaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoOperacionDetalleCuentaFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleCuentaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleCuentaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleCuentaFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleCuentaFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
					detallecuentaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajas) {
					detallecuentaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleCuentaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
						detallecuentaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajas) {
						detallecuentaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
					
						if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							detallecuentaflujocajaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajas) {
						
						if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							detallecuentaflujocajaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleCuentaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleCuentaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleCuentaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleCuentaFlujoCaja.getSelectedRows();
			
			DetalleCuentaFlujoCaja detallecuentaflujocajaLocal=new DetalleCuentaFlujoCaja();
			
			//this.seleccionarTodosDetalleCuentaFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallecuentaflujocajaLocal =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas().toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallecuentaflujocajaLocal =(DetalleCuentaFlujoCaja) this.detallecuentaflujocajas.toArray()[this.jTableDatosDetalleCuentaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallecuentaflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
						detallecuentaflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajas) {
						detallecuentaflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleCuentaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleCuentaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleCuentaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleCuentaFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleCuentaFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleCuentaFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleCuentaFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleCuentaFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleCuentaFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleCuentaFlujoCaja(conSplash);
				
					this.generarReporteDetalleCuentaFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleCuentaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleCuentaFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleCuentaFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleCuentaFlujoCaja();
				
				this.exportarDetalleCuentaFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleCuentaFlujoCajas();
				//this.importarDetalleCuentaFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleCuentaFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleCuentaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleCuentaFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleCuentaFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleCuentaFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleCuentaFlujoCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleCuentaFlujoCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleCuentaFlujoCaja(conSplash);
					
						//this.actualizarParametrosGeneralDetalleCuentaFlujoCaja();
						
						this.generarReporteProcesoAccionDetalleCuentaFlujoCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Cuenta Flujo CajaS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Cuenta Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleCuentaFlujoCaja();
				
						this.actualizarParametrosGeneralDetalleCuentaFlujoCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallecuentaflujocajaReturnGeneral=detallecuentaflujocajaLogic.procesarAccionDetalleCuentaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas(),this.detallecuentaflujocajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleCuentaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleCuentaFlujoCaja();
					
					DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleCuentaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleCuentaFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleCuentaFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleCuentaFlujoCaja();
			
			if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
			DetalleCuentaFlujoCaja detallecuentaflujocaja=new DetalleCuentaFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja.getSelectedItem();
			
			
			
			
			detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallecuentaflujocajasSeleccionados.size()==1) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
					detallecuentaflujocaja=detallecuentaflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleCuentaFlujoCaja();
			
      		//this.finishProcessDetalleCuentaFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleCuentaFlujoCajaReturnGeneral() throws Exception {
		if(this.detallecuentaflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallecuentaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallecuentaflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallecuentaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallecuentaflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallecuentaflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
		}
		
		if(this.detallecuentaflujocajaReturnGeneral.getConRetornoLista() || this.detallecuentaflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.detallecuentaflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCajas(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallecuentaflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallecuentaflujocajaLogic.setDetalleCuentaFlujoCaja(this.detallecuentaflujocajaReturnGeneral.getDetalleCuentaFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleCuentaFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleCuentaFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<DetalleCuentaFlujoCaja> getDetalleCuentaFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleCuentaFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas()) {
					if(detallecuentaflujocajaAux.getIsSelected()) {
						detallecuentaflujocajasSeleccionados.add(detallecuentaflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:this.detallecuentaflujocajas) {
					if(detallecuentaflujocajaAux.getIsSelected()) {
						detallecuentaflujocajasSeleccionados.add(detallecuentaflujocajaAux);				
					}
				}
			}
			
			if(detallecuentaflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallecuentaflujocajasSeleccionados.addAll(this.detallecuentaflujocajaLogic.getDetalleCuentaFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallecuentaflujocajasSeleccionados.addAll(this.detallecuentaflujocajas);				
					}
				}
			}
		} else {
			detallecuentaflujocajasSeleccionados.add(this.detallecuentaflujocaja);
		}
		
		return detallecuentaflujocajasSeleccionados;
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
	
	public void generarReporteDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleCuentaFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleCuentaFlujoCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Cuenta Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleCuentaFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleCuentaFlujoCaja();
		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleCuentaFlujoCaja();
		
		
		//this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados ,detallecuentaflujocajaImplementable,detallecuentaflujocajaImplementableHome);
	}
	
	public void mostrarImportacionDetalleCuentaFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleCuentaFlujoCaja();
		
		this.abrirFrameImportacionDetalleCuentaFlujoCaja();		
		
			
		//this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados ,detallecuentaflujocajaImplementable,detallecuentaflujocajaImplementableHome);
	}
	
	public void importarDetalleCuentaFlujoCajas() throws Exception {		
	
	}
	
	public void exportarDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleCuentaFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleCuentaFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleCuentaFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Cuenta Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleCuentaFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleCuentaFlujoCaja(detallecuentaflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallecuentaflujocajaAux.setsDetalleGeneralEntityReporte(detallecuentaflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleCuentaFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallecuentaflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecuentaflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecuentaflujocaja.gettipooperacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecuentaflujocaja.getcuentaflujocaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecuentaflujocaja.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallecuentaflujocaja.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleCuentaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleCuentaFlujoCaja(row);				
				iRow++;
			}				
			
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleCuentaFlujoCaja(detallecuentaflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleCuentaFlujoCajasSeleccionados() throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();		
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallecuentaflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallecuentaflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallecuentaflujocaja");
			//elementRoot.appendChild(element);
		
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
				element = document.createElement("detallecuentaflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleCuentaFlujoCaja(detallecuentaflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cuenta Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleCuentaFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallecuentaflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecuentaflujocaja.gettipooperacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecuentaflujocaja.getcuentaflujocaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecuentaflujocaja.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallecuentaflujocaja.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlDetalleCuentaFlujoCaja(DetalleCuentaFlujoCaja detallecuentaflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallecuentaflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallecuentaflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipooperacion_descripcion = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.IDTIPOOPERACION);
		elementtipooperacion_descripcion.appendChild(document.createTextNode(detallecuentaflujocaja.gettipooperacion_descripcion()));
		element.appendChild(elementtipooperacion_descripcion);

		Element elementcuentaflujocaja_descripcion = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.IDCUENTAFLUJOCAJA);
		elementcuentaflujocaja_descripcion.appendChild(document.createTextNode(detallecuentaflujocaja.getcuentaflujocaja_descripcion()));
		element.appendChild(elementcuentaflujocaja_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(detallecuentaflujocaja.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementesta_activo = document.createElement(DetalleCuentaFlujoCajaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(detallecuentaflujocaja.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoDetalleCuentaFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados=new ArrayList<DetalleCuentaFlujoCaja>();
		
		detallecuentaflujocajasSeleccionados=this.getDetalleCuentaFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleCuentaFlujoCaja(detallecuentaflujocajasSeleccionados);
		
		this.generarReporteDetalleCuentaFlujoCajas("Todos",detallecuentaflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleCuentaFlujoCaja(ArrayList<DetalleCuentaFlujoCaja> detallecuentaflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleCuentaFlujoCaja detallecuentaflujocajaAux:detallecuentaflujocajasSeleccionados) {
				detallecuentaflujocajaAux.setsDetalleGeneralEntityReporte(detallecuentaflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION)) {
					existe=true;
					detallecuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(detallecuentaflujocajaAux.gettipooperacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA)) {
					existe=true;
					detallecuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(detallecuentaflujocajaAux.getcuentaflujocaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					detallecuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(detallecuentaflujocajaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					detallecuentaflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detallecuentaflujocajaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleCuentaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaModificarDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarDetalleCuentaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleCuentaFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsDetalleCuentaFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleCuentaFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarDetalleCuentaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleCuentaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;												
			}
			
			this.jButtonCerrarDetalleCuentaFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleCuentaFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.detallecuentaflujocaja)) {
			this.isVisibilidadCeldaActualizarDetalleCuentaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarDetalleCuentaFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleCuentaFlujoCaja() {
	}
	
	public void actualizarEstadoPanelsDetalleCuentaFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleCuentaFlujoCaja!=null) {
				this.jScrollPanelDatosDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleCuentaFlujoCaja!=null) {
				this.jPanelPaginacionDetalleCuentaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
					this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleCuentaFlujoCaja!=null) {
				this.jPanelParametrosReportesDetalleCuentaFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoOperacion(Boolean isParaTipoOperacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoOperacionNegation=!isParaTipoOperacion;

			this.isVisibilidadFK_IdCuentaContable=isParaTipoOperacionNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaFlujoCaja=isParaTipoOperacionNegation;
			if(!this.isVisibilidadFK_IdCuentaFlujoCaja) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdTipoOperacion=isParaTipoOperacion;
			if(!this.isVisibilidadFK_IdTipoOperacion) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaFlujoCaja(Boolean isParaCuentaFlujoCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaFlujoCajaNegation=!isParaCuentaFlujoCaja;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaFlujoCajaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaFlujoCaja=isParaCuentaFlujoCaja;
			if(!this.isVisibilidadFK_IdCuentaFlujoCaja) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdTipoOperacion=isParaCuentaFlujoCajaNegation;
			if(!this.isVisibilidadFK_IdTipoOperacion) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdCuentaFlujoCaja=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCuentaFlujoCaja) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);}

			this.isVisibilidadFK_IdTipoOperacion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoOperacion) {this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		
		if(this.detallecuentaflujocajaSessionBean==null) {
			this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		}
		
		this.detallecuentaflujocajaSessionBean.setsUltimaBusquedaDetalleCuentaFlujoCaja(this.getsAccionBusqueda());
		this.detallecuentaflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallecuentaflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			detallecuentaflujocajaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaFlujoCaja")) {
			detallecuentaflujocajaSessionBean.setid_cuenta_flujo_caja(this.getid_cuenta_flujo_cajaFK_IdCuentaFlujoCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoOperacion")) {
			detallecuentaflujocajaSessionBean.setid_tipo_operacion(this.getid_tipo_operacionFK_IdTipoOperacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		
		if(this.detallecuentaflujocajaSessionBean==null) {
			this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		}
		
		if(this.detallecuentaflujocajaSessionBean.getsUltimaBusquedaDetalleCuentaFlujoCaja()!=null&&!this.detallecuentaflujocajaSessionBean.getsUltimaBusquedaDetalleCuentaFlujoCaja().equals("")) {
			this.setsAccionBusqueda(detallecuentaflujocajaSessionBean.getsUltimaBusquedaDetalleCuentaFlujoCaja());
			this.setiNumeroPaginacion(detallecuentaflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallecuentaflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(detallecuentaflujocajaSessionBean.getid_cuenta_contable());
				detallecuentaflujocajaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaFlujoCaja")) {
				this.setid_cuenta_flujo_cajaFK_IdCuentaFlujoCaja(detallecuentaflujocajaSessionBean.getid_cuenta_flujo_caja());
				detallecuentaflujocajaSessionBean.setid_cuenta_flujo_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoOperacion")) {
				this.setid_tipo_operacionFK_IdTipoOperacion(detallecuentaflujocajaSessionBean.getid_tipo_operacion());
				detallecuentaflujocajaSessionBean.setid_tipo_operacion(-1L);
			}
		}
		
		this.detallecuentaflujocajaSessionBean.setsUltimaBusquedaDetalleCuentaFlujoCaja("");
		this.detallecuentaflujocajaSessionBean.setiNumeroPaginacion(DetalleCuentaFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.detallecuentaflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleCuentaFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioDetalleCuentaFlujoCaja();
		this.updateVisibilidadBusquedasFormularioDetalleCuentaFlujoCaja();
		this.updateHabilitarBusquedasFormularioDetalleCuentaFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleCuentaFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponents().length>0) {
	

		if(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableDetalleCuentaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableDetalleCuentaFlujoCaja);
			}
		}

		if(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			}
		}

		if(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdTipoOperacionDetalleCuentaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleCuentaFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaContableDetalleCuentaFlujoCaja);
			if(!this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaContableDetalleCuentaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			if(!this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			if(!this.detallecuentaflujocajaConstantesFunciones.mostrarFK_IdTipoOperacionDetalleCuentaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleCuentaFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarFK_IdCuentaContableDetalleCuentaFlujoCaja);
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setEnabledAt(index,this.detallecuentaflujocajaConstantesFunciones.activarFK_IdCuentaContableDetalleCuentaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setEnabledAt(index,this.detallecuentaflujocajaConstantesFunciones.activarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarFK_IdTipoOperacionDetalleCuentaFlujoCaja);
				this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setEnabledAt(index,this.detallecuentaflujocajaConstantesFunciones.activarFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleCuentaFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContableDetalleCuentaFlujoCaja);

			this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);

			this.detallecuentaflujocajaConstantesFunciones.setResaltarFK_IdCuentaContableDetalleCuentaFlujoCaja(resaltar);

			jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaContableDetalleCuentaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaFlujoCaja")) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);

			this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);

			this.detallecuentaflujocajaConstantesFunciones.setResaltarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja(resaltar);

			jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdCuentaFlujoCajaDetalleCuentaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoOperacion")) {
			index= this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoOperacionDetalleCuentaFlujoCaja);

			this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleCuentaFlujoCaja.getComponent(index);

			this.detallecuentaflujocajaConstantesFunciones.setResaltarFK_IdTipoOperacionDetalleCuentaFlujoCaja(resaltar);

			jPanel.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarFK_IdTipoOperacionDetalleCuentaFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleCuentaFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleCuentaFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleCuentaFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioDetalleCuentaFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioDetalleCuentaFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleCuentaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallecuentaflujocajaConstantesFunciones.resaltaridDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltaridDetalleCuentaFlujoCaja);}
		if(this.detallecuentaflujocajaConstantesFunciones.resaltarid_tipo_operacionDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarid_tipo_operacionDetalleCuentaFlujoCaja);}
		if(this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja);}
		if(this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltarid_cuenta_contableDetalleCuentaFlujoCaja);}
		if(this.detallecuentaflujocajaConstantesFunciones.resaltaresta_activoDetalleCuentaFlujoCaja!=null && this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setBorder(this.detallecuentaflujocajaConstantesFunciones.resaltaresta_activoDetalleCuentaFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleCuentaFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostraridDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelidDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostraridDetalleCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_tipo_operacionDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_tipo_operacionDetalleCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostrarid_cuenta_contableDetalleCuentaFlujoCaja);
		//this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostraresta_activoDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jPanelesta_activoDetalleCuentaFlujoCaja.setVisible(this.detallecuentaflujocajaConstantesFunciones.mostraresta_activoDetalleCuentaFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleCuentaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jLabelidDetalleCuentaFlujoCaja.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activaridDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarid_tipo_operacionDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_flujo_cajaDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activarid_cuenta_contableDetalleCuentaFlujoCaja);
		this.jInternalFrameDetalleFormDetalleCuentaFlujoCaja.jCheckBoxesta_activoDetalleCuentaFlujoCaja.setEnabled(this.detallecuentaflujocajaConstantesFunciones.activaresta_activoDetalleCuentaFlujoCaja);
		}
	}
	
		
}