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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TablaAmortiDetalleConstantesFunciones;
import com.bydan.erp.facturacion.util.TablaAmortiDetalleParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TablaAmortiDetalleParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TablaAmortiDetalleBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class TablaAmortiDetalleBeanSwingJInternalFrame extends TablaAmortiDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TablaAmortiDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TablaAmortiDetalle> tablaamortidetalleValidator = new ClassValidator<TablaAmortiDetalle>(TablaAmortiDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TablaAmortiDetalle tablaamortidetalle;	
	public TablaAmortiDetalle tablaamortidetalleAux;
	public TablaAmortiDetalle tablaamortidetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TablaAmortiDetalle tablaamortidetalleTotales;
	public Long idTablaAmortiDetalleActual;
	public Long iIdNuevoTablaAmortiDetalle=0L;
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

	public String sFinalQueryComboTasa="";

	public List<Tasa> tasasForeignKey;

	public List<Tasa> gettasasForeignKey() {
		return tasasForeignKey;
	}

	public void settasasForeignKey(List<Tasa> tasasForeignKey) {
		this.tasasForeignKey = tasasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Tasa tasaForeignKey;

	public Tasa gettasaForeignKey() {
		return tasaForeignKey;
	}

	public void settasaForeignKey(Tasa tasaForeignKey) {
		this.tasaForeignKey = tasaForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

	public String sFinalQueryComboTipoIntervalo="";

	public List<TipoIntervalo> tipointervalosForeignKey;

	public List<TipoIntervalo> gettipointervalosForeignKey() {
		return tipointervalosForeignKey;
	}

	public void settipointervalosForeignKey(List<TipoIntervalo> tipointervalosForeignKey) {
		this.tipointervalosForeignKey = tipointervalosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIntervalo tipointervaloForeignKey;

	public TipoIntervalo gettipointervaloForeignKey() {
		return tipointervaloForeignKey;
	}

	public void settipointervaloForeignKey(TipoIntervalo tipointervaloForeignKey) {
		this.tipointervaloForeignKey = tipointervaloForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoTablaAmortiDetalle;
	public Boolean isPermisoNuevoTablaAmortiDetalle;
	public Boolean isPermisoActualizarTablaAmortiDetalle;
	public Boolean isPermisoActualizarOriginalTablaAmortiDetalle;
	public Boolean isPermisoEliminarTablaAmortiDetalle;
	public Boolean isPermisoGuardarCambiosTablaAmortiDetalle;
	public Boolean isPermisoConsultaTablaAmortiDetalle;
	public Boolean isPermisoBusquedaTablaAmortiDetalle;
	public Boolean isPermisoReporteTablaAmortiDetalle;
	public Boolean isPermisoPaginacionMedioTablaAmortiDetalle;
	public Boolean isPermisoPaginacionAltoTablaAmortiDetalle;
	public Boolean isPermisoPaginacionTodoTablaAmortiDetalle;
	public Boolean isPermisoCopiarTablaAmortiDetalle;
	public Boolean isPermisoVerFormTablaAmortiDetalle;
	public Boolean isPermisoDuplicarTablaAmortiDetalle;
	public Boolean isPermisoOrdenTablaAmortiDetalle;
	
	
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
	
	public TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleReturnGeneral;
	public TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTablaAmortiDetalle=false;
	public Boolean esParaAccionDesdeFormularioTablaAmortiDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TablaAmortiDetalleSessionBeanAdditional tablaamortidetalleSessionBeanAdditional=null;
	
	public TablaAmortiDetalleSessionBeanAdditional getTablaAmortiDetalleSessionBeanAdditional() {
		return this.tablaamortidetalleSessionBeanAdditional;
	}
	
	public void setTablaAmortiDetalleSessionBeanAdditional(TablaAmortiDetalleSessionBeanAdditional tablaamortidetalleSessionBeanAdditional) {
		try {
			this.tablaamortidetalleSessionBeanAdditional=tablaamortidetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TablaAmortiDetalleBeanSwingJInternalFrameAdditional tablaamortidetalleBeanSwingJInternalFrameAdditional=null;
	//public class TablaAmortiDetalleBeanSwingJInternalFrame
	
	public TablaAmortiDetalleBeanSwingJInternalFrameAdditional getTablaAmortiDetalleBeanSwingJInternalFrameAdditional() {
		return this.tablaamortidetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setTablaAmortiDetalleBeanSwingJInternalFrameAdditional(TablaAmortiDetalleBeanSwingJInternalFrameAdditional tablaamortidetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.tablaamortidetalleBeanSwingJInternalFrameAdditional=tablaamortidetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TablaAmortiDetalleLogic tablaamortidetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TablaAmortiDetalle tablaamortidetalleBean;
	public TablaAmortiDetalleConstantesFunciones tablaamortidetalleConstantesFunciones;
	//public TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TasaLogic tasaLogic;
	public FacturaLogic facturaLogic;
	public TipoIntervaloLogic tipointervaloLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<TablaAmortiDetalle> tablaamortidetalles;	
	//public List<TablaAmortiDetalle> tablaamortidetallesEliminados;
	//public List<TablaAmortiDetalle> tablaamortidetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarTablaAmortiDetalle=true;
	public Boolean isVisibilidadCeldaCopiarTablaAmortiDetalle=true;
	public Boolean isVisibilidadCeldaVerFormTablaAmortiDetalle=true;
	public Boolean isVisibilidadCeldaOrdenTablaAmortiDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaModificarTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaCancelarTablaAmortiDetalle=false;
	public Boolean isVisibilidadCeldaGuardarTablaAmortiDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTasa=false;
	public Boolean isVisibilidadFK_IdTipoIntervalo=false;
	
	public Long getiIdNuevoTablaAmortiDetalle() {
		return this.iIdNuevoTablaAmortiDetalle;
	}

	public void setiIdNuevoTablaAmortiDetalle(Long iIdNuevoTablaAmortiDetalle) {
		this.iIdNuevoTablaAmortiDetalle = iIdNuevoTablaAmortiDetalle;
	}
	
	public Long getidTablaAmortiDetalleActual() {
		return this.idTablaAmortiDetalleActual;
	}

	public void setidTablaAmortiDetalleActual(Long idTablaAmortiDetalleActual) {
		this.idTablaAmortiDetalleActual = idTablaAmortiDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TablaAmortiDetalle gettablaamortidetalle() {
		return this.tablaamortidetalle;
	}

	public void settablaamortidetalle(TablaAmortiDetalle tablaamortidetalle) {
		this.tablaamortidetalle = tablaamortidetalle;
	}
	
	public TablaAmortiDetalle gettablaamortidetalleAux() {
		return this.tablaamortidetalleAux;
	}

	public void settablaamortidetalleAux(TablaAmortiDetalle tablaamortidetalleAux) {
		this.tablaamortidetalleAux = tablaamortidetalleAux;
	}				
	
	public TablaAmortiDetalle gettablaamortidetalleAnterior() {
		return this.tablaamortidetalleAnterior;
	}

	public void settablaamortidetalleAnterior(TablaAmortiDetalle tablaamortidetalleAnterior) {
		this.tablaamortidetalleAnterior = tablaamortidetalleAnterior;
	}	
	
	public TablaAmortiDetalle gettablaamortidetalleTotales() {
		return this.tablaamortidetalleTotales;
	}

	public void settablaamortidetalleTotales(TablaAmortiDetalle tablaamortidetalleTotales) {
		this.tablaamortidetalleTotales = tablaamortidetalleTotales;
	}	
	
	public TablaAmortiDetalle gettablaamortidetalleBean() {
		return this.tablaamortidetalleBean;
	}

	public void settablaamortidetalleBean(TablaAmortiDetalle tablaamortidetalleBean) {
		this.tablaamortidetalleBean = tablaamortidetalleBean;
	}	
	
	public TablaAmortiDetalleParameterReturnGeneral gettablaamortidetalleReturnGeneral() {
		return this.tablaamortidetalleReturnGeneral;
	}

	public void settablaamortidetalleReturnGeneral(TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleReturnGeneral) {
		this.tablaamortidetalleReturnGeneral = tablaamortidetalleReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tasaFK_IdTasa=-1L;

	public Long getid_tasaFK_IdTasa() {
		return this.id_tasaFK_IdTasa;
	}

	public void setid_tasaFK_IdTasa(Long id_tasaFK_IdTasa) {
		this.id_tasaFK_IdTasa = id_tasaFK_IdTasa;
	}

	public Long id_tipo_intervaloFK_IdTipoIntervalo=-1L;

	public Long getid_tipo_intervaloFK_IdTipoIntervalo() {
		return this.id_tipo_intervaloFK_IdTipoIntervalo;
	}

	public void setid_tipo_intervaloFK_IdTipoIntervalo(Long id_tipo_intervaloFK_IdTipoIntervalo) {
		this.id_tipo_intervaloFK_IdTipoIntervalo = id_tipo_intervaloFK_IdTipoIntervalo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TablaAmortiDetalleLogic getTablaAmortiDetalleLogic()	{		
		return tablaamortidetalleLogic;
	}

	public void setTablaAmortiDetalleLogic(TablaAmortiDetalleLogic tablaamortidetalleLogic) {
		this.tablaamortidetalleLogic = tablaamortidetalleLogic;
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
	
	public Boolean getIsEsNuevoTablaAmortiDetalle() {
		return isEsNuevoTablaAmortiDetalle;
	}

	public void setIsEsNuevoTablaAmortiDetalle(Boolean isEsNuevoTablaAmortiDetalle) {
		this.isEsNuevoTablaAmortiDetalle = isEsNuevoTablaAmortiDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioTablaAmortiDetalle() {
		return esParaAccionDesdeFormularioTablaAmortiDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioTablaAmortiDetalle(Boolean esParaAccionDesdeFormularioTablaAmortiDetalle) {
		this.esParaAccionDesdeFormularioTablaAmortiDetalle = esParaAccionDesdeFormularioTablaAmortiDetalle;
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

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidEmpresaActual());
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

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidSucursalActual());
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

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidEjercicioActual());
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

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidPeriodoActual());
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

	public void cargarCombosTasasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tasasForeignKey=new ArrayList<Tasa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TasaLogic tasaLogic=new TasaLogic();

			//tasaLogic.getTasaDataAccess().setIsForForeingKeyData(true);

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tasaLogic.getTasaDataAccess().setIsForForeingKeyData(true);

					tasaLogic.getTodosTasasWithConnection(sFinalQuery,new Pagination());

					this.tasasForeignKey=tasaLogic.getTasas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTasa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tasaLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidTasaActual());
					this.tasasForeignKey.add(tasaLogic.getTasa());
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

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
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

	public void cargarCombosTipoIntervalosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIntervaloLogic tipointervaloLogic=new TipoIntervaloLogic();

			//tipointervaloLogic.getTipoIntervaloDataAccess().setIsForForeingKeyData(true);

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipointervaloLogic.getTipoIntervaloDataAccess().setIsForForeingKeyData(true);

					tipointervaloLogic.getTodosTipoIntervalosWithConnection(sFinalQuery,new Pagination());

					this.tipointervalosForeignKey=tipointervaloLogic.getTipoIntervalos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIntervalo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointervaloLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidTipoIntervaloActual());
					this.tipointervalosForeignKey.add(tipointervaloLogic.getTipoIntervalo());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(tablaamortidetalleSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTablaAmortiDetalle.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTablaAmortiDetalleGenerico)throws Exception
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
				jComboBoxid_empresaTablaAmortiDetalleGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTablaAmortiDetalleGenerico!=null && jComboBoxid_empresaTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_empresaTablaAmortiDetalleGenerico.setSelectedIndex(0);
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

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTablaAmortiDetalle.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTablaAmortiDetalleGenerico)throws Exception
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
				jComboBoxid_sucursalTablaAmortiDetalleGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTablaAmortiDetalleGenerico!=null && jComboBoxid_sucursalTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTablaAmortiDetalleGenerico.setSelectedIndex(0);
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

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioTablaAmortiDetalleGenerico)throws Exception
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
				jComboBoxid_ejercicioTablaAmortiDetalleGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioTablaAmortiDetalleGenerico!=null && jComboBoxid_ejercicioTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioTablaAmortiDetalleGenerico.setSelectedIndex(0);
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

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoTablaAmortiDetalle.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoTablaAmortiDetalleGenerico)throws Exception
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
				jComboBoxid_periodoTablaAmortiDetalleGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoTablaAmortiDetalleGenerico!=null && jComboBoxid_periodoTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_periodoTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTasaForeignKey(Long idTasaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Tasa  tasaTemp=null;

			for(Tasa tasaAux:tasasForeignKey) {
				if(tasaAux.getId()!=null && tasaAux.getId().equals(idTasaSeleccionado)) {
					tasaTemp=tasaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tasaTemp!=null) {

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setTasa(tasaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setSelectedItem(tasaTemp);
					}
				} else {
					//jComboBoxid_tasaTablaAmortiDetalle.setSelectedItem(tasaTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTasa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tasaTemp!=null && jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle!=null) {
						jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setSelectedItem(tasaTemp);
					} else {
						if(jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle!=null) {
							//jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setSelectedItem(tasaTemp);
							if(jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.getItemCount()>0) {
								jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setSelectedIndex(0);
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

	public String getActualTasaForeignKeyDescripcion(Long idTasaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Tasa  tasaTemp=null;

			for(Tasa tasaAux:tasasForeignKey) {
				if(tasaAux.getId()!=null && tasaAux.getId().equals(idTasaSeleccionado)) {
					tasaTemp=tasaAux;
					break;
				}
			}


			sDescripcion=TasaConstantesFunciones.getTasaDescripcion(tasaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTasaForeignKeyGenerico(Long idTasaSeleccionado,JComboBox jComboBoxid_tasaTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Tasa  tasaTemp=null;

			for(Tasa tasaAux:tasasForeignKey) {
				if(tasaAux.getId()!=null && tasaAux.getId().equals(idTasaSeleccionado)) {
					tasaTemp=tasaAux;
					break;
				}
			}

			if(tasaTemp!=null) {
				jComboBoxid_tasaTablaAmortiDetalleGenerico.setSelectedItem(tasaTemp);
			} else {
				if(jComboBoxid_tasaTablaAmortiDetalleGenerico!=null && jComboBoxid_tasaTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_tasaTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaTablaAmortiDetalle.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle!=null) {
						jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle!=null) {
							//jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setSelectedIndex(0);
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

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaTablaAmortiDetalleGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaTablaAmortiDetalleGenerico!=null && jComboBoxid_facturaTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_facturaTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIntervaloForeignKey(Long idTipoIntervaloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipointervaloTemp!=null) {

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setTipoIntervalo(tipointervaloTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedItem(tipointervaloTemp);
					}
				} else {
					//jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedItem(tipointervaloTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoIntervalo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipointervaloTemp!=null && jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle!=null) {
						jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setSelectedItem(tipointervaloTemp);
					} else {
						if(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle!=null) {
							//jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setSelectedItem(tipointervaloTemp);
							if(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.getItemCount()>0) {
								jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setSelectedIndex(0);
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

	public String getActualTipoIntervaloForeignKeyDescripcion(Long idTipoIntervaloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}


			sDescripcion=TipoIntervaloConstantesFunciones.getTipoIntervaloDescripcion(tipointervaloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIntervaloForeignKeyGenerico(Long idTipoIntervaloSeleccionado,JComboBox jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}

			if(tipointervaloTemp!=null) {
				jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico.setSelectedItem(tipointervaloTemp);
			} else {
				if(jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico!=null && jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioTablaAmortiDetalle.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioTablaAmortiDetalleGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioTablaAmortiDetalleGenerico!=null && jComboBoxid_anioTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_anioTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.tablaamortidetalle!=null) {
						this.tablaamortidetalle.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesTablaAmortiDetalle.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesTablaAmortiDetalleGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesTablaAmortiDetalleGenerico!=null && jComboBoxid_mesTablaAmortiDetalleGenerico.getItemCount()>0) {
					jComboBoxid_mesTablaAmortiDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_empresaTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTablaAmortiDetalleGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tablaamortidetalle.setid_empresa(empresaAux.getId());
				tablaamortidetalle.setempresa_descripcion(TablaAmortiDetalleConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tablaamortidetalle.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_sucursalTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTablaAmortiDetalleGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tablaamortidetalle.setid_sucursal(sucursalAux.getId());
				tablaamortidetalle.setsucursal_descripcion(TablaAmortiDetalleConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tablaamortidetalle.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_ejercicioTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioTablaAmortiDetalleGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				tablaamortidetalle.setid_ejercicio(ejercicioAux.getId());
				tablaamortidetalle.setejercicio_descripcion(TablaAmortiDetalleConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				tablaamortidetalle.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_periodoTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoTablaAmortiDetalleGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				tablaamortidetalle.setid_periodo(periodoAux.getId());
				tablaamortidetalle.setperiodo_descripcion(TablaAmortiDetalleConstantesFunciones.getPeriodoDescripcion(periodoAux));
				tablaamortidetalle.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTasaForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_tasaTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Tasa  tasaAux=new Tasa();

			if(jComboBoxid_tasaTablaAmortiDetalleGenerico==null) {
				tasaAux=(Tasa)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.getSelectedItem();
			} else {
				tasaAux=(Tasa)jComboBoxid_tasaTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(tasaAux!=null && tasaAux.getId()!=null) {
				tablaamortidetalle.setid_tasa(tasaAux.getId());
				tablaamortidetalle.settasa_descripcion(TablaAmortiDetalleConstantesFunciones.getTasaDescripcion(tasaAux));
				tablaamortidetalle.setTasa(tasaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_facturaTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaTablaAmortiDetalleGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				tablaamortidetalle.setid_factura(facturaAux.getId());
				tablaamortidetalle.setfactura_descripcion(TablaAmortiDetalleConstantesFunciones.getFacturaDescripcion(facturaAux));
				tablaamortidetalle.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIntervaloForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloAux=new TipoIntervalo();

			if(jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico==null) {
				tipointervaloAux=(TipoIntervalo)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.getSelectedItem();
			} else {
				tipointervaloAux=(TipoIntervalo)jComboBoxid_tipo_intervaloTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(tipointervaloAux!=null && tipointervaloAux.getId()!=null) {
				tablaamortidetalle.setid_tipo_intervalo(tipointervaloAux.getId());
				tablaamortidetalle.settipointervalo_descripcion(TablaAmortiDetalleConstantesFunciones.getTipoIntervaloDescripcion(tipointervaloAux));
				tablaamortidetalle.setTipoIntervalo(tipointervaloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_anioTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioTablaAmortiDetalleGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				tablaamortidetalle.setid_anio(anioAux.getId());
				tablaamortidetalle.setanio_descripcion(TablaAmortiDetalleConstantesFunciones.getAnioDescripcion(anioAux));
				tablaamortidetalle.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(TablaAmortiDetalle tablaamortidetalle,JComboBox jComboBoxid_mesTablaAmortiDetalleGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesTablaAmortiDetalleGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesTablaAmortiDetalleGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				tablaamortidetalle.setid_mes(mesAux.getId());
				tablaamortidetalle.setmes_descripcion(TablaAmortiDetalleConstantesFunciones.getMesDescripcion(mesAux));
				tablaamortidetalle.setMes(mesAux);			}
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

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTasasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTasa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.removeAllItems();

							for(Tasa tasa:this.tasasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.addItem(tasa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTasa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.removeAllItems();

							for(Tasa tasa:this.tasasForeignKey) {
								this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.addItem(tasa);
							}
						}

						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.addItem(factura);
							}
						}

						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIntervalosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIntervalo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.removeAllItems();

							for(TipoIntervalo tipointervalo:this.tipointervalosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.addItem(tipointervalo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoIntervalo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.removeAllItems();

							for(TipoIntervalo tipointervalo:this.tipointervalosForeignKey) {
								this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.addItem(tipointervalo);
							}
						}

						if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { 
					}

					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTasaForeignKey(Tasa tasa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setSelectedItem(tasa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setSelectedItem(tasa);
						} else {
							this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIntervaloForeignKey(TipoIntervalo tipointervalo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedItem(tipointervalo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setSelectedItem(tipointervalo);
						} else {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTablaAmortiDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TablaAmortiDetalleConstantesFunciones.refrescarForeignKeysDescripcionesTablaAmortiDetalle(this.tablaamortidetalleLogic.getTablaAmortiDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TablaAmortiDetalleConstantesFunciones.refrescarForeignKeysDescripcionesTablaAmortiDetalle(this.tablaamortidetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Tasa.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(TipoIntervalo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tablaamortidetalleLogic.setTablaAmortiDetalles(this.tablaamortidetalles);
			tablaamortidetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TablaAmortiDetalleParameterReturnGeneral getTablaAmortiDetalleParameterGeneral() {
		return this.tablaamortidetalleParameterGeneral;
	}
	
	public void setTablaAmortiDetalleParameterGeneral(TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleParameterGeneral) {
		this.tablaamortidetalleParameterGeneral = tablaamortidetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTablaAmortiDetalle() {
		return isPermisoTodoTablaAmortiDetalle;
	}

	public void setIsPermisoTodoTablaAmortiDetalle(Boolean isPermisoTodoTablaAmortiDetalle) {
		this.isPermisoTodoTablaAmortiDetalle = isPermisoTodoTablaAmortiDetalle;
	}

	public Boolean getIsPermisoNuevoTablaAmortiDetalle() {
		return isPermisoNuevoTablaAmortiDetalle;
	}

	public void setIsPermisoNuevoTablaAmortiDetalle(Boolean isPermisoNuevoTablaAmortiDetalle) {
		this.isPermisoNuevoTablaAmortiDetalle = isPermisoNuevoTablaAmortiDetalle;
	}

	public Boolean getIsPermisoActualizarTablaAmortiDetalle() {
		return isPermisoActualizarTablaAmortiDetalle;
	}

	public void setIsPermisoActualizarTablaAmortiDetalle(Boolean isPermisoActualizarTablaAmortiDetalle) {
		this.isPermisoActualizarTablaAmortiDetalle = isPermisoActualizarTablaAmortiDetalle;
	}

	public Boolean getIsPermisoEliminarTablaAmortiDetalle() {
		return isPermisoEliminarTablaAmortiDetalle;
	}

	public void setIsPermisoEliminarTablaAmortiDetalle(Boolean isPermisoEliminarTablaAmortiDetalle) {
		this.isPermisoEliminarTablaAmortiDetalle = isPermisoEliminarTablaAmortiDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosTablaAmortiDetalle() {
		return isPermisoGuardarCambiosTablaAmortiDetalle;
	}

	public void setIsPermisoGuardarCambiosTablaAmortiDetalle(Boolean isPermisoGuardarCambiosTablaAmortiDetalle) {
		this.isPermisoGuardarCambiosTablaAmortiDetalle = isPermisoGuardarCambiosTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoConsultaTablaAmortiDetalle() {
		return isPermisoConsultaTablaAmortiDetalle;
	}

	public void setIsPermisoConsultaTablaAmortiDetalle(Boolean isPermisoConsultaTablaAmortiDetalle) {
		this.isPermisoConsultaTablaAmortiDetalle = isPermisoConsultaTablaAmortiDetalle;
	}

	public Boolean getIsPermisoBusquedaTablaAmortiDetalle() {
		return isPermisoBusquedaTablaAmortiDetalle;
	}

	public void setIsPermisoBusquedaTablaAmortiDetalle(Boolean isPermisoBusquedaTablaAmortiDetalle) {
		this.isPermisoBusquedaTablaAmortiDetalle = isPermisoBusquedaTablaAmortiDetalle;
	}

	public Boolean getIsPermisoReporteTablaAmortiDetalle() {
		return isPermisoReporteTablaAmortiDetalle;
	}

	public void setIsPermisoReporteTablaAmortiDetalle(Boolean isPermisoReporteTablaAmortiDetalle) {
		this.isPermisoReporteTablaAmortiDetalle = isPermisoReporteTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioTablaAmortiDetalle() {
		return isPermisoPaginacionMedioTablaAmortiDetalle;
	}

	public void setIsPermisoPaginacionMedioTablaAmortiDetalle(Boolean isPermisoPaginacionMedioTablaAmortiDetalle) {
		this.isPermisoPaginacionMedioTablaAmortiDetalle = isPermisoPaginacionMedioTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoTablaAmortiDetalle() {
		return isPermisoPaginacionTodoTablaAmortiDetalle;
	}

	public void setIsPermisoPaginacionTodoTablaAmortiDetalle(Boolean isPermisoPaginacionTodoTablaAmortiDetalle) {
		this.isPermisoPaginacionTodoTablaAmortiDetalle = isPermisoPaginacionTodoTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoTablaAmortiDetalle() {
		return isPermisoPaginacionAltoTablaAmortiDetalle;
	}

	public void setIsPermisoPaginacionAltoTablaAmortiDetalle(Boolean isPermisoPaginacionAltoTablaAmortiDetalle) {
		this.isPermisoPaginacionAltoTablaAmortiDetalle = isPermisoPaginacionAltoTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoCopiarTablaAmortiDetalle() {
		return isPermisoCopiarTablaAmortiDetalle;
	}

	public void setIsPermisoCopiarTablaAmortiDetalle(Boolean isPermisoCopiarTablaAmortiDetalle) {
		this.isPermisoCopiarTablaAmortiDetalle = isPermisoCopiarTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoVerFormTablaAmortiDetalle() {
		return isPermisoVerFormTablaAmortiDetalle;
	}

	public void setIsPermisoVerFormTablaAmortiDetalle(Boolean isPermisoVerFormTablaAmortiDetalle) {
		this.isPermisoVerFormTablaAmortiDetalle = isPermisoVerFormTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoDuplicarTablaAmortiDetalle() {
		return isPermisoDuplicarTablaAmortiDetalle;
	}

	public void setIsPermisoDuplicarTablaAmortiDetalle(Boolean isPermisoDuplicarTablaAmortiDetalle) {
		this.isPermisoDuplicarTablaAmortiDetalle = isPermisoDuplicarTablaAmortiDetalle;
	}
	
	public Boolean getIsPermisoOrdenTablaAmortiDetalle() {
		return isPermisoOrdenTablaAmortiDetalle;
	}

	public void setIsPermisoOrdenTablaAmortiDetalle(Boolean isPermisoOrdenTablaAmortiDetalle) {
		this.isPermisoOrdenTablaAmortiDetalle = isPermisoOrdenTablaAmortiDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTablaAmortiDetalle() {
		return isVisibilidadCeldaNuevoTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaNuevoTablaAmortiDetalle(Boolean isVisibilidadCeldaNuevoTablaAmortiDetalle) {
		this.isVisibilidadCeldaNuevoTablaAmortiDetalle = isVisibilidadCeldaNuevoTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTablaAmortiDetalle() {
		return isVisibilidadCeldaDuplicarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarTablaAmortiDetalle(Boolean isVisibilidadCeldaDuplicarTablaAmortiDetalle) {
		this.isVisibilidadCeldaDuplicarTablaAmortiDetalle = isVisibilidadCeldaDuplicarTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTablaAmortiDetalle() {
		return isVisibilidadCeldaCopiarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaCopiarTablaAmortiDetalle(Boolean isVisibilidadCeldaCopiarTablaAmortiDetalle) {
		this.isVisibilidadCeldaCopiarTablaAmortiDetalle = isVisibilidadCeldaCopiarTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTablaAmortiDetalle() {
		return isVisibilidadCeldaVerFormTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaVerFormTablaAmortiDetalle(Boolean isVisibilidadCeldaVerFormTablaAmortiDetalle) {
		this.isVisibilidadCeldaVerFormTablaAmortiDetalle = isVisibilidadCeldaVerFormTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTablaAmortiDetalle() {
		return isVisibilidadCeldaOrdenTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaOrdenTablaAmortiDetalle(Boolean isVisibilidadCeldaOrdenTablaAmortiDetalle) {
		this.isVisibilidadCeldaOrdenTablaAmortiDetalle = isVisibilidadCeldaOrdenTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle() {
		return isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle(Boolean isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle = isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTablaAmortiDetalle() {
		return isVisibilidadCeldaModificarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaModificarTablaAmortiDetalle(Boolean isVisibilidadCeldaModificarTablaAmortiDetalle) {
		this.isVisibilidadCeldaModificarTablaAmortiDetalle = isVisibilidadCeldaModificarTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTablaAmortiDetalle() {
		return isVisibilidadCeldaActualizarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaActualizarTablaAmortiDetalle(Boolean isVisibilidadCeldaActualizarTablaAmortiDetalle) {
		this.isVisibilidadCeldaActualizarTablaAmortiDetalle = isVisibilidadCeldaActualizarTablaAmortiDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarTablaAmortiDetalle() {
		return isVisibilidadCeldaEliminarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaEliminarTablaAmortiDetalle(Boolean isVisibilidadCeldaEliminarTablaAmortiDetalle) {
		this.isVisibilidadCeldaEliminarTablaAmortiDetalle = isVisibilidadCeldaEliminarTablaAmortiDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarTablaAmortiDetalle() {
		return isVisibilidadCeldaCancelarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaCancelarTablaAmortiDetalle(Boolean isVisibilidadCeldaCancelarTablaAmortiDetalle) {
		this.isVisibilidadCeldaCancelarTablaAmortiDetalle = isVisibilidadCeldaCancelarTablaAmortiDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarTablaAmortiDetalle() {
		return isVisibilidadCeldaGuardarTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaGuardarTablaAmortiDetalle(Boolean isVisibilidadCeldaGuardarTablaAmortiDetalle) {
		this.isVisibilidadCeldaGuardarTablaAmortiDetalle = isVisibilidadCeldaGuardarTablaAmortiDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTablaAmortiDetalle() {
		return isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTablaAmortiDetalle(Boolean isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle) {
		this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle = isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle;
	}
		
	public TablaAmortiDetalleSessionBean gettablaamortidetalleSessionBean() {
		return this.tablaamortidetalleSessionBean;
	}
	
	public void settablaamortidetalleSessionBean(TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean) {
		this.tablaamortidetalleSessionBean=tablaamortidetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTasa() {
		return this.isVisibilidadFK_IdTasa;
	}

	public void setisVisibilidadFK_IdTasa(Boolean isVisibilidadFK_IdTasa) {
		this.isVisibilidadFK_IdTasa=isVisibilidadFK_IdTasa;
	}

	public Boolean getisVisibilidadFK_IdTipoIntervalo() {
		return this.isVisibilidadFK_IdTipoIntervalo;
	}

	public void setisVisibilidadFK_IdTipoIntervalo(Boolean isVisibilidadFK_IdTipoIntervalo) {
		this.isVisibilidadFK_IdTipoIntervalo=isVisibilidadFK_IdTipoIntervalo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarSucursalForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarEjercicioForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarPeriodoForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarTasaForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarFacturaForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarTipoIntervaloForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarAnioForeignKey(tablaamortidetalle,null);
				this.setActualParaGuardarMesForeignKey(tablaamortidetalle,null);
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
	
	public void bugActualizarReferenciaActual(TablaAmortiDetalle tablaamortidetalle,TablaAmortiDetalle tablaamortidetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTablaAmortiDetalle(tablaamortidetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tablaamortidetalleAux.setId(tablaamortidetalle.getId());
		tablaamortidetalleAux.setVersionRow(tablaamortidetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTablaAmortiDetalle();
		
			int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tablaamortidetalleValidator.getInvalidValues(this.tablaamortidetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tablaamortidetalleLogic.setDatosCliente(datosCliente);
			tablaamortidetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tablaamortidetalleAux=new  TablaAmortiDetalle();
				
				tablaamortidetalleAux.setIsNew(true);
				tablaamortidetalleAux.setIsChanged(true);
				
				tablaamortidetalleAux.setTablaAmortiDetalleOriginal(this.tablaamortidetalle);
				
				tablaamortidetalleAux.setId(this.tablaamortidetalle.getId());	
				tablaamortidetalleAux.setVersionRow(this.tablaamortidetalle.getVersionRow());	
				tablaamortidetalleAux.setid_empresa(this.tablaamortidetalle.getid_empresa());	
				tablaamortidetalleAux.setid_sucursal(this.tablaamortidetalle.getid_sucursal());	
				tablaamortidetalleAux.setid_ejercicio(this.tablaamortidetalle.getid_ejercicio());	
				tablaamortidetalleAux.setid_periodo(this.tablaamortidetalle.getid_periodo());	
				tablaamortidetalleAux.setid_tasa(this.tablaamortidetalle.getid_tasa());	
				tablaamortidetalleAux.setid_factura(this.tablaamortidetalle.getid_factura());	
				tablaamortidetalleAux.setid_tipo_intervalo(this.tablaamortidetalle.getid_tipo_intervalo());	
				tablaamortidetalleAux.setfecha_emision(this.tablaamortidetalle.getfecha_emision());	
				tablaamortidetalleAux.setfecha_vencimiento(this.tablaamortidetalle.getfecha_vencimiento());	
				tablaamortidetalleAux.setfecha_inicial(this.tablaamortidetalle.getfecha_inicial());	
				tablaamortidetalleAux.setfecha_final(this.tablaamortidetalle.getfecha_final());	
				tablaamortidetalleAux.setvalor(this.tablaamortidetalle.getvalor());	
				tablaamortidetalleAux.setinteres(this.tablaamortidetalle.getinteres());	
				tablaamortidetalleAux.setcapital(this.tablaamortidetalle.getcapital());	
				tablaamortidetalleAux.setnumero_cuotas(this.tablaamortidetalle.getnumero_cuotas());	
				tablaamortidetalleAux.setid_anio(this.tablaamortidetalle.getid_anio());	
				tablaamortidetalleAux.setid_mes(this.tablaamortidetalle.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.saveTablaAmortiDetalles();//WithConnection
						//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);
					
					this.refrescarForeignKeysDescripcionesTablaAmortiDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortidetalleLogic.saveTablaAmortiDetalleRelaciones(tablaamortidetalleAux);//WithConnection
								//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tablaamortidetalleAux=new  TablaAmortiDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() && this.tablaamortidetalle.getId()>=0)) {
						
					tablaamortidetalleAux.setIsNew(false);
				}
				
				tablaamortidetalleAux.setIsDeleted(false);
			
				tablaamortidetalleAux.setId(this.tablaamortidetalle.getId());	
				tablaamortidetalleAux.setVersionRow(this.tablaamortidetalle.getVersionRow());	
				tablaamortidetalleAux.setid_empresa(this.tablaamortidetalle.getid_empresa());	
				tablaamortidetalleAux.setid_sucursal(this.tablaamortidetalle.getid_sucursal());	
				tablaamortidetalleAux.setid_ejercicio(this.tablaamortidetalle.getid_ejercicio());	
				tablaamortidetalleAux.setid_periodo(this.tablaamortidetalle.getid_periodo());	
				tablaamortidetalleAux.setid_tasa(this.tablaamortidetalle.getid_tasa());	
				tablaamortidetalleAux.setid_factura(this.tablaamortidetalle.getid_factura());	
				tablaamortidetalleAux.setid_tipo_intervalo(this.tablaamortidetalle.getid_tipo_intervalo());	
				tablaamortidetalleAux.setfecha_emision(this.tablaamortidetalle.getfecha_emision());	
				tablaamortidetalleAux.setfecha_vencimiento(this.tablaamortidetalle.getfecha_vencimiento());	
				tablaamortidetalleAux.setfecha_inicial(this.tablaamortidetalle.getfecha_inicial());	
				tablaamortidetalleAux.setfecha_final(this.tablaamortidetalle.getfecha_final());	
				tablaamortidetalleAux.setvalor(this.tablaamortidetalle.getvalor());	
				tablaamortidetalleAux.setinteres(this.tablaamortidetalle.getinteres());	
				tablaamortidetalleAux.setcapital(this.tablaamortidetalle.getcapital());	
				tablaamortidetalleAux.setnumero_cuotas(this.tablaamortidetalle.getnumero_cuotas());	
				tablaamortidetalleAux.setid_anio(this.tablaamortidetalle.getid_anio());	
				tablaamortidetalleAux.setid_mes(this.tablaamortidetalle.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.saveTablaAmortiDetalles();//WithConnection
						//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);
					
					this.refrescarForeignKeysDescripcionesTablaAmortiDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortidetalleLogic.saveTablaAmortiDetalleRelaciones(tablaamortidetalleAux);//WithConnection
								//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaamortidetalle,tablaamortidetalleAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tablaamortidetalleAux=new  TablaAmortiDetalle();
				
				tablaamortidetalleAux.setIsNew(false);
				tablaamortidetalleAux.setIsChanged(false);
				
				tablaamortidetalleAux.setIsDeleted(true);
				
				tablaamortidetalleAux.setId(this.tablaamortidetalle.getId());	
				tablaamortidetalleAux.setVersionRow(this.tablaamortidetalle.getVersionRow());	
				tablaamortidetalleAux.setid_empresa(this.tablaamortidetalle.getid_empresa());	
				tablaamortidetalleAux.setid_sucursal(this.tablaamortidetalle.getid_sucursal());	
				tablaamortidetalleAux.setid_ejercicio(this.tablaamortidetalle.getid_ejercicio());	
				tablaamortidetalleAux.setid_periodo(this.tablaamortidetalle.getid_periodo());	
				tablaamortidetalleAux.setid_tasa(this.tablaamortidetalle.getid_tasa());	
				tablaamortidetalleAux.setid_factura(this.tablaamortidetalle.getid_factura());	
				tablaamortidetalleAux.setid_tipo_intervalo(this.tablaamortidetalle.getid_tipo_intervalo());	
				tablaamortidetalleAux.setfecha_emision(this.tablaamortidetalle.getfecha_emision());	
				tablaamortidetalleAux.setfecha_vencimiento(this.tablaamortidetalle.getfecha_vencimiento());	
				tablaamortidetalleAux.setfecha_inicial(this.tablaamortidetalle.getfecha_inicial());	
				tablaamortidetalleAux.setfecha_final(this.tablaamortidetalle.getfecha_final());	
				tablaamortidetalleAux.setvalor(this.tablaamortidetalle.getvalor());	
				tablaamortidetalleAux.setinteres(this.tablaamortidetalle.getinteres());	
				tablaamortidetalleAux.setcapital(this.tablaamortidetalle.getcapital());	
				tablaamortidetalleAux.setnumero_cuotas(this.tablaamortidetalle.getnumero_cuotas());	
				tablaamortidetalleAux.setid_anio(this.tablaamortidetalle.getid_anio());	
				tablaamortidetalleAux.setid_mes(this.tablaamortidetalle.getid_mes());	
				
				if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tablaamortidetalleAux.getId()>=0) {	
						this.tablaamortidetallesEliminados.add(tablaamortidetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.saveTablaAmortiDetalles();//WithConnection
						//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortidetalleLogic.saveTablaAmortiDetalleRelaciones(tablaamortidetalleAux);//WithConnection
								//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
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
							if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tablaamortidetalleAux,tablaamortidetalleLogic.getTablaAmortiDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tablaamortidetalleAux,tablaamortidetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(this.tablaamortidetallesEliminados);
					
					tablaamortidetalleLogic.saveTablaAmortiDetalles();//WithConnection
					//tablaamortidetalleLogic.getSetVersionRowTablaAmortiDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTablaAmortiDetalle();
				
				this.tablaamortidetallesEliminados= new ArrayList<TablaAmortiDetalle>();		
			}
			
			if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tabla Amortizacion Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tablaamortidetalle=tablaamortidetalleAux;
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
      		//this.finishProcessTablaAmortiDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(TablaAmortiDetalle tablaamortidetalleLocal) throws Exception {
		
		if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TablaAmortiDetalle tablaamortidetalleLocal) throws Exception {	
		if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tablaamortidetalleLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tablaamortidetalleLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				tablaamortidetalleLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				tablaamortidetalleLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TasaDetalleFormJInternalFrame.class)) {
				TasaBeanSwingJInternalFrame tasaBeanSwingJInternalFrameLocal=(TasaBeanSwingJInternalFrame) ((TasaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tasaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTasa(tasaBeanSwingJInternalFrameLocal.gettasa(),true);
				tasaBeanSwingJInternalFrameLocal.actualizarLista(tasaBeanSwingJInternalFrameLocal.tasa,this.tasasForeignKey);

				tasaBeanSwingJInternalFrameLocal.actualizarRelaciones(tasaBeanSwingJInternalFrameLocal.tasa);

				tablaamortidetalleLocal.setTasa(tasaBeanSwingJInternalFrameLocal.tasa);

				this.addItemDefectoCombosForeignKeyTasa();
				this.cargarCombosFrameTasasForeignKey("Formulario");
				this.setActualTasaForeignKey(tasaBeanSwingJInternalFrameLocal.tasa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				tablaamortidetalleLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIntervaloDetalleFormJInternalFrame.class)) {
				TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrameLocal=(TipoIntervaloBeanSwingJInternalFrame) ((TipoIntervaloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipointervaloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIntervalo(tipointervaloBeanSwingJInternalFrameLocal.gettipointervalo(),true);
				tipointervaloBeanSwingJInternalFrameLocal.actualizarLista(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo,this.tipointervalosForeignKey);

				tipointervaloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo);

				tablaamortidetalleLocal.setTipoIntervalo(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo);

				this.addItemDefectoCombosForeignKeyTipoIntervalo();
				this.cargarCombosFrameTipoIntervalosForeignKey("Formulario");
				this.setActualTipoIntervaloForeignKey(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				tablaamortidetalleLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				tablaamortidetalleLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTablaAmortiDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tablaamortidetalleValidator.getInvalidValues(this.tablaamortidetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TablaAmortiDetalle tablaamortidetalle,List<TablaAmortiDetalle> tablaamortidetalles) throws Exception {
		try	{		
			TablaAmortiDetalleConstantesFunciones.actualizarLista(tablaamortidetalle,tablaamortidetalles,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TablaAmortiDetalle tablaamortidetalle,List<TablaAmortiDetalle> tablaamortidetalles) throws Exception {
		try	{			
			TablaAmortiDetalleConstantesFunciones.actualizarSelectedLista(tablaamortidetalle,tablaamortidetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TablaAmortiDetalle> tablaamortidetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tablaamortidetallesLocal=this.tablaamortidetalleLogic.getTablaAmortiDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tablaamortidetallesLocal=this.tablaamortidetalles;
			}
			//ARCHITECTURE
		
			for(TablaAmortiDetalle tablaamortidetalleLocal:tablaamortidetallesLocal) {
				if(this.permiteMantenimiento(tablaamortidetalleLocal) && tablaamortidetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TablaAmortiDetalleConstantesFunciones.getTablaAmortiDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_empresaTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_sucursalTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_ejercicioTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_periodoTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDTASA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_tasaTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_facturaTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDTIPOINTERVALO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_tipo_intervaloTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_emisionTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_vencimientoTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.FECHAINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_inicialTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.FECHAFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_finalTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelvalorTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.INTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelinteresTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.CAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelcapitalTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.NUMEROCUOTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelnumero_cuotasTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_anioTablaAmortiDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiDetalleConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_mesTablaAmortiDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_empresaTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_sucursalTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_ejercicioTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_periodoTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_tasaTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_facturaTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_tipo_intervaloTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_emisionTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_vencimientoTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_inicialTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_finalTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelvalorTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelinteresTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelcapitalTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelnumero_cuotasTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_anioTablaAmortiDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelid_mesTablaAmortiDetalle,"");
		
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
		this.iIdNuevoTablaAmortiDetalle--;	
		
		
		this.tablaamortidetalleAux=new TablaAmortiDetalle();
		
		this.tablaamortidetalleAux.setId(this.iIdNuevoTablaAmortiDetalle);
		this.tablaamortidetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaamortidetalleLogic.getTablaAmortiDetalles().add(this.tablaamortidetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tablaamortidetalles.add(this.tablaamortidetalleAux);
		}
		//ARCHITECTURE
		
		this.tablaamortidetalle=this.tablaamortidetalleAux;
		
		if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyTablaAmortiDetalle(this.tablaamortidetalle);
		}
				
		//this.setDefaultControlesTablaAmortiDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTablaAmortiDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTablaAmortiDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmortiDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaAmortiDetalle(this.tablaamortidetalleBean,this.tablaamortidetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
			classes=TablaAmortiDetalleConstantesFunciones.getClassesRelationshipsOfTablaAmortiDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.procesarEventosTablaAmortiDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this.tablaamortidetalle,this.tablaamortidetalleParameterGeneral,this.isEsNuevoTablaAmortiDetalle,classes);//this.tablaamortidetalleLogic.getTablaAmortiDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral,this.tablaamortidetalleBean,false);
		
		if(this.tablaamortidetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle());
		}
		
		if(this.tablaamortidetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle(),classes);//this.tablaamortidetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTablaAmortiDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTablaAmortiDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.RecargarFormTablaAmortiDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
						
			if(tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmortiDetalle();
			}
			
			this.actualizarVisualTableDatosTablaAmortiDetalle();
			
			this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(this.getIndiceNuevoTablaAmortiDetalle(), this.getIndiceNuevoTablaAmortiDetalle());
			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
						
			this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTablaAmortiDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarfecha_emisionTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarfecha_vencimientoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarfecha_inicialTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarfecha_finalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarvalorTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarinteresTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarcapitalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarnumero_cuotasTablaAmortiDetalle);	
		//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_empresaTablaAmortiDetalle);//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_sucursalTablaAmortiDetalle);//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_ejercicioTablaAmortiDetalle);//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_periodoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_tasaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_facturaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_tipo_intervaloTablaAmortiDetalle);//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_anioTablaAmortiDetalle);//
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setEnabled(isHabilitar && this.tablaamortidetalleConstantesFunciones.activarid_mesTablaAmortiDetalle);
	};
	
	public void setDefaultControlesTablaAmortiDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTablaAmortiDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tablaamortidetalleSessionBean.setConGuardarRelaciones(true);			
			this.tablaamortidetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.setVisible(true);
			
					
		} else {
			//this.tablaamortidetalleSessionBean.setConGuardarRelaciones(false);			
			this.tablaamortidetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTablaAmortiDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				if(tablaamortidetalleAux.getId().equals(this.iIdNuevoTablaAmortiDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalles) {
				if(tablaamortidetalleAux.getId().equals(this.iIdNuevoTablaAmortiDetalle)) {
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
	
	public int getIndiceActualTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				if(tablaamortidetalleAux.getId().equals(tablaamortidetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalles) {
				if(tablaamortidetalleAux.getId().equals(tablaamortidetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				if(tablaamortidetalleAux.getTablaAmortiDetalleOriginal().getId().equals(tablaamortidetalleOriginal.getId())) {
					existe=true;
					tablaamortidetalleOriginal.setId(tablaamortidetalleAux.getId());
					tablaamortidetalleOriginal.setVersionRow(tablaamortidetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalles) {
				if(tablaamortidetalleAux.getTablaAmortiDetalleOriginal().getId().equals(tablaamortidetalleOriginal.getId())) {
					existe=true;
					tablaamortidetalleOriginal.setId(tablaamortidetalleAux.getId());
					tablaamortidetalleOriginal.setVersionRow(tablaamortidetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTablaAmortiDetalle(Boolean esParaCancelar) throws Exception {
		tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
		tablaamortidetalleAux=new TablaAmortiDetalle();
		
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
					if(tablaamortidetalleAux.getId()<0) {
						tablaamortidetallesAux.add(tablaamortidetalleAux);
					}		
				}
				this.iIdNuevoTablaAmortiDetalle=0L;
				this.tablaamortidetalleLogic.getTablaAmortiDetalles().removeAll(tablaamortidetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalles) {
					if(tablaamortidetalleAux.getId()<0) {
						tablaamortidetallesAux.add(tablaamortidetalleAux);
					}		
				}
				this.iIdNuevoTablaAmortiDetalle=0L;
				this.tablaamortidetalles.removeAll(tablaamortidetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTablaAmortiDetalle 
					&& this.tablaamortidetalleLogic.getTablaAmortiDetalles().size()>0
					) {
					tablaamortidetalleAux=this.tablaamortidetalleLogic.getTablaAmortiDetalles().get(this.tablaamortidetalleLogic.getTablaAmortiDetalles().size() - 1);
				
					if(tablaamortidetalleAux.getId()<0) {
						this.tablaamortidetalleLogic.getTablaAmortiDetalles().remove(tablaamortidetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTablaAmortiDetalle && this.tablaamortidetalles.size()>0) {
					tablaamortidetalleAux=this.tablaamortidetalles.get(this.tablaamortidetalles.size() - 1);
				
					if(tablaamortidetalleAux.getId()<0) {
						this.tablaamortidetalles.remove(tablaamortidetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTablaAmortiDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tablaamortidetalle.getId()<0) {
				this.tablaamortidetalleLogic.getTablaAmortiDetalles().remove(this.tablaamortidetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tablaamortidetalle.getId()<0) {
				this.tablaamortidetalles.remove(this.tablaamortidetalle);
			}
		}			
	}
	
	public void setEstadosInicialesTablaAmortiDetalle(List<TablaAmortiDetalle> tablaamortidetallesAux) throws Exception {
		TablaAmortiDetalleConstantesFunciones.setEstadosInicialesTablaAmortiDetalle(tablaamortidetallesAux);
	}
	
	public void setEstadosInicialesTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalleAux) throws Exception {
		TablaAmortiDetalleConstantesFunciones.setEstadosInicialesTablaAmortiDetalle(tablaamortidetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTablaAmortiDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTablaAmortiDetalleActual()) {
				if(!this.isEsNuevoTablaAmortiDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTablaAmortiDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTablaAmortiDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tabla Amortizacion Detalle ?", "MANTENIMIENTO DE Tabla Amortizacion Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TablaAmortiDetalle tablaamortidetalle) throws Exception {
		TablaAmortiDetalleConstantesFunciones.seleccionarAsignar(this.tablaamortidetalle,tablaamortidetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTablaAmortiDetalle=this.isPermisoActualizarOriginalTablaAmortiDetalle;
			
			
			this.seleccionarAsignar(tablaamortidetalle);
			
			

			idFacturaActual=tablaamortidetalle.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaAmortiDetalleConstantesFunciones.quitarEspaciosTablaAmortiDetalle(this.tablaamortidetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tablaamortidetalleSessionBean.setsFuncionBusquedaRapida(this.tablaamortidetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTablaAmortiDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTablaAmortiDetalle(esParaCancelar);				
				this.cancelarNuevoTablaAmortiDetalle(esParaCancelar);								
			}
			
			this.tablaamortidetalle=new TablaAmortiDetalle();
			
			this.inicializarTablaAmortiDetalle();
			
			this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTablaAmortiDetalle() throws Exception {
		try {
			TablaAmortiDetalleConstantesFunciones.inicializarTablaAmortiDetalle(this.tablaamortidetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tablaamortidetalleLogic.getTablaAmortiDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTablaAmortiDetalles(String sAccionBusqueda,List<TablaAmortiDetalle> tablaamortidetallesParaReportes) throws Exception {
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
					sPathReporteFinal="TablaAmortiDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TablaAmortiDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TablaAmortiDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TablaAmortiDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tabla Amortizacion Detalles");		
		parameters.put("busquedapor", TablaAmortiDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTablaAmortiDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TablaAmortiDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TablaAmortiDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTablaAmortiDetalle=new JRBeanArrayDataSource(TablaAmortiDetalleJInternalFrame.TraerTablaAmortiDetalleBeans(tablaamortidetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTablaAmortiDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TablaAmortiDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TablaAmortiDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TablaAmortiDetalleBean.TraerTablaAmortiDetalleBeans(tablaamortidetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalleActionPerformed(null);
					//this.generarExcelReporteTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTablaAmortiDetalles(sAccionBusqueda,sTipoArchivoReporte,tablaamortidetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTablaAmortiDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmortiDetalle> tablaamortidetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortiDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaAmortiDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TablaAmortiDetalle tablaamortidetalle : tablaamortidetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TablaAmortiDetalleConstantesFunciones.generarExcelReporteDataTablaAmortiDetalle("NORMAL",row,workbook,tablaamortidetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTablaAmortiDetalle(String sTipo,Row row,Workbook workbook) {
		
		TablaAmortiDetalleConstantesFunciones.generarExcelReporteHeaderTablaAmortiDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTablaAmortiDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmortiDetalle> tablaamortidetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortiDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TablaAmortiDetalle tablaamortidetalle : tablaamortidetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TablaAmortiDetalleConstantesFunciones.getTablaAmortiDetalleDescripcion(tablaamortidetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.gettasa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.gettipointervalo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getfecha_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getfecha_final());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getinteres());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getcapital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getnumero_cuotas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamortidetalle.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTablaAmortiDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmortiDetalle> tablaamortidetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TablaAmortiDetalle> tablaamortidetallesRespaldo=null;
		
		classes=TablaAmortiDetalleConstantesFunciones.getClassesRelationshipsOfTablaAmortiDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tablaamortidetalleLogic.setDatosCliente(this.datosCliente);
		this.tablaamortidetalleLogic.setDatosDeep(this.datosDeep);
		this.tablaamortidetalleLogic.setIsConDeep(true);
		
		tablaamortidetallesRespaldo=this.tablaamortidetalleLogic.getTablaAmortiDetalles();
		
		this.tablaamortidetalleLogic.setTablaAmortiDetalles(tablaamortidetallesParaReportes);	
		this.tablaamortidetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tablaamortidetallesParaReportes=this.tablaamortidetalleLogic.getTablaAmortiDetalles();
		this.tablaamortidetalleLogic.setTablaAmortiDetalles(tablaamortidetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortiDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaAmortiDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TablaAmortiDetalle tablaamortidetalle : tablaamortidetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTablaAmortiDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TablaAmortiDetalleConstantesFunciones.generarExcelReporteDataTablaAmortiDetalle("NORMAL",row,workbook,tablaamortidetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TablaAmortiDetalleConstantesFunciones.getTablaAmortiDetalleDescripcion(tablaamortidetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTablaAmortiDetalle() throws Exception {		
		this.startProcessTablaAmortiDetalle(true);
	}
	
	public void startProcessTablaAmortiDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTablaAmortiDetalle ,this.jPanelParametrosReportesTablaAmortiDetalle, this.jScrollPanelDatosTablaAmortiDetalle,this.jPanelPaginacionTablaAmortiDetalle, this.jScrollPanelDatosEdicionTablaAmortiDetalle, this.jPanelAccionesTablaAmortiDetalle,this.jPanelAccionesFormularioTablaAmortiDetalle,this.jmenuBarTablaAmortiDetalle,this.jmenuBarDetalleTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaAmortiDetalle=this.jTabbedPaneBusquedasTablaAmortiDetalle; 
		
		final JPanel jPanelParametrosReportesTablaAmortiDetalle=this.jPanelParametrosReportesTablaAmortiDetalle;
		//final JScrollPane jScrollPanelDatosTablaAmortiDetalle=this.jScrollPanelDatosTablaAmortiDetalle;
		final JTable jTableDatosTablaAmortiDetalle=this.jTableDatosTablaAmortiDetalle;		
		final JPanel jPanelPaginacionTablaAmortiDetalle=this.jPanelPaginacionTablaAmortiDetalle;
		//final JScrollPane jScrollPanelDatosEdicionTablaAmortiDetalle=this.jScrollPanelDatosEdicionTablaAmortiDetalle;
		final JPanel jPanelAccionesTablaAmortiDetalle=this.jPanelAccionesTablaAmortiDetalle;
		
		JPanel jPanelCamposAuxiliarTablaAmortiDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTablaAmortiDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			jPanelCamposAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelCamposTablaAmortiDetalle;
			jPanelAccionesFormularioAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelAccionesFormularioTablaAmortiDetalle;
		}
		
		final JPanel jPanelCamposTablaAmortiDetalle=jPanelCamposAuxiliarTablaAmortiDetalle;
		final JPanel jPanelAccionesFormularioTablaAmortiDetalle=jPanelAccionesFormularioAuxiliarTablaAmortiDetalle;
		
		
		final JMenuBar jmenuBarTablaAmortiDetalle=this.jmenuBarTablaAmortiDetalle;
		final JToolBar jTtoolBarTablaAmortiDetalle=this.jTtoolBarTablaAmortiDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTablaAmortiDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaAmortiDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			jmenuBarDetalleAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jmenuBarDetalleTablaAmortiDetalle;
			jTtoolBarDetalleAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jTtoolBarDetalleTablaAmortiDetalle;
		}
		
		final JMenuBar jmenuBarDetalleTablaAmortiDetalle=jmenuBarDetalleAuxiliarTablaAmortiDetalle;
		final JToolBar jTtoolBarDetalleTablaAmortiDetalle=jTtoolBarDetalleAuxiliarTablaAmortiDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaAmortiDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaAmortiDetalle;
			processRunnable.jTableDatos=jTableDatosTablaAmortiDetalle;
			processRunnable.jPanelCampos=jPanelCamposTablaAmortiDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaAmortiDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesTablaAmortiDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaAmortiDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarTablaAmortiDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaAmortiDetalle;
			processRunnable.jTtoolBar=jTtoolBarTablaAmortiDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaAmortiDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaAmortiDetalle ,jPanelParametrosReportesTablaAmortiDetalle,jTableDatosTablaAmortiDetalle, /*jScrollPanelDatosTablaAmortiDetalle,*/jPanelCamposTablaAmortiDetalle,jPanelPaginacionTablaAmortiDetalle, /*jScrollPanelDatosEdicionTablaAmortiDetalle,*/ jPanelAccionesTablaAmortiDetalle,jPanelAccionesFormularioTablaAmortiDetalle,jmenuBarTablaAmortiDetalle,jmenuBarDetalleTablaAmortiDetalle,jTtoolBarTablaAmortiDetalle,jTtoolBarDetalleTablaAmortiDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaAmortiDetalle ,jPanelParametrosReportesTablaAmortiDetalle, jScrollPanelDatosTablaAmortiDetalle,jPanelPaginacionTablaAmortiDetalle, jScrollPanelDatosEdicionTablaAmortiDetalle, jPanelAccionesTablaAmortiDetalle,jPanelAccionesFormularioTablaAmortiDetalle,jmenuBarTablaAmortiDetalle,jmenuBarDetalleTablaAmortiDetalle,jTtoolBarTablaAmortiDetalle,jTtoolBarDetalleTablaAmortiDetalle);
						
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
	
	public void finishProcessTablaAmortiDetalle() {// throws Exception 
		this.finishProcessTablaAmortiDetalle(true);
	}
	
	public void finishProcessTablaAmortiDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTablaAmortiDetalle ,this.jPanelParametrosReportesTablaAmortiDetalle, this.jScrollPanelDatosTablaAmortiDetalle,this.jPanelPaginacionTablaAmortiDetalle, this.jScrollPanelDatosEdicionTablaAmortiDetalle, this.jPanelAccionesTablaAmortiDetalle,this.jPanelAccionesFormularioTablaAmortiDetalle,this.jmenuBarTablaAmortiDetalle,this.jmenuBarDetalleTablaAmortiDetalle,this.jTtoolBarTablaAmortiDetalle,this.jTtoolBarDetalleTablaAmortiDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaAmortiDetalle=this.jTabbedPaneBusquedasTablaAmortiDetalle; 
		
		final JPanel jPanelParametrosReportesTablaAmortiDetalle=this.jPanelParametrosReportesTablaAmortiDetalle;
		//final JScrollPane jScrollPanelDatosTablaAmortiDetalle=this.jScrollPanelDatosTablaAmortiDetalle;
		final JTable jTableDatosTablaAmortiDetalle=this.jTableDatosTablaAmortiDetalle;		
		final JPanel jPanelPaginacionTablaAmortiDetalle=this.jPanelPaginacionTablaAmortiDetalle;
		//final JScrollPane jScrollPanelDatosEdicionTablaAmortiDetalle=this.jScrollPanelDatosEdicionTablaAmortiDetalle;
		final JPanel jPanelAccionesTablaAmortiDetalle=this.jPanelAccionesTablaAmortiDetalle;
		
		JPanel jPanelCamposAuxiliarTablaAmortiDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTablaAmortiDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			jPanelCamposAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelCamposTablaAmortiDetalle;
			jPanelAccionesFormularioAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelAccionesFormularioTablaAmortiDetalle;
		}
		
		final JPanel jPanelCamposTablaAmortiDetalle=jPanelCamposAuxiliarTablaAmortiDetalle;
		final JPanel jPanelAccionesFormularioTablaAmortiDetalle=jPanelAccionesFormularioAuxiliarTablaAmortiDetalle;
		
		
		final JMenuBar jmenuBarTablaAmortiDetalle=this.jmenuBarTablaAmortiDetalle;		
		final JToolBar jTtoolBarTablaAmortiDetalle=this.jTtoolBarTablaAmortiDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarTablaAmortiDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaAmortiDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			jmenuBarDetalleAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jmenuBarDetalleTablaAmortiDetalle;
			jTtoolBarDetalleAuxiliarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jTtoolBarDetalleTablaAmortiDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleTablaAmortiDetalle=jmenuBarDetalleAuxiliarTablaAmortiDetalle;
		final JToolBar jTtoolBarDetalleTablaAmortiDetalle=jTtoolBarDetalleAuxiliarTablaAmortiDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaAmortiDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaAmortiDetalle;
			processRunnable.jTableDatos=jTableDatosTablaAmortiDetalle;
			processRunnable.jPanelCampos=jPanelCamposTablaAmortiDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaAmortiDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesTablaAmortiDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaAmortiDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarTablaAmortiDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaAmortiDetalle;
			processRunnable.jTtoolBar=jTtoolBarTablaAmortiDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaAmortiDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTablaAmortiDetalle ,jPanelParametrosReportesTablaAmortiDetalle, jTableDatosTablaAmortiDetalle,/*jScrollPanelDatosTablaAmortiDetalle,*/jPanelCamposTablaAmortiDetalle,jPanelPaginacionTablaAmortiDetalle, /*jScrollPanelDatosEdicionTablaAmortiDetalle,*/ jPanelAccionesTablaAmortiDetalle,jPanelAccionesFormularioTablaAmortiDetalle,jmenuBarTablaAmortiDetalle,jmenuBarDetalleTablaAmortiDetalle,jTtoolBarTablaAmortiDetalle,jTtoolBarDetalleTablaAmortiDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTablaAmortiDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTablaAmortiDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTablaAmortiDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTablaAmortiDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTablaAmortiDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTablaAmortiDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTablaAmortiDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTablaAmortiDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTablaAmortiDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tablaamortidetalleConstantesFunciones.getsFinalQueryTablaAmortiDetalle();
		String  finalQueryPaginacionTodos=this.tablaamortidetalleConstantesFunciones.getsFinalQueryTablaAmortiDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TablaAmortiDetalleConstantesFunciones.getArrayColumnasGlobalesNoTablaAmortiDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TablaAmortiDetalleConstantesFunciones.getArrayColumnasGlobalesTablaAmortiDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TablaAmortiDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tablaamortidetallesEliminados= new ArrayList<TablaAmortiDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTablaAmortiDetalle();
		
				///*TablaAmortiDetalleSessionBean*/this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			
			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
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
					this.iNumeroPaginacion=TablaAmortiDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TablaAmortiDetalleConstantesFunciones.getClassesForeignKeysOfTablaAmortiDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tablaamortidetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tablaamortidetallesAux= new ArrayList<TablaAmortiDetalle>();
			
				
			tablaamortidetalleLogic.setDatosCliente(this.datosCliente);
			tablaamortidetalleLogic.setDatosDeep(this.datosDeep);
			tablaamortidetalleLogic.setIsConDeep(true);
			
			
			tablaamortidetalleLogic.getTablaAmortiDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tablaamortidetalleLogic.getTodosTablaAmortiDetalles(finalQueryGlobal,pagination);
					
					//tablaamortidetalleLogic.getTodosTablaAmortiDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tablaamortidetalleLogic.getTablaAmortiDetalles()==null|| tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortidetallesAux= new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux= new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortidetalleLogic.getTodosTablaAmortiDetalles(finalQueryGlobal+"",this.pagination);												
							
							//tablaamortidetalleLogic.getTodosTablaAmortiDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetalleLogic.getTablaAmortiDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());					
							tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTablaAmortiDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTablaAmortiDetalle=this.idActual;
				
				} else if(this.idTablaAmortiDetalleActual!=null && this.idTablaAmortiDetalleActual!=0L) {
					idTablaAmortiDetalle=idTablaAmortiDetalleActual;
				}
				
					
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndicePorId(idTablaAmortiDetalle);
				
				this.tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tablaamortidetalleLogic.getEntity(idTablaAmortiDetalle);
					
					//tablaamortidetalleLogic.getEntityWithConnection(idTablaAmortiDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
					tablaamortidetalleLogic.getTablaAmortiDetalles().add(tablaamortidetalleLogic.getTablaAmortiDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
					this.tablaamortidetalles.add(tablaamortidetalle);
				}
				
				if(tablaamortidetalleLogic.getTablaAmortiDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdEjercicio",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdEjercicio",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdEmpresa",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdEmpresa",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdFactura",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdFactura",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdPeriodo",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdPeriodo",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdSucursal",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdSucursal",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTasa")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTasa(finalQueryGlobal,pagination,id_tasaFK_IdTasa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTasa(finalQueryGlobal,pagination,id_tasaFK_IdTasa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdTasa",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdTasa",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoIntervalo")) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTipoIntervalo(finalQueryGlobal,pagination,id_tipo_intervaloFK_IdTipoIntervalo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles()==null||tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortidetalles==null|| tablaamortidetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
						tablaamortidetallesAux.addAll(tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetallesAux=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetallesAux.addAll(tablaamortidetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTipoIntervalo(finalQueryGlobal,pagination,id_tipo_intervaloFK_IdTipoIntervalo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiDetalleConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortiDetalles("FK_IdTipoIntervalo",tablaamortidetalleLogic.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortiDetalles("FK_IdTipoIntervalo",tablaamortidetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleLogic.setTablaAmortiDetalles(new ArrayList<TablaAmortiDetalle>());
						tablaamortidetalleLogic.getTablaAmortiDetalles().addAll(tablaamortidetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalles=new ArrayList<TablaAmortiDetalle>();
							tablaamortidetalles.addAll(tablaamortidetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTablaAmortiDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTablaAmortiDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaamortidetalleLogic.getTablaAmortiDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortidetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaamortidetalleLogic.getTablaAmortiDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortidetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TablaAmortiDetalle tablaamortidetalle) {
		Boolean permite=true;
		
		if(this.tablaamortidetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TablaAmortiDetalleConstantesFunciones.getOrderByListaTablaAmortiDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TablaAmortiDetalleConstantesFunciones.getOrderByListaTablaAmortiDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				if(tablaamortidetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortidetalleTotales=tablaamortidetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmortiDetalle tablaamortidetalle:this.tablaamortidetalles) {
				if(tablaamortidetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortidetalleTotales=tablaamortidetalle;
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
			this.tablaamortidetalleAux=new TablaAmortiDetalle();
			this.tablaamortidetalleAux.setsType(Constantes2.S_TOTALES);
			this.tablaamortidetalleAux.setIsNew(false);
			this.tablaamortidetalleAux.setIsChanged(false);
			this.tablaamortidetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TablaAmortiDetalleConstantesFunciones.TotalizarValoresFilaTablaAmortiDetalle(this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this.tablaamortidetalleAux);
				
				this.tablaamortidetalleLogic.getTablaAmortiDetalles().add(this.tablaamortidetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TablaAmortiDetalleConstantesFunciones.TotalizarValoresFilaTablaAmortiDetalle(this.tablaamortidetalles,this.tablaamortidetalleAux);
				
				this.tablaamortidetalles.add(this.tablaamortidetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tablaamortidetalleTotales=new TablaAmortiDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaamortidetalleLogic.getTablaAmortiDetalles().remove(tablaamortidetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaamortidetalles.remove(tablaamortidetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tablaamortidetalleTotales=new TablaAmortiDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				if(tablaamortidetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortidetalleTotales=tablaamortidetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaAmortiDetalleConstantesFunciones.TotalizarValoresFilaTablaAmortiDetalle(this.tablaamortidetalleLogic.getTablaAmortiDetalles(),tablaamortidetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmortiDetalle tablaamortidetalle:this.tablaamortidetalles) {
				if(tablaamortidetalle.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortidetalleTotales=tablaamortidetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaAmortiDetalleConstantesFunciones.TotalizarValoresFilaTablaAmortiDetalle(this.tablaamortidetalles,tablaamortidetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTablaAmortiDetallesFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdTasa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTasa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortiDetallesFK_IdTipoIntervalo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIntervalo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTablaAmortiDetallesFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdTasa(String sFinalQuery,Long id_tasa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTasa(sFinalQuery,this.pagination,id_tasa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortiDetallesFK_IdTipoIntervalo(String sFinalQuery,Long id_tipo_intervalo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLogic.getTablaAmortiDetallesFK_IdTipoIntervalo(sFinalQuery,this.pagination,id_tipo_intervalo);
				
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
	
	public void inicializarPermisosTablaAmortiDetalle() {
		this.isPermisoTodoTablaAmortiDetalle=false;
		this.isPermisoNuevoTablaAmortiDetalle=false;
		this.isPermisoActualizarTablaAmortiDetalle=false;
		this.isPermisoActualizarOriginalTablaAmortiDetalle=false;
		this.isPermisoEliminarTablaAmortiDetalle=false;
		this.isPermisoGuardarCambiosTablaAmortiDetalle=false;
		this.isPermisoConsultaTablaAmortiDetalle=false;
		this.isPermisoBusquedaTablaAmortiDetalle=false;
		this.isPermisoReporteTablaAmortiDetalle=false;		
		this.isPermisoOrdenTablaAmortiDetalle=false;		
		this.isPermisoPaginacionMedioTablaAmortiDetalle=false;		
		this.isPermisoPaginacionAltoTablaAmortiDetalle=false;
		this.isPermisoPaginacionTodoTablaAmortiDetalle=false;
		this.isPermisoCopiarTablaAmortiDetalle=false;		
		this.isPermisoVerFormTablaAmortiDetalle=false;		
		this.isPermisoDuplicarTablaAmortiDetalle=false;		
		this.isPermisoOrdenTablaAmortiDetalle=false;		
	}
	
	public void setPermisosUsuarioTablaAmortiDetalle(Boolean isPermiso) {
		this.isPermisoTodoTablaAmortiDetalle=isPermiso;
		this.isPermisoNuevoTablaAmortiDetalle=isPermiso;
		this.isPermisoActualizarTablaAmortiDetalle=isPermiso;
		this.isPermisoActualizarOriginalTablaAmortiDetalle=isPermiso;
		this.isPermisoEliminarTablaAmortiDetalle=isPermiso;
		this.isPermisoGuardarCambiosTablaAmortiDetalle=isPermiso;
		this.isPermisoConsultaTablaAmortiDetalle=isPermiso;
		this.isPermisoBusquedaTablaAmortiDetalle=isPermiso;
		this.isPermisoReporteTablaAmortiDetalle=isPermiso;
		this.isPermisoOrdenTablaAmortiDetalle=isPermiso;		
		this.isPermisoPaginacionMedioTablaAmortiDetalle=isPermiso;		
		this.isPermisoPaginacionAltoTablaAmortiDetalle=isPermiso;		
		this.isPermisoPaginacionTodoTablaAmortiDetalle=isPermiso;		
		this.isPermisoCopiarTablaAmortiDetalle=isPermiso;		
		this.isPermisoVerFormTablaAmortiDetalle=isPermiso;		
		this.isPermisoDuplicarTablaAmortiDetalle=isPermiso;
		this.isPermisoOrdenTablaAmortiDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTablaAmortiDetalle(Boolean isPermiso) {
		//this.isPermisoTodoTablaAmortiDetalle=isPermiso;
		this.isPermisoNuevoTablaAmortiDetalle=isPermiso;
		this.isPermisoActualizarTablaAmortiDetalle=isPermiso;
		this.isPermisoActualizarOriginalTablaAmortiDetalle=isPermiso;
		this.isPermisoEliminarTablaAmortiDetalle=isPermiso;
		this.isPermisoGuardarCambiosTablaAmortiDetalle=isPermiso;
		//this.isPermisoConsultaTablaAmortiDetalle=isPermiso;
		//this.isPermisoBusquedaTablaAmortiDetalle=isPermiso;
		//this.isPermisoReporteTablaAmortiDetalle=isPermiso;
		//this.isPermisoOrdenTablaAmortiDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioTablaAmortiDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoTablaAmortiDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoTablaAmortiDetalle=isPermiso;		
		//this.isPermisoCopiarTablaAmortiDetalle=isPermiso;		
		//this.isPermisoDuplicarTablaAmortiDetalle=isPermiso;
		//this.isPermisoOrdenTablaAmortiDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTablaAmortiDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TablaAmortiDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTablaAmortiDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTablaAmortiDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTablaAmortiDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTablaAmortiDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTablaAmortiDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TablaAmortiDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTablaAmortiDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTablaAmortiDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTablaAmortiDetalle=this.isPermisoActualizarTablaAmortiDetalle;
			this.isPermisoEliminarTablaAmortiDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTablaAmortiDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTablaAmortiDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTablaAmortiDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTablaAmortiDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTablaAmortiDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaAmortiDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTablaAmortiDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTablaAmortiDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTablaAmortiDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTablaAmortiDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTablaAmortiDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTablaAmortiDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaAmortiDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTablaAmortiDetalle.setToolTipText(this.jTableDatosTablaAmortiDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTablaAmortiDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTablaAmortiDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TablaAmortiDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TablaAmortiDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTablaAmortiDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyTablaAmortiDetalleListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tasasForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.tipointervalosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTablaAmortiDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TablaAmortiDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTablaAmortiDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTasaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIntervaloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTasaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tasasForeignKey==null||this.tasasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TasaConstantesFunciones.getArrayColumnasGlobalesTasa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TasaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TasaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTasasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIntervaloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipointervalosForeignKey==null||this.tipointervalosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesTipoIntervalo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIntervaloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIntervaloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIntervalosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTablaAmortiDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleReturnGeneral=new TablaAmortiDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_empresaTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_empresaTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_sucursalTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_sucursalTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_ejercicioTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_ejercicioTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_periodoTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_periodoTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalTasa="";

				if(((this.tasasForeignKey==null||this.tasasForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_tasaTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_tasaTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TasaConstantesFunciones.getArrayColumnasGlobalesTasa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTasa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TasaConstantesFunciones.TABLENAME);

						finalQueryGlobalTasa=Funciones.GetFinalQueryAppend(finalQueryGlobalTasa, "");
						finalQueryGlobalTasa+=TasaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTasasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTasa=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidTasaActual();
					}
				} else {
					finalQueryGlobalTasa="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_facturaTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_facturaTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalTipoIntervalo="";

				if(((this.tipointervalosForeignKey==null||this.tipointervalosForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_tipo_intervaloTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_tipo_intervaloTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesTipoIntervalo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIntervalo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIntervaloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIntervalo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIntervalo, "");
						finalQueryGlobalTipoIntervalo+=TipoIntervaloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIntervalosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIntervalo=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidTipoIntervaloActual();
					}
				} else {
					finalQueryGlobalTipoIntervalo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_anioTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_anioTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.tablaamortidetalleConstantesFunciones.cargarid_mesTablaAmortiDetalle)
					 || (this.esRecargarFks && this.tablaamortidetalleConstantesFunciones.cargarid_mesTablaAmortiDetalle)) {

					if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+tablaamortidetalleSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.cargarCombosLoteForeignKeyTablaAmortiDetalle(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalTasa,finalQueryGlobalFactura,finalQueryGlobalTipoIntervalo,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tablaamortidetalleReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=tablaamortidetalleReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=tablaamortidetalleReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=tablaamortidetalleReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalTasa.equals("NONE")) {
				this.tasasForeignKey=tablaamortidetalleReturnGeneral.gettasasForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=tablaamortidetalleReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalTipoIntervalo.equals("NONE")) {
				this.tipointervalosForeignKey=tablaamortidetalleReturnGeneral.gettipointervalosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=tablaamortidetalleReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=tablaamortidetalleReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTablaAmortiDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTasa();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyTipoIntervalo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tablaamortidetalleSessionBean==null) {
				this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyTasa()throws Exception {
		try {

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {
				Tasa tasa=new Tasa();
				TasaConstantesFunciones.setTasaDescripcion(tasa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tasa.setId(null);

				if(!TasaConstantesFunciones.ExisteEnLista(this.tasasForeignKey,tasa,true)) {

					this.tasasForeignKey.add(0,tasa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIntervalo()throws Exception {
		try {

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {
				TipoIntervalo tipointervalo=new TipoIntervalo();
				TipoIntervaloConstantesFunciones.setTipoIntervaloDescripcion(tipointervalo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipointervalo.setId(null);

				if(!TipoIntervaloConstantesFunciones.ExisteEnLista(this.tipointervalosForeignKey,tipointervalo,true)) {

					this.tipointervalosForeignKey.add(0,tipointervalo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.tablaamortidetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTablaAmortiDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTablaAmortiDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTablaAmortiDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.tablaamortidetalle.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.tablaamortidetalle.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
				this.tablaamortidetalle.setfecha_inicial(this.parametroGeneralUsuario.getfecha_sistema());
				this.tablaamortidetalle.setfecha_final(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmortiDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle)throws Exception {	
		try {
			
			this.setActualTasaForeignKey(tablaamortidetalle.getid_tasa(),false,"Formulario");
			this.setActualFacturaForeignKey(tablaamortidetalle.getid_factura(),false,"Formulario");
			this.setActualTipoIntervaloForeignKey(tablaamortidetalle.getid_tipo_intervalo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tablaamortidetalle.getFactura()!=null && !sTipoEvento.equals("id_facturaTablaAmortiDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(tablaamortidetalle.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTablaAmortiDetalle()throws Exception {	
		try {
			
			this.setActualTasaForeignKey(this.tablaamortidetalleConstantesFunciones.getid_tasa(),false,"Formulario");
			this.setActualFacturaForeignKey(this.tablaamortidetalleConstantesFunciones.getid_factura(),false,"Formulario");
			this.setActualTipoIntervaloForeignKey(this.tablaamortidetalleConstantesFunciones.getid_tipo_intervalo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmortiDetalle()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTablaAmortiDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTablaAmortiDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTablaAmortiDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTablaAmortiDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTasasForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameTipoIntervalosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTablaAmortiDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTasasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIntervalosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTablaAmortiDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public TablaAmortiDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TablaAmortiDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TablaAmortiDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean(); 
		this.tablaamortidetalleConstantesFunciones=new TablaAmortiDetalleConstantesFunciones(); 
		this.tablaamortidetalleBean=new TablaAmortiDetalle();//(this.tablaamortidetalleConstantesFunciones); 		
		this.tablaamortidetalleReturnGeneral=new TablaAmortiDetalleParameterReturnGeneral(); 
		
		this.tablaamortidetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TablaAmortiDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TablaAmortiDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TablaAmortiDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTablaAmortiDetalle(true);
			
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
			
			this.tablaamortidetalleConstantesFunciones=new TablaAmortiDetalleConstantesFunciones(); 
			this.tablaamortidetalleBean=new TablaAmortiDetalle();//this.tablaamortidetalleConstantesFunciones); 			
			this.tablaamortidetalleReturnGeneral=new TablaAmortiDetalleParameterReturnGeneral(); 
		
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Amortizacion Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tablaamortidetalle=new TablaAmortiDetalle();
			this.tablaamortidetalles = new ArrayList<TablaAmortiDetalle>();
			this.tablaamortidetallesAux = new ArrayList<TablaAmortiDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic=new TablaAmortiDetalleLogic();
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.tablaamortidetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTablaAmortiDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaAmortiDetalle);	
					}
					
					if(this.jInternalFrameImportacionTablaAmortiDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaAmortiDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTablaAmortiDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTablaAmortiDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaAmortiDetalle);
				this.jInternalFrameDetalleFormTablaAmortiDetalle.setVisible(false);
				this.jInternalFrameDetalleFormTablaAmortiDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaAmortiDetalle);
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTablaAmortiDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTablaAmortiDetalle);
					this.jInternalFrameImportacionTablaAmortiDetalle.setVisible(false);
					this.jInternalFrameImportacionTablaAmortiDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTablaAmortiDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTablaAmortiDetalle);
					this.jInternalFrameOrderByTablaAmortiDetalle.setVisible(false);
					this.jInternalFrameOrderByTablaAmortiDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTablaAmortiDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TablaAmortiDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tablaamortidetalleReturnGeneral=new TablaAmortiDetalleParameterReturnGeneral();
			
			this.tablaamortidetalleParameterGeneral=new TablaAmortiDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tablaamortidetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TablaAmortiDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),this.tablaamortidetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),this.tablaamortidetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaDuplicarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaCopiarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaVerFormTablaAmortiDetalle=true;
			this.isVisibilidadCeldaOrdenTablaAmortiDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTasa=true;
			this.isVisibilidadFK_IdTipoIntervalo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTablaAmortiDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTablaAmortiDetalle(false);
			
			this.setPermisosUsuarioTablaAmortiDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.tablaamortidetalleSessionBean.getEsGuardarRelacionado() && this.tablaamortidetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTablaAmortiDetalleClasesRelacionadas();
			}
			
			if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTablaAmortiDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTablaAmortiDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTablaAmortiDetalle();
			}
			
			if(!this.isPermisoBusquedaTablaAmortiDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTablaAmortiDetalle,this.isPermisoPaginacionMedioTablaAmortiDetalle,this.isPermisoPaginacionTodoTablaAmortiDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TablaAmortiDetalleConstantesFunciones.getTiposSeleccionarTablaAmortiDetalle());
				
				this.tiposColumnasSelect=TablaAmortiDetalleConstantesFunciones.getTiposSeleccionarTablaAmortiDetalle(true);
				
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
			//if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTablaAmortiDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTablaAmortiDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTablaAmortiDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmortiDetalle() ;
			
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
			this.periodoLogic=new PeriodoLogic();
			this.tasaLogic=new TasaLogic();
			this.facturaLogic=new FacturaLogic();
			this.tipointervaloLogic=new TipoIntervaloLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tablaamortidetalleImplementable= (TablaAmortiDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaAmortiDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tablaamortidetalleImplementableHome= (TablaAmortiDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaAmortiDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tablaamortidetalles= new ArrayList<TablaAmortiDetalle>();
			this.tablaamortidetallesEliminados= new ArrayList<TablaAmortiDetalle>();
						
			this.isEsNuevoTablaAmortiDetalle=false;
			this.esParaAccionDesdeFormularioTablaAmortiDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tasasForeignKey=new ArrayList<Tasa>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTablaAmortiDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTablaAmortiDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TablaAmortiDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTablaAmortiDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTablaAmortiDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTablaAmortiDetalle();
			}
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTablaAmortiDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTablaAmortiDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTablaAmortiDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTablaAmortiDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TablaAmortiDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTablaAmortiDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTablaAmortiDetalle")) {
				iIndex=this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTablaAmortiDetalle();	
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
	
	public void cargarCombosForeignKeyTablaAmortiDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTablaAmortiDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTablaAmortiDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTablaAmortiDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTablaAmortiDetalle();
		
		this.cargarCombosFrameForeignKeyTablaAmortiDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTablaAmortiDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTablaAmortiDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyTasa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTasaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTasa();
				this.cargarCombosFrameTasasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTasa(this.tasasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIntervalo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIntervaloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIntervalo();
				this.cargarCombosFrameTipoIntervalosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIntervalo(this.tipointervalosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTablaAmortiDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			
			if(jTableDatosTablaAmortiDetalle.getRowCount()>=1) {
				jTableDatosTablaAmortiDetalle.removeRowSelectionInterval(0, jTableDatosTablaAmortiDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoTablaAmortiDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTablaAmortiDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTablaAmortiDetalle(true);			
			//this.tablaamortidetalle=new TablaAmortiDetalle();
			//this.tablaamortidetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle() ;
			
			if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmortiDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tablaamortidetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);				
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TablaAmortiDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTablaAmortiDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTablaAmortiDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTablaAmortiDetalle.getSelectedRows().length;			
			}
			
			tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTablaAmortiDetalle--;			
				//TablaAmortiDetalle tablaamortidetalleAux= new TablaAmortiDetalle();			
				//tablaamortidetalleAux.setId(this.iIdNuevoTablaAmortiDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TablaAmortiDetalle tablaamortidetalleOrigen=new TablaAmortiDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TablaAmortiDetalle tablaamortidetalleOrigen : tablaamortidetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tablaamortidetalleOrigen =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortidetalleOrigen =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTablaAmortiDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tablaamortidetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTablaAmortiDetalle(tablaamortidetalleOrigen,this.tablaamortidetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaamortidetalleLogic.getTablaAmortiDetalles().add(this.tablaamortidetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalles.add(this.tablaamortidetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
				
				this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(this.getIndiceNuevoTablaAmortiDetalle(), this.getIndiceNuevoTablaAmortiDetalle());
				
				int iLastRow =  this.jTableDatosTablaAmortiDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaAmortiDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaAmortiDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();									
		
			TablaAmortiDetalle tablaamortidetalleOrigen=new TablaAmortiDetalle();
			TablaAmortiDetalle tablaamortidetalleDestino=new TablaAmortiDetalle();
				
			tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTablaAmortiDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tablaamortidetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTablaAmortiDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleOrigen =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaamortidetalleOrigen =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortidetalleDestino =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaamortidetalleDestino =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tablaamortidetalleOrigen =tablaamortidetallesSeleccionados.get(0);
				tablaamortidetalleDestino =tablaamortidetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTablaAmortiDetalle(tablaamortidetalleOrigen,tablaamortidetalleDestino,true,false);
				
				tablaamortidetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaamortidetalleDestino,tablaamortidetalleLogic.getTablaAmortiDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortidetalleDestino,tablaamortidetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
				
				//this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(this.getIndiceNuevoTablaAmortiDetalle(), this.getIndiceNuevoTablaAmortiDetalle());
				
				int iLastRow =  this.jTableDatosTablaAmortiDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaAmortiDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaAmortiDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTablaAmortiDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(!isVisible);
			this.jPanelPaginacionTablaAmortiDetalle.setVisible(!isVisible);
			this.jPanelAccionesTablaAmortiDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTablaAmortiDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTablaAmortiDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTablaAmortiDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTablaAmortiDetalle();
			
			this.abrirFrameOrderByTablaAmortiDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTablaAmortiDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTablaAmortiDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaAmortiDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTablaAmortiDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTablaAmortiDetalle.setSize(this.jInternalFrameDetalleFormTablaAmortiDetalle.iWidthFormulario,this.jInternalFrameDetalleFormTablaAmortiDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTablaAmortiDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTablaAmortiDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTablaAmortiDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jContentPaneDetalleTablaAmortiDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTablaAmortiDetalle.jContentPaneDetalleTablaAmortiDetalle.getWidth(),TablaAmortiDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTablaAmortiDetalle.jContentPaneDetalleTablaAmortiDetalle.getWidth(),TablaAmortiDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTablaAmortiDetalle.jContentPaneDetalleTablaAmortiDetalle.getWidth(),TablaAmortiDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTablaAmortiDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormTablaAmortiDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTablaAmortiDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTablaAmortiDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTablaAmortiDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmortiDetalle,false,this);
				} else {
					this.jInternalFrameOrderByTablaAmortiDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmortiDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTablaAmortiDetalle);
				this.jInternalFrameOrderByTablaAmortiDetalle.setVisible(false);
				this.jInternalFrameOrderByTablaAmortiDetalle.setSelected(false);
				
				this.jInternalFrameOrderByTablaAmortiDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaAmortiDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByTablaAmortiDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTablaAmortiDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTablaAmortiDetalle==null) {
				
				this.jInternalFrameImportacionTablaAmortiDetalle=new ImportacionJInternalFrame(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaAmortiDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTablaAmortiDetalle);
				this.jInternalFrameImportacionTablaAmortiDetalle.setVisible(false);
				this.jInternalFrameImportacionTablaAmortiDetalle.setSelected(false);


				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaAmortiDetalle"));
				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaAmortiDetalle"));
				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaAmortiDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTablaAmortiDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle==null) {
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle=new ReporteDinamicoJInternalFrame(TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaAmortiDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaAmortiDetalle);
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmortiDetalle"));
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmortiDetalle"));
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmortiDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmortiDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTablaAmortiDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaAmortiDetalle);
			
	       	this.jInternalFrameDetalleFormTablaAmortiDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormTablaAmortiDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormTablaAmortiDetalle.dispose();
			//this.jInternalFrameDetalleFormTablaAmortiDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTablaAmortiDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTablaAmortiDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTablaAmortiDetalle.setVisible(true);
	        this.jInternalFrameImportacionTablaAmortiDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTablaAmortiDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTablaAmortiDetalle.setVisible(true);
	        this.jInternalFrameOrderByTablaAmortiDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTablaAmortiDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTablaAmortiDetalle.setVisible(false);
	        this.jInternalFrameOrderByTablaAmortiDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTablaAmortiDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTablaAmortiDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTablaAmortiDetalle.setVisible(false);
	        this.jInternalFrameImportacionTablaAmortiDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTablaAmortiDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTablaAmortiDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTablaAmortiDetalle(true);
			//this.isEsNuevoTablaAmortiDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false) ;
			
			if(tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmortiDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTablaAmortiDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTablaAmortiDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTablaAmortiDetalle(true);
			//this.isEsNuevoTablaAmortiDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tablaamortidetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false) ;
			
			if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmortiDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.tablaamortidetalleConstantesFunciones.cargarid_facturaTablaAmortiDetalle) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaTasa(List<Tasa> tasasForeignKey)throws Exception{
		TableColumn tableColumnTasa=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA));
		TableCellEditor tableCellEditorTasa =tableColumnTasa.getCellEditor();

		TasaTableCell tasaTableCellFk=(TasaTableCell)tableCellEditorTasa;

		if(tasaTableCellFk!=null) {
			tasaTableCellFk.settasasForeignKey(tasasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tasaTableCellFk.setRowActual(intSelectedRow);
			//tasaTableCellFk.settasasForeignKeyActual(tasasForeignKey);
		//}


		if(tasaTableCellFk!=null) {
			tasaTableCellFk.RecargarTasasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIntervalo(List<TipoIntervalo> tipointervalosForeignKey)throws Exception{
		TableColumn tableColumnTipoIntervalo=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO));
		TableCellEditor tableCellEditorTipoIntervalo =tableColumnTipoIntervalo.getCellEditor();

		TipoIntervaloTableCell tipointervaloTableCellFk=(TipoIntervaloTableCell)tableCellEditorTipoIntervalo;

		if(tipointervaloTableCellFk!=null) {
			tipointervaloTableCellFk.settipointervalosForeignKey(tipointervalosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipointervaloTableCellFk.setRowActual(intSelectedRow);
			//tipointervaloTableCellFk.settipointervalosForeignKeyActual(tipointervalosForeignKey);
		//}


		if(tipointervaloTableCellFk!=null) {
			tipointervaloTableCellFk.RecargarTipoIntervalosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTablaAmortiDetalle(false);
			
			//if(!this.isEsNuevoTablaAmortiDetalle) {								
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				
			}
			
			if(this.permiteMantenimiento(this.tablaamortidetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTablaAmortiDetalle=true;
					this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
					this.isEsNuevoTablaAmortiDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTablaAmortiDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTablaAmortiDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(false);
				
				this.habilitarDeshabilitarControlesTablaAmortiDetalle(false);
			
												
				
				if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTablaAmortiDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTablaAmortiDetalleActionPerformed(evt,tablaamortidetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTablaAmortiDetalle(this.tablaamortidetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tablaamortidetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tablaamortidetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				this.tablaamortidetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				this.tablaamortidetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tablaamortidetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TablaAmortiDetalleModel) this.jTableDatosTablaAmortiDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTablaAmortiDetalle=true;
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
				this.isEsNuevoTablaAmortiDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(false);
				
				this.habilitarDeshabilitarControlesTablaAmortiDetalle(false);
				
				
				
				if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTablaAmortiDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTablaAmortiDetalle.getRowCount()>=1) {
				jTableDatosTablaAmortiDetalle.removeRowSelectionInterval(0, jTableDatosTablaAmortiDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTablaAmortiDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(false) ;
			
			this.isEsNuevoTablaAmortiDetalle=false;
			
			if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTablaAmortiDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTablaAmortiDetalle(false);
				
				//SI ES MANUAL
				if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTablaAmortiDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTablaAmortiDetalle--;			
			//TablaAmortiDetalle tablaamortidetalleAux= new TablaAmortiDetalle();			
			//tablaamortidetalleAux.setId(this.iIdNuevoTablaAmortiDetalle);
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTablaAmortiDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
			
			this.tablaamortidetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tablaamortidetalleLogic.getTablaAmortiDetalles().add(this.tablaamortidetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tablaamortidetalles.add(this.tablaamortidetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			
			this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(this.getIndiceNuevoTablaAmortiDetalle(), this.getIndiceNuevoTablaAmortiDetalle());
			
			int iLastRow =  this.jTableDatosTablaAmortiDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTablaAmortiDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTablaAmortiDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
			
			//SI ES MANUAL
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmortiDetalle();
			}
			
			//this.abrirFrameTreeTablaAmortiDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tabla Amortizacion DetalleS ?", "MANTENIMIENTO DE Tabla Amortizacion Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTablaAmortiDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTablaAmortiDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.procesarImportacionTablaAmortiDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tablaamortidetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTablaAmortiDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTablaAmortiDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTablaAmortiDetalle.setFileImportacion(this.jInternalFrameImportacionTablaAmortiDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTablaAmortiDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTablaAmortiDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTablaAmortiDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTablaAmortiDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		

		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TablaAmortiDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TablaAmortiDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Tasa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Tasa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Tasa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Tasa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIntervalo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIntervalo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIntervalo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIntervalo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_INTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_teres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_teres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_teres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_teres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_pital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_pital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_pital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_pital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuota_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuota_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuota_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuota_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA:
					sNombreCampoCategoria="id_tasa";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO:
					sNombreCampoCategoria="id_tipo_intervalo";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL:
					sNombreCampoCategoria="fecha_inicial";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL:
					sNombreCampoCategoria="fecha_final";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoria="interes";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoria="capital";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoria="numero_cuotas";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA:
					sNombreCampoCategoriaValor="id_tasa";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO:
					sNombreCampoCategoriaValor="id_tipo_intervalo";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL:
					sNombreCampoCategoriaValor="fecha_inicial";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL:
					sNombreCampoCategoriaValor="fecha_final";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoriaValor="interes";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoriaValor="capital";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA:
					sNombreCampoCategoriaValor="numero_cuotas";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tasa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tasa");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Intervalo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_intervalo");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicial");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_final");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_INTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"interes");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"capital");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuotas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuotas");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TablaAmortiDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.gettasa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.gettipointervalo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getfecha_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getfecha_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_INTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getinteres());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getcapital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getnumero_cuotas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiDetalleConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(TablaAmortiDetalle tablaamortidetalle:tablaamortidetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamortidetalle.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelTablaAmortiDetalle(row);				
			//	iRow++;
			//}				
			
			//for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTablaAmortiDetalle(tablaamortidetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
			
			//SI ES MANUAL
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmortiDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
			
			//SI ES MANUAL
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaAmortiDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
			
			//SI ES MANUAL
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaAmortiDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTablaAmortiDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTablaAmortiDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTablaAmortiDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTablaAmortiDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTablaAmortiDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTablaAmortiDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosTablaAmortiDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosTablaAmortiDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTablaAmortiDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTablaAmortiDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTablaAmortiDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTablaAmortiDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTablaAmortiDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTablaAmortiDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmortiDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTablaAmortiDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTablaAmortiDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTablaAmortiDetalle();
		
		this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTablaAmortiDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmortiDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmortiDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmortiDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTablaAmortiDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTablaAmortiDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionNuevoTablaAmortiDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTablaAmortiDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTablaAmortiDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionNuevoTablaAmortiDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionSinCerrarTablaAmortiDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jCheckBoxPostAccionSinMensajeTablaAmortiDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTablaAmortiDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTablaAmortiDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTablaAmortiDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTablaAmortiDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTablaAmortiDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTablaAmortiDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTablaAmortiDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTablaAmortiDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmortiDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmortiDetalle() throws Exception {
		try	{
			if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaAmortiDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaAmortiDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaAmortiDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTablaAmortiDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTablaAmortiDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTablaAmortiDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTablaAmortiDetalle.addItem(reporte);
			}
			
			
			if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTablaAmortiDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTablaAmortiDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTablaAmortiDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTablaAmortiDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTablaAmortiDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTablaAmortiDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTablaAmortiDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmortiDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmortiDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TablaAmortiDetalleConstantesFunciones.getTiposSeleccionarTablaAmortiDetalle(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TablaAmortiDetalleConstantesFunciones.getTiposSeleccionarTablaAmortiDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TablaAmortiDetalleConstantesFunciones.getTiposSeleccionarTablaAmortiDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTablaAmortiDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaTablaAmortiDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.getSelectedItem()!=null){this.id_tasaFK_IdTasa=((Tasa)this.jComboBoxid_tasaFK_IdTasaTablaAmortiDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.getSelectedItem()!=null){this.id_tipo_intervaloFK_IdTipoIntervalo=((TipoIntervalo)this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloTablaAmortiDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTablaAmortiDetalle(Boolean esInicializar) throws Exception {				
		if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTablaAmortiDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTablaAmortiDetalle() throws Exception {
		this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTablaAmortiDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTablaAmortiDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTablaAmortiDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tablaamortidetalleLogic.getTablaAmortiDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tablaamortidetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTablaAmortiDetalle.setModel(new TablaAmortiDetalleModel(this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTablaAmortiDetalle.setModel(new TablaAmortiDetalleModel(this.tablaamortidetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTablaAmortiDetalle!=null && this.jInternalFrameOrderByTablaAmortiDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTablaAmortiDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,tablaamortidetalleConstantesFunciones.resaltarSeleccionarTablaAmortiDetalle,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TablaAmortiDetalleConstantesFunciones.SCLASSWEBTITULO,tablaamortidetalleConstantesFunciones.resaltarSeleccionarTablaAmortiDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_ID));

		if(this.tablaamortidetalleConstantesFunciones.mostraridTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortidetalleConstantesFunciones.resaltaridTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activaridTablaAmortiDetalle,iSizeTabla,this,true,"idTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltaridTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activaridTablaAmortiDetalle,this,true,"idTablaAmortiDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_empresaTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_empresaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_empresaTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_empresaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_empresaTablaAmortiDetalle,false,"id_empresaTablaAmortiDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_sucursalTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_sucursalTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_sucursalTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_sucursalTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_sucursalTablaAmortiDetalle,false,"id_sucursalTablaAmortiDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_ejercicioTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_ejercicioTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_ejercicioTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_ejercicioTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_ejercicioTablaAmortiDetalle,false,"id_ejercicioTablaAmortiDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_periodoTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_periodoTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_periodoTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_periodoTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_periodoTablaAmortiDetalle,false,"id_periodoTablaAmortiDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_tasaTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TasaTableCell(this.tasasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_tasaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_tasaTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new TasaTableCell(this.tasasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_tasaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_tasaTablaAmortiDetalle,true,"id_tasaTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_facturaTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_facturaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_facturaTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_facturaTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_facturaTablaAmortiDetalle,true,"id_facturaTablaAmortiDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_tipo_intervaloTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIntervaloTableCell(this.tipointervalosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_tipo_intervaloTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_tipo_intervaloTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new TipoIntervaloTableCell(this.tipointervalosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_tipo_intervaloTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_tipo_intervaloTablaAmortiDetalle,true,"id_tipo_intervaloTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION));

		if(this.tablaamortidetalleConstantesFunciones.mostrarfecha_emisionTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_emisionTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_emisionTablaAmortiDetalle,iSizeTabla,this,true,"fecha_emisionTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_emisionTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_emisionTablaAmortiDetalle,this,true,"fecha_emisionTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.tablaamortidetalleConstantesFunciones.mostrarfecha_vencimientoTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_vencimientoTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_vencimientoTablaAmortiDetalle,iSizeTabla,this,true,"fecha_vencimientoTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_vencimientoTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_vencimientoTablaAmortiDetalle,this,true,"fecha_vencimientoTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL));

		if(this.tablaamortidetalleConstantesFunciones.mostrarfecha_inicialTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_inicialTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_inicialTablaAmortiDetalle,iSizeTabla,this,true,"fecha_inicialTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_inicialTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_inicialTablaAmortiDetalle,this,true,"fecha_inicialTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL));

		if(this.tablaamortidetalleConstantesFunciones.mostrarfecha_finalTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_finalTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_finalTablaAmortiDetalle,iSizeTabla,this,true,"fecha_finalTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarfecha_finalTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarfecha_finalTablaAmortiDetalle,this,true,"fecha_finalTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_VALOR));

		if(this.tablaamortidetalleConstantesFunciones.mostrarvalorTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortidetalleConstantesFunciones.resaltarvalorTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarvalorTablaAmortiDetalle,iSizeTabla,this,true,"valorTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarvalorTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarvalorTablaAmortiDetalle,this,true,"valorTablaAmortiDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_INTERES));

		if(this.tablaamortidetalleConstantesFunciones.mostrarinteresTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_INTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortidetalleConstantesFunciones.resaltarinteresTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarinteresTablaAmortiDetalle,iSizeTabla,this,true,"interesTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarinteresTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarinteresTablaAmortiDetalle,this,true,"interesTablaAmortiDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL));

		if(this.tablaamortidetalleConstantesFunciones.mostrarcapitalTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortidetalleConstantesFunciones.resaltarcapitalTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarcapitalTablaAmortiDetalle,iSizeTabla,this,true,"capitalTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarcapitalTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarcapitalTablaAmortiDetalle,this,true,"capitalTablaAmortiDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA));

		if(this.tablaamortidetalleConstantesFunciones.mostrarnumero_cuotasTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortidetalleConstantesFunciones.resaltarnumero_cuotasTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarnumero_cuotasTablaAmortiDetalle,iSizeTabla,this,true,"numero_cuotasTablaAmortiDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortidetalleConstantesFunciones.resaltarnumero_cuotasTablaAmortiDetalle,this.tablaamortidetalleConstantesFunciones.activarnumero_cuotasTablaAmortiDetalle,this,true,"numero_cuotasTablaAmortiDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_anioTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_anioTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_anioTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_anioTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_anioTablaAmortiDetalle,true,"id_anioTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,TablaAmortiDetalleConstantesFunciones.LABEL_IDMES));

		if(this.tablaamortidetalleConstantesFunciones.mostrarid_mesTablaAmortiDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiDetalleConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_mesTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_mesTablaAmortiDetalle,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.tablaamortidetalleConstantesFunciones.resaltarid_mesTablaAmortiDetalle,this,this.tablaamortidetalleConstantesFunciones.activarid_mesTablaAmortiDetalle,true,"id_mesTablaAmortiDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaAmortiDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaAmortiDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTablaAmortiDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosTablaAmortiDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTablaAmortiDetalle.moveColumn(this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTablaAmortiDetalle.moveColumn(this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTablaAmortiDetalle.moveColumn(this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTablaAmortiDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTablaAmortiDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTablaAmortiDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTablaAmortiDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTablaAmortiDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTablaAmortiDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tablaamortidetalleLogic.getTablaAmortiDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tablaamortidetalles.size()-1;
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
		//this.jTableDatosTablaAmortiDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTablaAmortiDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTablaAmortiDetalle();
			
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
				
				//this.isEsNuevoTablaAmortiDetalle=false;
					
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
				if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaAmortiDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tablaamortidetalle.getsType().equals("DUPLICADO")
				   || this.tablaamortidetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTablaAmortiDetalle=true;
				
				} else {
					this.isEsNuevoTablaAmortiDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.tablaamortidetalle.getId()>=0 && !this.tablaamortidetalle.getIsNew()) {						
						this.isEsNuevoTablaAmortiDetalle=false;
						
					} else {
						this.isEsNuevoTablaAmortiDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTablaAmortiDetalle(esRelaciones);						
				
				this.seleccionarTablaAmortiDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tablaamortidetalle.getId()<0) {
					this.isEsNuevoTablaAmortiDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTablaAmortiDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTablaAmortiDetalle(evt,rowIndex);
				}	
				
				if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TablaAmortiDetalle: " + this.dDif); 
					}
				}								
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTablaAmortiDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tablaamortidetalle)) {
					if(this.tablaamortidetalle.getId()>0) {
						this.tablaamortidetalle.setIsDeleted(true);
						
						this.tablaamortidetallesEliminados.add(this.tablaamortidetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaamortidetalleLogic.getTablaAmortiDetalles().remove(this.tablaamortidetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalles.remove(this.tablaamortidetalle);				
					}
					
					
					((TablaAmortiDetalleModel) this.jTableDatosTablaAmortiDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTablaAmortiDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTablaAmortiDetalle) {
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaAmortiDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaAmortiDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_empresaTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_empresaTablaAmortiDetalle) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tablaamortidetalle.getid_empresa());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tablaamortidetalle.getEmpresa()!=null) {
							this.empresasForeignKey.add(tablaamortidetalle.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tablaamortidetalle.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_sucursalTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_sucursalTablaAmortiDetalle) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.tablaamortidetalle.getid_sucursal());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(tablaamortidetalle.getSucursal()!=null) {
							this.sucursalsForeignKey.add(tablaamortidetalle.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.tablaamortidetalle.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_ejercicioTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_ejercicioTablaAmortiDetalle) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.tablaamortidetalle.getid_ejercicio());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(tablaamortidetalle.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(tablaamortidetalle.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.tablaamortidetalle.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_periodoTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_periodoTablaAmortiDetalle) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.tablaamortidetalle.getid_periodo());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(tablaamortidetalle.getPeriodo()!=null) {
							this.periodosForeignKey.add(tablaamortidetalle.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.tablaamortidetalle.getid_periodo(),false,"Formulario");

					//Tasa
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_tasaTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_tasaTablaAmortiDetalle) {
						//this.cargarCombosTasasForeignKeyLista(" where id="+this.tablaamortidetalle.getid_tasa());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.tasasForeignKey=new ArrayList<Tasa>();

						if(tablaamortidetalle.getTasa()!=null) {
							this.tasasForeignKey.add(tablaamortidetalle.getTasa());
						}

						this.addItemDefectoCombosForeignKeyTasa();
						this.cargarCombosFrameTasasForeignKey("Todos");
					}
					this.setActualTasaForeignKey(this.tablaamortidetalle.getid_tasa(),false,"Formulario");

					//Factura
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_facturaTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_facturaTablaAmortiDetalle) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.tablaamortidetalle.getid_factura());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(tablaamortidetalle.getFactura()!=null) {
							this.facturasForeignKey.add(tablaamortidetalle.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.tablaamortidetalle.getid_factura(),false,"Formulario");

					//TipoIntervalo
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_tipo_intervaloTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_tipo_intervaloTablaAmortiDetalle) {
						//this.cargarCombosTipoIntervalosForeignKeyLista(" where id="+this.tablaamortidetalle.getid_tipo_intervalo());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>();

						if(tablaamortidetalle.getTipoIntervalo()!=null) {
							this.tipointervalosForeignKey.add(tablaamortidetalle.getTipoIntervalo());
						}

						this.addItemDefectoCombosForeignKeyTipoIntervalo();
						this.cargarCombosFrameTipoIntervalosForeignKey("Todos");
					}
					this.setActualTipoIntervaloForeignKey(this.tablaamortidetalle.getid_tipo_intervalo(),false,"Formulario");

					//Anio
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_anioTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_anioTablaAmortiDetalle) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.tablaamortidetalle.getid_anio());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(tablaamortidetalle.getAnio()!=null) {
							this.aniosForeignKey.add(tablaamortidetalle.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.tablaamortidetalle.getid_anio(),false,"Formulario");

					//Mes
					if(!this.tablaamortidetalleConstantesFunciones.cargarid_mesTablaAmortiDetalle || this.tablaamortidetalleConstantesFunciones.event_dependid_mesTablaAmortiDetalle) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.tablaamortidetalle.getid_mes());
									//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(tablaamortidetalle.getMes()!=null) {
							this.messForeignKey.add(tablaamortidetalle.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.tablaamortidetalle.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTablaAmortiDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTablaAmortiDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTablaAmortiDetalle(tablaamortidetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTablaAmortiDetalle(tablaamortidetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTablaAmortiDetalle(tablaamortidetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTablaAmortiDetalle(tablaamortidetalle);
	}
	
	public void setVariablesObjetoActualToFormularioTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setText(tablaamortidetalle.getId().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_inicial());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_final());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setText(tablaamortidetalle.getvalor().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setText(tablaamortidetalle.getinteres().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setText(tablaamortidetalle.getcapital().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setText(tablaamortidetalle.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TablaAmortiDetalle tablaamortidetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tablaamortidetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TablaAmortiDetalle tablaamortidetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tablaamortidetalleLocal=this.tablaamortidetalle;
			} else {
				tablaamortidetalleLocal=this.tablaamortidetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tablaamortidetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTablaAmortiDetalle(tablaamortidetalleLocal,true);
					
					if(tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tablaamortidetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tablaamortidetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(tablaamortidetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(tablaamortidetalle);
	}
	
	public void setVariablesFormularioToObjetoActualTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(tablaamortidetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.getText()==null || this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.getText()=="" || this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setText("0");
			}

			if(conColumnasBase) {tablaamortidetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelIdTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setfecha_emision(this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_emisionTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setfecha_vencimiento(this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_vencimientoTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setfecha_inicial(this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_inicialTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setfecha_final(this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelfecha_finalTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelvalorTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setinteres(Double.parseDouble(this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_INTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelinteresTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setcapital(Double.parseDouble(this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelcapitalTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamortidetalle.setnumero_cuotas(Integer.parseInt(this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelnumero_cuotasTablaAmortiDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalleBean,TablaAmortiDetalle tablaamortidetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalleOrigen,TablaAmortiDetalle tablaamortidetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaamortidetalleOrigen.getId()!=null && !tablaamortidetalleOrigen.getId().equals(0L))) {tablaamortidetalle.setId(tablaamortidetalleOrigen.getId());}}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getfecha_emision()!=null && !tablaamortidetalleOrigen.getfecha_emision().equals(new Date()))) {tablaamortidetalle.setfecha_emision(tablaamortidetalleOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getfecha_vencimiento()!=null && !tablaamortidetalleOrigen.getfecha_vencimiento().equals(new Date()))) {tablaamortidetalle.setfecha_vencimiento(tablaamortidetalleOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getfecha_inicial()!=null && !tablaamortidetalleOrigen.getfecha_inicial().equals(new Date()))) {tablaamortidetalle.setfecha_inicial(tablaamortidetalleOrigen.getfecha_inicial());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getfecha_final()!=null && !tablaamortidetalleOrigen.getfecha_final().equals(new Date()))) {tablaamortidetalle.setfecha_final(tablaamortidetalleOrigen.getfecha_final());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getvalor()!=null && !tablaamortidetalleOrigen.getvalor().equals(0.0))) {tablaamortidetalle.setvalor(tablaamortidetalleOrigen.getvalor());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getinteres()!=null && !tablaamortidetalleOrigen.getinteres().equals(0.0))) {tablaamortidetalle.setinteres(tablaamortidetalleOrigen.getinteres());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getcapital()!=null && !tablaamortidetalleOrigen.getcapital().equals(0.0))) {tablaamortidetalle.setcapital(tablaamortidetalleOrigen.getcapital());}
			if(conDefault || (!conDefault && tablaamortidetalleOrigen.getnumero_cuotas()!=null && !tablaamortidetalleOrigen.getnumero_cuotas().equals(0))) {tablaamortidetalle.setnumero_cuotas(tablaamortidetalleOrigen.getnumero_cuotas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setText(tablaamortidetalle.getId().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_inicial());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setDate(tablaamortidetalle.getfecha_final());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setText(tablaamortidetalle.getvalor().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setText(tablaamortidetalle.getinteres().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setText(tablaamortidetalle.getcapital().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setText(tablaamortidetalle.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaAmortiDetalle(TablaAmortiDetalleBean tablaamortidetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setText(tablaamortidetalleBean.getId().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setDate(tablaamortidetalleBean.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setDate(tablaamortidetalleBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setDate(tablaamortidetalleBean.getfecha_inicial());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setDate(tablaamortidetalleBean.getfecha_final());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setText(tablaamortidetalleBean.getvalor().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setText(tablaamortidetalleBean.getinteres().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setText(tablaamortidetalleBean.getcapital().toString());
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setText(tablaamortidetalleBean.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTablaAmortiDetalle(TablaAmortiDetalleParameterReturnGeneral tablaamortidetalleReturnGeneral,TablaAmortiDetalleBean tablaamortidetalleBean,Boolean conDefault) throws Exception { 
		try {
			TablaAmortiDetalle tablaamortidetalleLocal=new TablaAmortiDetalle();
			
			tablaamortidetalleLocal=tablaamortidetalleReturnGeneral.getTablaAmortiDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaamortidetalleLocal.getId()!=null && !tablaamortidetalleLocal.getId().equals(0L))) {tablaamortidetalleBean.setId(tablaamortidetalleLocal.getId());}}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getfecha_emision()!=null && !tablaamortidetalleLocal.getfecha_emision().equals(new Date()))) {tablaamortidetalleBean.setfecha_emision(tablaamortidetalleLocal.getfecha_emision());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getfecha_vencimiento()!=null && !tablaamortidetalleLocal.getfecha_vencimiento().equals(new Date()))) {tablaamortidetalleBean.setfecha_vencimiento(tablaamortidetalleLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getfecha_inicial()!=null && !tablaamortidetalleLocal.getfecha_inicial().equals(new Date()))) {tablaamortidetalleBean.setfecha_inicial(tablaamortidetalleLocal.getfecha_inicial());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getfecha_final()!=null && !tablaamortidetalleLocal.getfecha_final().equals(new Date()))) {tablaamortidetalleBean.setfecha_final(tablaamortidetalleLocal.getfecha_final());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getvalor()!=null && !tablaamortidetalleLocal.getvalor().equals(0.0))) {tablaamortidetalleBean.setvalor(tablaamortidetalleLocal.getvalor());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getinteres()!=null && !tablaamortidetalleLocal.getinteres().equals(0.0))) {tablaamortidetalleBean.setinteres(tablaamortidetalleLocal.getinteres());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getcapital()!=null && !tablaamortidetalleLocal.getcapital().equals(0.0))) {tablaamortidetalleBean.setcapital(tablaamortidetalleLocal.getcapital());}
			if(conDefault || (!conDefault && tablaamortidetalleLocal.getnumero_cuotas()!=null && !tablaamortidetalleLocal.getnumero_cuotas().equals(0))) {tablaamortidetalleBean.setnumero_cuotas(tablaamortidetalleLocal.getnumero_cuotas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTablaAmortiDetalleGenerico(Long idTablaAmortiDetalleSeleccionado,JComboBox jComboBoxTablaAmortiDetalle,List<TablaAmortiDetalle> tablaamortidetallesLocal)throws Exception {
		try {
			TablaAmortiDetalle  tablaamortidetalleTemp=null;

			for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesLocal) {
				if(tablaamortidetalleAux.getId()!=null && tablaamortidetalleAux.getId().equals(idTablaAmortiDetalleSeleccionado)) {
					tablaamortidetalleTemp=tablaamortidetalleAux;
					break;
				}
			}

			jComboBoxTablaAmortiDetalle.setSelectedItem(tablaamortidetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTablaAmortiDetalleGenerico(JComboBox jComboBoxTablaAmortiDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaAmortiDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTablaAmortiDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaAmortiDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTablaAmortiDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTablaAmortiDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTablaAmortiDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamortidetalle=(TablaAmortiDetalle) tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaamortidetalle =(TablaAmortiDetalle) tablaamortidetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Tasa")) {
			//sDescripcion=this.getActualTasaForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.gettasa_descripcion();
			} else {
				//sDescripcion=this.getActualTasaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.gettasa_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getfactura_descripcion();
			}
		}

		if(sTipo.equals("TipoIntervalo")) {
			//sDescripcion=this.getActualTipoIntervaloForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.gettipointervalo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIntervaloForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.gettipointervalo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!tablaamortidetalle.getIsNew() && !tablaamortidetalle.getIsChanged() && !tablaamortidetalle.getIsDeleted()) {
				sDescripcion=tablaamortidetalle.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamortidetalle.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TablaAmortiDetalle tablaamortidetalleRow=new TablaAmortiDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamortidetalleRow=(TablaAmortiDetalle) tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaamortidetalleRow=(TablaAmortiDetalle) tablaamortidetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTablaAmortiDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));			
			this.jButtonDuplicarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaDuplicarTablaAmortiDetalle && this.isPermisoDuplicarTablaAmortiDetalle));			
			this.jButtonCopiarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaCopiarTablaAmortiDetalle && this.isPermisoCopiarTablaAmortiDetalle));
			this.jButtonVerFormTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaVerFormTablaAmortiDetalle && this.isPermisoVerFormTablaAmortiDetalle));
			
			this.jButtonAbrirOrderByTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));			
			
			this.jButtonNuevoRelacionesTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));			
			this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaModificarTablaAmortiDetalle && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaActualizarTablaAmortiDetalle && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaEliminarTablaAmortiDetalle && this.isPermisoEliminarTablaAmortiDetalle));
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.setVisible(this.isVisibilidadCeldaCancelarTablaAmortiDetalle);							
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));						
			this.jButtonDuplicarToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaDuplicarTablaAmortiDetalle && this.isPermisoDuplicarTablaAmortiDetalle));						
			this.jButtonCopiarToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaCopiarTablaAmortiDetalle && this.isPermisoCopiarTablaAmortiDetalle));			
			this.jButtonVerFormToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaVerFormTablaAmortiDetalle && this.isPermisoVerFormTablaAmortiDetalle));			
			this.jButtonAbrirOrderByToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));
			this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));			
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaModificarTablaAmortiDetalle && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaActualizarTablaAmortiDetalle  && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaEliminarTablaAmortiDetalle && this.isPermisoEliminarTablaAmortiDetalle));
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarToolBarTablaAmortiDetalle.setVisible(this.isVisibilidadCeldaCancelarTablaAmortiDetalle);				
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));			
			this.jMenuItemDuplicarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaDuplicarTablaAmortiDetalle && this.isPermisoDuplicarTablaAmortiDetalle));			
			this.jMenuItemCopiarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaCopiarTablaAmortiDetalle && this.isPermisoCopiarTablaAmortiDetalle));			
			this.jMenuItemVerFormTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaVerFormTablaAmortiDetalle && this.isPermisoVerFormTablaAmortiDetalle));			
			this.jMenuItemAbrirOrderByTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));			
			//this.jMenuItemMostrarOcultarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));
			this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));			
			//this.jMenuItemDetalleMostrarOcultarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaOrdenTablaAmortiDetalle && this.isPermisoOrdenTablaAmortiDetalle));			
			this.jMenuItemNuevoRelacionesTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle));			
			this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaNuevoTablaAmortiDetalle && this.isPermisoNuevoTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));									
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemModificarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaModificarTablaAmortiDetalle && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemActualizarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaActualizarTablaAmortiDetalle && this.isPermisoActualizarTablaAmortiDetalle));	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemEliminarTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaEliminarTablaAmortiDetalle && this.isPermisoEliminarTablaAmortiDetalle));
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemCancelarTablaAmortiDetalle.setVisible(this.isVisibilidadCeldaCancelarTablaAmortiDetalle);				
			}
			
			this.jMenuItemGuardarCambiosTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));						
			this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=this.jButtonNuevoTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarTablaAmortiDetalle=this.jButtonDuplicarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaCopiarTablaAmortiDetalle=this.jButtonCopiarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaVerFormTablaAmortiDetalle=this.jButtonVerFormTablaAmortiDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenTablaAmortiDetalle=this.jButtonAbrirOrderByTablaAmortiDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=this.jButtonNuevoRelacionesTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=this.jButtonModificarTablaAmortiDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaGuardarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=this.jButtonGuardarCambiosTablaTablaAmortiDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=this.jButtonNuevoToolBarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarToolBarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarToolBarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarToolBarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarToolBarTablaAmortiDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaAmortiDetalle=this.jButtonGuardarCambiosToolBarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=this.jMenuItemNuevoTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=this.jMenuItemNuevoRelacionesTablaAmortiDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemModificarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemActualizarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemEliminarTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemCancelarTablaAmortiDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaAmortiDetalle=this.jMenuItemGuardarCambiosTablaAmortiDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTablaAmortiDetalle(Boolean esInicializar) {
		if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTablaAmortiDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualTablaAmortiDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTablaAmortiDetalle() {
		this.jButtonNuevoTablaAmortiDetalle.setVisible(this.isPermisoNuevoTablaAmortiDetalle);			
		this.jButtonDuplicarTablaAmortiDetalle.setVisible(this.isPermisoDuplicarTablaAmortiDetalle);			
		this.jButtonCopiarTablaAmortiDetalle.setVisible(this.isPermisoCopiarTablaAmortiDetalle);			
		this.jButtonVerFormTablaAmortiDetalle.setVisible(this.isPermisoVerFormTablaAmortiDetalle);			
		
		this.jButtonAbrirOrderByTablaAmortiDetalle.setVisible(this.isPermisoOrdenTablaAmortiDetalle);					
		
		this.jButtonNuevoRelacionesTablaAmortiDetalle.setVisible(this.isPermisoNuevoTablaAmortiDetalle);			
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarTablaAmortiDetalle.setVisible(this.isPermisoActualizarTablaAmortiDetalle);	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.setVisible(this.isPermisoActualizarTablaAmortiDetalle);	
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.setVisible(this.isPermisoEliminarTablaAmortiDetalle);
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.setVisible(this.isVisibilidadCeldaCancelarTablaAmortiDetalle);						
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.setVisible(this.isPermisoGuardarCambiosTablaAmortiDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.setVisible(this.isPermisoActualizarTablaAmortiDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaAmortiDetalle() {
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarTablaAmortiDetalle.setVisible(this.isPermisoActualizarTablaAmortiDetalle);	
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.setVisible(this.isPermisoActualizarTablaAmortiDetalle);	
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.setVisible(this.isPermisoEliminarTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.setVisible(this.isVisibilidadCeldaCancelarTablaAmortiDetalle);							
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.setVisible((this.isVisibilidadCeldaGuardarTablaAmortiDetalle && this.isPermisoGuardarCambiosTablaAmortiDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTablaAmortiDetalle() {
		if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTablaAmortiDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTablaAmortiDetalle() {
	}
	
	public void jTableDatosTablaAmortiDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTablaAmortiDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tablaamortidetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tablaamortidetalle.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tablaamortidetalle.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.tablaamortidetalle.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.tablaamortidetalle.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tasaTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotasa=true;

			idTienePermisotasa=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(TasaConstantesFunciones.CLASSNAME);

			if(idTienePermisotasa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.tasaBeanSwingJInternalFrame=new TasaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tasaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tasaBeanSwingJInternalFrame.getTasaLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_tasa()!=null) {
					this.tasaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tasaBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_tasa());
					this.tasaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tasaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tasaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTasa();
				}

				JInternalFrameBase jinternalFrame =this.tasaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBordertasa=(TitledBorder)this.tasaBeanSwingJInternalFrame.jScrollPanelDatosTasa.getBorder();

				titledBordertasa.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Tasa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tasaTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_tasa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tasa = "+this.tablaamortidetalle.getid_tasa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaTablaAmortiDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTablaAmortiDetalle=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosTablaAmortiDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.tablaamortidetalle.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_intervaloTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipointervalo=true;

			idTienePermisotipointervalo=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(TipoIntervaloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipointervalo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.tipointervaloBeanSwingJInternalFrame=new TipoIntervaloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipointervaloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipointervaloBeanSwingJInternalFrame.getTipoIntervaloLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_tipo_intervalo()!=null) {
					this.tipointervaloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipointervaloBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_tipo_intervalo());
					this.tipointervaloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipointervaloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipointervaloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIntervalo();
				}

				JInternalFrameBase jinternalFrame =this.tipointervaloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBordertipointervalo=(TitledBorder)this.tipointervaloBeanSwingJInternalFrame.jScrollPanelDatosTipoIntervalo.getBorder();

				titledBordertipointervalo.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Tipo Intervalo ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_intervaloTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_tipo_intervalo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_intervalo = "+this.tablaamortidetalle.getid_tipo_intervalo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.tablaamortidetalle.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.tablaamortidetalle.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicialTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getfecha_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicial = '"+Funciones2.getStringPostgresDate(this.tablaamortidetalle.getfecha_inicial())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finalTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getfecha_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_final = '"+Funciones2.getStringPostgresDate(this.tablaamortidetalle.getfecha_final())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.tablaamortidetalle.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninteresTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getinteres()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where interes = "+this.tablaamortidetalle.getinteres().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncapitalTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getcapital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where capital = "+this.tablaamortidetalle.getcapital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotasTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getnumero_cuotas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuotas = "+this.tablaamortidetalle.getnumero_cuotas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.tablaamortidetalle.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesTablaAmortiDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebTablaAmortiDetalle(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmortiDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmortiDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.tablaamortidetalleLogic.getConnexion());

				if(this.tablaamortidetalle.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.tablaamortidetalle.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmortiDetalle=(TitledBorder)this.jScrollPanelDatosTablaAmortiDetalle.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderTablaAmortiDetalle.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesTablaAmortiDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.gettablaamortidetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamortidetalle==null) {
						this.tablaamortidetalle = new TablaAmortiDetalle();
					}

					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);
				}

				if(this.tablaamortidetalle.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.tablaamortidetalle.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmortiDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdAnio();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdEjercicio();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdEmpresa();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdFactura();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdMes();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdPeriodo();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdSucursal();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTasaTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdTasa();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoIntervaloTablaAmortiDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);

			this.getTablaAmortiDetallesFK_IdTipoIntervalo();

			this.inicializarActualizarBindingTablaAmortiDetalle(false);

			//if(TablaAmortiDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortidetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTablaAmortiDetalle() {
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.dispose();
			this.jInternalFrameDetalleFormTablaAmortiDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
			this.jInternalFrameReporteDinamicoTablaAmortiDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTablaAmortiDetalle.dispose();
			this.jInternalFrameReporteDinamicoTablaAmortiDetalle=null;
		}
		
		if(this.jInternalFrameImportacionTablaAmortiDetalle!=null) {
			this.jInternalFrameImportacionTablaAmortiDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionTablaAmortiDetalle.dispose();
			this.jInternalFrameImportacionTablaAmortiDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTablaAmortiDetalle();
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTablaAmortiDetalle")) {
				jButtonDuplicarTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTablaAmortiDetalle")) {
				jButtonCopiarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormTablaAmortiDetalle")) {
				jButtonVerFormTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTablaAmortiDetalle")) {
				jButtonDuplicarTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTablaAmortiDetalle")) {
				jButtonDuplicarTablaAmortiDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTablaAmortiDetalle")) {
				jButtonModificarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTablaAmortiDetalle")) {
				jButtonModificarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTablaAmortiDetalle")) {
				jButtonModificarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTablaAmortiDetalle")) {
				jButtonActualizarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTablaAmortiDetalle")) {
				jButtonActualizarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTablaAmortiDetalle")) {
				jButtonActualizarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarTablaAmortiDetalle")) {
				jButtonEliminarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTablaAmortiDetalle")) {
				jButtonEliminarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTablaAmortiDetalle")) {
				jButtonEliminarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarTablaAmortiDetalle")) {
				jButtonCancelarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTablaAmortiDetalle")) {
				jButtonCancelarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTablaAmortiDetalle")) {
				jButtonCancelarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarTablaAmortiDetalle")) {
				jButtonCerrarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTablaAmortiDetalle")) {
				jButtonCerrarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTablaAmortiDetalle")) {
				jButtonCerrarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTablaAmortiDetalle")) {
				jButtonMostrarOcultarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTablaAmortiDetalle")) {
				jButtonCancelarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTablaAmortiDetalle")) {
				jButtonCopiarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTablaAmortiDetalle")) {
				jButtonVerFormTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTablaAmortiDetalle")) {
				jButtonCopiarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTablaAmortiDetalle")) {
				jButtonVerFormTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTablaAmortiDetalle")) {
				jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTablaAmortiDetalle")) {
				jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTablaAmortiDetalle")) {
				jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTablaAmortiDetalle")) {
				jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTablaAmortiDetalle")) {
				jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTablaAmortiDetalle")) {
				jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTablaAmortiDetalle")) {
				jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTablaAmortiDetalle")) {
				jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTablaAmortiDetalle")) {
				jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTablaAmortiDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByTablaAmortiDetalle")) {
				jButtonAbrirOrderByTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTablaAmortiDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarTablaAmortiDetalle")) {
				jButtonMostrarOcultarTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTablaAmortiDetalle")) {
				jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTablaAmortiDetalle")) {
				jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTablaAmortiDetalle")) {
				jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTablaAmortiDetalle")) {
				jButtonCerrarReporteDinamicoTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTablaAmortiDetalle")) {
				jButtonGenerarReporteDinamicoTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTablaAmortiDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTablaAmortiDetalle")) {
				jButtonCerrarImportacionTablaAmortiDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTablaAmortiDetalle")) {
				
				jButtonGenerarImportacionTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTablaAmortiDetalle")) {
				
				jButtonAbrirImportacionTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTablaAmortiDetalle")) {
				jComboBoxTiposAccionesTablaAmortiDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTablaAmortiDetalle")) {
				jComboBoxTiposRelacionesTablaAmortiDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTablaAmortiDetalle")) {
				jComboBoxTiposAccionesTablaAmortiDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTablaAmortiDetalle")) {
				
				jComboBoxTiposSeleccionarTablaAmortiDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTablaAmortiDetalle")) {
				jTextFieldValorCampoGeneralTablaAmortiDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTablaAmortiDetalle")) {
				jButtonAbrirOrderByTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTablaAmortiDetalle")) {
				jButtonAbrirOrderByTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTablaAmortiDetalle")) {
				jButtonCerrarOrderByTablaAmortiDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaAmortiDetalleBusqueda")) {
				this.jButtonidTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiDetalleUpdate")) {
				this.jButtonid_empresaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_empresaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiDetalleUpdate")) {
				this.jButtonid_sucursalTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiDetalleBusqueda")) {
				this.jButtonid_sucursalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiDetalleUpdate")) {
				this.jButtonid_ejercicioTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiDetalleBusqueda")) {
				this.jButtonid_ejercicioTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiDetalleUpdate")) {
				this.jButtonid_periodoTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiDetalleBusqueda")) {
				this.jButtonid_periodoTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiDetalleUpdate")) {
				this.jButtonid_tasaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_tasaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalle")) {
				this.jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalleUpdate")) {
				this.jButtonid_facturaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_facturaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_intervaloTablaAmortiDetalleUpdate")) {
				this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_intervaloTablaAmortiDetalleBusqueda")) {
				this.jButtonid_tipo_intervaloTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_emisionTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_vencimientoTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicialTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_inicialTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_finalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorTablaAmortiDetalleBusqueda")) {
				this.jButtonvalorTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesTablaAmortiDetalleBusqueda")) {
				this.jButtoninteresTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalTablaAmortiDetalleBusqueda")) {
				this.jButtoncapitalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasTablaAmortiDetalleBusqueda")) {
				this.jButtonnumero_cuotasTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioTablaAmortiDetalleUpdate")) {
				this.jButtonid_anioTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioTablaAmortiDetalleBusqueda")) {
				this.jButtonid_anioTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesTablaAmortiDetalleUpdate")) {
				this.jButtonid_mesTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesTablaAmortiDetalleBusqueda")) {
				this.jButtonid_mesTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_facturaTablaAmortiDetalle")) {
				this.jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdFacturaTablaAmortiDetalle")) {
				this.jButtonFK_IdFacturaTablaAmortiDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTasaTablaAmortiDetalle")) {
				this.jButtonFK_IdTasaTablaAmortiDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoIntervaloTablaAmortiDetalle")) {
				this.jButtonFK_IdTipoIntervaloTablaAmortiDetalleActionPerformed(evt);
			}
			
			;
			
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTablaAmortiDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TablaAmortiDetalle tablaamortidetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				tablaamortidetalleLocal=this.tablaamortidetalle;
			} else {
				tablaamortidetalleLocal=this.tablaamortidetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
							
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
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
			
			


			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
								
						
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
								
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
							
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
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
			
			


			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
								
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTablaAmortiDetalle")) {
					jCheckBoxSeleccionarTodosTablaAmortiDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTablaAmortiDetalle")) {
					jCheckBoxSeleccionadosTablaAmortiDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTablaAmortiDetalle")) {
					
				}
				
				


				
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
												
				
				


				
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
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
			
			


			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamortidetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamortidetalle);
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
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
				
				


				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmortiDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmortiDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortidetalleAnterior =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTablaAmortiDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTablaAmortiDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTablaAmortiDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tablaamortidetalle =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tablaamortidetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTablaAmortiDetalle")) {
				
				}
				
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTablaAmortiDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTablaAmortiDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTablaAmortiDetalle")) {
			
			}
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTablaAmortiDetalle();
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			if(sTipo.equals("NuevoTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTablaAmortiDetalle")) {
				jButtonDuplicarTablaAmortiDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTablaAmortiDetalle")) {
				jButtonCopiarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTablaAmortiDetalle")) {
				jButtonVerFormTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTablaAmortiDetalle")) {
				jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTablaAmortiDetalle")) {
				jButtonModificarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTablaAmortiDetalle")) {
				jButtonActualizarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTablaAmortiDetalle")) {
				jButtonEliminarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTablaAmortiDetalle")) {
				jButtonCancelarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTablaAmortiDetalle")) {
				jButtonCerrarTablaAmortiDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAmortiDetalle")) {
				jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTablaAmortiDetalle")) {
				jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTablaAmortiDetalle")) {
				jButtonAbrirOrderByTablaAmortiDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTablaAmortiDetalle")) {
				jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTablaAmortiDetalle")) {
				jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTablaAmortiDetalle")) {
				jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaAmortiDetalleBusqueda")) {
				this.jButtonidTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiDetalleUpdate")) {
				this.jButtonid_empresaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_empresaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiDetalleUpdate")) {
				this.jButtonid_sucursalTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiDetalleBusqueda")) {
				this.jButtonid_sucursalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiDetalleUpdate")) {
				this.jButtonid_ejercicioTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiDetalleBusqueda")) {
				this.jButtonid_ejercicioTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiDetalleUpdate")) {
				this.jButtonid_periodoTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiDetalleBusqueda")) {
				this.jButtonid_periodoTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiDetalleUpdate")) {
				this.jButtonid_tasaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_tasaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalle")) {
				this.jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalleUpdate")) {
				this.jButtonid_facturaTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiDetalleBusqueda")) {
				this.jButtonid_facturaTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_intervaloTablaAmortiDetalleUpdate")) {
				this.jButtonid_tipo_intervaloTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_intervaloTablaAmortiDetalleBusqueda")) {
				this.jButtonid_tipo_intervaloTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_emisionTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_vencimientoTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicialTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_inicialTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalTablaAmortiDetalleBusqueda")) {
				this.jButtonfecha_finalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorTablaAmortiDetalleBusqueda")) {
				this.jButtonvalorTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesTablaAmortiDetalleBusqueda")) {
				this.jButtoninteresTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalTablaAmortiDetalleBusqueda")) {
				this.jButtoncapitalTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasTablaAmortiDetalleBusqueda")) {
				this.jButtonnumero_cuotasTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioTablaAmortiDetalleUpdate")) {
				this.jButtonid_anioTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioTablaAmortiDetalleBusqueda")) {
				this.jButtonid_anioTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesTablaAmortiDetalleUpdate")) {
				this.jButtonid_mesTablaAmortiDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesTablaAmortiDetalleBusqueda")) {
				this.jButtonid_mesTablaAmortiDetalleBusquedaActionPerformed(evt);
			}
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTablaAmortiDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTablaAmortiDetalle")) {
				closingInternalFrameTablaAmortiDetalle();
				
			} else if(sTipo.equals("jButtonCancelarTablaAmortiDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormTablaAmortiDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            TablaAmortiDetalleBeanSwingJInternalFrame jInternalFrameParent=(TablaAmortiDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaAmortiDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTablaAmortiDetalleActionPerformed(null);
			}
			
			TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaamortidetalle,new Object(),this.tablaamortidetalleParameterGeneral,this.tablaamortidetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTablaAmortiDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTablaAmortiDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTablaAmortiDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tablaamortidetalle)) {
			if(!esControlTabla) {
				if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);			
				}
				
				if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.procesarEventosTablaAmortiDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this.tablaamortidetalle,this.tablaamortidetalleParameterGeneral,this.isEsNuevoTablaAmortiDetalle,classes);//this.tablaamortidetalleLogic.getTablaAmortiDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral,this.tablaamortidetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTablaAmortiDetalle(classes,this.tablaamortidetalleReturnGeneral,this.tablaamortidetalleBean,false);
					}
						
					if(this.tablaamortidetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle());	
					}
						
					if(this.tablaamortidetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle(),classes);//this.tablaamortidetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTablaAmortiDetalle(this.tablaamortidetalle,classes);//this.tablaamortidetalleBean);									
				}
			
				if(TablaAmortiDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTablaAmortiDetalle(this.tablaamortidetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmortiDetalle(this.tablaamortidetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tablaamortidetalleAnterior!=null) {
						this.tablaamortidetalle=this.tablaamortidetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.procesarEventosTablaAmortiDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this.tablaamortidetalle,this.tablaamortidetalleParameterGeneral,this.isEsNuevoTablaAmortiDetalle,classes);//this.tablaamortidetalleLogic.getTablaAmortiDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaamortidetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaamortidetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle(),tablaamortidetalleLogic.getTablaAmortiDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle(),this.tablaamortidetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTablaAmortiDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosTablaAmortiDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTablaAmortiDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosTablaAmortiDetalle() throws Exception {
		
		TablaAmortiDetalleModel tablaamortidetalleModel=(TablaAmortiDetalleModel)this.jTableDatosTablaAmortiDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamortidetalleModel.tablaamortidetalles=this.tablaamortidetalleLogic.getTablaAmortiDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tablaamortidetalleModel.tablaamortidetalles=this.tablaamortidetalles;
		}
		
		
		((TablaAmortiDetalleModel) this.jTableDatosTablaAmortiDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTablaAmortiDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettablaamortidetalleAnterior(),this.tablaamortidetalleLogic.getTablaAmortiDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettablaamortidetalleAnterior(),this.tablaamortidetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTablaAmortiDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
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
										
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortidetalle,new Object(),generalEntityParameterGeneral,this.tablaamortidetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TablaAmortiDetalleConstantesFunciones.getClassesRelationshipsOfTablaAmortiDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TablaAmortiDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfTablaAmortiDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTablaAmortiDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TablaAmortiDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortidetalle,new Object(),generalEntityParameterGeneral,this.tablaamortidetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTablaAmortiDetalle(TablaAmortiDetalleBean tablaamortidetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTablaAmortiDetalle(ArrayList<Classe> classes,TablaAmortiDetalleReturnGeneral tablaamortidetalleReturnGeneral,TablaAmortiDetalleBean tablaamortidetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tablaamortidetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle = new TablaAmortiDetalleDetalleFormJInternalFrame(jDesktopPane,this.tablaamortidetalleSessionBean.getConGuardarRelaciones(),this.tablaamortidetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.setVisible(false);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.tablaamortidetalleLogic=this.tablaamortidetalleLogic;
		
		this.cargarCombosFrameForeignKeyTablaAmortiDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaAmortiDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaAmortiDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTablaAmortiDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTablaAmortiDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaAmortiDetalle"));
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ModificarTablaAmortiDetalle"));

		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaAmortiDetalle"));
					
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemModificarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaAmortiDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"ActualizarTablaAmortiDetalle"));
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaAmortiDetalle"));
						
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemActualizarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaAmortiDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"EliminarTablaAmortiDetalle"));
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaAmortiDetalle"));
								
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemEliminarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaAmortiDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CancelarTablaAmortiDetalle"));
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaAmortiDetalle"));
					
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemCancelarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaAmortiDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemDetalleCerrarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaAmortiDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmortiDetalle"));
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmortiDetalle"));
		
		
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaAmortiDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonidTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleBusqueda"));
		//jButtonid_facturaTablaAmortiDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_emisionTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_inicialTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicialTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_finalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonvalorTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoninteresTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"interesTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoncapitalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"capitalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaAmortiDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTablaAmortiDetalle"));
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaAmortiDetalle"));
		}
		
		this.jTableDatosTablaAmortiDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTablaAmortiDetalle"));
		
		this.jTableDatosTablaAmortiDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTablaAmortiDetalle"));
		
		this.jButtonNuevoTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"NuevoTablaAmortiDetalle"));
		
		this.jButtonDuplicarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"DuplicarTablaAmortiDetalle"));
		
		this.jButtonCopiarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"CopiarTablaAmortiDetalle"));
		
		this.jButtonVerFormTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"VerFormTablaAmortiDetalle"));
		
		
		this.jButtonNuevoToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarTablaAmortiDetalle"));
			
		this.jButtonDuplicarToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTablaAmortiDetalle"));
			
		this.jMenuItemNuevoTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTablaAmortiDetalle"));
			
		this.jMenuItemDuplicarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTablaAmortiDetalle"));		
		
		
		this.jButtonNuevoRelacionesTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTablaAmortiDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTablaAmortiDetalle"));
			
		this.jMenuItemNuevoRelacionesTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTablaAmortiDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ModificarTablaAmortiDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonModificarToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaAmortiDetalle"));
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemModificarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaAmortiDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"ActualizarTablaAmortiDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonActualizarToolBarTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaAmortiDetalle"));
				
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemActualizarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaAmortiDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"EliminarTablaAmortiDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonEliminarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaAmortiDetalle"));
						
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemEliminarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaAmortiDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CancelarTablaAmortiDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonCancelarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaAmortiDetalle"));
			
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemCancelarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaAmortiDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTablaAmortiDetalle"));		
		
		
		this.jButtonCerrarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CerrarTablaAmortiDetalle"));
		
		
		this.jButtonCerrarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarTablaAmortiDetalle"));
			
		this.jMenuItemCerrarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTablaAmortiDetalle"));
			
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jMenuItemDetalleCerrarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaAmortiDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAmortiDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmortiDetalle"));
		}
		
		this.jButtonCopiarToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarTablaAmortiDetalle"));
			
		this.jButtonVerFormToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarTablaAmortiDetalle"));
		
		this.jMenuItemGuardarCambiosTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTablaAmortiDetalle"));
			
		this.jMenuItemCopiarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTablaAmortiDetalle"));		
		
		this.jMenuItemVerFormTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTablaAmortiDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaAmortiDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTablaAmortiDetalle"));
			
		this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaAmortiDetalle"));		
		
		
		
		this.jButtonRecargarInformacionTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionTablaAmortiDetalle"));
					
		this.jButtonRecargarInformacionToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTablaAmortiDetalle"));
		
		this.jMenuItemRecargarInformacionTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTablaAmortiDetalle"));		
		
		
		
		this.jButtonAnterioresTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"AnterioresTablaAmortiDetalle"));
		
		
		this.jButtonAnterioresToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTablaAmortiDetalle"));
		
		this.jMenuItemAnterioresTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTablaAmortiDetalle"));		
		
		
		this.jButtonSiguientesTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"SiguientesTablaAmortiDetalle"));
		
		
		this.jButtonSiguientesToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTablaAmortiDetalle"));
			
		this.jMenuItemSiguientesTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTablaAmortiDetalle"));
			
		this.jMenuItemAbrirOrderByTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTablaAmortiDetalle"));
			
		this.jMenuItemMostrarOcultarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTablaAmortiDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTablaAmortiDetalle"));
			
		this.jMenuItemDetalleMostarOcultarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTablaAmortiDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTablaAmortiDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTablaAmortiDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTablaAmortiDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTablaAmortiDetalle"));

		this.jCheckBoxSeleccionadosTablaAmortiDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTablaAmortiDetalle"));
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaAmortiDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesTablaAmortiDetalle"));
			
		this.jComboBoxTiposAccionesTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesTablaAmortiDetalle"));
					
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTablaAmortiDetalle"));
			
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTablaAmortiDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonidTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleBusqueda"));
		//jButtonid_facturaTablaAmortiDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_emisionTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_inicialTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicialTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_finalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonvalorTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoninteresTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"interesTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoncapitalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"capitalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFacturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTablaAmortiDetalle"));

			this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalle"));

			this.jButtonFK_IdTasaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdTasaTablaAmortiDetalle"));

			this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdTipoIntervaloTablaAmortiDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTablaAmortiDetalle!=null) {
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmortiDetalle"));
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmortiDetalle"));
				this.jInternalFrameReporteDinamicoTablaAmortiDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmortiDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmortiDetalle"));				
			//this.jButtonGenerarReporteDinamicoTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmortiDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmortiDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTablaAmortiDetalle!=null) {
				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaAmortiDetalle"));
				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaAmortiDetalle"));
				this.jInternalFrameImportacionTablaAmortiDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaAmortiDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByTablaAmortiDetalle"));
			
			this.jButtonAbrirOrderByToolBarTablaAmortiDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTablaAmortiDetalle"));			
			
			if(this.jInternalFrameOrderByTablaAmortiDetalle!=null) {
				this.jInternalFrameOrderByTablaAmortiDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaAmortiDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jTabbedPaneRelacionesTablaAmortiDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaAmortiDetalle"));
		
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
            		closingInternalFrameTablaAmortiDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTablaAmortiDetalle = (JInternalFrameBase)event.getSource();
	            	
	            TablaAmortiDetalleBeanSwingJInternalFrame jInternalFrameParent=(TablaAmortiDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaAmortiDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTablaAmortiDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTablaAmortiDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTablaAmortiDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTablaAmortiDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTablaAmortiDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTablaAmortiDetalle";
		inputMap = this.jButtonNuevoTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTablaAmortiDetalle";
		inputMap = this.jButtonNuevoRelacionesTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaAmortiDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTablaAmortiDetalle";
		inputMap = this.jButtonModificarTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTablaAmortiDetalle";
		inputMap = this.jButtonActualizarTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTablaAmortiDetalle";
		inputMap = this.jButtonEliminarTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTablaAmortiDetalle";
		inputMap = this.jButtonCancelarTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTablaAmortiDetalle";
		inputMap = this.jButtonCerrarTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTablaAmortiDetalle";
		inputMap = this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonGuardarCambiosTablaAmortiDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTablaAmortiDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTablaAmortiDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTablaAmortiDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTablaAmortiDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTablaAmortiDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTablaAmortiDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTablaAmortiDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTablaAmortiDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTablaAmortiDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonidTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_empresaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_sucursalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_ejercicioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_periodoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tasaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiDetalleBusqueda"));
		//jButtonid_facturaTablaAmortiDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_tipo_intervaloTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_emisionTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_vencimientoTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_inicialTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicialTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonfecha_finalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonvalorTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoninteresTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"interesTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtoncapitalTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"capitalTablaAmortiDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonnumero_cuotasTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_anioTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_mesTablaAmortiDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiDetalleBusqueda"));
		
		
		this.jButtonFK_IdFacturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTablaAmortiDetalle"));

		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiDetalle"));

		this.jButtonFK_IdTasaTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdTasaTablaAmortiDetalle"));

		this.jButtonFK_IdTipoIntervaloTablaAmortiDetalle.addActionListener(new ButtonActionListener(this,"FK_IdTipoIntervaloTablaAmortiDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTablaAmortiDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTablaAmortiDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTablaAmortiDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTablaAmortiDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTablaAmortiDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
					tablaamortidetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalles) {
					tablaamortidetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTablaAmortiDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
						tablaamortidetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalles) {
						tablaamortidetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaAmortiDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaAmortiDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTablaAmortiDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTablaAmortiDetalle.getSelectedRows();
			
			TablaAmortiDetalle tablaamortidetalleLocal=new TablaAmortiDetalle();
			
			//this.seleccionarTodosTablaAmortiDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortidetalleLocal =(TablaAmortiDetalle) this.tablaamortidetalleLogic.getTablaAmortiDetalles().toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tablaamortidetalleLocal =(TablaAmortiDetalle) this.tablaamortidetalles.toArray()[this.jTableDatosTablaAmortiDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tablaamortidetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
						tablaamortidetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalles) {
						tablaamortidetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaAmortiDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaAmortiDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTablaAmortiDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTablaAmortiDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTablaAmortiDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTablaAmortiDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalleLogic.getTablaAmortiDetalles()) {
				
						if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							tablaamortidetalleAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							tablaamortidetalleAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL)) {
							existe=true;
							tablaamortidetalleAux.setfecha_inicial(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL)) {
							existe=true;
							tablaamortidetalleAux.setfecha_final(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							tablaamortidetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							tablaamortidetalleAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							tablaamortidetalleAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							tablaamortidetalleAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalles) {
					
						if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							tablaamortidetalleAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							tablaamortidetalleAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL)) {
							existe=true;
							tablaamortidetalleAux.setfecha_inicial(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL)) {
							existe=true;
							tablaamortidetalleAux.setfecha_final(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							tablaamortidetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							tablaamortidetalleAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							tablaamortidetalleAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA)) {
							existe=true;
							tablaamortidetalleAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTablaAmortiDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTablaAmortiDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTablaAmortiDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTablaAmortiDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessTablaAmortiDetalle(conSplash);
				
					this.generarReporteTablaAmortiDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTablaAmortiDetallesSeleccionados();
				//this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaAmortiDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaAmortiDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaAmortiDetalle();
				
				this.exportarTablaAmortiDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTablaAmortiDetalles();
				//this.importarTablaAmortiDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaAmortiDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTablaAmortiDetallesSeleccionados();
				//this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tabla Amortizacion Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTablaAmortiDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTablaAmortiDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTablaAmortiDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(TablaAmortiDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTablaAmortiDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTablaAmortiDetalle(conSplash);
					
						//this.actualizarParametrosGeneralTablaAmortiDetalle();
						
						this.generarReporteProcesoAccionTablaAmortiDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TablaAmortiDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tabla Amortizacion DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Tabla Amortizacion Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTablaAmortiDetalle();
				
						this.actualizarParametrosGeneralTablaAmortiDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tablaamortidetalleReturnGeneral=tablaamortidetalleLogic.procesarAccionTablaAmortiDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tablaamortidetalleLogic.getTablaAmortiDetalles(),this.tablaamortidetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTablaAmortiDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTablaAmortiDetalle();
					
					TablaAmortiDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTablaAmortiDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaAmortiDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxTiposAccionesFormularioTablaAmortiDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTablaAmortiDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTablaAmortiDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTablaAmortiDetalle();
			
			if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
			TablaAmortiDetalle tablaamortidetalle=new TablaAmortiDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTablaAmortiDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTablaAmortiDetalle.getSelectedItem();
			
			
			
			
			tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tablaamortidetallesSeleccionados.size()==1) {
				for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
					tablaamortidetalle=tablaamortidetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTablaAmortiDetalle();
			
      		//this.finishProcessTablaAmortiDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTablaAmortiDetalleReturnGeneral() throws Exception {
		if(this.tablaamortidetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tablaamortidetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tablaamortidetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tablaamortidetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tablaamortidetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tablaamortidetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
		}
		
		if(this.tablaamortidetalleReturnGeneral.getConRetornoLista() || this.tablaamortidetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.tablaamortidetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaamortidetalleLogic.setTablaAmortiDetalles(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tablaamortidetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaamortidetalleLogic.setTablaAmortiDetalle(this.tablaamortidetalleReturnGeneral.getTablaAmortiDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTablaAmortiDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralTablaAmortiDetalle() throws Exception {
		
		
	}
	
	public ArrayList<TablaAmortiDetalle> getTablaAmortiDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTablaAmortiDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetalleLogic.getTablaAmortiDetalles()) {
					if(tablaamortidetalleAux.getIsSelected()) {
						tablaamortidetallesSeleccionados.add(tablaamortidetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmortiDetalle tablaamortidetalleAux:this.tablaamortidetalles) {
					if(tablaamortidetalleAux.getIsSelected()) {
						tablaamortidetallesSeleccionados.add(tablaamortidetalleAux);				
					}
				}
			}
			
			if(tablaamortidetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tablaamortidetallesSeleccionados.addAll(this.tablaamortidetalleLogic.getTablaAmortiDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tablaamortidetallesSeleccionados.addAll(this.tablaamortidetalles);				
					}
				}
			}
		} else {
			tablaamortidetallesSeleccionados.add(this.tablaamortidetalle);
		}
		
		return tablaamortidetallesSeleccionados;
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
	
	public void generarReporteTablaAmortiDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTablaAmortiDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTablaAmortiDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaAmortiDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaAmortiDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tabla Amortizacion Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTablaAmortiDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTablaAmortiDetalle();
		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTablaAmortiDetalle();
		
		
		//this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados ,tablaamortidetalleImplementable,tablaamortidetalleImplementableHome);
	}
	
	public void mostrarImportacionTablaAmortiDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTablaAmortiDetalle();
		
		this.abrirFrameImportacionTablaAmortiDetalle();		
		
			
		//this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados ,tablaamortidetalleImplementable,tablaamortidetalleImplementableHome);
	}
	
	public void importarTablaAmortiDetalles() throws Exception {		
	
	}
	
	public void exportarTablaAmortiDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTablaAmortiDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTablaAmortiDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTablaAmortiDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tabla Amortizacion Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTablaAmortiDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTablaAmortiDetalle(tablaamortidetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tablaamortidetalleAux.setsDetalleGeneralEntityReporte(tablaamortidetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTablaAmortiDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_INTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiDetalleConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tablaamortidetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.gettasa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.gettipointervalo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getfecha_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getfecha_final().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getinteres().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getcapital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getnumero_cuotas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamortidetalle.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TablaAmortiDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTablaAmortiDetalle(row);				
				iRow++;
			}				
			
			for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTablaAmortiDetalle(tablaamortidetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTablaAmortiDetallesSeleccionados() throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();		
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamortidetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tablaamortidetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tablaamortidetalle");
			//elementRoot.appendChild(element);
		
			for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
				element = document.createElement("tablaamortidetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTablaAmortiDetalle(tablaamortidetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amortizacion Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTablaAmortiDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_INTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_CAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.gettasa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.gettipointervalo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getfecha_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getfecha_final());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getinteres());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getcapital());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getnumero_cuotas());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamortidetalle.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlTablaAmortiDetalle(TablaAmortiDetalle tablaamortidetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TablaAmortiDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tablaamortidetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TablaAmortiDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tablaamortidetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtasa_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDTASA);
		elementtasa_descripcion.appendChild(document.createTextNode(tablaamortidetalle.gettasa_descripcion()));
		element.appendChild(elementtasa_descripcion);

		Element elementfactura_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementtipointervalo_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDTIPOINTERVALO);
		elementtipointervalo_descripcion.appendChild(document.createTextNode(tablaamortidetalle.gettipointervalo_descripcion()));
		element.appendChild(elementtipointervalo_descripcion);

		Element elementfecha_emision = document.createElement(TablaAmortiDetalleConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(tablaamortidetalle.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(TablaAmortiDetalleConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(tablaamortidetalle.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementfecha_inicial = document.createElement(TablaAmortiDetalleConstantesFunciones.FECHAINICIAL);
		elementfecha_inicial.appendChild(document.createTextNode(tablaamortidetalle.getfecha_inicial().toString().trim()));
		element.appendChild(elementfecha_inicial);

		Element elementfecha_final = document.createElement(TablaAmortiDetalleConstantesFunciones.FECHAFINAL);
		elementfecha_final.appendChild(document.createTextNode(tablaamortidetalle.getfecha_final().toString().trim()));
		element.appendChild(elementfecha_final);

		Element elementvalor = document.createElement(TablaAmortiDetalleConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(tablaamortidetalle.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementinteres = document.createElement(TablaAmortiDetalleConstantesFunciones.INTERES);
		elementinteres.appendChild(document.createTextNode(tablaamortidetalle.getinteres().toString().trim()));
		element.appendChild(elementinteres);

		Element elementcapital = document.createElement(TablaAmortiDetalleConstantesFunciones.CAPITAL);
		elementcapital.appendChild(document.createTextNode(tablaamortidetalle.getcapital().toString().trim()));
		element.appendChild(elementcapital);

		Element elementnumero_cuotas = document.createElement(TablaAmortiDetalleConstantesFunciones.NUMEROCUOTA);
		elementnumero_cuotas.appendChild(document.createTextNode(tablaamortidetalle.getnumero_cuotas().toString().trim()));
		element.appendChild(elementnumero_cuotas);

		Element elementanio_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(TablaAmortiDetalleConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(tablaamortidetalle.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoTablaAmortiDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados=new ArrayList<TablaAmortiDetalle>();
		
		tablaamortidetallesSeleccionados=this.getTablaAmortiDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTablaAmortiDetalle(tablaamortidetallesSeleccionados);
		
		this.generarReporteTablaAmortiDetalles("Todos",tablaamortidetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTablaAmortiDetalle(ArrayList<TablaAmortiDetalle> tablaamortidetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TablaAmortiDetalle tablaamortidetalleAux:tablaamortidetallesSeleccionados) {
				tablaamortidetalleAux.setsDetalleGeneralEntityReporte(tablaamortidetalleAux.toString());
			
				if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDTASA)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.gettasa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDTIPOINTERVALO)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.gettipointervalo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortidetalleAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortidetalleAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAINICIAL)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortidetalleAux.getfecha_inicial()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_FECHAFINAL)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortidetalleAux.getfecha_final()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_NUMEROCUOTA)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getnumero_cuotas().toString());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiDetalleConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					tablaamortidetalleAux.setsDescripcionGeneralEntityReporte1(tablaamortidetalleAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTablaAmortiDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTablaAmortiDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=true;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
			this.isVisibilidadCeldaModificarTablaAmortiDetalle=true;
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaCancelarTablaAmortiDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmortiDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TablaAmortiDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=true;
		} else {
			this.actualizarEstadoPanelsTablaAmortiDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTablaAmortiDetalle=false;
			//this.isVisibilidadCeldaVerFormTablaAmortiDetalle=false;
			this.isVisibilidadCeldaDuplicarTablaAmortiDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tablaamortidetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoTablaAmortiDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmortiDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			if(!tablaamortidetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;												
			}
			
			this.jButtonCerrarTablaAmortiDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTablaAmortiDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.tablaamortidetalle)) {
			this.isVisibilidadCeldaActualizarTablaAmortiDetalle=false;
			this.isVisibilidadCeldaEliminarTablaAmortiDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTablaAmortiDetalle() {
	}
	
	public void actualizarEstadoPanelsTablaAmortiDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosEdicionTablaAmortiDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmortiDetalle!=null) {
				this.jScrollPanelDatosTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmortiDetalle!=null) {
				this.jPanelPaginacionTablaAmortiDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
					this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmortiDetalle!=null) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTablaAmortiDetalle!=null) {
				this.jPanelParametrosReportesTablaAmortiDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdFactura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdFactura=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaTasa(Boolean isParaTasa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTasaNegation=!isParaTasa;

			this.isVisibilidadFK_IdFactura=isParaTasaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaTasa;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTasaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIntervalo(Boolean isParaTipoIntervalo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIntervaloNegation=!isParaTipoIntervalo;

			this.isVisibilidadFK_IdFactura=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTipoIntervalo;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdFactura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdFactura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdFacturaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTasa=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTasaTablaAmortiDetalle);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(jPanelFK_IdTipoIntervaloTablaAmortiDetalle);}
		}
		
	}
	
	
	
	

	public String registrarSesionTablaAmortiDetalleParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(tablaamortidetalleSessionBean==null) {
				tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(tablaamortidetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.tablaamortidetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(TablaAmortiDetalleConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionTablaAmortiDetalle(true);
			//facturaSessionBean.setlidTablaAmortiDetalleActual(this.idTablaAmortiDetalleActual);

			tablaamortidetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTablaAmortiDetalle(true);
			tablaamortidetalleSessionBean.setlIdTablaAmortiDetalleActualForeignKey(this.idTablaAmortiDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		
		if(this.tablaamortidetalleSessionBean==null) {
			this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		}
		
		this.tablaamortidetalleSessionBean.setsUltimaBusquedaTablaAmortiDetalle(this.getsAccionBusqueda());
		this.tablaamortidetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tablaamortidetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			tablaamortidetalleSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tablaamortidetalleSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			tablaamortidetalleSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			tablaamortidetalleSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			tablaamortidetalleSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTasa")) {
			tablaamortidetalleSessionBean.setid_tasa(this.getid_tasaFK_IdTasa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoIntervalo")) {
			tablaamortidetalleSessionBean.setid_tipo_intervalo(this.getid_tipo_intervaloFK_IdTipoIntervalo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		
		if(this.tablaamortidetalleSessionBean==null) {
			this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		}
		
		if(this.tablaamortidetalleSessionBean.getsUltimaBusquedaTablaAmortiDetalle()!=null&&!this.tablaamortidetalleSessionBean.getsUltimaBusquedaTablaAmortiDetalle().equals("")) {
			this.setsAccionBusqueda(tablaamortidetalleSessionBean.getsUltimaBusquedaTablaAmortiDetalle());
			this.setiNumeroPaginacion(tablaamortidetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tablaamortidetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(tablaamortidetalleSessionBean.getid_ejercicio());
				tablaamortidetalleSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tablaamortidetalleSessionBean.getid_empresa());
				tablaamortidetalleSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(tablaamortidetalleSessionBean.getid_factura());
				tablaamortidetalleSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(tablaamortidetalleSessionBean.getid_periodo());
				tablaamortidetalleSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(tablaamortidetalleSessionBean.getid_sucursal());
				tablaamortidetalleSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTasa")) {
				this.setid_tasaFK_IdTasa(tablaamortidetalleSessionBean.getid_tasa());
				tablaamortidetalleSessionBean.setid_tasa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoIntervalo")) {
				this.setid_tipo_intervaloFK_IdTipoIntervalo(tablaamortidetalleSessionBean.getid_tipo_intervalo());
				tablaamortidetalleSessionBean.setid_tipo_intervalo(-1L);
			}
		}
		
		this.tablaamortidetalleSessionBean.setsUltimaBusquedaTablaAmortiDetalle("");
		this.tablaamortidetalleSessionBean.setiNumeroPaginacion(TablaAmortiDetalleConstantesFunciones.INUMEROPAGINACION);
		this.tablaamortidetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTablaAmortiDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTablaAmortiDetalle() {
		this.updateBorderResaltarBusquedasFormularioTablaAmortiDetalle();
		this.updateVisibilidadBusquedasFormularioTablaAmortiDetalle();
		this.updateHabilitarBusquedasFormularioTablaAmortiDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioTablaAmortiDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponents().length>0) {
	

		if(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdFacturaTablaAmortiDetalle!=null) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdFacturaTablaAmortiDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdFacturaTablaAmortiDetalle);
			}
		}

		if(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTasaTablaAmortiDetalle!=null) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTasaTablaAmortiDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTasaTablaAmortiDetalle);
			}
		}

		if(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTipoIntervaloTablaAmortiDetalle!=null) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTipoIntervaloTablaAmortiDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTablaAmortiDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdFacturaTablaAmortiDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarFK_IdFacturaTablaAmortiDetalle);
			if(!this.tablaamortidetalleConstantesFunciones.mostrarFK_IdFacturaTablaAmortiDetalle && index>-1) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTasaTablaAmortiDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarFK_IdTasaTablaAmortiDetalle);
			if(!this.tablaamortidetalleConstantesFunciones.mostrarFK_IdTasaTablaAmortiDetalle && index>-1) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarFK_IdTipoIntervaloTablaAmortiDetalle);
			if(!this.tablaamortidetalleConstantesFunciones.mostrarFK_IdTipoIntervaloTablaAmortiDetalle && index>-1) {
				this.jTabbedPaneBusquedasTablaAmortiDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTablaAmortiDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdFacturaTablaAmortiDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaamortidetalleConstantesFunciones.activarFK_IdFacturaTablaAmortiDetalle);
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setEnabledAt(index,this.tablaamortidetalleConstantesFunciones.activarFK_IdFacturaTablaAmortiDetalle);
			}

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTasaTablaAmortiDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaamortidetalleConstantesFunciones.activarFK_IdTasaTablaAmortiDetalle);
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setEnabledAt(index,this.tablaamortidetalleConstantesFunciones.activarFK_IdTasaTablaAmortiDetalle);
			}

			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaamortidetalleConstantesFunciones.activarFK_IdTipoIntervaloTablaAmortiDetalle);
				this.jTabbedPaneBusquedasTablaAmortiDetalle.setEnabledAt(index,this.tablaamortidetalleConstantesFunciones.activarFK_IdTipoIntervaloTablaAmortiDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTablaAmortiDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdFacturaTablaAmortiDetalle);

			this.jTabbedPaneBusquedasTablaAmortiDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);

			this.tablaamortidetalleConstantesFunciones.setResaltarFK_IdFacturaTablaAmortiDetalle(resaltar);

			jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdFacturaTablaAmortiDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTasa")) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTasaTablaAmortiDetalle);

			this.jTabbedPaneBusquedasTablaAmortiDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);

			this.tablaamortidetalleConstantesFunciones.setResaltarFK_IdTasaTablaAmortiDetalle(resaltar);

			jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTasaTablaAmortiDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoIntervalo")) {
			index= this.jTabbedPaneBusquedasTablaAmortiDetalle.indexOfComponent(this.jPanelFK_IdTipoIntervaloTablaAmortiDetalle);

			this.jTabbedPaneBusquedasTablaAmortiDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmortiDetalle.getComponent(index);

			this.tablaamortidetalleConstantesFunciones.setResaltarFK_IdTipoIntervaloTablaAmortiDetalle(resaltar);

			jPanel.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarFK_IdTipoIntervaloTablaAmortiDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTablaAmortiDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTablaAmortiDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTablaAmortiDetalle();
		this.updateVisibilidadResaltarControlesFormularioTablaAmortiDetalle();
		this.updateHabilitarResaltarControlesFormularioTablaAmortiDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioTablaAmortiDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tablaamortidetalleConstantesFunciones.resaltaridTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltaridTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_empresaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_empresaTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_sucursalTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_sucursalTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_ejercicioTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_ejercicioTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_periodoTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_periodoTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_tasaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_tasaTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_facturaTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_facturaTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_tipo_intervaloTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_tipo_intervaloTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarfecha_emisionTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarfecha_emisionTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarfecha_vencimientoTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarfecha_vencimientoTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarfecha_inicialTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarfecha_inicialTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarfecha_finalTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarfecha_finalTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarvalorTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarvalorTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarinteresTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarinteresTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarcapitalTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarcapitalTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarnumero_cuotasTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarnumero_cuotasTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_anioTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_anioTablaAmortiDetalle);}
		if(this.tablaamortidetalleConstantesFunciones.resaltarid_mesTablaAmortiDetalle!=null && this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setBorder(this.tablaamortidetalleConstantesFunciones.resaltarid_mesTablaAmortiDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTablaAmortiDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
	
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostraridTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelidTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostraridTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_empresaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_empresaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_empresaTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_sucursalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_sucursalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_sucursalTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_ejercicioTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_ejercicioTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_ejercicioTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_periodoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_periodoTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_periodoTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_tasaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_tasaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_tasaTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_facturaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_facturaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_facturaTablaAmortiDetalle);
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_facturaTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_tipo_intervaloTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_tipo_intervaloTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_tipo_intervaloTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_emisionTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelfecha_emisionTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_emisionTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_vencimientoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelfecha_vencimientoTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_vencimientoTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_inicialTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelfecha_inicialTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_inicialTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_finalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelfecha_finalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarfecha_finalTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarvalorTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelvalorTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarvalorTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarinteresTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelinteresTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarinteresTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarcapitalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelcapitalTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarcapitalTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarnumero_cuotasTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelnumero_cuotasTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarnumero_cuotasTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_anioTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_anioTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_anioTablaAmortiDetalle);
		//this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_mesTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jPanelid_mesTablaAmortiDetalle.setVisible(this.tablaamortidetalleConstantesFunciones.mostrarid_mesTablaAmortiDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTablaAmortiDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaAmortiDetalle!=null) {
	
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jLabelidTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activaridTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_empresaTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_empresaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_sucursalTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_sucursalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_ejercicioTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_ejercicioTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_periodoTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_periodoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tasaTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_tasaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_facturaTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_facturaTablaAmortiDetalle);
			this.jInternalFrameDetalleFormTablaAmortiDetalle.jButtonid_facturaTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_facturaTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_tipo_intervaloTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_tipo_intervaloTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_emisionTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarfecha_emisionTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_vencimientoTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarfecha_vencimientoTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_inicialTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarfecha_inicialTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jDateChooserfecha_finalTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarfecha_finalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldvalorTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarvalorTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldinteresTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarinteresTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldcapitalTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarcapitalTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jTextFieldnumero_cuotasTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarnumero_cuotasTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_anioTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_anioTablaAmortiDetalle);
		this.jInternalFrameDetalleFormTablaAmortiDetalle.jComboBoxid_mesTablaAmortiDetalle.setEnabled(this.tablaamortidetalleConstantesFunciones.activarid_mesTablaAmortiDetalle);
		}
	}
	
		
}